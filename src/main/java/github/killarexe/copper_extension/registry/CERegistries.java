package github.killarexe.copper_extension.registry;

import github.killarexe.copper_extension.CEMod;

public class CERegistries {
	public static void register() {
		CEMod.LOGGER.debug("Initializing Copper Extension Items...");
		CEGameRules.register();
		CEItems.register();
		CEMod.LOGGER.debug("Copper Extension Items Initialized!");
	}
}
