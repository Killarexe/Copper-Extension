package github.killarexe.copper_extension;

import org.apache.logging.log4j.Logger;

import github.killarexe.copper_extension.common.event.CEEvents;
import github.killarexe.copper_extension.registry.CERegistries;

import org.apache.logging.log4j.LogManager;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CEMod.MOD_ID)
public class CEMod{
	public static final String MOD_ID = "copper_extension";
	public static final Logger LOGGER = LogManager.getLogger();

	public CEMod(){
		IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
		CERegistries.register(modBus);
		CEEvents.registerEvents(modBus, MinecraftForge.EVENT_BUS);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public static ResourceLocation res(String loc) {
		return new ResourceLocation(MOD_ID, loc);
	}
}
