package github.killarexe.copper_extension.registry;

import github.killarexe.copper_extension.CEMod;
import net.minecraftforge.eventbus.api.IEventBus;

public class CERegistries{
	public static void register(IEventBus modBus) {
		CEMod.LOGGER.debug("Initializing Copper Extension Items...");
		CEItems.ITEMS.register(modBus);
		CEMod.LOGGER.debug("Copper Extension Items Initialized!");
	}
}
