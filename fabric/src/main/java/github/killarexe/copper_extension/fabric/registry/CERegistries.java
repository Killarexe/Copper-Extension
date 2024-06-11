package github.killarexe.copper_extension.fabric.registry;

import github.killarexe.copper_extension.fabric.CEFabric;
import github.killarexe.copper_extension.registry.CEGameRules;

public class CERegistries {
  public static void register() {
    CEFabric.LOGGER.debug("Initializing Copper Extension Game Rules...");
    CEGameRules.register();
    CEFabric.LOGGER.debug("Initializing Copper Extension Items...");
    CEItems.register();
    CEFabric.LOGGER.debug("Copper Extension Items Initialized!");
  }
}
