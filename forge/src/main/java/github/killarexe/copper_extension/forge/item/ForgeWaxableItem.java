package github.killarexe.copper_extension.forge.item;

import github.killarexe.copper_extension.forge.registry.CEItems;
import github.killarexe.copper_extension.item.WaxableItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ForgeWaxableItem extends WaxableItem {

	public ForgeWaxableItem(Properties properties, ResourceLocation scrappedItemId, ResourceLocation waxedItemId) {
		super(properties, scrappedItemId, waxedItemId);
	}

  @Override
  public Item getScrappedItem() {
    return CEItems.getItemFromId(getScrappedItemId());
  }

  @Override
  public Item getWaxedItem() {
    return CEItems.getItemFromId(getScrappedItemId());
  }
}
