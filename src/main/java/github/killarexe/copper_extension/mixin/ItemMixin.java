package github.killarexe.copper_extension.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import github.killarexe.copper_extension.common.item.RustableItem;
import github.killarexe.copper_extension.common.item.WaxableItem;
import github.killarexe.copper_extension.registry.CEGameRules;
import github.killarexe.copper_extension.registry.CEItems;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.resource.featuretoggle.ToggleableFeature;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@Mixin(Item.class)
public abstract class ItemMixin implements ToggleableFeature, ItemConvertible, FabricItem{

	@Inject(method = "inventoryTick(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;IZ)V", at = @At("HEAD"))
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected, CallbackInfo callbackInfo){
		if(entity instanceof PlayerEntity player && stack.getItem() == Items.COPPER_INGOT) {
			int count = stack.getCount();
			if(player.getRandom().nextFloat() < world.getGameRules().getInt(CEGameRules.COPPER_OXIDATION_CHANCE) * RustableItem.BASE_CHANCE / count) {
				player.getInventory().setStack(slot, new ItemStack(CEItems.EXPOSED_COPPER_INGOT, count));
			}
		}
	}
	
	@Inject(method = "useOnBlock(Lnet/minecraft/item/ItemUsageContext;)Lnet/minecraft/util/ActionResult;", at = @At("HEAD"), cancellable = true)
	public void useOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> callbackInfoReturnable) {
		if(context.getStack().getItem() == Items.COPPER_INGOT) {
			World world = context.getWorld();
			BlockPos pos = context.getBlockPos();
			BlockState state = world.getBlockState(pos);
			if(state.contains(BeehiveBlock.HONEY_LEVEL)) {
				int currentValue = state.get(BeehiveBlock.HONEY_LEVEL);
				if(currentValue >= 1) {
					PlayerEntity player = context.getPlayer();
					Vec3d playerPos = player.getPos();
					ItemStack stack = context.getStack();
					int amount = player.isSneaking() ? currentValue : 1;
					WaxableItem.waxStack(CEItems.WAXED_COPPER_INGOT, world, stack, playerPos, amount);
					world.setBlockState(pos, state.with(BeehiveBlock.HONEY_LEVEL, currentValue - amount), Block.NOTIFY_ALL_AND_REDRAW);
					callbackInfoReturnable.setReturnValue(ActionResult.SUCCESS);
				}
			}
			callbackInfoReturnable.setReturnValue(ActionResult.PASS);
		}
	}
}
