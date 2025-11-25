package github.killarexe.copper_extension;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oshi.util.tuples.Pair;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class CEActions {

    public static final float BASE_CHANCE = 0.0001366F;

    private static void scrap(Item scarpItem, ItemStack currentStack, ItemStack otherStack, ServerPlayer serverPlayer, int count) {
        int damage = otherStack.getMaxDamage() - otherStack.getDamageValue();
        int amount = Math.min(Math.min(count, currentStack.getCount()), damage);

        currentStack.shrink(amount);
        otherStack.hurtAndBreak(amount, serverPlayer, EquipmentSlot.OFFHAND);

        ServerLevel level = serverPlayer.level();
        ItemStack result = new ItemStack(scarpItem, amount);
        ItemEntity itemEntity = new ItemEntity(level, serverPlayer.getX(), serverPlayer.getY(), serverPlayer.getZ(), result);

        level.addFreshEntity(itemEntity);
        serverPlayer.getCooldowns().addCooldown(otherStack, amount * 8);
    }

    private static Optional<Item> getScrapItem(Item item) {
        for (Map.Entry<Item, Item> entry: CEMaps.OXIDATION_MAP_ITEMS.entrySet()) {
            if (entry.getValue() == item) {
                return Optional.of(entry.getKey());
            }
        }
        for (Map.Entry<Item, Item> entry: CEMaps.WAXING_MAP_ITEMS.entrySet()) {
            if (entry.getValue() == item) {
                return Optional.of(entry.getKey());
            }
        }
        return Optional.empty();
    }

    public static void scrapUse(Player player, InteractionHand hand, CallbackInfoReturnable<InteractionResult> callbackInfo) {
        ItemStack currentHandStack = player.getItemInHand(hand);
        ItemStack otherHandStack = player.getOffhandItem();
        Optional<Item> scrapItem = getScrapItem(currentHandStack.getItem());
        if (scrapItem.isPresent() && otherHandStack.is(ItemTags.AXES)) {
            if (player instanceof ServerPlayer serverPlayer && !player.getCooldowns().isOnCooldown(otherHandStack)) {
                scrap(scrapItem.get(), currentHandStack, otherHandStack, serverPlayer, serverPlayer.isShiftKeyDown() ? currentHandStack.getCount() : 1);
                callbackInfo.setReturnValue(InteractionResult.SUCCESS.heldItemTransformedTo(currentHandStack));
            }
            callbackInfo.setReturnValue(InteractionResult.CONSUME.heldItemTransformedTo(currentHandStack));
        }
    }

    public static <T extends Item> void rustEntityStack(
            T nextItem, ItemStack stack, ServerLevel level,
            ItemEntity entity, GameRules.Key<GameRules.IntegerValue> oxidationGameRule, RandomSource random)
    {
        int count = stack.getCount();
        if(random.nextFloat() < level.getGameRules().getInt(oxidationGameRule) * BASE_CHANCE / count) {
            entity.setItem(new ItemStack(nextItem, count));
        }
    }

    private static void waxItem(UseOnContext context, int currentValue, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = level.getBlockState(pos);
        Item item = context.getItemInHand().getItem();
        if(currentValue >= 1 && level instanceof ServerLevel serverLevel) {
            Player player = context.getPlayer();
            Vec3 playerPos = player.position();
            int amount = player.isShiftKeyDown() ? currentValue : 1;
            context.getItemInHand().shrink(amount);
            ItemEntity entity = new ItemEntity(
                    serverLevel,
                    playerPos.x, playerPos.y, playerPos.z,
                    new ItemStack(CEMaps.WAXING_MAP_ITEMS.get(item), amount)
            );
            serverLevel.addFreshEntity(entity);
            serverLevel.setBlock(pos, state.setValue(BeehiveBlock.HONEY_LEVEL, currentValue - amount), Block.UPDATE_ALL_IMMEDIATE);
            callbackInfoReturnable.setReturnValue(InteractionResult.SUCCESS);
        }
        callbackInfoReturnable.setReturnValue(InteractionResult.PASS);
    }

    public static void waxUseOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
        ItemStack stack = context.getItemInHand();
        Item item = stack.getItem();
        if(CEMaps.WAXING_MAP_ITEMS.containsKey(item)) {
            Optional<Integer> value = context.getLevel().getBlockState(context.getClickedPos()).getOptionalValue(BeehiveBlock.HONEY_LEVEL);
            value.ifPresent(integer -> waxItem(context, integer, callbackInfoReturnable));
        }
    }

    public static Optional<Integer> findSlotFromStack(Inventory inventory, ItemStack stack) {
        for (int i = 0; i < inventory.getContainerSize(); i++) {
            ItemStack slot = inventory.getItem(i);
            if (!slot.isEmpty() && slot.getCount() == stack.getCount() && ItemStack.isSameItemSameComponents(slot, stack)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }

    private static void appendEffect(ArrayList<MobEffectInstance> list, MobEffectInstance effect) {
      for (int i = 0; i < list.size(); i++) {
        MobEffectInstance instance = list.get(i);
        if (instance.is(effect.getEffect())) {
          if (instance.getAmplifier() < effect.getAmplifier()) {
            list.set(i, effect);
            return;
          }
          if (instance.getAmplifier() > effect.getAmplifier()) {
            return;
          }
          list.set(i, new MobEffectInstance(instance.getEffect(), instance.getDuration() + effect.getDuration(), instance.getAmplifier()));
        }
      }
      list.add(effect);
    }

    public static ArrayList<MobEffectInstance> getEffectsFromArmor(ItemStack head, ItemStack chestplate, ItemStack leggings, ItemStack boots) {
      ArrayList<MobEffectInstance> instances = new ArrayList<>();

      CEMaps.ARMOR_EFFECTS.computeIfPresent(head.getItem(), (_a, effect) -> {
        appendEffect(instances, effect);
        return effect;
      });

      CEMaps.ARMOR_EFFECTS.computeIfPresent(chestplate.getItem(), (_a, effect) -> {
        appendEffect(instances, effect);
        return effect;
      });

      CEMaps.ARMOR_EFFECTS.computeIfPresent(leggings.getItem(), (_a, effect) -> {
        appendEffect(instances, effect);
        return effect;
      });

      CEMaps.ARMOR_EFFECTS.computeIfPresent(boots.getItem(), (_a, effect) -> {
        appendEffect(instances, effect);
        return effect;
      });

      return instances;
    }
}
