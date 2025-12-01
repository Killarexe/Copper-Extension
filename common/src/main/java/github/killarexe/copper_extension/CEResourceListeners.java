package github.killarexe.copper_extension;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import oshi.util.tuples.Pair;

import java.io.InputStream;
import java.util.Set;

public class CEResourceListeners {

  public static class LightningEffectListener implements ResourceManagerReloadListener {
    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
      Set<ResourceLocation> locations = resourceManager.listResources("lightning_effects", path -> path.toString().endsWith(".json")).keySet();
      for (ResourceLocation location : locations) {
        try (InputStream stream = resourceManager.open(location)) {
          LightningEffect effect = LightningEffect.fromInputStream(stream);
          CEMaps.ARMOR_EFFECTS.put(effect.item().value(), effect.effect());
        } catch (Exception e) {
          CEMod.LOGGER.error("Failed to load LightningEffect resource json at location \"{}\":\n\t{}", location, e);
        }
      }
    }
  }

  public static class OxidationTransformationListener implements ResourceManagerReloadListener {
    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
      Set<ResourceLocation> locations = resourceManager.listResources("oxidation_transformation", path -> path.toString().endsWith(".json")).keySet();
      for (ResourceLocation location : locations) {
        try (InputStream stream = resourceManager.open(location)) {
          OxidationTransformation effect = OxidationTransformation.fromInputStream(stream);
          CEMaps.OXIDATION_MAP_ITEMS.put(effect.base().value(), new Pair<>(effect.oxidized().value(), effect.chanceMultiplier()));
        } catch (Exception e) {
          CEMod.LOGGER.error("Failed to load OxidationTransformation resource json at location \"{}\":\n\t{}", location, e);
        }
      }
    }
  }

  public static class WaxingTransformationListener implements ResourceManagerReloadListener {
    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
      Set<ResourceLocation> locations = resourceManager.listResources("waxing_transformation", path -> path.toString().endsWith(".json")).keySet();
      for (ResourceLocation location : locations) {
        try (InputStream stream = resourceManager.open(location)) {
          WaxingTransformation effect = WaxingTransformation.fromInputStream(stream);
          CEMaps.WAXING_MAP_ITEMS.put(effect.base().value(), effect.waxed().value());
        } catch (Exception e) {
          CEMod.LOGGER.error("Failed to load WaxingTransformation resource json at location \"{}\":\n\t{}", location, e);
        }
      }
    }
  }
}