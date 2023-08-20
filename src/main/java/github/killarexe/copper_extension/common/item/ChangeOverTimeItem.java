package github.killarexe.copper_extension.common.item;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ChangeOverTimeItem extends Item{

	private final Item nextItem, waxedItem;
	
	public ChangeOverTimeItem(Properties pProperties, Item nextItem, Item waxedItem) {
		super(pProperties);
		this.nextItem = nextItem;
		this.waxedItem = waxedItem;
	}

	@Override
	public InteractionResult useOn(UseOnContext pContext) {
		BlockState state = pContext.getLevel().getBlockState(pContext.getClickedPos());
		if(state.hasProperty(BeehiveBlock.HONEY_LEVEL)) {
			int currentValue = state.getValue(BeehiveBlock.HONEY_LEVEL);
			if(currentValue >= 1) {
				waxStack(pContext, state, currentValue);
				return InteractionResult.CONSUME;
			}
		}
		return InteractionResult.PASS;
	}
	
	@Override
	public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
		return super.onEntityItemUpdate(stack, entity) || updateStack(stack, entity.level().getRandom());
	}
	
	@Override
	public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
		updateStack(pStack, pLevel.getRandom());
	}
	
	private boolean updateStack(ItemStack stack, RandomSource random) {
		int count = stack.getCount(); 
		if (random.nextFloat() < 0.05688889F / count) {
			stack = new ItemStack(nextItem, count);
			return true;
		}
		return false;
	}
	
	private void waxStack(UseOnContext pContext, BlockState state, int currentValue) {
		BlockPos playerPos = pContext.getPlayer().blockPosition();
		ItemStack stack = pContext.getItemInHand();
		Level level = pContext.getLevel();
		if(pContext.getPlayer().isShiftKeyDown()) {
			stack.shrink(currentValue);
			state.setValue(BeehiveBlock.HONEY_LEVEL, 0);
			level.addFreshEntity(new ItemEntity(level, playerPos.getX(), playerPos.getY(), playerPos.getX(), new ItemStack(waxedItem, currentValue)));
		}else{
			stack.shrink(1);
			state.setValue(BeehiveBlock.HONEY_LEVEL, currentValue - 1);
			level.addFreshEntity(new ItemEntity(level, playerPos.getX(), playerPos.getY(), playerPos.getX(), new ItemStack(waxedItem)));
		}
	}
}
