package github.killarexe.copper_extension;

import net.minecraft.resources.ResourceLocation;

public class CEMod {
  public static final String MOD_ID = "copper_extension";

  public static ResourceLocation id(String id) {
    return new ResourceLocation(MOD_ID, id);
  }
}
