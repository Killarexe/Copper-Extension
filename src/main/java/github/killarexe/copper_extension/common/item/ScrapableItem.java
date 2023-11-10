package github.killarexe.copper_extension.common.item;

import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ScrapableItem extends Item{

	private final Identifier scrappedItemId;
	
	public ScrapableItem(Settings settings, Identifier scrappedItemId) {
		super(settings);
		this.scrappedItemId = scrappedItemId;
	}
	
	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		ItemStack currentHandStack = user.getStackInHand(hand);
		ItemStack otherHandStack = user.getOffHandStack();
		
		if(otherHandStack.isIn(ItemTags.AXES) && user instanceof ServerPlayerEntity player && !player.getItemCooldownManager().isCoolingDown(otherHandStack.getItem())) {
			scrap(currentHandStack, otherHandStack, player, player.isSneaking() ? currentHandStack.getCount() : 1);
			return TypedActionResult.success(currentHandStack);
		}
		return TypedActionResult.pass(currentHandStack);
	}
	
	private void scrap(ItemStack currentStack, ItemStack otherStack, ServerPlayerEntity player, int count) {
		int damage = otherStack.getMaxDamage() - otherStack.getDamage();
		int amount = Math.min(Math.min(count, currentStack.getCount()), damage);

		currentStack.decrement(amount);
		otherStack.damage(amount, player, (event) -> event.sendEquipmentBreakStatus(EquipmentSlot.OFFHAND));
		
		ServerWorld world = player.getServerWorld();
		ItemStack result = new ItemStack(CEItems.getItem(scrappedItemId), amount);
		ItemEntity itemEntity = new ItemEntity(world, player.getX(), player.getY(), player.getZ(), result);
		
		world.spawnEntity(itemEntity);
		player.getItemCooldownManager().set(otherStack.getItem(), amount * 8);
	}
	
	public Identifier getScrappedItemId() {
		return scrappedItemId;
	}
}
