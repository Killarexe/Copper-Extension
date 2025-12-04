package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.fabric.registry.CEItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class CEEnUsLangProvider extends FabricLanguageProvider {
  protected CEEnUsLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
    super(dataOutput, "en_us", registryLookup);
  }

  @Override
  public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
    translationBuilder.add(CEItems.WAXED_COPPER_INGOT, "Waxed Copper Ingot");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_INGOT, "Waxed Exposed Copper Ingot");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_INGOT, "Waxed Weathered Copper Ingot");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_INGOT, "Waxed Oxidized Copper Ingot");
    translationBuilder.add(CEItems.EXPOSED_COPPER_INGOT, "Exposed Copper Ingot");
    translationBuilder.add(CEItems.WEATHERED_COPPER_INGOT, "Weathered Copper Ingot");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_INGOT, "Oxidized Copper Ingot");

    translationBuilder.add(CEItems.WAXED_COPPER_NUGGET, "Waxed Copper Nugget");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_NUGGET, "Waxed Exposed Copper Nugget");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_NUGGET, "Waxed Weathered Copper Nugget");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_NUGGET, "Waxed Oxidized Copper Nugget");
    translationBuilder.add(CEItems.EXPOSED_COPPER_NUGGET, "Exposed Copper Nugget");
    translationBuilder.add(CEItems.WEATHERED_COPPER_NUGGET, "Weathered Copper Nugget");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_NUGGET, "Oxidized Copper Nugget");

    translationBuilder.add(CEItems.WAXED_COPPER_HELMET, "Waxed Copper Helmet");
    translationBuilder.add(CEItems.WAXED_COPPER_CHESTPLATE, "Waxed Copper Chestplate");
    translationBuilder.add(CEItems.WAXED_COPPER_LEGGINGS, "Waxed Copper Leggings");
    translationBuilder.add(CEItems.WAXED_COPPER_BOOTS, "Waxed Copper Boots");

    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_HELMET, "Waxed Exposed Copper Helmet");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_CHESTPLATE, "Waxed Exposed Copper Chestplate");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_LEGGINGS, "Waxed Exposed Copper Leggings");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_BOOTS, "Waxed Exposed Copper Boots");

    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_HELMET, "Waxed Weathered Copper Helmet");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_CHESTPLATE, "Waxed Weathered Copper Chestplate");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_LEGGINGS, "Waxed Weathered Copper Leggings");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_BOOTS, "Waxed Weathered Copper Boots");

    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_HELMET, "Waxed Oxidized Copper Helmet");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_CHESTPLATE, "Waxed Oxidized Copper Chestplate");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_LEGGINGS, "Waxed Oxidized Copper Leggings");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_BOOTS, "Waxed Oxidized Copper Boots");

    translationBuilder.add(CEItems.EXPOSED_COPPER_HELMET, "Exposed Copper Helmet");
    translationBuilder.add(CEItems.EXPOSED_COPPER_CHESTPLATE, "Exposed Copper Chestplate");
    translationBuilder.add(CEItems.EXPOSED_COPPER_LEGGINGS, "Exposed Copper Leggings");
    translationBuilder.add(CEItems.EXPOSED_COPPER_BOOTS, "Exposed Copper Boots");

    translationBuilder.add(CEItems.WEATHERED_COPPER_HELMET, "Weathered Copper Helmet");
    translationBuilder.add(CEItems.WEATHERED_COPPER_CHESTPLATE, "Weathered Copper Chestplate");
    translationBuilder.add(CEItems.WEATHERED_COPPER_LEGGINGS, "Weathered Copper Leggings");
    translationBuilder.add(CEItems.WEATHERED_COPPER_BOOTS, "Weathered Copper Boots");

    translationBuilder.add(CEItems.OXIDIZED_COPPER_HELMET, "Oxidized Copper Helmet");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_CHESTPLATE, "Oxidized Copper Chestplate");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_LEGGINGS, "Oxidized Copper Leggings");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_BOOTS, "Oxidized Copper Boots");

    translationBuilder.add(CEItems.WAXED_COPPER_SWORD, "Waxed Copper Sword");
    translationBuilder.add(CEItems.WAXED_COPPER_PICKAXE, "Waxed Copper Pickaxe");
    translationBuilder.add(CEItems.WAXED_COPPER_AXE, "Waxed Copper Axe");
    translationBuilder.add(CEItems.WAXED_COPPER_SHOVEL, "Waxed Copper Shovel");
    translationBuilder.add(CEItems.WAXED_COPPER_HOE, "Waxed Copper Hoe");

    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_SWORD, "Waxed Exposed Copper Sword");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_PICKAXE, "Waxed Exposed Copper Pickaxe");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_AXE, "Waxed Exposed Copper Axe");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_SHOVEL, "Waxed Exposed Copper Shovel");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_HOE, "Waxed Exposed Copper Hoe");

    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_SWORD, "Waxed Weathered Copper Sword");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_PICKAXE, "Waxed Weathered Copper Pickaxe");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_AXE, "Waxed Weathered Copper Axe");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_SHOVEL, "Waxed Weathered Copper Shovel");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_HOE, "Waxed Weathered Copper Hoe");

    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_SWORD, "Waxed Oxidized Copper Sword");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_PICKAXE, "Waxed Oxidized Copper Pickaxe");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_AXE, "Waxed Oxidized Copper Axe");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_SHOVEL, "Waxed Oxidized Copper Shovel");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_HOE, "Waxed Oxidized Copper Hoe");

    translationBuilder.add(CEItems.EXPOSED_COPPER_SWORD, "Exposed Copper Sword");
    translationBuilder.add(CEItems.EXPOSED_COPPER_PICKAXE, "Exposed Copper Pickaxe");
    translationBuilder.add(CEItems.EXPOSED_COPPER_AXE, "Exposed Copper Axe");
    translationBuilder.add(CEItems.EXPOSED_COPPER_SHOVEL, "Exposed Copper Shovel");
    translationBuilder.add(CEItems.EXPOSED_COPPER_HOE, "Exposed Copper Hoe");

    translationBuilder.add(CEItems.WEATHERED_COPPER_SWORD, "Weathered Copper Sword");
    translationBuilder.add(CEItems.WEATHERED_COPPER_PICKAXE, "Weathered Copper Pickaxe");
    translationBuilder.add(CEItems.WEATHERED_COPPER_AXE, "Weathered Copper Axe");
    translationBuilder.add(CEItems.WEATHERED_COPPER_SHOVEL, "Weathered Copper Shovel");
    translationBuilder.add(CEItems.WEATHERED_COPPER_HOE, "Weathered Copper Hoe");

    translationBuilder.add(CEItems.OXIDIZED_COPPER_SWORD, "Oxidized Copper Sword");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_PICKAXE, "Oxidized Copper Pickaxe");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_AXE, "Oxidized Copper Axe");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_SHOVEL, "Oxidized Copper Shovel");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_HOE, "Oxidized Copper Hoe");
  }
}
