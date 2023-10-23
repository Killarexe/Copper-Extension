package github.killarexe.copper_extension.common.item;

import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class WaxableItem extends ScrapableItem{

	private final Identifier waxedItemId;
	
	public WaxableItem(Settings settings, Identifier scrappedItemId, Identifier waxedItemId) {
		super(settings, scrappedItemId);
		this.waxedItemId = waxedItemId;
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
				waxStack(CEItems.getItem(waxedItemId), world, stack, playerPos, amount);
				world.setBlockState(pos, state.with(BeehiveBlock.HONEY_LEVEL, currentValue - amount), Block.field_31022);
				return ActionResult.SUCCESS;
			}
		}
		return ActionResult.PASS;
	}

	public static void waxStack(Item waxedItem, World world, ItemStack stack, Vec3d playerPos, int amount) {
		stack.decrement(amount);
		if(world instanceof ServerWorld serverWorld) {
			ItemEntity entity = new ItemEntity(serverWorld, playerPos.x, playerPos.y, playerPos.z, new ItemStack(waxedItem, amount));
			serverWorld.spawnEntity(entity);
		}
	}
}
