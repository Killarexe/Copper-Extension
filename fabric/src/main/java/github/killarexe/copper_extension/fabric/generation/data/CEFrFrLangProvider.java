package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.fabric.registry.CEGameRules;
import github.killarexe.copper_extension.fabric.registry.CEItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class CEFrFrLangProvider extends FabricLanguageProvider {
  protected CEFrFrLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
    super(dataOutput, "fr_fr", registryLookup);
  }

  @Override
  public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
    translationBuilder.add(CEGameRules.COPPER_OXIDATION_CHANCE.getDescriptionId(), "Multiplicateur de chance d'oxidation des items en cuivre");

    translationBuilder.add(CEItems.WAXED_COPPER_INGOT, "Lingot de cuivre ciré");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_INGOT, "Lingot de cuivre exposé ciré");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_INGOT, "Lingot de cuivre érodé ciré");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_INGOT, "Lingot de cuivre oxydé ciré");
    translationBuilder.add(CEItems.EXPOSED_COPPER_INGOT, "Lingot de cuivre exposé");
    translationBuilder.add(CEItems.WEATHERED_COPPER_INGOT, "Lingot de cuivre érodé");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_INGOT, "Lingot de cuivre oxydé");

    translationBuilder.add(CEItems.WAXED_COPPER_NUGGET, "Pépite de cuivre ciré");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_NUGGET, "Pépite de cuivre exposé ciré");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_NUGGET, "Pépite de cuivre érodé ciré");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_NUGGET, "Pépite de cuivre oxydé ciré");
    translationBuilder.add(CEItems.EXPOSED_COPPER_NUGGET, "Pépite de cuivre exposé");
    translationBuilder.add(CEItems.WEATHERED_COPPER_NUGGET, "Pépite de cuivre érodé");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_NUGGET, "Pépite de cuivre oxydé");

    translationBuilder.add(CEItems.WAXED_COPPER_HELMET, "Casque en cuivre ciré");
    translationBuilder.add(CEItems.WAXED_COPPER_CHESTPLATE, "Plastron en cuivre ciré");
    translationBuilder.add(CEItems.WAXED_COPPER_LEGGINGS, "Pantalon en cuivre ciré");
    translationBuilder.add(CEItems.WAXED_COPPER_BOOTS, "Bottes en cuivre ciré");

    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_HELMET, "Casque en cuivre exposé ciré");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_CHESTPLATE, "Plastron en cuivre exposé ciré");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_LEGGINGS, "Pantalon en cuivre exposé ciré");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_BOOTS, "Bottes en cuivre exposé ciré");

    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_HELMET, "Casque en cuivre érodé ciré");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_CHESTPLATE, "Plastron en cuivre érodé ciré");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_LEGGINGS, "Pantalon en cuivre érodé ciré");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_BOOTS, "Bottes en cuivre érodé ciré");

    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_HELMET, "Casque en cuivre oxydé ciré");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_CHESTPLATE, "Plastron en cuivre oxydé ciré");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_LEGGINGS, "Pantalon en cuivre oxydé ciré");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_BOOTS, "Bottes en cuivre oxidé ciré");

    translationBuilder.add(CEItems.EXPOSED_COPPER_HELMET, "Casque en cuivre exposé");
    translationBuilder.add(CEItems.EXPOSED_COPPER_CHESTPLATE, "Plastron en cuivre exposé");
    translationBuilder.add(CEItems.EXPOSED_COPPER_LEGGINGS, "Pantalon en cuivre exposé");
    translationBuilder.add(CEItems.EXPOSED_COPPER_BOOTS, "Bottes en cuivre exposé");

    translationBuilder.add(CEItems.WEATHERED_COPPER_HELMET, "Casque en cuivre érodé");
    translationBuilder.add(CEItems.WEATHERED_COPPER_CHESTPLATE, "Plastron en cuivre érodé");
    translationBuilder.add(CEItems.WEATHERED_COPPER_LEGGINGS, "Pantalon en cuivre érodé");
    translationBuilder.add(CEItems.WEATHERED_COPPER_BOOTS, "Bottes en cuivre érodé");

    translationBuilder.add(CEItems.OXIDIZED_COPPER_HELMET, "Casque en cuivre oxydé");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_CHESTPLATE, "Plastron en cuivre oxydé");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_LEGGINGS, "Pantalon en cuivre oxydé");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_BOOTS, "Bottes en cuivre oxydé");

    translationBuilder.add(CEItems.WAXED_COPPER_SWORD, "Épée en cuivre cirée");
    translationBuilder.add(CEItems.WAXED_COPPER_PICKAXE, "Pioche en cuivre cirée");
    translationBuilder.add(CEItems.WAXED_COPPER_AXE, "Hache en cuivre cirée");
    translationBuilder.add(CEItems.WAXED_COPPER_SHOVEL, "Pelle en cuivre cirée");
    translationBuilder.add(CEItems.WAXED_COPPER_HOE, "Houe en cuivre cirée");

    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_SWORD, "Épée en cuivre exposé cirée");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_PICKAXE, "Pioche en cuivre exposé cirée");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_AXE, "Hache en cuivre exposé cirée");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_SHOVEL, "Pelle en cuivre exposé cirée");
    translationBuilder.add(CEItems.WAXED_EXPOSED_COPPER_HOE, "Houe en cuivre exposé cirée");

    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_SWORD, "Épée en cuivre érodé cirée");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_PICKAXE, "Pioche en cuivre érodé cirée");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_AXE, "Hache en cuivre érodé cirée");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_SHOVEL, "Pelle en cuivre érodé cirée");
    translationBuilder.add(CEItems.WAXED_WEATHERED_COPPER_HOE, "Houe en cuivre érodé cirée");

    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_SWORD, "Épée en cuivre oxydé cirée");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_PICKAXE, "Pioche en cuivre oxydé cirée");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_AXE, "Hache en cuivre oxydé cirée");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_SHOVEL, "Pelle en cuivre oxydé cirée");
    translationBuilder.add(CEItems.WAXED_OXIDIZED_COPPER_HOE, "Houe en cuivre oxydé cirée");

    translationBuilder.add(CEItems.EXPOSED_COPPER_SWORD, "Épée en cuivre exposé");
    translationBuilder.add(CEItems.EXPOSED_COPPER_PICKAXE, "Pioche en cuivre exposé");
    translationBuilder.add(CEItems.EXPOSED_COPPER_AXE, "Hache en cuivre exposé");
    translationBuilder.add(CEItems.EXPOSED_COPPER_SHOVEL, "Pelle en cuivre exposé");
    translationBuilder.add(CEItems.EXPOSED_COPPER_HOE, "Houe en cuivre exposé");

    translationBuilder.add(CEItems.WEATHERED_COPPER_SWORD, "Épée en cuivre érodé");
    translationBuilder.add(CEItems.WEATHERED_COPPER_PICKAXE, "Pioche en cuivre érodé");
    translationBuilder.add(CEItems.WEATHERED_COPPER_AXE, "Hache en cuivre érodé");
    translationBuilder.add(CEItems.WEATHERED_COPPER_SHOVEL, "Pelle en cuivre érodé");
    translationBuilder.add(CEItems.WEATHERED_COPPER_HOE, "Houe en cuivre érodé");

    translationBuilder.add(CEItems.OXIDIZED_COPPER_SWORD, "Épée en cuivre oxydé");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_PICKAXE, "Pioche en cuivre oxydé");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_AXE, "Hache en cuivre oxydé");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_SHOVEL, "Pelle en cuivre oxydé");
    translationBuilder.add(CEItems.OXIDIZED_COPPER_HOE, "Houe en cuivre oxydé");
  }
}
