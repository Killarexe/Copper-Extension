package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.fabric.generation.data.provider.WaxingTransformationProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

import static github.killarexe.copper_extension.fabric.registry.CEItems.*;

public class CEWaxingProvider extends WaxingTransformationProvider {
  public CEWaxingProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void generate(BiConsumer<Identifier, WaxingTransformationBuilder> consumer) {
    addVanillaTransformations(consumer);

    waxing(consumer, Items.COPPER_INGOT, WAXED_COPPER_INGOT);
    waxing(consumer, EXPOSED_COPPER_INGOT, WAXED_EXPOSED_COPPER_INGOT);
    waxing(consumer, WEATHERED_COPPER_INGOT, WAXED_WEATHERED_COPPER_INGOT);
    waxing(consumer, OXIDIZED_COPPER_INGOT, WAXED_OXIDIZED_COPPER_INGOT);

    waxing(consumer, Items.COPPER_NUGGET, WAXED_COPPER_NUGGET);
    waxing(consumer, EXPOSED_COPPER_NUGGET, WAXED_EXPOSED_COPPER_NUGGET);
    waxing(consumer, WEATHERED_COPPER_NUGGET, WAXED_WEATHERED_COPPER_NUGGET);
    waxing(consumer, OXIDIZED_COPPER_NUGGET, WAXED_OXIDIZED_COPPER_NUGGET);

    waxing(consumer, Items.COPPER_HELMET, WAXED_COPPER_HELMET);
    waxing(consumer, Items.COPPER_CHESTPLATE, WAXED_COPPER_CHESTPLATE);
    waxing(consumer, Items.COPPER_LEGGINGS, WAXED_COPPER_LEGGINGS);
    waxing(consumer, Items.COPPER_BOOTS, WAXED_COPPER_BOOTS);
    waxing(consumer, EXPOSED_COPPER_HELMET, WAXED_EXPOSED_COPPER_HELMET);
    waxing(consumer, EXPOSED_COPPER_CHESTPLATE, WAXED_EXPOSED_COPPER_CHESTPLATE);
    waxing(consumer, EXPOSED_COPPER_LEGGINGS, WAXED_EXPOSED_COPPER_LEGGINGS);
    waxing(consumer, EXPOSED_COPPER_BOOTS, WAXED_EXPOSED_COPPER_BOOTS);
    waxing(consumer, WEATHERED_COPPER_HELMET, WAXED_WEATHERED_COPPER_HELMET);
    waxing(consumer, WEATHERED_COPPER_CHESTPLATE, WAXED_WEATHERED_COPPER_CHESTPLATE);
    waxing(consumer, WEATHERED_COPPER_LEGGINGS, WAXED_WEATHERED_COPPER_LEGGINGS);
    waxing(consumer, WEATHERED_COPPER_BOOTS, WAXED_WEATHERED_COPPER_BOOTS);
    waxing(consumer, OXIDIZED_COPPER_HELMET, WAXED_OXIDIZED_COPPER_HELMET);
    waxing(consumer, OXIDIZED_COPPER_CHESTPLATE, WAXED_OXIDIZED_COPPER_CHESTPLATE);
    waxing(consumer, OXIDIZED_COPPER_LEGGINGS, WAXED_OXIDIZED_COPPER_LEGGINGS);
    waxing(consumer, OXIDIZED_COPPER_BOOTS, WAXED_OXIDIZED_COPPER_BOOTS);

    waxing(consumer, Items.COPPER_SWORD, WAXED_COPPER_SWORD);
    waxing(consumer, Items.COPPER_AXE, WAXED_COPPER_AXE);
    waxing(consumer, Items.COPPER_PICKAXE, WAXED_COPPER_PICKAXE);
    waxing(consumer, Items.COPPER_SHOVEL, WAXED_COPPER_SHOVEL);
    waxing(consumer, Items.COPPER_HOE, WAXED_COPPER_HOE);
    waxing(consumer, EXPOSED_COPPER_SWORD, WAXED_EXPOSED_COPPER_SWORD);
    waxing(consumer, EXPOSED_COPPER_AXE, WAXED_EXPOSED_COPPER_AXE);
    waxing(consumer, EXPOSED_COPPER_PICKAXE, WAXED_EXPOSED_COPPER_PICKAXE);
    waxing(consumer, EXPOSED_COPPER_SHOVEL, WAXED_EXPOSED_COPPER_SHOVEL);
    waxing(consumer, EXPOSED_COPPER_HOE, WAXED_EXPOSED_COPPER_HOE);
    waxing(consumer, WEATHERED_COPPER_SWORD, WAXED_WEATHERED_COPPER_SWORD);
    waxing(consumer, WEATHERED_COPPER_AXE, WAXED_WEATHERED_COPPER_AXE);
    waxing(consumer, WEATHERED_COPPER_PICKAXE, WAXED_WEATHERED_COPPER_PICKAXE);
    waxing(consumer, WEATHERED_COPPER_SHOVEL, WAXED_WEATHERED_COPPER_SHOVEL);
    waxing(consumer, WEATHERED_COPPER_HOE, WAXED_WEATHERED_COPPER_HOE);
    waxing(consumer, OXIDIZED_COPPER_SWORD, WAXED_OXIDIZED_COPPER_SWORD);
    waxing(consumer, OXIDIZED_COPPER_AXE, WAXED_OXIDIZED_COPPER_AXE);
    waxing(consumer, OXIDIZED_COPPER_PICKAXE, WAXED_OXIDIZED_COPPER_PICKAXE);
    waxing(consumer, OXIDIZED_COPPER_SHOVEL, WAXED_OXIDIZED_COPPER_SHOVEL);
    waxing(consumer, OXIDIZED_COPPER_HOE, WAXED_OXIDIZED_COPPER_HOE);
  }
}
