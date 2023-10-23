package github.killarexe.copper_extension.registry;

import java.util.HashMap;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.common.item.RustableItem;
import github.killarexe.copper_extension.common.item.ScrapableItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CEItems {
	
	private static final HashMap<String, Item> ITEMS = new HashMap<String, Item>();
	
	public static final Item WAXED_COPPER_INGOT = createItem("waxed_copper_ingot", new ScrapableItem(new FabricItemSettings(), new Identifier("minecraft", "copper_ingot")));
	public static final Item WAXED_EXPOSED_COPPER_INGOT = createItem("waxed_exposed_copper_ingot", new ScrapableItem(new FabricItemSettings(), CEMod.id("exposed_copper_ingot")));
	public static final Item WAXED_WEATHERED_COPPER_INGOT = createItem("waxed_weathered_copper_ingot", new ScrapableItem(new FabricItemSettings(), CEMod.id("weathered_copper_ingot")));
	
	public static final RustableItem EXPOSED_COPPER_INGOT = createItem("exposed_copper_ingot", new RustableItem(
			new FabricItemSettings(),
			new Identifier("minecraft", "copper_ingot"),
			CEMod.id("waxed_exposed_copper_ingot"),
			CEMod.id("weathered_copper_ingot"))
	);
	public static final RustableItem WEATHERED_COPPER_INGOT = createItem("weathered_copper_ingot", new RustableItem(
			new FabricItemSettings(),
			CEMod.id("exposed_copper_ingot"),
			CEMod.id("waxed_weathered_copper_ingot"),
			CEMod.id("oxidized_copper_ingot")
	));
	public static final Item OXIDIZED_COPPER_INGOT = createItem("oxidized_copper_ingot", new ScrapableItem(new FabricItemSettings(), CEMod.id("weathered_copper_ingot")));
	
	public static void register() {
		ITEMS.forEach((id, item) -> {
			Registry.register(Registries.ITEM, new Identifier(CEMod.MOD_ID, id), item);
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((group) -> {
				group.add(item);
			});
		});
	}
	
	private static <T extends Item> T createItem(String id, T item) {
		ITEMS.put(id, item);
		return item;
	}
	
	public static Item getItem(Identifier itemId) {
		if(Registries.ITEM.containsId(itemId)) {
			return Registries.ITEM.get(itemId);
		}
		return Items.AIR;
	}
}
