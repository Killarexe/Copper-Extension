package github.killarexe.copper_extension.forge.registry;

import github.killarexe.copper_extension.forge.CEForge;
import net.neoforged.bus.api.IEventBus;

public class CERegistries {
  public static void register(IEventBus bus) {
    CEForge.LOGGER.debug("Initializing Copper Extension Items...");
    CEGameRules.register();
    CEItems.ITEMS.register(bus);
    CEForge.LOGGER.debug("Copper Extension Items Initialized!");
  }
}
