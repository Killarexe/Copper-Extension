package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.resource.CETags;
import github.killarexe.copper_extension.fabric.registry.CEItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.ItemIds;
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
            .add(CEItems.EXPOSED_COPPER_SWORD.builtInRegistryHolder().key())
            .add(CEItems.WEATHERED_COPPER_SWORD.builtInRegistryHolder().key())
            .add(CEItems.OXIDIZED_COPPER_SWORD.builtInRegistryHolder().key())
            .add(CEItems.WAXED_COPPER_SWORD.builtInRegistryHolder().key())
            .add(CEItems.WAXED_EXPOSED_COPPER_SWORD.builtInRegistryHolder().key())
            .add(CEItems.WAXED_WEATHERED_COPPER_SWORD.builtInRegistryHolder().key())
            .add(CEItems.WAXED_OXIDIZED_COPPER_SWORD.builtInRegistryHolder().key());

    builder(ItemTags.AXES)
            .add(CEItems.EXPOSED_COPPER_AXE.builtInRegistryHolder().key())
            .add(CEItems.WEATHERED_COPPER_AXE.builtInRegistryHolder().key())
            .add(CEItems.OXIDIZED_COPPER_AXE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_COPPER_AXE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_EXPOSED_COPPER_AXE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_WEATHERED_COPPER_AXE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_OXIDIZED_COPPER_AXE.builtInRegistryHolder().key());

    builder(ItemTags.PICKAXES)
            .add(CEItems.EXPOSED_COPPER_PICKAXE.builtInRegistryHolder().key())
            .add(CEItems.WEATHERED_COPPER_PICKAXE.builtInRegistryHolder().key())
            .add(CEItems.OXIDIZED_COPPER_PICKAXE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_COPPER_PICKAXE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_EXPOSED_COPPER_PICKAXE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_WEATHERED_COPPER_PICKAXE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_OXIDIZED_COPPER_PICKAXE.builtInRegistryHolder().key());

    builder(ItemTags.SHOVELS)
            .add(CEItems.EXPOSED_COPPER_SHOVEL.builtInRegistryHolder().key())
            .add(CEItems.WEATHERED_COPPER_SHOVEL.builtInRegistryHolder().key())
            .add(CEItems.OXIDIZED_COPPER_SHOVEL.builtInRegistryHolder().key())
            .add(CEItems.WAXED_COPPER_SHOVEL.builtInRegistryHolder().key())
            .add(CEItems.WAXED_EXPOSED_COPPER_SHOVEL.builtInRegistryHolder().key())
            .add(CEItems.WAXED_WEATHERED_COPPER_SHOVEL.builtInRegistryHolder().key())
            .add(CEItems.WAXED_OXIDIZED_COPPER_SHOVEL.builtInRegistryHolder().key());

    builder(ItemTags.HOES)
            .add(CEItems.EXPOSED_COPPER_HOE.builtInRegistryHolder().key())
            .add(CEItems.WEATHERED_COPPER_HOE.builtInRegistryHolder().key())
            .add(CEItems.OXIDIZED_COPPER_HOE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_COPPER_HOE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_EXPOSED_COPPER_HOE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_WEATHERED_COPPER_HOE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_OXIDIZED_COPPER_HOE.builtInRegistryHolder().key());

    builder(ItemTags.SPEARS)
            .add(CEItems.EXPOSED_COPPER_SPEAR.builtInRegistryHolder().key())
            .add(CEItems.WEATHERED_COPPER_SPEAR.builtInRegistryHolder().key())
            .add(CEItems.OXIDIZED_COPPER_SPEAR.builtInRegistryHolder().key())
            .add(CEItems.WAXED_COPPER_SPEAR.builtInRegistryHolder().key())
            .add(CEItems.WAXED_EXPOSED_COPPER_SPEAR.builtInRegistryHolder().key())
            .add(CEItems.WAXED_WEATHERED_COPPER_SPEAR.builtInRegistryHolder().key())
            .add(CEItems.WAXED_OXIDIZED_COPPER_SPEAR.builtInRegistryHolder().key());

    builder(ItemTags.HEAD_ARMOR)
            .add(CEItems.EXPOSED_COPPER_HELMET.builtInRegistryHolder().key())
            .add(CEItems.WEATHERED_COPPER_HELMET.builtInRegistryHolder().key())
            .add(CEItems.OXIDIZED_COPPER_HELMET.builtInRegistryHolder().key())
            .add(CEItems.WAXED_COPPER_HELMET.builtInRegistryHolder().key())
            .add(CEItems.WAXED_EXPOSED_COPPER_HELMET.builtInRegistryHolder().key())
            .add(CEItems.WAXED_WEATHERED_COPPER_HELMET.builtInRegistryHolder().key())
            .add(CEItems.WAXED_OXIDIZED_COPPER_HELMET.builtInRegistryHolder().key());

    builder(ItemTags.CHEST_ARMOR)
            .add(CEItems.EXPOSED_COPPER_CHESTPLATE.builtInRegistryHolder().key())
            .add(CEItems.WEATHERED_COPPER_CHESTPLATE.builtInRegistryHolder().key())
            .add(CEItems.OXIDIZED_COPPER_CHESTPLATE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_COPPER_CHESTPLATE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_EXPOSED_COPPER_CHESTPLATE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_WEATHERED_COPPER_CHESTPLATE.builtInRegistryHolder().key())
            .add(CEItems.WAXED_OXIDIZED_COPPER_CHESTPLATE.builtInRegistryHolder().key());

    builder(ItemTags.LEG_ARMOR)
            .add(CEItems.EXPOSED_COPPER_LEGGINGS.builtInRegistryHolder().key())
            .add(CEItems.WEATHERED_COPPER_LEGGINGS.builtInRegistryHolder().key())
            .add(CEItems.OXIDIZED_COPPER_LEGGINGS.builtInRegistryHolder().key())
            .add(CEItems.WAXED_COPPER_LEGGINGS.builtInRegistryHolder().key())
            .add(CEItems.WAXED_EXPOSED_COPPER_LEGGINGS.builtInRegistryHolder().key())
            .add(CEItems.WAXED_WEATHERED_COPPER_LEGGINGS.builtInRegistryHolder().key())
            .add(CEItems.WAXED_OXIDIZED_COPPER_LEGGINGS.builtInRegistryHolder().key());

    builder(ItemTags.FOOT_ARMOR)
            .add(CEItems.EXPOSED_COPPER_BOOTS.builtInRegistryHolder().key())
            .add(CEItems.WEATHERED_COPPER_BOOTS.builtInRegistryHolder().key())
            .add(CEItems.OXIDIZED_COPPER_BOOTS.builtInRegistryHolder().key())
            .add(CEItems.WAXED_COPPER_BOOTS.builtInRegistryHolder().key())
            .add(CEItems.WAXED_EXPOSED_COPPER_BOOTS.builtInRegistryHolder().key())
            .add(CEItems.WAXED_WEATHERED_COPPER_BOOTS.builtInRegistryHolder().key())
            .add(CEItems.WAXED_OXIDIZED_COPPER_BOOTS.builtInRegistryHolder().key());

    builder(CETags.REPAIRS_WAXED_COPPER_ARMOR).add(CEItems.WAXED_COPPER_INGOT.builtInRegistryHolder().key());
    builder(CETags.REPAIRS_WAXED_EXPOSED_COPPER_ARMOR).add(CEItems.WAXED_EXPOSED_COPPER_INGOT.builtInRegistryHolder().key());
    builder(CETags.REPAIRS_WAXED_WEATHERED_COPPER_ARMOR).add(CEItems.WAXED_WEATHERED_COPPER_INGOT.builtInRegistryHolder().key());
    builder(CETags.REPAIRS_WAXED_OXIDIZED_COPPER_ARMOR).add(CEItems.WAXED_OXIDIZED_COPPER_INGOT.builtInRegistryHolder().key());
    builder(CETags.REPAIRS_EXPOSED_COPPER_ARMOR).add(CEItems.EXPOSED_COPPER_INGOT.builtInRegistryHolder().key());
    builder(CETags.REPAIRS_WEATHERED_COPPER_ARMOR).add(CEItems.WEATHERED_COPPER_INGOT.builtInRegistryHolder().key());
    builder(CETags.REPAIRS_OXIDIZED_COPPER_ARMOR).add(CEItems.OXIDIZED_COPPER_INGOT.builtInRegistryHolder().key());
  }
}
