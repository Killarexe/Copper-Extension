package github.killarexe.copper_extension.neoforge.mixin;

import github.killarexe.copper_extension.CEActions;
import github.killarexe.copper_extension.CEMaps;
import github.killarexe.copper_extension.neoforge.registry.CEGameRules;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Inventory;
import net.neoforged.neoforge.common.extensions.IItemExtension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureElement;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;

@Mixin(Item.class)
public abstract class ItemMixin implements FeatureElement, ItemLike, IItemExtension {

  @Inject(method = "inventoryTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EquipmentSlot;)V", at = @At("HEAD"))
  public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot, CallbackInfo ci) {
    Item item = stack.getItem();
    if(entity instanceof Player player && CEMaps.OXIDATION_MAP_ITEMS.containsKey(item)) {
      int count = stack.getCount();
      float random = player.getRandom().nextFloat();
      float chance = level.getGameRules().getInt(CEGameRules.COPPER_OXIDATION_CHANCE) * CEActions.BASE_CHANCE / count;
      if(random < chance) {
        int itemSlot;
        Inventory inventory = player.getInventory();
        if (slot != null) {
          itemSlot = slot.getIndex();
        } else {
          itemSlot = CEActions.findSlotFromStack(inventory, stack).orElse(-1);
        }
        player.getInventory().setItem(itemSlot, new ItemStack(CEMaps.OXIDATION_MAP_ITEMS.get(item), count));
      }
    }
  }

  @Inject(method = "use", at = @At("HEAD"), cancellable = true)
  public void use(Level level, Player player, InteractionHand interactionHand, CallbackInfoReturnable<InteractionResult> callbackInfo) {
    CEActions.scrapUse(player, interactionHand, callbackInfo);
  }

  @Inject(method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", at = @At("HEAD"), cancellable = true)
  public void useOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
    CEActions.waxUseOn(context, callbackInfoReturnable);
  }
}
