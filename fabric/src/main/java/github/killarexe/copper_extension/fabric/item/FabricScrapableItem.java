package github.killarexe.copper_extension.fabric.item;

import github.killarexe.copper_extension.fabric.registry.CEItems;
import github.killarexe.copper_extension.item.ScrapableItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class FabricScrapableItem extends ScrapableItem {

  public FabricScrapableItem(Item.Properties properties, ResourceLocation scrappedItemId) {
    super(properties, scrappedItemId);
  }

  @Override
  public Item getScrappedItem() {
    return CEItems.getItem(getScrappedItemId());
  }
}
