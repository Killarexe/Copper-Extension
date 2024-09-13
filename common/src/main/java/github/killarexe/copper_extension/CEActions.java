package github.killarexe.copper_extension;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

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
}
