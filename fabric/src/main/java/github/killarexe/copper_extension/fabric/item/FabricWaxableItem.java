package github.killarexe.copper_extension.fabric.item;

import github.killarexe.copper_extension.fabric.registry.CEItems;
import github.killarexe.copper_extension.item.WaxableItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class FabricWaxableItem extends WaxableItem {

  public FabricWaxableItem(Item.Properties properties, ResourceLocation scrappedItemId, ResourceLocation waxedItemId) {
    super(properties, scrappedItemId, waxedItemId);
  }

  @Override
  public Item getItemFromId(ResourceLocation itemId) {
    return CEItems.getItem(itemId);
  }
}
