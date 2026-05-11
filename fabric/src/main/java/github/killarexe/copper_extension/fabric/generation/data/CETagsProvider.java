package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.resource.CETags;
import github.killarexe.copper_extension.fabric.registry.CEItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class CETagsProvider extends FabricTagProvider.ItemTagProvider {

  public CETagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void addTags(HolderLookup.Provider wrapperLookup) {
    valueLookupBuilder(ItemTags.SWORDS)
            .add(CEItems.EXPOSED_COPPER_SWORD)
            .add(CEItems.WEATHERED_COPPER_SWORD)
            .add(CEItems.OXIDIZED_COPPER_SWORD)
            .add(CEItems.WAXED_COPPER_SWORD)
            .add(CEItems.WAXED_EXPOSED_COPPER_SWORD)
            .add(CEItems.WAXED_WEATHERED_COPPER_SWORD)
            .add(CEItems.WAXED_OXIDIZED_COPPER_SWORD);

    valueLookupBuilder(ItemTags.AXES)
            .add(CEItems.EXPOSED_COPPER_AXE)
            .add(CEItems.WEATHERED_COPPER_AXE)
            .add(CEItems.OXIDIZED_COPPER_AXE)
            .add(CEItems.WAXED_COPPER_AXE)
            .add(CEItems.WAXED_EXPOSED_COPPER_AXE)
            .add(CEItems.WAXED_WEATHERED_COPPER_AXE)
            .add(CEItems.WAXED_OXIDIZED_COPPER_AXE);

    valueLookupBuilder(ItemTags.PICKAXES)
            .add(CEItems.EXPOSED_COPPER_PICKAXE)
            .add(CEItems.WEATHERED_COPPER_PICKAXE)
            .add(CEItems.OXIDIZED_COPPER_PICKAXE)
            .add(CEItems.WAXED_COPPER_PICKAXE)
            .add(CEItems.WAXED_EXPOSED_COPPER_PICKAXE)
            .add(CEItems.WAXED_WEATHERED_COPPER_PICKAXE)
            .add(CEItems.WAXED_OXIDIZED_COPPER_PICKAXE);

    valueLookupBuilder(ItemTags.SHOVELS)
            .add(CEItems.EXPOSED_COPPER_SHOVEL)
            .add(CEItems.WEATHERED_COPPER_SHOVEL)
            .add(CEItems.OXIDIZED_COPPER_SHOVEL)
            .add(CEItems.WAXED_COPPER_SHOVEL)
            .add(CEItems.WAXED_EXPOSED_COPPER_SHOVEL)
            .add(CEItems.WAXED_WEATHERED_COPPER_SHOVEL)
            .add(CEItems.WAXED_OXIDIZED_COPPER_SHOVEL);

    valueLookupBuilder(ItemTags.HOES)
            .add(CEItems.EXPOSED_COPPER_HOE)
            .add(CEItems.WEATHERED_COPPER_HOE)
            .add(CEItems.OXIDIZED_COPPER_HOE)
            .add(CEItems.WAXED_COPPER_HOE)
            .add(CEItems.WAXED_EXPOSED_COPPER_HOE)
            .add(CEItems.WAXED_WEATHERED_COPPER_HOE)
            .add(CEItems.WAXED_OXIDIZED_COPPER_HOE);

    valueLookupBuilder(ItemTags.HEAD_ARMOR)
            .add(CEItems.EXPOSED_COPPER_HELMET)
            .add(CEItems.WEATHERED_COPPER_HELMET)
            .add(CEItems.OXIDIZED_COPPER_HELMET)
            .add(CEItems.WAXED_COPPER_HELMET)
            .add(CEItems.WAXED_EXPOSED_COPPER_HELMET)
            .add(CEItems.WAXED_WEATHERED_COPPER_HELMET)
            .add(CEItems.WAXED_OXIDIZED_COPPER_HELMET);

    valueLookupBuilder(ItemTags.CHEST_ARMOR)
            .add(CEItems.EXPOSED_COPPER_CHESTPLATE)
            .add(CEItems.WEATHERED_COPPER_CHESTPLATE)
            .add(CEItems.OXIDIZED_COPPER_CHESTPLATE)
            .add(CEItems.WAXED_COPPER_CHESTPLATE)
            .add(CEItems.WAXED_EXPOSED_COPPER_CHESTPLATE)
            .add(CEItems.WAXED_WEATHERED_COPPER_CHESTPLATE)
            .add(CEItems.WAXED_OXIDIZED_COPPER_CHESTPLATE);

    valueLookupBuilder(ItemTags.LEG_ARMOR)
            .add(CEItems.EXPOSED_COPPER_LEGGINGS)
            .add(CEItems.WEATHERED_COPPER_LEGGINGS)
            .add(CEItems.OXIDIZED_COPPER_LEGGINGS)
            .add(CEItems.WAXED_COPPER_LEGGINGS)
            .add(CEItems.WAXED_EXPOSED_COPPER_LEGGINGS)
            .add(CEItems.WAXED_WEATHERED_COPPER_LEGGINGS)
            .add(CEItems.WAXED_OXIDIZED_COPPER_LEGGINGS);

    valueLookupBuilder(ItemTags.FOOT_ARMOR)
            .add(CEItems.EXPOSED_COPPER_BOOTS)
            .add(CEItems.WEATHERED_COPPER_BOOTS)
            .add(CEItems.OXIDIZED_COPPER_BOOTS)
            .add(CEItems.WAXED_COPPER_BOOTS)
            .add(CEItems.WAXED_EXPOSED_COPPER_BOOTS)
            .add(CEItems.WAXED_WEATHERED_COPPER_BOOTS)
            .add(CEItems.WAXED_OXIDIZED_COPPER_BOOTS);

    valueLookupBuilder(CETags.REPAIRS_WAXED_COPPER_ARMOR).add(CEItems.WAXED_COPPER_INGOT);
    valueLookupBuilder(CETags.REPAIRS_WAXED_EXPOSED_COPPER_ARMOR).add(CEItems.WAXED_EXPOSED_COPPER_INGOT);
    valueLookupBuilder(CETags.REPAIRS_WAXED_WEATHERED_COPPER_ARMOR).add(CEItems.WAXED_WEATHERED_COPPER_INGOT);
    valueLookupBuilder(CETags.REPAIRS_WAXED_OXIDIZED_COPPER_ARMOR).add(CEItems.WAXED_OXIDIZED_COPPER_INGOT);
    valueLookupBuilder(CETags.REPAIRS_EXPOSED_COPPER_ARMOR).add(CEItems.EXPOSED_COPPER_INGOT);
    valueLookupBuilder(CETags.REPAIRS_WEATHERED_COPPER_ARMOR).add(CEItems.WEATHERED_COPPER_INGOT);
    valueLookupBuilder(CETags.REPAIRS_OXIDIZED_COPPER_ARMOR).add(CEItems.OXIDIZED_COPPER_INGOT);
  }
}
