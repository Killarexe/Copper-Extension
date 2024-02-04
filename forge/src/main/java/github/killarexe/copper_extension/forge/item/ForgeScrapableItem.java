package github.killarexe.copper_extension.forge.item;

import github.killarexe.copper_extension.forge.registry.CEItems;
import github.killarexe.copper_extension.item.ScrapableItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ForgeScrapableItem extends ScrapableItem{

	public ForgeScrapableItem(Properties properties, ResourceLocation scrappedItemId) {
		super(properties, scrappedItemId);
	}

  @Override
  public Item getScrappedItem() {
    return CEItems.getItemFromId(getScrappedItemId());
  }

}
