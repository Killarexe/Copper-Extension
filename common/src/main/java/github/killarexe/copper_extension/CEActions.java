package github.killarexe.copper_extension;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
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

import java.util.Optional;

public class CEActions {

    public static final float BASE_CHANCE = 0.0013666F;

    public static void scrap(Item scarpItem, ItemStack currentStack, ItemStack otherStack, ServerPlayer serverPlayer, int count) {
        int damage = otherStack.getMaxDamage() - otherStack.getDamageValue();
        int amount = Math.min(Math.min(count, currentStack.getCount()), damage);

        currentStack.shrink(amount);
        otherStack.hurtAndBreak(amount, serverPlayer, EquipmentSlot.OFFHAND);

        ServerLevel level = serverPlayer.serverLevel();
        ItemStack result = new ItemStack(scarpItem, amount);
        ItemEntity itemEntity = new ItemEntity(level, serverPlayer.getX(), serverPlayer.getY(), serverPlayer.getZ(), result);

        level.addFreshEntity(itemEntity);
        serverPlayer.getCooldowns().addCooldown(otherStack.getItem(), amount * 8);
    }

    public static <T extends Item> void rustEntityStack(
            T nextItem, ItemStack stack, Level level,
            ItemEntity entity, GameRules.Key<GameRules.IntegerValue> oxidationGameRule, RandomSource random)
    {
        int count = stack.getCount();
        if(random.nextFloat() < level.getGameRules().getInt(oxidationGameRule) * BASE_CHANCE / count) {
            Vec3 pos = entity.position();
            ItemEntity newItemEntity = new ItemEntity(level, pos.x, pos.y, pos.z, new ItemStack(nextItem, count));
            newItemEntity.copyPosition(entity);
            level.addFreshEntity(newItemEntity);
            entity.kill();
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
}
