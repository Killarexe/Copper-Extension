package github.killarexe.copper_extension.neoforge.mixin;

import github.killarexe.copper_extension.CEMaps;
import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.common_functions.CEOxidation;
import github.killarexe.copper_extension.common_functions.CEScraping;
import github.killarexe.copper_extension.common_functions.CEWaxing;
import github.killarexe.copper_extension.neoforge.registry.CEGameRules;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureElement;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.extensions.IItemExtension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oshi.util.tuples.Pair;

@Mixin(Item.class)
public abstract class ItemMixin implements FeatureElement, ItemLike, IItemExtension {

  @Inject(method = "inventoryTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EquipmentSlot;)V", at = @At("HEAD"))
  public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot, CallbackInfo ci) {
    Item item = stack.getItem();
    if(entity instanceof LivingEntity livingEntity && CEMaps.OXIDATION_MAP_ITEMS.containsKey(item)) {
      int count = stack.getCount();
      Pair<Item, Float> result = CEMaps.OXIDATION_MAP_ITEMS.get(item);

      float random = livingEntity.getRandom().nextFloat();
      float chance = (level.getGameRules().getInt(CEGameRules.COPPER_OXIDATION_CHANCE) * CEOxidation.BASE_CHANCE * result.getB() ) / count;
      if(random < chance) {
        ItemStack resultStack = new ItemStack(result.getA(), count);
        resultStack.applyComponents(stack.getComponentsPatch());

        if (slot != null) {
          livingEntity.setItemSlot(slot, resultStack);
        } else if (entity instanceof Player player) {
          Inventory inventory = player.getInventory();
          int itemSlot = CEOxidation.findSlotFromStack(inventory, stack).orElse(-1);

          inventory.setItem(itemSlot, resultStack);
        } else {
          CEMod.LOGGER.debug("Failed to rust item {} for entity: {}", stack, entity);
        }
      }
    }
  }

  @Inject(method = "use", at = @At("HEAD"), cancellable = true)
  public void use(Level level, Player player, InteractionHand interactionHand, CallbackInfoReturnable<InteractionResult> callbackInfo) {
    CEScraping.scrapUse(player, interactionHand, callbackInfo);
  }

  @Inject(method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", at = @At("HEAD"), cancellable = true)
  public void useOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
    CEWaxing.waxUseOn(context, callbackInfoReturnable);
  }
}
