package github.killarexe.copper_extension.fabric.generation.data.provider;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.OxidationTransformation;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public abstract class OxidationTransformationProvider implements DataProvider {

  private final PackOutput.PathProvider pathProvider;
  private final CompletableFuture<HolderLookup.Provider> registriesFuture;
  private final List<OxidationTransformationBuilder> builders = new ArrayList<>();

  public OxidationTransformationProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    this.pathProvider = output.createPathProvider(PackOutput.Target.DATA_PACK, "oxidation_transformation");
    this.registriesFuture = registriesFuture;
  }

  protected abstract void generate(BiConsumer<ResourceLocation, OxidationTransformationBuilder> consumer);

  @Override
  public @NotNull CompletableFuture<?> run(CachedOutput cache) {
    return this.registriesFuture.thenCompose(provider -> {
      builders.clear();

      List<ResourceLocation> usedIds = new ArrayList<>();

      generate((id, builder) -> {
        builder.id = id;
        if (usedIds.contains(id)) {
          throw new IllegalStateException("Try to build Oxidation Transformation with same id: \"" + id + "\".");
        }
        usedIds.add(id);
        builders.add(builder);
      });

      List<CompletableFuture<?>> futures = new ArrayList<>();
      for (OxidationTransformationBuilder builder : builders) {
        futures.add(builder.save(cache, pathProvider, provider));
      }

      return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
    });
  }

  protected OxidationTransformationBuilder createOxidation(ItemLike base, ItemLike oxidized, float chanceMultiplier) {
    return new OxidationTransformationBuilder(base.asItem(), oxidized.asItem(), chanceMultiplier);
  }

  protected void oxidation(BiConsumer<ResourceLocation, OxidationTransformationBuilder> consumer, ItemLike base, ItemLike oxidized, float chanceMultiplier, ResourceLocation location) {
    consumer.accept(location, createOxidation(base, oxidized, chanceMultiplier));
  }

  protected void oxidation(BiConsumer<ResourceLocation, OxidationTransformationBuilder> consumer, ItemLike base, ItemLike oxidized, float chanceMultiplier) {
    oxidation(consumer, base, oxidized, chanceMultiplier, BuiltInRegistries.ITEM.getKey(oxidized.asItem()));
  }

  protected void addVanillaTransformations(BiConsumer<ResourceLocation, OxidationTransformationBuilder> consumer) {
    oxidation(consumer, Items.COPPER_BLOCK, Items.EXPOSED_COPPER, 1.0f);
    oxidation(consumer, Items.EXPOSED_COPPER, Items.WEATHERED_COPPER, 1.0f);
    oxidation(consumer, Items.WEATHERED_COPPER, Items.OXIDIZED_COPPER, 1.0f);

    oxidation(consumer, Items.CUT_COPPER, Items.EXPOSED_CUT_COPPER, 1.0f);
    oxidation(consumer, Items.EXPOSED_CUT_COPPER, Items.WEATHERED_CUT_COPPER, 1.0f);
    oxidation(consumer, Items.WEATHERED_CUT_COPPER, Items.OXIDIZED_CUT_COPPER, 1.0f);

    oxidation(consumer, Items.CUT_COPPER_SLAB, Items.EXPOSED_CUT_COPPER_SLAB, 1.0f);
    oxidation(consumer, Items.EXPOSED_CUT_COPPER_SLAB, Items.WEATHERED_CUT_COPPER_SLAB, 1.0f);
    oxidation(consumer, Items.WEATHERED_CUT_COPPER_SLAB, Items.OXIDIZED_CUT_COPPER_SLAB, 1.0f);

    oxidation(consumer, Items.CUT_COPPER_STAIRS, Items.EXPOSED_CUT_COPPER_STAIRS, 1.0f);
    oxidation(consumer, Items.EXPOSED_CUT_COPPER_STAIRS, Items.WEATHERED_CUT_COPPER_STAIRS, 1.0f);
    oxidation(consumer, Items.WEATHERED_CUT_COPPER_STAIRS, Items.OXIDIZED_CUT_COPPER_STAIRS, 1.0f);

    oxidation(consumer, Items.COPPER_BULB, Items.EXPOSED_COPPER_BULB, 1.0f);
    oxidation(consumer, Items.EXPOSED_COPPER_BULB, Items.WEATHERED_COPPER_BULB, 1.0f);
    oxidation(consumer, Items.WEATHERED_COPPER_BULB, Items.OXIDIZED_COPPER_BULB, 1.0f);

    oxidation(consumer, Items.COPPER_DOOR, Items.EXPOSED_COPPER_DOOR, 1.0f);
    oxidation(consumer, Items.EXPOSED_COPPER_DOOR, Items.WEATHERED_COPPER_DOOR, 1.0f);
    oxidation(consumer, Items.WEATHERED_COPPER_DOOR, Items.OXIDIZED_COPPER_DOOR, 1.0f);

    oxidation(consumer, Items.COPPER_GRATE, Items.EXPOSED_COPPER_GRATE, 1.0f);
    oxidation(consumer, Items.EXPOSED_COPPER_GRATE, Items.WEATHERED_COPPER_GRATE, 1.0f);
    oxidation(consumer, Items.WEATHERED_COPPER_GRATE, Items.OXIDIZED_COPPER_GRATE, 1.0f);

    oxidation(consumer, Items.COPPER_TRAPDOOR, Items.EXPOSED_COPPER_TRAPDOOR, 1.0f);
    oxidation(consumer, Items.EXPOSED_COPPER_TRAPDOOR, Items.WEATHERED_COPPER_TRAPDOOR, 1.0f);
    oxidation(consumer, Items.WEATHERED_COPPER_TRAPDOOR, Items.OXIDIZED_COPPER_TRAPDOOR, 1.0f);

    oxidation(consumer, Items.CHISELED_COPPER, Items.EXPOSED_CHISELED_COPPER, 1.0f);
    oxidation(consumer, Items.EXPOSED_CHISELED_COPPER, Items.WEATHERED_CHISELED_COPPER, 1.0f);
    oxidation(consumer, Items.WEATHERED_CHISELED_COPPER, Items.OXIDIZED_CHISELED_COPPER, 1.0f);

    oxidation(consumer, Items.COPPER_LANTERN.unaffected(), Items.COPPER_LANTERN.exposed(), 1.0f);
    oxidation(consumer, Items.COPPER_LANTERN.exposed(), Items.COPPER_LANTERN.weathered(), 1.0f);
    oxidation(consumer, Items.COPPER_LANTERN.weathered(), Items.COPPER_LANTERN.oxidized(), 1.0f);

    oxidation(consumer, Items.COPPER_CHEST, Items.EXPOSED_COPPER_CHEST, 1.0f);
    oxidation(consumer, Items.EXPOSED_COPPER_CHEST, Items.WEATHERED_COPPER_CHEST, 1.0f);
    oxidation(consumer, Items.WEATHERED_COPPER_CHEST, Items.OXIDIZED_COPPER_CHEST, 1.0f);
  }

  @Override
  public String getName() {
    return "Oxidation Transformation";
  }

  public static class OxidationTransformationBuilder {
    private ResourceLocation id;
    private final Item base;
    private final Item oxidized;
    private final float chanceMultiplier;

    private OxidationTransformationBuilder(Item base, Item oxidized, float chanceMultiplier) {
      this.base = base;
      this.oxidized = oxidized;
      this.chanceMultiplier = chanceMultiplier;
    }

    private CompletableFuture<?> save(CachedOutput output, PackOutput.PathProvider pathProvider, HolderLookup.Provider registries) {
      OxidationTransformation transformation = new OxidationTransformation(
              BuiltInRegistries.ITEM.wrapAsHolder(base),
              BuiltInRegistries.ITEM.wrapAsHolder(oxidized),
              chanceMultiplier
      );

      JsonElement json = OxidationTransformation.CODEC.encodeStart(JsonOps.INSTANCE, transformation).getOrThrow();
      Path path = pathProvider.json(id);

      return DataProvider.saveStable(output, json, path);
    }
  }
}
