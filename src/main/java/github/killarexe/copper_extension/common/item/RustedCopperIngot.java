package github.killarexe.copper_extension.common.item;

import java.text.NumberFormat;

import github.killarexe.copper_extension.CEMod;
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
import net.minecraft.world.phys.Vec3;

public class RustedCopperIngot extends Item{

	private final Item nextItem, waxedItem;
	
	public RustedCopperIngot(Properties pProperties, Item nextItem, Item waxedItem) {
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
				Vec3 playerPos = pContext.getPlayer().position();
				ItemStack stack = pContext.getItemInHand();
				Level level = pContext.getLevel();
				convertStack(waxedItem, level, stack, state, playerPos, pContext.getPlayer().isShiftKeyDown() ? currentValue : 1);
				return InteractionResult.SUCCESS;
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
		CEMod.LOGGER.info("Updating");
		if (random.nextFloat() < 0.1366666F / count) {
			CEMod.LOGGER.info("Updated!");
			stack = new ItemStack(nextItem, count);
			return true;
		}
		return false;
	}
	
	public static void convertStack(Item waxedItem, Level level, ItemStack stack, BlockState state, Vec3 playerPos, int count) {
		int currentValue = state.getValue(BeehiveBlock.HONEY_LEVEL);
		int amount = Math.min(Math.min(count, stack.getCount()), currentValue);
		stack.shrink(amount);
		state.setValue(BeehiveBlock.HONEY_LEVEL, currentValue - amount);
		CEMod.LOGGER.info(playerPos.toVector3f().toString(NumberFormat.getIntegerInstance()));
		level.addFreshEntity(new ItemEntity(level, playerPos.x(), playerPos.y(), playerPos.x(), new ItemStack(waxedItem, amount)));
	}
}
