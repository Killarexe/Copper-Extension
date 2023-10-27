package github.killarexe.copper_extension.common.item;

import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class ScrapableItem extends Item{

	private ResourceLocation scrappedItemId;
	
	public ScrapableItem(Properties pProperties, ResourceLocation scrappedItemId) {
		super(pProperties);
		this.scrappedItemId = scrappedItemId;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
		ItemStack currentHandStack = pPlayer.getItemInHand(pUsedHand);
		ItemStack otherHandStack = pPlayer.getOffhandItem();
		
		if(otherHandStack.is(ItemTags.AXES) && pPlayer instanceof ServerPlayer player && !pPlayer.getCooldowns().isOnCooldown(otherHandStack.getItem())) {
			if(pPlayer.isCrouching()) {
				scrap(currentHandStack, otherHandStack, player, currentHandStack.getCount());
			}else {
				scrap(currentHandStack, otherHandStack, player, 1);
			}
			return InteractionResultHolder.success(currentHandStack);
		}
		return InteractionResultHolder.pass(currentHandStack);
	}
	
	private void scrap(ItemStack currentStack, ItemStack otherStack, ServerPlayer player, int count) {
		int damage = otherStack.getMaxDamage() - otherStack.getDamageValue();
		int amount = Math.min(Math.min(count, currentStack.getCount()), damage);
		currentStack.shrink(amount);
		otherStack.hurt(amount, player.getRandom(), player);
		ItemStack result = new ItemStack(CEItems.getItemFromId(scrappedItemId), amount);
		if(!player.getInventory().add(result)){
			Level level = player.level();
			Vec3 position = player.position(); 
			ItemEntity itemEntity = new ItemEntity(level, position.x(), position.y(), position.z(), result);
			player.level().addFreshEntity(itemEntity);
		}
		player.getCooldowns().addCooldown(otherStack.getItem(), amount * 8);
	}
	
	public ResourceLocation getScrappedItemId() {
		return scrappedItemId;
	}
}
