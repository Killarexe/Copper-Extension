package github.killarexe.copper_extension.common.item;

import github.killarexe.copper_extension.registry.CEGameRules;
import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class RustableItem extends WaxableItem{
	
	public static final float BASE_CHANCE = 0.0013666F;
	
	private final Identifier rustItemId;
	
	public RustableItem(Settings settings, Identifier scrappedItemId, Identifier waxedItemId, Identifier rustItemId) {
		super(settings, scrappedItemId, waxedItemId);
		this.rustItemId = rustItemId;
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		if(entity instanceof PlayerEntity player && !world.isClient()) {
			rustStack(stack, world, player, slot);
		}
	}
	
	public static void rustEntityStack(Item nextItem, ItemStack stack, World world, ItemEntity entity, Random random) {
		int count = stack.getCount();
		if(random.nextFloat() < world.getGameRules().getInt(CEGameRules.COPPER_OXIDATION_CHANCE) * BASE_CHANCE / count) {
			Vec3d pos = entity.getPos();
			ItemEntity newItemEntity = new ItemEntity(world, pos.x, pos.y, pos.z, new ItemStack(nextItem, count));
			newItemEntity.copyPositionAndRotation(entity);
			entity.remove(RemovalReason.KILLED);
			world.spawnEntity(newItemEntity);
		}
	}
	
	private void rustStack(ItemStack stack, World world, PlayerEntity player, int slot) {
		int count = stack.getCount();
		if(world.random.nextFloat() < world.getGameRules().getInt(CEGameRules.COPPER_OXIDATION_CHANCE) * BASE_CHANCE / count) {
			player.getInventory().setStack(slot, new ItemStack(CEItems.getItem(rustItemId), count));
		}
	}

	public Identifier getRustItemId() {
		return rustItemId;
	}
}
