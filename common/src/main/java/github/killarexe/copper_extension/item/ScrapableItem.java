package github.killarexe.copper_extension.item;

import github.killarexe.copper_extension.ItemManagerAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public abstract class ScrapableItem extends Item implements ItemManagerAccessor {

  private final ResourceLocation scrappedItemId;

  public ScrapableItem(Item.Properties properties, ResourceLocation scrappedItemId) {
    super(properties);
    this.scrappedItemId = scrappedItemId;
  }

  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
    ItemStack currentHandStack = player.getItemInHand(interactionHand);
    ItemStack otherHandStack = player.getOffhandItem();

    if(otherHandStack.is(ItemTags.AXES) && player instanceof ServerPlayer serverPlayer && !player.getCooldowns().isOnCooldown(otherHandStack.getItem())) {
      scrap(currentHandStack, otherHandStack, serverPlayer, serverPlayer.isShiftKeyDown() ? currentHandStack.getCount() : 1);
      return InteractionResultHolder.success(currentHandStack);
    }

    return InteractionResultHolder.consume(currentHandStack);
  }

  public void scrap(ItemStack currentStack, ItemStack otherStack, ServerPlayer serverPlayer, int count) {
    int damage = otherStack.getMaxDamage() - otherStack.getDamageValue();
    int amount = Math.min(Math.min(count, currentStack.getCount()), damage);

    currentStack.shrink(damage);
    otherStack.hurtAndBreak(amount, serverPlayer, (event) -> event.broadcastBreakEvent(EquipmentSlot.OFFHAND));

    ServerLevel level = serverPlayer.serverLevel();
    ItemStack result = new ItemStack(getScrappedItem(), amount);
    ItemEntity itemEntity = new ItemEntity(level, serverPlayer.getX(), serverPlayer.getY(), serverPlayer.getZ(), result);

    level.addFreshEntity(itemEntity);
    serverPlayer.getCooldowns().addCooldown(otherStack.getItem(), amount * 8);
  }

  public Item getScrappedItem() {
    return getItemFromId(scrappedItemId);
  }

  public ResourceLocation getScrappedItemId() {
    return scrappedItemId;
  }
}
