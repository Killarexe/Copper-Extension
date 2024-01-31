package github.killarexe.copper_extension.fabric.item;

import github.killarexe.copper_extension.fabric.registry.CEGameRules;
import github.killarexe.copper_extension.fabric.registry.CEItems;
import github.killarexe.copper_extension.item.RustableItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.GameRules.IntegerValue;
import net.minecraft.world.level.GameRules.Key;

public class FabricRustableItem extends RustableItem{

  public FabricRustableItem(Item.Properties properties, ResourceLocation scrappedItemId, ResourceLocation waxedItemId, ResourceLocation rustItemId) {
    super(properties, scrappedItemId, waxedItemId, rustItemId);
  }

  @Override
  public Item getScrappedItem() {
    return CEItems.getItem(getScrappedItemId());
  }

  @Override
  public Item getWaxedItem() {
    return CEItems.getItem(getWaxedItemId());
  }

  @Override
  public Item getRustItem() {
    return CEItems.getItem(getRustItemId());
  }

  @Override
  public Key<IntegerValue> getOxidationChanceGameRule() {
    return CEGameRules.COPPER_OXIDATION_CHANCE;
  }
}
