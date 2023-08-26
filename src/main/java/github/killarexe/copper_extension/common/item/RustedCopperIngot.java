package github.killarexe.copper_extension.common.item;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class RustedCopperIngot extends Item{

	public static final float CHANCE = 0.0136666F;
	
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
				Vec3 playerPos = pContext.getPlayer().blockPosition().getCenter();
				ItemStack stack = pContext.getItemInHand();
				Level level = pContext.getLevel();
				int amount = pContext.getPlayer().isShiftKeyDown() ? currentValue : 1;
				convertStack(waxedItem, level, stack, state, playerPos, amount);
				state.setValue(BeehiveBlock.HONEY_LEVEL, currentValue - amount);
				pContext.getLevel().setBlockAndUpdate(pContext.getClickedPos(), state);
				return InteractionResult.SUCCESS;
			}
		}
		return InteractionResult.PASS;
	}
	
	@Override
	public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
		updateEntityStack(stack, entity, entity.level().getRandom());
		return super.onEntityItemUpdate(stack, entity);
	}
	
	@Override
	public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
		if(pEntity instanceof ServerPlayer player) {
			updateStack(pStack, pLevel.getRandom(), player, pSlotId);
		}
	}
	
	private void updateEntityStack(ItemStack stack, ItemEntity entity, RandomSource random) {
		int count = stack.getCount(); 
		if (random.nextFloat() < CHANCE / count) {
			entity.setItem(new ItemStack(nextItem, count));
		}
	}
	
	private void updateStack(ItemStack stack, RandomSource random, Player player, int slot) {
		int count = stack.getCount(); 
		if (random.nextFloat() < CHANCE / count) {
			player.getInventory().setItem(slot, new ItemStack(nextItem, count));
		}
	}
	
	public static void convertStack(Item waxedItem, Level level, ItemStack stack, BlockState state, Vec3 playerPos, int count) {
		int currentValue = state.getValue(BeehiveBlock.HONEY_LEVEL);
		int amount = Math.min(Math.min(count, stack.getCount()), currentValue);
		stack.shrink(amount);
		state.setValue(BeehiveBlock.HONEY_LEVEL, currentValue - amount);
		if(level instanceof ServerLevel serverLevel) {
			ItemEntity itemEntity =  new ItemEntity(level, playerPos.x(), playerPos.y(), playerPos.z(), new ItemStack(waxedItem, amount));
			serverLevel.addFreshEntity(itemEntity);
		}
	}
}
