package github.killarexe.copper_extension.forge.item;

import github.killarexe.copper_extension.forge.registry.CEGameRules;
import github.killarexe.copper_extension.forge.registry.CEItems;
import github.killarexe.copper_extension.item.RustableItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.GameRules.IntegerValue;
import net.minecraft.world.level.GameRules.Key;

public class ForgeRustableItem extends RustableItem {

	public ForgeRustableItem(Properties properties, ResourceLocation scrappedItemId, ResourceLocation waxedItemId, ResourceLocation rustItemId) {
		super(properties, scrappedItemId, waxedItemId, rustItemId);
	}

  @Override
  public Item getScrappedItem() {
    return CEItems.getItemFromId(getScrappedItemId());
  }

  @Override
  public Item getWaxedItem() {
    return CEItems.getItemFromId(getWaxedItemId());
  }

  @Override
  public Item getRustItem() {
    return CEItems.getItemFromId(getRustItemId());
  }

  @Override
  public Key<IntegerValue> getOxidationChanceGameRule() {
    return CEGameRules.COPPER_OXIDATION_CHANCE;
  }
}
