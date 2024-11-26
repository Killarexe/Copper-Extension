package github.killarexe.copper_extension.fabric.mixin;

import github.killarexe.copper_extension.CEActions;
import github.killarexe.copper_extension.CEMaps;
import github.killarexe.copper_extension.fabric.registry.CEGameRules;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.OwnableEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
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
    Item nextItem = CEMaps.OXIDATION_MAP_ITEMS.get(stack.getItem());
    if (nextItem != null && level() instanceof ServerLevel level) {
      CEActions.rustEntityStack(nextItem, stack, level, itemEntity, CEGameRules.COPPER_OXIDATION_CHANCE, random);
    }
  }
}
