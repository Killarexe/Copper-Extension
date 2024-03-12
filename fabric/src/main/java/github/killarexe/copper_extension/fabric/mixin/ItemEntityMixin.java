package github.killarexe.copper_extension.fabric.mixin;

import github.killarexe.copper_extension.fabric.registry.CEGameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import github.killarexe.copper_extension.fabric.registry.CEItems;
import github.killarexe.copper_extension.item.RustableItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.OwnableEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

@Mixin(ItemEntity.class)
public abstract class ItemEntityMixin extends Entity implements OwnableEntity{

  public ItemEntityMixin(EntityType<?> type, Level level) {
    super(type, level);
  }

  @Inject(method = "tick()V", at = @At("HEAD"))
  public void tick(CallbackInfo callbackInfo) {
    ItemEntity itemEntity = ItemEntity.class.cast(this);
    ItemStack stack = itemEntity.getItem();
    if(stack.getItem() == Items.COPPER_INGOT) {
      RustableItem.rustEntityStack(CEItems.EXPOSED_COPPER_INGOT, stack, level(), itemEntity, CEGameRules.COPPER_OXIDATION_CHANCE, random);
    } else if(stack.getItem() instanceof RustableItem rustableItem) {
      RustableItem.rustEntityStack(rustableItem.getRustItem(), stack, level(), itemEntity, CEGameRules.COPPER_OXIDATION_CHANCE, random);
    }
  }
}
