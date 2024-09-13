package github.killarexe.copper_extension.fabric.mixin;

import github.killarexe.copper_extension.CEActions;
import github.killarexe.copper_extension.CEMaps;
import github.killarexe.copper_extension.fabric.registry.CEGameRules;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.ItemEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureElement;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import java.util.Map;

@Mixin(Item.class)
public abstract class ItemMixin implements FeatureElement, ItemLike, FabricItem {

  @Inject(method = "inventoryTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;IZ)V", at = @At("HEAD"))
  public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected, CallbackInfo callbackInfo) {
    Item item = stack.getItem();
    if(entity instanceof Player player && CEMaps.OXIDATION_MAP_ITEMS.containsKey(item)) {
      int count = stack.getCount();
      if(player.getRandom().nextFloat() < level.getGameRules().getInt(CEGameRules.COPPER_OXIDATION_CHANCE) * CEActions.BASE_CHANCE / count) {
        player.getInventory().setItem(slot, new ItemStack(CEMaps.OXIDATION_MAP_ITEMS.get(item), count));
      }
    }
  }

  @Inject(method = "use", at = @At("HEAD"), cancellable = true)
  public void use(Level level, Player player, InteractionHand interactionHand, CallbackInfoReturnable<InteractionResultHolder<ItemStack>> callbackInfo) {
    ItemStack currentHandStack = player.getItemInHand(interactionHand);
    ItemStack otherHandStack = player.getOffhandItem();
    if (CEMaps.OXIDATION_MAP_ITEMS.containsValue(currentHandStack.getItem()) && otherHandStack.is(ItemTags.AXES)) {
      Item scrapItem = null;
      for (Map.Entry<Item, Item> entry: CEMaps.OXIDATION_MAP_ITEMS.entrySet()) {
        if (entry.getValue() == currentHandStack.getItem()) {
          scrapItem = entry.getKey();
          break;
        }
      }
      if (scrapItem == null) {
        callbackInfo.setReturnValue(InteractionResultHolder.fail(currentHandStack));
      }
      if (player instanceof ServerPlayer serverPlayer && !player.getCooldowns().isOnCooldown(otherHandStack.getItem())) {
        CEActions.scrap(scrapItem, currentHandStack, otherHandStack, serverPlayer, serverPlayer.isShiftKeyDown() ? currentHandStack.getCount() : 1);
        callbackInfo.setReturnValue(InteractionResultHolder.success(currentHandStack));
      }

      callbackInfo.setReturnValue(InteractionResultHolder.consume(currentHandStack));
    }
  }

  @Inject(method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", at = @At("HEAD"), cancellable = true)
  public void useOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
    Item item = context.getItemInHand().getItem();
    if(CEMaps.WAXING_MAP_ITEMS.containsKey(item)) {
      Level level = context.getLevel();
      BlockPos pos = context.getClickedPos();
      BlockState state = level.getBlockState(pos);
      if(!state.hasProperty(BeehiveBlock.HONEY_LEVEL)) {
        callbackInfoReturnable.cancel();
      }
      int currentValue = state.getValue(BeehiveBlock.HONEY_LEVEL);
      if(currentValue <= 1 && level instanceof ServerLevel serverLevel) {
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
  }
}
