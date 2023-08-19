package github.killarexe.copper_extension;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(CopperExtension.MOD_ID)
public class CopperExtension{
	public static final String MOD_ID = "copper_extension";
	public static final Logger LOGGER = LogManager.getLogger();

	public CopperExtension(){
		MinecraftForge.EVENT_BUS.register(this);
	}
}
