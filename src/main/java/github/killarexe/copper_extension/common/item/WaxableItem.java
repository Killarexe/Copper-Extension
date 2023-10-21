package github.killarexe.copper_extension.common.item;

import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class WaxableItem extends ScrapableItem{
	
	private final ResourceLocation waxedItemId;
	
	public WaxableItem(Properties pProperties, ResourceLocation scrappedItemId, ResourceLocation waxedItemId) {
		super(pProperties, scrappedItemId);
		this.waxedItemId = waxedItemId;
	}

	@Override
	public InteractionResult useOn(UseOnContext pContext) {
		BlockState state = pContext.getLevel().getBlockState(pContext.getClickedPos());
		if(state.hasProperty(BeehiveBlock.HONEY_LEVEL)) {
			int currentValue = state.getValue(BeehiveBlock.HONEY_LEVEL);
			if(currentValue >= 1) {
				Vec3 playerPos = pContext.getPlayer().blockPosition().getCenter();
				ItemStack stack = pContext.getItemInHand();
				Level level = pContext.getLevel();
				int amount = pContext.getPlayer().isShiftKeyDown() ? currentValue : 1;
				waxStack(CEItems.getItemFromId(waxedItemId), level, stack, state, playerPos, amount);
				level.setBlock(pContext.getClickedPos(), state.setValue(BeehiveBlock.HONEY_LEVEL, currentValue - amount), Block.UPDATE_ALL_IMMEDIATE);
				return InteractionResult.SUCCESS;
			}
		}
		return InteractionResult.PASS;
	}

	public static void waxStack(Item waxedItem, Level level, ItemStack stack, BlockState state, Vec3 playerPos, int count) {
		int currentValue = state.getValue(BeehiveBlock.HONEY_LEVEL);
		int amount = Math.min(Math.min(count, stack.getCount()), currentValue);
		stack.shrink(amount);
		state.setValue(BeehiveBlock.HONEY_LEVEL, currentValue - amount);
		if(level instanceof ServerLevel serverLevel) {
			ItemEntity itemEntity =  new ItemEntity(level, playerPos.x(), playerPos.y(), playerPos.z(), new ItemStack(waxedItem, amount));
			serverLevel.addFreshEntity(itemEntity);
		}
	}

	public ResourceLocation getWaxedItemId() {
		return waxedItemId;
	}
}
