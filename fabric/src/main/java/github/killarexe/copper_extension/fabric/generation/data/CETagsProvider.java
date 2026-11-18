package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.resource.CEItemIds;
import github.killarexe.copper_extension.resource.CETags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class CETagsProvider extends FabricTagsProvider.ItemTagsProvider {

  public CETagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void addTags(HolderLookup.@NonNull Provider wrapperLookup) {
    builder(ItemTags.SWORDS)
            .add(CEItemIds.EXPOSED_COPPER_SWORD)
            .add(CEItemIds.WEATHERED_COPPER_SWORD)
            .add(CEItemIds.OXIDIZED_COPPER_SWORD)
            .add(CEItemIds.WAXED_COPPER_SWORD)
            .add(CEItemIds.WAXED_EXPOSED_COPPER_SWORD)
            .add(CEItemIds.WAXED_WEATHERED_COPPER_SWORD)
            .add(CEItemIds.WAXED_OXIDIZED_COPPER_SWORD);

    builder(ItemTags.AXES)
            .add(CEItemIds.EXPOSED_COPPER_AXE)
            .add(CEItemIds.WEATHERED_COPPER_AXE)
            .add(CEItemIds.OXIDIZED_COPPER_AXE)
            .add(CEItemIds.WAXED_COPPER_AXE)
            .add(CEItemIds.WAXED_EXPOSED_COPPER_AXE)
            .add(CEItemIds.WAXED_WEATHERED_COPPER_AXE)
            .add(CEItemIds.WAXED_OXIDIZED_COPPER_AXE);

    builder(ItemTags.PICKAXES)
            .add(CEItemIds.EXPOSED_COPPER_PICKAXE)
            .add(CEItemIds.WEATHERED_COPPER_PICKAXE)
            .add(CEItemIds.OXIDIZED_COPPER_PICKAXE)
            .add(CEItemIds.WAXED_COPPER_PICKAXE)
            .add(CEItemIds.WAXED_EXPOSED_COPPER_PICKAXE)
            .add(CEItemIds.WAXED_WEATHERED_COPPER_PICKAXE)
            .add(CEItemIds.WAXED_OXIDIZED_COPPER_PICKAXE);

    builder(ItemTags.SHOVELS)
            .add(CEItemIds.EXPOSED_COPPER_SHOVEL)
            .add(CEItemIds.WEATHERED_COPPER_SHOVEL)
            .add(CEItemIds.OXIDIZED_COPPER_SHOVEL)
            .add(CEItemIds.WAXED_COPPER_SHOVEL)
            .add(CEItemIds.WAXED_EXPOSED_COPPER_SHOVEL)
            .add(CEItemIds.WAXED_WEATHERED_COPPER_SHOVEL)
            .add(CEItemIds.WAXED_OXIDIZED_COPPER_SHOVEL);

    builder(ItemTags.HOES)
            .add(CEItemIds.EXPOSED_COPPER_HOE)
            .add(CEItemIds.WEATHERED_COPPER_HOE)
            .add(CEItemIds.OXIDIZED_COPPER_HOE)
            .add(CEItemIds.WAXED_COPPER_HOE)
            .add(CEItemIds.WAXED_EXPOSED_COPPER_HOE)
            .add(CEItemIds.WAXED_WEATHERED_COPPER_HOE)
            .add(CEItemIds.WAXED_OXIDIZED_COPPER_HOE);

    builder(ItemTags.SPEARS)
            .add(CEItemIds.EXPOSED_COPPER_SPEAR)
            .add(CEItemIds.WEATHERED_COPPER_SPEAR)
            .add(CEItemIds.OXIDIZED_COPPER_SPEAR)
            .add(CEItemIds.WAXED_COPPER_SPEAR)
            .add(CEItemIds.WAXED_EXPOSED_COPPER_SPEAR)
            .add(CEItemIds.WAXED_WEATHERED_COPPER_SPEAR)
            .add(CEItemIds.WAXED_OXIDIZED_COPPER_SPEAR);

    builder(ItemTags.HEAD_ARMOR)
            .add(CEItemIds.EXPOSED_COPPER_HELMET)
            .add(CEItemIds.WEATHERED_COPPER_HELMET)
            .add(CEItemIds.OXIDIZED_COPPER_HELMET)
            .add(CEItemIds.WAXED_COPPER_HELMET)
            .add(CEItemIds.WAXED_EXPOSED_COPPER_HELMET)
            .add(CEItemIds.WAXED_WEATHERED_COPPER_HELMET)
            .add(CEItemIds.WAXED_OXIDIZED_COPPER_HELMET);

    builder(ItemTags.CHEST_ARMOR)
            .add(CEItemIds.EXPOSED_COPPER_CHESTPLATE)
            .add(CEItemIds.WEATHERED_COPPER_CHESTPLATE)
            .add(CEItemIds.OXIDIZED_COPPER_CHESTPLATE)
            .add(CEItemIds.WAXED_COPPER_CHESTPLATE)
            .add(CEItemIds.WAXED_EXPOSED_COPPER_CHESTPLATE)
            .add(CEItemIds.WAXED_WEATHERED_COPPER_CHESTPLATE)
            .add(CEItemIds.WAXED_OXIDIZED_COPPER_CHESTPLATE);

    builder(ItemTags.LEG_ARMOR)
            .add(CEItemIds.EXPOSED_COPPER_LEGGINGS)
            .add(CEItemIds.WEATHERED_COPPER_LEGGINGS)
            .add(CEItemIds.OXIDIZED_COPPER_LEGGINGS)
            .add(CEItemIds.WAXED_COPPER_LEGGINGS)
            .add(CEItemIds.WAXED_EXPOSED_COPPER_LEGGINGS)
            .add(CEItemIds.WAXED_WEATHERED_COPPER_LEGGINGS)
            .add(CEItemIds.WAXED_OXIDIZED_COPPER_LEGGINGS);

    builder(ItemTags.FOOT_ARMOR)
            .add(CEItemIds.EXPOSED_COPPER_BOOTS)
            .add(CEItemIds.WEATHERED_COPPER_BOOTS)
            .add(CEItemIds.OXIDIZED_COPPER_BOOTS)
            .add(CEItemIds.WAXED_COPPER_BOOTS)
            .add(CEItemIds.WAXED_EXPOSED_COPPER_BOOTS)
            .add(CEItemIds.WAXED_WEATHERED_COPPER_BOOTS)
            .add(CEItemIds.WAXED_OXIDIZED_COPPER_BOOTS);

    builder(CETags.REPAIRS_WAXED_COPPER_ARMOR).add(CEItemIds.WAXED_COPPER_INGOT);
    builder(CETags.REPAIRS_WAXED_EXPOSED_COPPER_ARMOR).add(CEItemIds.WAXED_EXPOSED_COPPER_INGOT);
    builder(CETags.REPAIRS_WAXED_WEATHERED_COPPER_ARMOR).add(CEItemIds.WAXED_WEATHERED_COPPER_INGOT);
    builder(CETags.REPAIRS_WAXED_OXIDIZED_COPPER_ARMOR).add(CEItemIds.WAXED_OXIDIZED_COPPER_INGOT);
    builder(CETags.REPAIRS_EXPOSED_COPPER_ARMOR).add(CEItemIds.EXPOSED_COPPER_INGOT);
    builder(CETags.REPAIRS_WEATHERED_COPPER_ARMOR).add(CEItemIds.WEATHERED_COPPER_INGOT);
    builder(CETags.REPAIRS_OXIDIZED_COPPER_ARMOR).add(CEItemIds.OXIDIZED_COPPER_INGOT);
  }
}
