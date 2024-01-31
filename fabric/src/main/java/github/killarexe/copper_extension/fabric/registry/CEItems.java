package github.killarexe.copper_extension.fabric.registry;

import java.util.HashMap;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.fabric.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class CEItems {
	
	private static final HashMap<String, Item> ITEMS = new HashMap<String, Item>();
	
	public static final FabricScrapableItem WAXED_COPPER_INGOT = createItem("waxed_copper_ingot", new FabricScrapableItem(new FabricItemSettings(), new ResourceLocation("minecraft", "copper_ingot")));
	public static final FabricScrapableItem WAXED_EXPOSED_COPPER_INGOT = createItem("waxed_exposed_copper_ingot", new FabricScrapableItem(new FabricItemSettings(), CEMod.id("exposed_copper_ingot")));
	public static final FabricScrapableItem WAXED_WEATHERED_COPPER_INGOT = createItem("waxed_weathered_copper_ingot", new FabricScrapableItem(new FabricItemSettings(), CEMod.id("weathered_copper_ingot")));
	
	public static final FabricRustableItem EXPOSED_COPPER_INGOT = createItem("exposed_copper_ingot", new FabricRustableItem(
			new FabricItemSettings(),
			new ResourceLocation("minecraft", "copper_ingot"),
			CEMod.id("waxed_exposed_copper_ingot"),
			CEMod.id("weathered_copper_ingot"))
	);
	public static final FabricRustableItem WEATHERED_COPPER_INGOT = createItem("weathered_copper_ingot", new FabricRustableItem(
			new FabricItemSettings(),
			CEMod.id("exposed_copper_ingot"),
			CEMod.id("waxed_weathered_copper_ingot"),
			CEMod.id("oxidized_copper_ingot")
	));
	public static final Item OXIDIZED_COPPER_INGOT = createItem("oxidized_copper_ingot", new FabricScrapableItem(new FabricItemSettings(), CEMod.id("weathered_copper_ingot")));
	
	public static void register() {
		ITEMS.forEach((id, item) -> {
			Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CEMod.MOD_ID, id), item);
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register((group) -> {
				group.accept(item);
			});
		});
	}
	
	private static <T extends Item> T createItem(String id, T item) {
		ITEMS.put(id, item);
		return item;
	}
	
	public static Item getItem(ResourceLocation itemId) {
		if(BuiltInRegistries.ITEM.containsKey(itemId)) {
			return BuiltInRegistries.ITEM.get(itemId);
		}
		return Items.AIR;
	}
}
