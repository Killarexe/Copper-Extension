package github.killarexe.copper_extension.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import github.killarexe.copper_extension.common.item.RustedCopperIngot;
import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.Ownable;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.world.World;

@Mixin(ItemEntity.class)
public abstract class ItemEntityMixin extends Entity implements Ownable{
	
	public ItemEntityMixin(EntityType<?> type, World world) {
		super(type, world);
	}

	@Inject(method = "tick()V", at = @At("HEAD"))
	public void tick(CallbackInfo callbackInfo) {
		ItemEntity itemEntity = ItemEntity.class.cast(this);
		Item item = itemEntity.getStack().getItem();
		if(item == Items.COPPER_INGOT) {
			RustedCopperIngot.updateEntityStack(CEItems.EXPOSED_COPPER_INGOT, itemEntity.getStack(), getEntityWorld(), itemEntity, random);
		}else if(item instanceof RustedCopperIngot rustedCopperIngot) {
			RustedCopperIngot.updateEntityStack(rustedCopperIngot.getNextItem(), itemEntity.getStack(), getEntityWorld(), itemEntity, random);
		}
	}
}
