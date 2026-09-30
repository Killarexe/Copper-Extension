package github.killarexe.copper_extension.fabric.generation.data.provider;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import github.killarexe.copper_extension.resource.WaxingTransformation;
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

public abstract class WaxingTransformationProvider implements DataProvider {

  private final PackOutput.PathProvider pathProvider;
  private final CompletableFuture<HolderLookup.Provider> registriesFuture;
  private final List<WaxingTransformationBuilder> builders = new ArrayList<>();

  public WaxingTransformationProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    this.pathProvider = output.createPathProvider(PackOutput.Target.DATA_PACK, "waxing_transformation");
    this.registriesFuture = registriesFuture;
  }

  protected abstract void generate(BiConsumer<Identifier, WaxingTransformationBuilder> consumer);

  @Override
  public @NotNull CompletableFuture<?> run(@NonNull CachedOutput cache) {
    return this.registriesFuture.thenCompose(provider -> {
      builders.clear();

      List<Identifier> usedIds = new ArrayList<>();

      generate((id, builder) -> {
        builder.id = id;
        if (usedIds.contains(id)) {
          throw new IllegalStateException("Try to build Waxing Transformation with same id: \"" + id + "\".");
        }
        usedIds.add(id);
        builders.add(builder);
      });

      List<CompletableFuture<?>> futures = new ArrayList<>();
      for (WaxingTransformationBuilder builder : builders) {
        futures.add(builder.save(cache, pathProvider, provider));
      }

      return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
    });
  }

  protected WaxingTransformationBuilder createWaxing(ItemLike base, ItemLike waxed) {
    return new WaxingTransformationBuilder(base.asItem(), waxed.asItem());
  }

  protected void waxing(BiConsumer<Identifier, WaxingTransformationBuilder> consumer, ItemLike base, ItemLike waxed, Identifier location) {
    consumer.accept(location, createWaxing(base, waxed));
  }

  protected void waxing(BiConsumer<Identifier, WaxingTransformationBuilder> consumer, ItemLike base, ItemLike waxed) {
    waxing(consumer, base, waxed, BuiltInRegistries.ITEM.getKey(waxed.asItem()));
  }

  protected void addVanillaTransformations(BiConsumer<Identifier, WaxingTransformationBuilder> consumer) {
    waxing(consumer, Items.COPPER_BLOCK.weathering().unaffected(), Items.COPPER_BLOCK.waxed().unaffected());
    waxing(consumer, Items.COPPER_BLOCK.weathering().exposed(), Items.COPPER_BLOCK.waxed().exposed());
    waxing(consumer, Items.COPPER_BLOCK.weathering().weathered(), Items.COPPER_BLOCK.waxed().weathered());
    waxing(consumer, Items.COPPER_BLOCK.weathering().oxidized(), Items.COPPER_BLOCK.waxed().oxidized());

    waxing(consumer, Items.CUT_COPPER.weathering().unaffected(), Items.CUT_COPPER.waxed().unaffected());
    waxing(consumer, Items.CUT_COPPER.weathering().exposed(), Items.CUT_COPPER.waxed().exposed());
    waxing(consumer, Items.CUT_COPPER.weathering().weathered(), Items.CUT_COPPER.waxed().weathered());
    waxing(consumer, Items.CUT_COPPER.weathering().oxidized(), Items.CUT_COPPER.waxed().oxidized());

    waxing(consumer, Items.CUT_COPPER_SLAB.weathering().unaffected(), Items.CUT_COPPER_SLAB.waxed().unaffected());
    waxing(consumer, Items.CUT_COPPER_SLAB.weathering().exposed(), Items.CUT_COPPER_SLAB.waxed().exposed());
    waxing(consumer, Items.CUT_COPPER_SLAB.weathering().weathered(), Items.CUT_COPPER_SLAB.waxed().weathered());
    waxing(consumer, Items.CUT_COPPER_SLAB.weathering().oxidized(), Items.CUT_COPPER_SLAB.waxed().oxidized());

    waxing(consumer, Items.CUT_COPPER_STAIRS.weathering().unaffected(), Items.CUT_COPPER_STAIRS.waxed().unaffected());
    waxing(consumer, Items.CUT_COPPER_STAIRS.weathering().exposed(), Items.CUT_COPPER_STAIRS.waxed().exposed());
    waxing(consumer, Items.CUT_COPPER_STAIRS.weathering().weathered(), Items.CUT_COPPER_STAIRS.waxed().weathered());
    waxing(consumer, Items.CUT_COPPER_STAIRS.weathering().oxidized(), Items.CUT_COPPER_STAIRS.waxed().oxidized());

    waxing(consumer, Items.COPPER_BULB.weathering().unaffected(), Items.COPPER_BULB.waxed().unaffected());
    waxing(consumer, Items.COPPER_BULB.weathering().exposed(), Items.COPPER_BULB.waxed().exposed());
    waxing(consumer, Items.COPPER_BULB.weathering().weathered(), Items.COPPER_BULB.waxed().weathered());
    waxing(consumer, Items.COPPER_BULB.weathering().oxidized(), Items.COPPER_BULB.waxed().oxidized());

    waxing(consumer, Items.COPPER_DOOR.weathering().unaffected(), Items.COPPER_DOOR.waxed().unaffected());
    waxing(consumer, Items.COPPER_DOOR.weathering().exposed(), Items.COPPER_DOOR.waxed().exposed());
    waxing(consumer, Items.COPPER_DOOR.weathering().weathered(), Items.COPPER_DOOR.waxed().weathered());
    waxing(consumer, Items.COPPER_DOOR.weathering().oxidized(), Items.COPPER_DOOR.waxed().oxidized());

    waxing(consumer, Items.COPPER_GRATE.weathering().unaffected(), Items.COPPER_GRATE.waxed().unaffected());
    waxing(consumer, Items.COPPER_GRATE.weathering().exposed(), Items.COPPER_GRATE.waxed().exposed());
    waxing(consumer, Items.COPPER_GRATE.weathering().weathered(), Items.COPPER_GRATE.waxed().weathered());
    waxing(consumer, Items.COPPER_GRATE.weathering().oxidized(), Items.COPPER_GRATE.waxed().oxidized());

    waxing(consumer, Items.COPPER_TRAPDOOR.weathering().unaffected(), Items.COPPER_TRAPDOOR.waxed().unaffected());
    waxing(consumer, Items.COPPER_TRAPDOOR.weathering().exposed(), Items.COPPER_TRAPDOOR.waxed().exposed());
    waxing(consumer, Items.COPPER_TRAPDOOR.weathering().weathered(), Items.COPPER_TRAPDOOR.waxed().weathered());
    waxing(consumer, Items.COPPER_TRAPDOOR.weathering().oxidized(), Items.COPPER_TRAPDOOR.waxed().oxidized());

    waxing(consumer, Items.CHISELED_COPPER.weathering().unaffected(), Items.CHISELED_COPPER.waxed().unaffected());
    waxing(consumer, Items.CHISELED_COPPER.weathering().exposed(), Items.CHISELED_COPPER.waxed().exposed());
    waxing(consumer, Items.CHISELED_COPPER.weathering().weathered(), Items.CHISELED_COPPER.waxed().weathered());
    waxing(consumer, Items.CHISELED_COPPER.weathering().oxidized(), Items.CHISELED_COPPER.waxed().oxidized());

    waxing(consumer, Items.COPPER_LANTERN.weathering().unaffected(), Items.COPPER_LANTERN.waxed().unaffected());
    waxing(consumer, Items.COPPER_LANTERN.weathering().exposed(), Items.COPPER_LANTERN.waxed().exposed());
    waxing(consumer, Items.COPPER_LANTERN.weathering().weathered(), Items.COPPER_LANTERN.waxed().weathered());
    waxing(consumer, Items.COPPER_LANTERN.weathering().oxidized(), Items.COPPER_LANTERN.waxed().oxidized());

    waxing(consumer, Items.COPPER_CHEST.weathering().unaffected(), Items.COPPER_CHEST.waxed().unaffected());
    waxing(consumer, Items.COPPER_CHEST.weathering().exposed(), Items.COPPER_CHEST.waxed().exposed());
    waxing(consumer, Items.COPPER_CHEST.weathering().weathered(), Items.COPPER_CHEST.waxed().weathered());
    waxing(consumer, Items.COPPER_CHEST.weathering().oxidized(), Items.COPPER_CHEST.waxed().oxidized());

    waxing(consumer, Items.COPPER_GOLEM_STATUE.weathering().unaffected(), Items.COPPER_GOLEM_STATUE.waxed().unaffected());
    waxing(consumer, Items.COPPER_GOLEM_STATUE.weathering().exposed(), Items.COPPER_GOLEM_STATUE.waxed().exposed());
    waxing(consumer, Items.COPPER_GOLEM_STATUE.weathering().weathered(), Items.COPPER_GOLEM_STATUE.waxed().weathered());
    waxing(consumer, Items.COPPER_GOLEM_STATUE.weathering().oxidized(), Items.COPPER_GOLEM_STATUE.waxed().oxidized());

    waxing(consumer, Items.COPPER_CHAIN.weathering().unaffected(), Items.COPPER_CHAIN.waxed().unaffected());
    waxing(consumer, Items.COPPER_CHAIN.weathering().exposed(), Items.COPPER_CHAIN.waxed().exposed());
    waxing(consumer, Items.COPPER_CHAIN.weathering().weathered(), Items.COPPER_CHAIN.waxed().weathered());
    waxing(consumer, Items.COPPER_CHAIN.weathering().oxidized(), Items.COPPER_CHAIN.waxed().oxidized());

    waxing(consumer, Items.COPPER_BARS.weathering().unaffected(), Items.COPPER_BARS.waxed().unaffected());
    waxing(consumer, Items.COPPER_BARS.weathering().exposed(), Items.COPPER_BARS.waxed().exposed());
    waxing(consumer, Items.COPPER_BARS.weathering().weathered(), Items.COPPER_BARS.waxed().weathered());
    waxing(consumer, Items.COPPER_BARS.weathering().oxidized(), Items.COPPER_BARS.waxed().oxidized());
  }

  @Override
  public @NonNull String getName() {
    return "Waxing Transformation";
  }

  public static class WaxingTransformationBuilder {
    private Identifier id;
    private final Item base;
    private final Item waxed;

    private WaxingTransformationBuilder(Item base, Item waxed) {
      this.base = base;
      this.waxed = waxed;
    }

    private CompletableFuture<?> save(CachedOutput output, PackOutput.PathProvider pathProvider, HolderLookup.Provider registries) {
      WaxingTransformation transformation = new WaxingTransformation(
              BuiltInRegistries.ITEM.wrapAsHolder(base),
              BuiltInRegistries.ITEM.wrapAsHolder(waxed),
              false
      );

      JsonElement json = WaxingTransformation.CODEC.encodeStart(JsonOps.INSTANCE, transformation).getOrThrow();
      Path path = pathProvider.json(id);

      return DataProvider.saveStable(output, json, path);
    }
  }
}
