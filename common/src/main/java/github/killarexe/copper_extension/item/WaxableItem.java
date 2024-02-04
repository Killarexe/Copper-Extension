package github.killarexe.copper_extension.item;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public abstract class WaxableItem extends ScrapableItem {

  private final ResourceLocation waxedItemId;

  public WaxableItem(Item.Properties properties, ResourceLocation scrappedItemId, ResourceLocation waxedItemId) {
    super(properties, scrappedItemId);
    this.waxedItemId = waxedItemId;
  }

  @Override
  public InteractionResult useOn(UseOnContext context) {
    Level level = context.getLevel();
    BlockPos pos = context.getClickedPos();
    BlockState state = level.getBlockState(pos);
    if(state.hasProperty(BeehiveBlock.HONEY_LEVEL)) {
      int currentValue = state.getValue(BeehiveBlock.HONEY_LEVEL);
      if(currentValue >= 1) {
        Player player = context.getPlayer();
        Vec3 playerPos = player.position();
        ItemStack stack = context.getItemInHand();
        int amount = player.isShiftKeyDown() ? currentValue : 1;

        waxStack(getWaxedItem(), level, stack, playerPos, amount);
        level.setBlock(pos, state.setValue(BeehiveBlock.HONEY_LEVEL, currentValue - amount), Block.UPDATE_ALL_IMMEDIATE);
        return InteractionResult.SUCCESS;
      }
    }
    return InteractionResult.PASS;
  }

  public static <T extends Item> void waxStack(T waxedItem, Level level, ItemStack stack, Vec3 playerPos, int amount) {
    stack.shrink(amount);
    if(level instanceof ServerLevel serverLevel) {
      ItemEntity entity = new ItemEntity(serverLevel, playerPos.x, playerPos.y, playerPos.z, new ItemStack(waxedItem, amount));
      serverLevel.addFreshEntity(entity);
    }
  }

  public Item getWaxedItem() {
    return getItemFromId(waxedItemId);
  }

  public ResourceLocation getWaxedItemId() {
    return waxedItemId;
  }
}
