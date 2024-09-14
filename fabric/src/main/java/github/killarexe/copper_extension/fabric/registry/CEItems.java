package github.killarexe.copper_extension.fabric.registry;

import java.util.HashMap;

import github.killarexe.copper_extension.CEMaps;
import github.killarexe.copper_extension.CEMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class CEItems {
	private static final HashMap<String, Item> ITEMS = new HashMap<String, Item>();

	public static final Item WAXED_COPPER_INGOT = createItem("waxed_copper_ingot", new Item(new Item.Properties()));
	
	public static final Item WAXED_EXPOSED_COPPER_INGOT = createItem("waxed_exposed_copper_ingot", new Item(new Item.Properties()));
	
	public static final Item WAXED_WEATHERED_COPPER_INGOT = createItem("waxed_weathered_copper_ingot", new Item(new Item.Properties()));

	public static final Item WAXED_OXIDIZED_COPPER_INGOT = createItem("waxed_oxidized_copper_ingot", new Item(new Item.Properties()));
	
	public static final Item EXPOSED_COPPER_INGOT = createItem("exposed_copper_ingot", new Item(new Item.Properties()));

	public static final Item WEATHERED_COPPER_INGOT = createItem("weathered_copper_ingot", new Item(new Item.Properties()));
  
	public static final Item OXIDIZED_COPPER_INGOT = createItem("oxidized_copper_ingot", new Item(new Item.Properties()));
	
	public static void register() {
		ITEMS.forEach((id, item) -> {
			Registry.register(BuiltInRegistries.ITEM, CEMod.id(id), item);
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register((group) -> {
				group.accept(item);
			});
		});
		ITEMS.clear();

		CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_INGOT, EXPOSED_COPPER_INGOT);
		CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_INGOT, WEATHERED_COPPER_INGOT);
		CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_INGOT, OXIDIZED_COPPER_INGOT);
		CEMaps.WAXING_MAP_ITEMS.put(Items.COPPER_INGOT, WAXED_COPPER_INGOT);
		CEMaps.WAXING_MAP_ITEMS.put(EXPOSED_COPPER_INGOT, WAXED_EXPOSED_COPPER_INGOT);
		CEMaps.WAXING_MAP_ITEMS.put(WEATHERED_COPPER_INGOT, WAXED_WEATHERED_COPPER_INGOT);
		CEMaps.WAXING_MAP_ITEMS.put(OXIDIZED_COPPER_INGOT, WAXED_OXIDIZED_COPPER_INGOT);
	}
	
	private static <T extends Item> T createItem(String id, T item) {
		ITEMS.put(id, item);
		return item;
	}
}
