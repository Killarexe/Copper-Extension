package github.killarexe.copper_extension.fabric;

import github.killarexe.copper_extension.fabric.registry.CERegistries;
import net.fabricmc.api.ModInitializer;

public class CEFabric implements ModInitializer {
  @Override
  public void onInitialize() {
    CERegistries.register();
  }
}
