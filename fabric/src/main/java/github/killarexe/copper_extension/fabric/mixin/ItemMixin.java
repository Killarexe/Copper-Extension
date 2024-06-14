package github.killarexe.copper_extension.fabric.mixin;

import github.killarexe.copper_extension.fabric.registry.CEGameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import github.killarexe.copper_extension.fabric.registry.CEItems;
import github.killarexe.copper_extension.item.RustableItem;
import github.killarexe.copper_extension.item.WaxableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureElement;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

@Mixin(Item.class)
public abstract class ItemMixin implements FeatureElement, ItemLike, FabricItem {

  @Inject(method = "inventoryTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;IZ)V", at = @At("HEAD"))
  public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected, CallbackInfo callbackInfo) {
    if(entity instanceof Player player && stack.getItem() == Items.COPPER_INGOT) {
      int count = stack.getCount();
      if(player.getRandom().nextFloat() < level.getGameRules().getInt(CEGameRules.COPPER_OXIDATION_CHANCE) * RustableItem.BASE_CHANCE / count) {
        player.getInventory().setItem(slot, new ItemStack(CEItems.EXPOSED_COPPER_INGOT, count));
      }
    }
  }

  @Inject(method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", at = @At("HEAD"), cancellable = true)
  public void useOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
    if(context.getItemInHand().getItem() == Items.COPPER_INGOT) {
      Level level = context.getLevel();
      BlockPos pos = context.getClickedPos();
      BlockState state = level.getBlockState(pos);
      if(state.hasProperty(BeehiveBlock.HONEY_LEVEL)) {
        int currentValue = state.getValue(BeehiveBlock.HONEY_LEVEL);
        if(currentValue <= 1) {
          Player player = context.getPlayer();
          Vec3 playerPos = player.position();
          ItemStack stack = context.getItemInHand();
          int amount = player.isShiftKeyDown() ? currentValue : 1;
          WaxableItem.waxStack(CEItems.WAXED_COPPER_INGOT, level, stack, playerPos, amount);
        level.setBlock(pos, state.setValue(BeehiveBlock.HONEY_LEVEL, currentValue - amount), Block.UPDATE_ALL_IMMEDIATE);
          callbackInfoReturnable.setReturnValue(InteractionResult.SUCCESS);
        }
      }
      callbackInfoReturnable.setReturnValue(InteractionResult.PASS);
    }
  }
}
