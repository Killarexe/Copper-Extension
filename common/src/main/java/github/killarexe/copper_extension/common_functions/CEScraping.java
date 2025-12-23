package github.killarexe.copper_extension.common_functions;

import github.killarexe.copper_extension.CEMaps;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oshi.util.tuples.Pair;

import java.util.Map;
import java.util.Optional;

public class CEScraping {
  private static void scrap(Item scarpItem, ItemStack currentStack, ItemStack otherStack, ServerPlayer serverPlayer, int count) {
    int damage = otherStack.getMaxDamage() - otherStack.getDamageValue();
    int amount = Math.min(Math.min(count, currentStack.getCount()), damage);

    ServerLevel level = serverPlayer.level();
    ItemStack result = new ItemStack(scarpItem, amount);
    result.applyComponents(currentStack.getComponentsPatch());

    currentStack.shrink(amount);
    otherStack.hurtAndBreak(amount, serverPlayer, EquipmentSlot.OFFHAND);

    ItemEntity itemEntity = new ItemEntity(level, serverPlayer.getX(), serverPlayer.getY(), serverPlayer.getZ(), result);

    level.addFreshEntity(itemEntity);
    level.playSound(itemEntity, serverPlayer.blockPosition(), SoundEvents.AXE_SCRAPE, SoundSource.PLAYERS, 1.0f, 1.0f);

    serverPlayer.getCooldowns().addCooldown(otherStack, amount * 8);
  }

  private static Optional<Item> getScrapItem(Item item) {
    for (Map.Entry<Item, Pair<Item, Float>> entry: CEMaps.OXIDATION_MAP_ITEMS.entrySet()) {
      if (entry.getValue().getA() == item) {
        return Optional.of(entry.getKey());
      }
    }
    for (Map.Entry<Item, Item> entry: CEMaps.WAXING_MAP_ITEMS.entrySet()) {
      if (entry.getValue() == item) {
        return Optional.of(entry.getKey());
      }
    }
    return Optional.empty();
  }

  public static void scrapUse(Player player, InteractionHand hand, CallbackInfoReturnable<InteractionResult> callbackInfo) {
    ItemStack currentHandStack = player.getItemInHand(hand);
    ItemStack otherHandStack = player.getOffhandItem();
    Optional<Item> scrapItem = getScrapItem(currentHandStack.getItem());

    if (scrapItem.isPresent() && otherHandStack.is(ItemTags.AXES)) {
      if (player instanceof ServerPlayer serverPlayer && !player.getCooldowns().isOnCooldown(otherHandStack)) {
        scrap(scrapItem.get(), currentHandStack, otherHandStack, serverPlayer, serverPlayer.isShiftKeyDown() ? currentHandStack.getCount() : 1);
        callbackInfo.setReturnValue(InteractionResult.SUCCESS.heldItemTransformedTo(currentHandStack));
      }
      callbackInfo.setReturnValue(InteractionResult.CONSUME.heldItemTransformedTo(currentHandStack));
    }
  }
}
