package github.killarexe.copper_extension.neoforge.registry;

import github.killarexe.copper_extension.neoforge.CENeoForge;
import net.neoforged.bus.api.IEventBus;

public class CERegistries {
  public static void register(IEventBus bus) {
    CENeoForge.LOGGER.debug("Initializing Copper Extension Items...");
    CEGameRules.register();
    CEItems.ITEMS.register(bus);
    CENeoForge.LOGGER.debug("Copper Extension Items Initialized!");
  }
}
