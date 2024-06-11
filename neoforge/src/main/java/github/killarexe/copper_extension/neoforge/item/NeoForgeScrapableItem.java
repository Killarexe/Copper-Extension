package github.killarexe.copper_extension.neoforge.item;

import github.killarexe.copper_extension.neoforge.registry.CEItems;
import github.killarexe.copper_extension.item.ScrapableItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class NeoForgeScrapableItem extends ScrapableItem{

	public NeoForgeScrapableItem(Properties properties, ResourceLocation scrappedItemId) {
		super(properties, scrappedItemId);
	}

  @Override
  public Item getItemFromId(ResourceLocation itemId) {
    return CEItems.getItemFromId(itemId);
  }
}
