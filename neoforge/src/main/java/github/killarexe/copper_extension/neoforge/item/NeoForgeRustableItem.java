package github.killarexe.copper_extension.neoforge.item;

import github.killarexe.copper_extension.neoforge.registry.CEGameRules;
import github.killarexe.copper_extension.neoforge.registry.CEItems;
import github.killarexe.copper_extension.item.RustableItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.GameRules.IntegerValue;
import net.minecraft.world.level.GameRules.Key;

public class NeoForgeRustableItem extends RustableItem {

	public NeoForgeRustableItem(Properties properties, ResourceLocation scrappedItemId, ResourceLocation waxedItemId, ResourceLocation rustItemId) {
		super(properties, scrappedItemId, waxedItemId, rustItemId);
	}
    @Override
    public Item getItemFromId(ResourceLocation itemId) {
        return CEItems.getItemFromId(itemId);
    }
    @Override
    public Key<IntegerValue> getOxidationChanceGameRule() {
        return CEGameRules.COPPER_OXIDATION_CHANCE;
    }
}
