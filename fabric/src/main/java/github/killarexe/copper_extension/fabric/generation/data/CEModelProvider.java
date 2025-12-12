package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.fabric.registry.CEItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class CEModelProvider extends FabricModelProvider {
  public CEModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

  }

  @Override
  public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
  }
}
