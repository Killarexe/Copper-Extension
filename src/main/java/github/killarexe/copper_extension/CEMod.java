package github.killarexe.copper_extension;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import github.killarexe.copper_extension.registry.CERegistries;

public class CEMod implements ModInitializer {
    public static final String MOD_ID = "copper_extension";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CERegistries.register();
	}
}
