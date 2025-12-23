package github.killarexe.copper_extension.fabric.registry;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.resource.CEResourceListeners;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.minecraft.server.packs.PackType;

public class CERegistries {
  public static void register() {
    CEMod.LOGGER.debug("Initializing Copper Extension Game Rules...");
    CEGameRules.register();
    CEMod.LOGGER.debug("Initializing Copper Extension Items...");
    CEItems.register();
    CEMod.LOGGER.debug("Initializing Copper Extension Data Listeners...");
    ResourceLoader.get(PackType.SERVER_DATA).registerReloader(CEMod.id("lightning_effects"), new CEResourceListeners.LightningEffectListener());
    ResourceLoader.get(PackType.SERVER_DATA).registerReloader(CEMod.id("oxidation_transformation"), new CEResourceListeners.OxidationTransformationListener());
    ResourceLoader.get(PackType.SERVER_DATA).registerReloader(CEMod.id("waxing_transformation"), new CEResourceListeners.WaxingTransformationListener());
    CEMod.LOGGER.debug("Copper Extension Items Initialized!");
  }
}
