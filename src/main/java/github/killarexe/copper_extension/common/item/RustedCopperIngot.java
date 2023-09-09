package github.killarexe.copper_extension.common.item;

import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class RustedCopperIngot extends Item{
	
	public static final float CHANCE = 0.0006666F;
	
	private final Item nextItem, waxedItem;

	public RustedCopperIngot(Settings settings, Item nextItem, Item waxedItem) {
		super(settings);
		this.nextItem = nextItem;
		this.waxedItem = waxedItem;
	}
	
	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {
		World world = context.getWorld();
		BlockPos pos = context.getBlockPos();
		BlockState state = world.getBlockState(pos);
		if(state.contains(BeehiveBlock.HONEY_LEVEL)) {
			int currentValue = state.get(BeehiveBlock.HONEY_LEVEL);
			if(currentValue >= 1) {
				PlayerEntity player = context.getPlayer();
				Vec3d playerPos = player.getPos();
				ItemStack stack = context.getStack();
				int amount = player.isSneaking() ? currentValue : 1;
				convertStack(waxedItem, world, stack, playerPos, amount);
				world.setBlockState(pos, state.with(BeehiveBlock.HONEY_LEVEL, currentValue - amount), Block.field_31022);
				return ActionResult.SUCCESS;
			}
		}
		return ActionResult.PASS;
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		if(entity instanceof PlayerEntity player) {
			updateStack(stack, player.getRandom(), player, slot);
		}
		super.inventoryTick(stack, world, entity, slot, selected);
	}
	
	public static void updateEntityStack(Item nextItem, ItemStack stack, World world, ItemEntity entity, Random random) {
		int count = stack.getCount();
		if(random.nextFloat() < CHANCE / count) {
			Vec3d pos = entity.getPos();
			ItemEntity newItemEntity = new ItemEntity(world, pos.x, pos.y, pos.z, new ItemStack(nextItem, count));
			newItemEntity.copyPositionAndRotation(entity);
			entity.remove(RemovalReason.KILLED);
			world.spawnEntity(newItemEntity);
		}
	}
	
	private void updateStack(ItemStack stack, Random random, PlayerEntity player, int slot) {
		int count = stack.getCount();
		if(random.nextFloat() < CHANCE / count) {
			player.getInventory().setStack(slot, new ItemStack(nextItem, count));
		}
	}
	
	public static void convertStack(Item waxedItem, World world, ItemStack stack, Vec3d playerPos, int amount) {
		stack.decrement(amount);
		if(world instanceof ServerWorld serverWorld) {
			ItemEntity entity = new ItemEntity(serverWorld, playerPos.x, playerPos.y, playerPos.z, new ItemStack(waxedItem, amount));
			serverWorld.spawnEntity(entity);
		}
	}
	
	public Item getNextItem() {
		return nextItem;
	}
}
