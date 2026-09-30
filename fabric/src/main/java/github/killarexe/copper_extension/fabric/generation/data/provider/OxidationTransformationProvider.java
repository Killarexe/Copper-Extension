package github.killarexe.copper_extension.fabric.generation.data.provider;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import github.killarexe.copper_extension.resource.OxidationTransformation;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public abstract class OxidationTransformationProvider implements DataProvider {

  private final PackOutput.PathProvider pathProvider;
  private final CompletableFuture<HolderLookup.Provider> registriesFuture;
  private final List<OxidationTransformationBuilder> builders = new ArrayList<>();

  public OxidationTransformationProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    this.pathProvider = output.createPathProvider(PackOutput.Target.DATA_PACK, "oxidation_transformation");
    this.registriesFuture = registriesFuture;
  }

  protected abstract void generate(BiConsumer<Identifier, OxidationTransformationBuilder> consumer);

  @Override
  public @NotNull CompletableFuture<?> run(@NonNull CachedOutput cache) {
    return this.registriesFuture.thenCompose(provider -> {
      builders.clear();

      List<Identifier> usedIds = new ArrayList<>();

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

  protected void oxidation(BiConsumer<Identifier, OxidationTransformationBuilder> consumer, ItemLike base, ItemLike oxidized, float chanceMultiplier, Identifier location) {
    consumer.accept(location, createOxidation(base, oxidized, chanceMultiplier));
  }

  protected void oxidation(BiConsumer<Identifier, OxidationTransformationBuilder> consumer, ItemLike base, ItemLike oxidized, float chanceMultiplier) {
    oxidation(consumer, base, oxidized, chanceMultiplier, BuiltInRegistries.ITEM.getKey(oxidized.asItem()));
  }

  protected void addVanillaTransformations(BiConsumer<Identifier, OxidationTransformationBuilder> consumer) {
    oxidation(consumer, Items.COPPER_BLOCK.weathering().unaffected(), Items.COPPER_BLOCK.weathering().exposed(), 1.0f);
    oxidation(consumer, Items.COPPER_BLOCK.weathering().exposed(), Items.COPPER_BLOCK.weathering().weathered(), 1.0f);
    oxidation(consumer, Items.COPPER_BLOCK.weathering().weathered(), Items.COPPER_BLOCK.weathering().oxidized(), 1.0f);

    oxidation(consumer, Items.CUT_COPPER.weathering().unaffected(), Items.CUT_COPPER.weathering().exposed(), 1.0f);
    oxidation(consumer, Items.CUT_COPPER.weathering().exposed(), Items.CUT_COPPER.weathering().weathered(), 1.0f);
    oxidation(consumer, Items.CUT_COPPER.weathering().weathered(), Items.CUT_COPPER.weathering().oxidized(), 1.0f);

    oxidation(consumer, Items.CUT_COPPER_SLAB.weathering().unaffected(), Items.CUT_COPPER_SLAB.weathering().exposed(), 1.0f);
    oxidation(consumer, Items.CUT_COPPER_SLAB.weathering().exposed(), Items.CUT_COPPER_SLAB.weathering().weathered(), 1.0f);
    oxidation(consumer, Items.CUT_COPPER_SLAB.weathering().weathered(), Items.CUT_COPPER_SLAB.weathering().oxidized(), 1.0f);

    oxidation(consumer, Items.CUT_COPPER_STAIRS.weathering().unaffected(), Items.CUT_COPPER_STAIRS.weathering().exposed(), 1.0f);
    oxidation(consumer, Items.CUT_COPPER_STAIRS.weathering().exposed(), Items.CUT_COPPER_STAIRS.weathering().weathered(), 1.0f);
    oxidation(consumer, Items.CUT_COPPER_STAIRS.weathering().weathered(), Items.CUT_COPPER_STAIRS.weathering().oxidized(), 1.0f);

    oxidation(consumer, Items.COPPER_BULB.weathering().unaffected(), Items.COPPER_BULB.weathering().exposed(), 1.0f);
    oxidation(consumer, Items.COPPER_BULB.weathering().exposed(), Items.COPPER_BULB.weathering().weathered(), 1.0f);
    oxidation(consumer, Items.COPPER_BULB.weathering().weathered(), Items.COPPER_BULB.weathering().oxidized(), 1.0f);

    oxidation(consumer, Items.COPPER_DOOR.weathering().unaffected(), Items.COPPER_DOOR.weathering().exposed(), 0.75f);
    oxidation(consumer, Items.COPPER_DOOR.weathering().exposed(), Items.COPPER_DOOR.weathering().weathered(), 0.75f);
    oxidation(consumer, Items.COPPER_DOOR.weathering().weathered(), Items.COPPER_DOOR.weathering().oxidized(), 0.75f);

    oxidation(consumer, Items.COPPER_GRATE.weathering().unaffected(), Items.COPPER_GRATE.weathering().exposed(), 1.25f);
    oxidation(consumer, Items.COPPER_GRATE.weathering().exposed(), Items.COPPER_GRATE.weathering().weathered(), 1.25f);
    oxidation(consumer, Items.COPPER_GRATE.weathering().weathered(), Items.COPPER_GRATE.weathering().oxidized(), 1.25f);

    oxidation(consumer, Items.COPPER_TRAPDOOR.weathering().unaffected(), Items.COPPER_TRAPDOOR.weathering().exposed(), 1.25f);
    oxidation(consumer, Items.COPPER_TRAPDOOR.weathering().exposed(), Items.COPPER_TRAPDOOR.weathering().weathered(), 1.25f);
    oxidation(consumer, Items.COPPER_TRAPDOOR.weathering().weathered(), Items.COPPER_TRAPDOOR.weathering().oxidized(), 1.25f);

    oxidation(consumer, Items.CHISELED_COPPER.weathering().unaffected(), Items.CHISELED_COPPER.weathering().exposed(), 1.0f);
    oxidation(consumer, Items.CHISELED_COPPER.weathering().exposed(), Items.CHISELED_COPPER.weathering().weathered(), 1.0f);
    oxidation(consumer, Items.CHISELED_COPPER.weathering().weathered(), Items.CHISELED_COPPER.weathering().oxidized(), 1.0f);

    oxidation(consumer, Items.COPPER_LANTERN.weathering().unaffected(), Items.COPPER_LANTERN.weathering().exposed(), 1.125f);
    oxidation(consumer, Items.COPPER_LANTERN.weathering().exposed(), Items.COPPER_LANTERN.weathering().weathered(), 1.125f);
    oxidation(consumer, Items.COPPER_LANTERN.weathering().weathered(), Items.COPPER_LANTERN.weathering().oxidized(), 1.125f);

    oxidation(consumer, Items.COPPER_CHEST.weathering().unaffected(), Items.COPPER_CHEST.weathering().exposed(), 1.0f);
    oxidation(consumer, Items.COPPER_CHEST.weathering().exposed(), Items.COPPER_CHEST.weathering().weathered(), 1.0f);
    oxidation(consumer, Items.COPPER_CHEST.weathering().weathered(), Items.COPPER_CHEST.weathering().oxidized(), 1.0f);

    oxidation(consumer, Items.COPPER_GOLEM_STATUE.weathering().unaffected(), Items.COPPER_GOLEM_STATUE.weathering().exposed(), 1.0f);
    oxidation(consumer, Items.COPPER_GOLEM_STATUE.weathering().exposed(), Items.COPPER_GOLEM_STATUE.weathering().weathered(), 1.0f);
    oxidation(consumer, Items.COPPER_GOLEM_STATUE.weathering().weathered(), Items.COPPER_GOLEM_STATUE.weathering().oxidized(), 1.0f);

    oxidation(consumer, Items.LIGHTNING_ROD.weathering().unaffected(), Items.LIGHTNING_ROD.weathering().exposed(), 1.2f);
    oxidation(consumer, Items.LIGHTNING_ROD.weathering().exposed(), Items.LIGHTNING_ROD.weathering().weathered(), 1.2f);
    oxidation(consumer, Items.LIGHTNING_ROD.weathering().weathered(), Items.LIGHTNING_ROD.weathering().oxidized(), 1.2f);

    oxidation(consumer, Items.COPPER_CHAIN.weathering().unaffected(), Items.COPPER_CHAIN.weathering().exposed(), 1.3f);
    oxidation(consumer, Items.COPPER_CHAIN.weathering().exposed(), Items.COPPER_CHAIN.weathering().weathered(), 1.3f);
    oxidation(consumer, Items.COPPER_CHAIN.weathering().weathered(), Items.COPPER_CHAIN.weathering().oxidized(), 1.3f);

    oxidation(consumer, Items.COPPER_BARS.weathering().unaffected(), Items.COPPER_BARS.weathering().exposed(), 1.0f);
    oxidation(consumer, Items.COPPER_BARS.weathering().exposed(), Items.COPPER_BARS.weathering().weathered(), 1.0f);
    oxidation(consumer, Items.COPPER_BARS.weathering().weathered(), Items.COPPER_BARS.weathering().oxidized(), 1.0f);
  }

  @Override
  public @NonNull String getName() {
    return "Oxidation Transformation";
  }

  public static class OxidationTransformationBuilder {
    private Identifier id;
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
              chanceMultiplier,
              false
      );

      JsonElement json = OxidationTransformation.CODEC.encodeStart(JsonOps.INSTANCE, transformation).getOrThrow();
      Path path = pathProvider.json(id);

      return DataProvider.saveStable(output, json, path);
    }
  }
}
