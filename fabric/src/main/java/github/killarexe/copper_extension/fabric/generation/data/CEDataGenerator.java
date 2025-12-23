package github.killarexe.copper_extension.fabric.generation.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CEDataGenerator implements DataGeneratorEntrypoint {

  @Override
  public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
    FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
    pack.addProvider(CEEnUsLangProvider::new);
    pack.addProvider(CEFrFrLangProvider::new);
    pack.addProvider(CEModelProvider::new);
    pack.addProvider(CERecipeProvider::new);
    pack.addProvider(CETagsProvider::new);
    pack.addProvider(CELightningEffectProvider::new);
    pack.addProvider(CEOxidationProvider::new);
    pack.addProvider(CEWaxingProvider::new);
  }
}
