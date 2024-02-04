package github.killarexe.copper_extension.forge.registry;

import github.killarexe.copper_extension.forge.CEForge;
import net.minecraftforge.eventbus.api.IEventBus;

public class CERegistries {
  public static void register(IEventBus modBus) {
    CEForge.LOGGER.debug("Initializing Copper Extension Items...");
    CEGameRules.register();
    CEItems.ITEMS.register(modBus);
    CEForge.LOGGER.debug("Copper Extension Items Initialized!");
  }
}
