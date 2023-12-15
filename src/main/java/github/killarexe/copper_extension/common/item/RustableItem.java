package github.killarexe.copper_extension.common.item;

import github.killarexe.copper_extension.registry.CEGameRules;
import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RustableItem extends WaxableItem{

	public static final float BASE_CHANCE = 0.0013666F;

	private final ResourceLocation rustItemId;
	
	public RustableItem(Properties pProperties, ResourceLocation scrappedItemId, ResourceLocation waxedItemId, ResourceLocation rustItemId) {
		super(pProperties, scrappedItemId, waxedItemId);
		this.rustItemId = rustItemId;
	}

	@Override
	public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
		if(!entity.level().isClientSide()) {
			updateEntityStack(stack, entity, entity.level());
		}
		return super.onEntityItemUpdate(stack, entity);
	}

	@Override
	public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
		if(pEntity instanceof Player player && !pLevel.isClientSide()) {
			updateStack(pStack, pLevel.random, player, pSlotId);
		}
	}
	
	private void updateEntityStack(ItemStack stack, ItemEntity entity, Level level) {
		int count = stack.getCount();
		int chance = level.getGameRules().getInt(CEGameRules.COPPER_OXIDATION_CHANCE);
		if (level.random.nextFloat() < chance * BASE_CHANCE / count) {
			entity.setItem(new ItemStack(CEItems.getItemFromId(rustItemId), count));
		}
	}

	private void updateStack(ItemStack stack, RandomSource random, Player player, int slot) {
		int count = stack.getCount();
		int chance = player.level().getGameRules().getInt(CEGameRules.COPPER_OXIDATION_CHANCE);
		if (random.nextFloat() < chance * BASE_CHANCE / count) {
			player.getInventory().setItem(slot, new ItemStack(CEItems.getItemFromId(rustItemId), count));
		}
	}

	public ResourceLocation getRustItemId() {
		return rustItemId;
	}
}
