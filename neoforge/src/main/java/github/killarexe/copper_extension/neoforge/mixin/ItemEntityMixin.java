package github.killarexe.copper_extension.neoforge.mixin;

import github.killarexe.copper_extension.CEActions;
import github.killarexe.copper_extension.CEMaps;
import github.killarexe.copper_extension.neoforge.registry.CEGameRules;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TraceableEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oshi.util.tuples.Pair;

@Mixin(ItemEntity.class)
public abstract class ItemEntityMixin extends Entity implements TraceableEntity {

  public ItemEntityMixin(EntityType<?> type, Level level) {
    super(type, level);
  }

  @Inject(method = "tick()V", at = @At("HEAD"))
  public void tick(CallbackInfo callbackInfo) {
    ItemEntity itemEntity = ItemEntity.class.cast(this);
    ItemStack stack = itemEntity.getItem();
    Pair<Item, Float> nextItem = CEMaps.OXIDATION_MAP_ITEMS.get(stack.getItem());
    if (nextItem != null && level() instanceof ServerLevel level) {
      CEActions.rustEntityStack(nextItem.getA(), stack, level, nextItem.getB(), itemEntity, CEGameRules.COPPER_OXIDATION_CHANCE, random);
    }
  }
}
