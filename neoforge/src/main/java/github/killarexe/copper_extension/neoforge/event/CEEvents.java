package github.killarexe.copper_extension.neoforge.event;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.neoforge.registry.CEItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class CEEvents {
	public static void registerEvents(IEventBus bus) {
		CEMod.LOGGER.debug("Initiliazing Copper Extension Events...");
		bus.addListener(CEEvents::addItemsToCreativeTabsEvent);
		CEMod.LOGGER.debug("Copper Extension Events Initiliazed!");
	}

	private static void addItemsToCreativeTabsEvent(BuildCreativeModeTabContentsEvent event) {
		if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			event.acceptAll(CEItems.ITEMS.getEntries().stream().map(item -> new ItemStack(item.get())).toList());
		}
	}
}
