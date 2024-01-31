package github.killarexe.copper_extension.fabric;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.fabric.registry.CERegistries;
import net.fabricmc.api.ModInitializer;

public class CEFabric implements ModInitializer {

  public static final Logger LOGGER = LoggerFactory.getLogger(CEMod.MOD_ID);

  @Override
  public void onInitialize() {
    CERegistries.register();
  }
}
