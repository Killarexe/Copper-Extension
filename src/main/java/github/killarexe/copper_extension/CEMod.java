package github.killarexe.copper_extension;

import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CEMod {
  public static final Logger LOGGER = LoggerFactory.getLogger(CEMod.MOD_ID);

  public static final String MOD_ID = "copper_extension";

  public static Identifier id(String id) {
    return Identifier.fromNamespaceAndPath(MOD_ID, id);
  }
}
