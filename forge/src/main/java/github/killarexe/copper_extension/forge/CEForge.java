package github.killarexe.copper_extension.forge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.forge.registry.CERegistries;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CEMod.MOD_ID)
public class CEForge {
  public static final Logger LOGGER = LogManager.getLogger();

  public CEForge() {
    IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
    CERegistries.register(modBus);
    MinecraftForge.EVENT_BUS.register(this);
  }
}
