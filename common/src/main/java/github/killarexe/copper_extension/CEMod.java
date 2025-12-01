package github.killarexe.copper_extension;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CEMod {
  public static final Logger LOGGER = LoggerFactory.getLogger(CEMod.MOD_ID);

  public static final String MOD_ID = "copper_extension";

  public static ResourceLocation id(String id) {
    return ResourceLocation.fromNamespaceAndPath(MOD_ID, id);
  }
}
