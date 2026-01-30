package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.fabric.generation.data.provider.OxidationTransformationProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

import static github.killarexe.copper_extension.fabric.registry.CEItems.*;

public class CEOxidationProvider extends OxidationTransformationProvider {
  public CEOxidationProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void generate(BiConsumer<Identifier, OxidationTransformationBuilder> consumer) {
    addVanillaTransformations(consumer);

    oxidation(consumer, Items.COPPER_INGOT, EXPOSED_COPPER_INGOT, 2.0f);
    oxidation(consumer, EXPOSED_COPPER_INGOT, WEATHERED_COPPER_INGOT, 2.0f);
    oxidation(consumer, WEATHERED_COPPER_INGOT, OXIDIZED_COPPER_INGOT, 2.0f);

    oxidation(consumer, Items.COPPER_NUGGET, EXPOSED_COPPER_NUGGET, 4.0f);
    oxidation(consumer, EXPOSED_COPPER_NUGGET, WEATHERED_COPPER_NUGGET, 4.0f);
    oxidation(consumer, WEATHERED_COPPER_NUGGET, OXIDIZED_COPPER_NUGGET, 4.0f);

    oxidation(consumer, Items.COPPER_HELMET, EXPOSED_COPPER_HELMET, 1.5f);
    oxidation(consumer, Items.COPPER_CHESTPLATE, EXPOSED_COPPER_CHESTPLATE, 1.8f);
    oxidation(consumer, Items.COPPER_LEGGINGS, EXPOSED_COPPER_LEGGINGS, 1.7f);
    oxidation(consumer, Items.COPPER_BOOTS, EXPOSED_COPPER_BOOTS, 1.4f);
    oxidation(consumer, EXPOSED_COPPER_HELMET, WEATHERED_COPPER_HELMET, 1.5f);
    oxidation(consumer, EXPOSED_COPPER_CHESTPLATE, WEATHERED_COPPER_CHESTPLATE, 1.8f);
    oxidation(consumer, EXPOSED_COPPER_LEGGINGS, WEATHERED_COPPER_LEGGINGS, 1.7f);
    oxidation(consumer, EXPOSED_COPPER_BOOTS, WEATHERED_COPPER_BOOTS, 1.4f);
    oxidation(consumer, WEATHERED_COPPER_HELMET, OXIDIZED_COPPER_HELMET, 1.5f);
    oxidation(consumer, WEATHERED_COPPER_CHESTPLATE, OXIDIZED_COPPER_CHESTPLATE, 1.8f);
    oxidation(consumer, WEATHERED_COPPER_LEGGINGS, OXIDIZED_COPPER_LEGGINGS, 1.7f);
    oxidation(consumer, WEATHERED_COPPER_BOOTS, OXIDIZED_COPPER_BOOTS, 1.4f);

    oxidation(consumer, Items.COPPER_SWORD, EXPOSED_COPPER_SWORD, 1.2f);
    oxidation(consumer, EXPOSED_COPPER_SWORD, WEATHERED_COPPER_SWORD, 1.2f);
    oxidation(consumer, WEATHERED_COPPER_SWORD, OXIDIZED_COPPER_SWORD, 1.2f);
    oxidation(consumer, Items.COPPER_AXE, EXPOSED_COPPER_AXE, 1.3f);
    oxidation(consumer, EXPOSED_COPPER_AXE, WEATHERED_COPPER_AXE, 1.3f);
    oxidation(consumer, WEATHERED_COPPER_AXE, OXIDIZED_COPPER_AXE, 1.3f);
    oxidation(consumer, Items.COPPER_PICKAXE, EXPOSED_COPPER_PICKAXE, 1.3f);
    oxidation(consumer, EXPOSED_COPPER_PICKAXE, WEATHERED_COPPER_PICKAXE, 1.3f);
    oxidation(consumer, WEATHERED_COPPER_PICKAXE, OXIDIZED_COPPER_PICKAXE, 1.3f);
    oxidation(consumer, Items.COPPER_SHOVEL, EXPOSED_COPPER_SHOVEL, 1.1f);
    oxidation(consumer, EXPOSED_COPPER_SHOVEL, WEATHERED_COPPER_SHOVEL, 1.1f);
    oxidation(consumer, WEATHERED_COPPER_SHOVEL, OXIDIZED_COPPER_SHOVEL, 1.1f);
    oxidation(consumer, Items.COPPER_HOE, EXPOSED_COPPER_HOE, 1.2f);
    oxidation(consumer, EXPOSED_COPPER_HOE, WEATHERED_COPPER_HOE, 1.2f);
    oxidation(consumer, WEATHERED_COPPER_HOE, OXIDIZED_COPPER_HOE, 1.2f);
  }
}
