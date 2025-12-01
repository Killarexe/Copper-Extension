package github.killarexe.copper_extension.neoforge.registry;

import github.killarexe.copper_extension.CEMod;
import net.neoforged.bus.api.IEventBus;

public class CERegistries {
  public static void register(IEventBus bus) {
    CEMod.LOGGER.debug("Initializing Copper Extension Items...");
    CEGameRules.register();
    CEItems.ITEMS.register(bus);
    CEMod.LOGGER.debug("Copper Extension Items Initialized!");
  }
}
