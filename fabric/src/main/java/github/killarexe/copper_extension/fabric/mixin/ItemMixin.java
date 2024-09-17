package github.killarexe.copper_extension.fabric.mixin;

import github.killarexe.copper_extension.CEActions;
import github.killarexe.copper_extension.CEMaps;
import github.killarexe.copper_extension.fabric.registry.CEGameRules;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.ItemEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.core.BlockPos;
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
public abstract class ItemMixin implements FeatureElement, ItemLike, FabricItem {

  @Inject(method = "inventoryTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;IZ)V", at = @At("HEAD"))
  public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected, CallbackInfo callbackInfo) {
    Item item = stack.getItem();
    if(entity instanceof Player player && CEMaps.OXIDATION_MAP_ITEMS.containsKey(item)) {
      int count = stack.getCount();
      if(player.getRandom().nextFloat() < level.getGameRules().getInt(CEGameRules.COPPER_OXIDATION_CHANCE) * CEActions.BASE_CHANCE / count) {
        player.getInventory().setItem(slot, new ItemStack(CEMaps.OXIDATION_MAP_ITEMS.get(item), count));
      }
    }
  }

  @Inject(method = "use", at = @At("HEAD"), cancellable = true)
  public void use(Level level, Player player, InteractionHand interactionHand, CallbackInfoReturnable<InteractionResultHolder<ItemStack>> callbackInfo) {
    CEActions.scrapUse(player, interactionHand, callbackInfo);
  }

  @Inject(method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", at = @At("HEAD"), cancellable = true)
  public void useOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
    CEActions.waxUseOn(context, callbackInfoReturnable);
  }
}
