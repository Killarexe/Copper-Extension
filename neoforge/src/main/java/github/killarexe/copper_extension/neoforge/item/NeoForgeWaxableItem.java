package github.killarexe.copper_extension.neoforge.item;

import github.killarexe.copper_extension.item.WaxableItem;
import github.killarexe.copper_extension.neoforge.registry.CEItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class NeoForgeWaxableItem extends WaxableItem {

	public NeoForgeWaxableItem(Properties properties, ResourceLocation scrappedItemId, ResourceLocation waxedItemId) {
		super(properties, scrappedItemId, waxedItemId);
	}

  @Override
  public Item getItemFromId(ResourceLocation itemId) {
    return CEItems.getItemFromId(itemId);
  }
}
