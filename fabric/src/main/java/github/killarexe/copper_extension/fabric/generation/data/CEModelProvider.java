package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.fabric.registry.CEItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.jspecify.annotations.NonNull;

public class CEModelProvider extends FabricModelProvider {
  public CEModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(@NonNull BlockModelGenerators blockStateModelGenerator) {

  }

  @Override
  public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_INGOT, Items.COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_INGOT, CEItems.EXPOSED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_INGOT, CEItems.WEATHERED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_INGOT, CEItems.OXIDIZED_COPPER_INGOT, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_NUGGET, Items.COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_NUGGET, CEItems.EXPOSED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_NUGGET, CEItems.WEATHERED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_NUGGET, CEItems.OXIDIZED_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_NAUTILUS_ARMOR, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_NAUTILUS_ARMOR, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_NAUTILUS_ARMOR, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_HELMET, Items.COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_CHESTPLATE, Items.COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_LEGGINGS, Items.COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_BOOTS, Items.COPPER_BOOTS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_HORSE_ARMOR, Items.COPPER_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_NAUTILUS_ARMOR, Items.COPPER_NAUTILUS_ARMOR, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_HELMET, CEItems.EXPOSED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_CHESTPLATE, CEItems.EXPOSED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_LEGGINGS, CEItems.EXPOSED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_BOOTS, CEItems.EXPOSED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_HORSE_ARMOR, CEItems.EXPOSED_COPPER_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_NAUTILUS_ARMOR, CEItems.EXPOSED_COPPER_NAUTILUS_ARMOR, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_HELMET, CEItems.WEATHERED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_CHESTPLATE, CEItems.WEATHERED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_LEGGINGS, CEItems.WEATHERED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_BOOTS, CEItems.WEATHERED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_HORSE_ARMOR, CEItems.WEATHERED_COPPER_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_NAUTILUS_ARMOR, CEItems.WEATHERED_COPPER_NAUTILUS_ARMOR, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_HELMET, CEItems.OXIDIZED_COPPER_HELMET, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_CHESTPLATE, CEItems.OXIDIZED_COPPER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_LEGGINGS, CEItems.OXIDIZED_COPPER_LEGGINGS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_BOOTS, CEItems.OXIDIZED_COPPER_BOOTS, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_HORSE_ARMOR, CEItems.OXIDIZED_COPPER_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_NAUTILUS_ARMOR, CEItems.OXIDIZED_COPPER_NAUTILUS_ARMOR, ModelTemplates.FLAT_ITEM);

    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.EXPOSED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateSpear(CEItems.EXPOSED_COPPER_SPEAR);

    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WEATHERED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateSpear(CEItems.WEATHERED_COPPER_SPEAR);

    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.OXIDIZED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateSpear(CEItems.OXIDIZED_COPPER_SPEAR);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_SWORD, Items.COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_AXE, Items.COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_PICKAXE, Items.COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_SHOVEL, Items.COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_COPPER_HOE, Items.COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
    generateSpear(itemModelGenerator, CEItems.WAXED_COPPER_SPEAR, Items.COPPER_SPEAR);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_SWORD, CEItems.EXPOSED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_AXE, CEItems.EXPOSED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_PICKAXE, CEItems.EXPOSED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_SHOVEL, CEItems.EXPOSED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_EXPOSED_COPPER_HOE, CEItems.EXPOSED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
    generateSpear(itemModelGenerator, CEItems.WAXED_EXPOSED_COPPER_SPEAR, CEItems.EXPOSED_COPPER_SPEAR);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_SWORD, CEItems.WEATHERED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_AXE, CEItems.WEATHERED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_PICKAXE, CEItems.WEATHERED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_SHOVEL, CEItems.WEATHERED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_WEATHERED_COPPER_HOE, CEItems.WEATHERED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
    generateSpear(itemModelGenerator, CEItems.WAXED_WEATHERED_COPPER_SPEAR, CEItems.WEATHERED_COPPER_SPEAR);

    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_SWORD, CEItems.OXIDIZED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_AXE, CEItems.OXIDIZED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_PICKAXE, CEItems.OXIDIZED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_SHOVEL, CEItems.OXIDIZED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerator.generateFlatItem(CEItems.WAXED_OXIDIZED_COPPER_HOE, CEItems.OXIDIZED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
    generateSpear(itemModelGenerator, CEItems.WAXED_OXIDIZED_COPPER_SPEAR, CEItems.OXIDIZED_COPPER_SPEAR);
  }

  private void generateSpear(ItemModelGenerators generators, Item item, Item textureItem) {
    ItemModel.Unbaked unbaked = ItemModelUtils.plainModel(generators.createFlatItemModel(item, textureItem, ModelTemplates.FLAT_ITEM));
    ItemModel.Unbaked unbaked2 = ItemModelUtils.plainModel(ModelTemplates.SPEAR_IN_HAND.create(item, TextureMapping.layer0(TextureMapping.getItemTexture(textureItem, "_in_hand")), generators.modelOutput));
    generators.itemModelOutput.accept(item, ItemModelGenerators.createFlatModelDispatch(unbaked, unbaked2), new ClientItem.Properties(true, false, 1.95F));
  }
}
