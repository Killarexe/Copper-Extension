package github.killarexe.copper_extension.forge;

import github.killarexe.copper_extension.forge.event.CEEvents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.forge.registry.CERegistries;

@Mod(CEMod.MOD_ID)
public class CEForge {
  public static final Logger LOGGER = LogManager.getLogger();

  public CEForge(IEventBus bus, ModContainer container) {
    CERegistries.register(bus);
    CEEvents.registerEvents(bus);
  }
}
