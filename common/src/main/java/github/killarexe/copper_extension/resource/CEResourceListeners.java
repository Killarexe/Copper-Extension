package github.killarexe.copper_extension.resource;

import github.killarexe.copper_extension.CEMaps;
import github.killarexe.copper_extension.CEMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import oshi.util.tuples.Pair;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CEResourceListeners {

  public static class LightningEffectListener implements ResourceManagerReloadListener {
    private void appendLightningEffect(LightningEffect effect) {
      if (CEMaps.ARMOR_EFFECTS.containsKey(effect.item().value())) {
        if (effect.replace()) {
          CEMaps.ARMOR_EFFECTS.replace(effect.item().value(), new ArrayList<>(List.of(effect.effect())));
        } else {
          CEMaps.ARMOR_EFFECTS.get(effect.item().value()).add(effect.effect());
        }
      } else {
        CEMaps.ARMOR_EFFECTS.put(effect.item().value(), new ArrayList<>(List.of(effect.effect())));
      }
    }

    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
      CEMaps.ARMOR_EFFECTS.clear();
      Set<ResourceLocation> locations = resourceManager.listResources("lightning_effect", path -> path.toString().endsWith(".json")).keySet();
      for (ResourceLocation location : locations) {
        try (InputStream stream = resourceManager.open(location)) {
          LightningEffect effect = LightningEffect.fromInputStream(stream);
          appendLightningEffect(effect);
        } catch (Exception e) {
          CEMod.LOGGER.error("Failed to load LightningEffect resource json at location \"{}\"\n\t:", location, e);
        }
      }
    }
  }

  public static class OxidationTransformationListener implements ResourceManagerReloadListener {
    private void appendOxidationTransformation(OxidationTransformation transformation) {
      if (transformation.replace() && CEMaps.OXIDATION_MAP_ITEMS.containsKey(transformation.base().value())) {
        CEMaps.OXIDATION_MAP_ITEMS.replace(transformation.base().value(), new Pair<>(transformation.oxidized().value(), transformation.chanceMultiplier()));
      } else {
        CEMaps.OXIDATION_MAP_ITEMS.putIfAbsent(transformation.base().value(), new Pair<>(transformation.oxidized().value(), transformation.chanceMultiplier()));
      }
    }
    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
      CEMaps.OXIDATION_MAP_ITEMS.clear();
      Set<ResourceLocation> locations = resourceManager.listResources("oxidation_transformation", path -> path.toString().endsWith(".json")).keySet();
      for (ResourceLocation location : locations) {
        try (InputStream stream = resourceManager.open(location)) {
          OxidationTransformation transformation = OxidationTransformation.fromInputStream(stream);
          appendOxidationTransformation(transformation);
        } catch (Exception e) {
          CEMod.LOGGER.error("Failed to load OxidationTransformation resource json at location \"{}\":\n\t", location, e);
        }
      }
    }
  }

  public static class WaxingTransformationListener implements ResourceManagerReloadListener {
    private void appendWaxingTransformation(WaxingTransformation transformation) {
      if (transformation.replace() && CEMaps.WAXING_MAP_ITEMS.containsKey(transformation.base().value())) {
        CEMaps.WAXING_MAP_ITEMS.replace(transformation.base().value(), transformation.waxed().value());
      } else {
        CEMaps.WAXING_MAP_ITEMS.putIfAbsent(transformation.base().value(), transformation.waxed().value());
      }
    }

    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
      CEMaps.WAXING_MAP_ITEMS.clear();
      Set<ResourceLocation> locations = resourceManager.listResources("waxing_transformation", path -> path.toString().endsWith(".json")).keySet();
      for (ResourceLocation location : locations) {
        try (InputStream stream = resourceManager.open(location)) {
          WaxingTransformation transformation = WaxingTransformation.fromInputStream(stream);
          appendWaxingTransformation(transformation);
        } catch (Exception e) {
          CEMod.LOGGER.error("Failed to load WaxingTransformation resource json at location \"{}\":\n\t", location, e);
        }
      }
    }
  }
}