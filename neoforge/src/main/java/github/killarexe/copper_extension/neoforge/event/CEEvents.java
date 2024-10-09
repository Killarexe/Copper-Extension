package github.killarexe.copper_extension.neoforge.event;

import github.killarexe.copper_extension.CEMaps;
import github.killarexe.copper_extension.neoforge.CENeoForge;
import github.killarexe.copper_extension.neoforge.registry.CEItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class CEEvents {
	public static void registerEvents(IEventBus bus) {
		CENeoForge.LOGGER.debug("Initiliazing Copper Extension Events...");
		bus.addListener(CEEvents::addItemsToCreativeTabsEvent);
		bus.addListener(CEEvents::commonSetupEvent);
		CENeoForge.LOGGER.debug("Copper Extension Events Initiliazed!");
	}

	private static void commonSetupEvent(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_INGOT, CEItems.EXPOSED_COPPER_INGOT.get());
			CEMaps.OXIDATION_MAP_ITEMS.put(CEItems.EXPOSED_COPPER_INGOT.get(), CEItems.WEATHERED_COPPER_INGOT.get());
			CEMaps.OXIDATION_MAP_ITEMS.put(CEItems.WEATHERED_COPPER_INGOT.get(), CEItems.OXIDIZED_COPPER_INGOT.get());
			CEMaps.WAXING_MAP_ITEMS.put(Items.COPPER_INGOT, CEItems.WAXED_COPPER_INGOT.get());
			CEMaps.WAXING_MAP_ITEMS.put(CEItems.EXPOSED_COPPER_INGOT.get(), CEItems.WAXED_EXPOSED_COPPER_INGOT.get());
			CEMaps.WAXING_MAP_ITEMS.put(CEItems.WEATHERED_COPPER_INGOT.get(), CEItems.WAXED_WEATHERED_COPPER_INGOT.get());
			CEMaps.WAXING_MAP_ITEMS.put(CEItems.OXIDIZED_COPPER_INGOT.get(), CEItems.WAXED_OXIDIZED_COPPER_INGOT.get());
		});
	}

	private static void addItemsToCreativeTabsEvent(BuildCreativeModeTabContentsEvent event) {
		if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			event.acceptAll(CEItems.ITEMS.getEntries().stream().map(item -> new ItemStack(item.get())).toList());
		}
	}
}
