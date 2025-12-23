package github.killarexe.copper_extension.fabric.generation.data.provider;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import github.killarexe.copper_extension.resource.WaxingTransformation;
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

public abstract class WaxingTransformationProvider implements DataProvider {

  private final PackOutput.PathProvider pathProvider;
  private final CompletableFuture<HolderLookup.Provider> registriesFuture;
  private final List<WaxingTransformationBuilder> builders = new ArrayList<>();

  public WaxingTransformationProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    this.pathProvider = output.createPathProvider(PackOutput.Target.DATA_PACK, "waxing_transformation");
    this.registriesFuture = registriesFuture;
  }

  protected abstract void generate(BiConsumer<ResourceLocation, WaxingTransformationBuilder> consumer);

  @Override
  public @NotNull CompletableFuture<?> run(CachedOutput cache) {
    return this.registriesFuture.thenCompose(provider -> {
      builders.clear();

      List<ResourceLocation> usedIds = new ArrayList<>();

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

  protected void waxing(BiConsumer<ResourceLocation, WaxingTransformationBuilder> consumer, ItemLike base, ItemLike waxed, ResourceLocation location) {
    consumer.accept(location, createWaxing(base, waxed));
  }

  protected void waxing(BiConsumer<ResourceLocation, WaxingTransformationBuilder> consumer, ItemLike base, ItemLike waxed) {
    waxing(consumer, base, waxed, BuiltInRegistries.ITEM.getKey(waxed.asItem()));
  }

  protected void addVanillaTransformations(BiConsumer<ResourceLocation, WaxingTransformationBuilder> consumer) {
    waxing(consumer, Items.COPPER_BLOCK, Items.WAXED_COPPER_BLOCK);
    waxing(consumer, Items.EXPOSED_COPPER, Items.WAXED_EXPOSED_COPPER);
    waxing(consumer, Items.WEATHERED_COPPER, Items.WAXED_WEATHERED_COPPER);
    waxing(consumer, Items.OXIDIZED_COPPER, Items.WAXED_OXIDIZED_COPPER);

    waxing(consumer, Items.CUT_COPPER, Items.WAXED_CUT_COPPER);
    waxing(consumer, Items.EXPOSED_CUT_COPPER, Items.WAXED_EXPOSED_CUT_COPPER);
    waxing(consumer, Items.WEATHERED_CUT_COPPER, Items.WAXED_WEATHERED_CUT_COPPER);
    waxing(consumer, Items.OXIDIZED_CUT_COPPER, Items.WAXED_OXIDIZED_CUT_COPPER);

    waxing(consumer, Items.CUT_COPPER_SLAB, Items.WAXED_CUT_COPPER_SLAB);
    waxing(consumer, Items.EXPOSED_CUT_COPPER_SLAB, Items.WAXED_EXPOSED_CUT_COPPER_SLAB);
    waxing(consumer, Items.WEATHERED_CUT_COPPER_SLAB, Items.WAXED_WEATHERED_CUT_COPPER_SLAB);
    waxing(consumer, Items.OXIDIZED_CUT_COPPER_SLAB, Items.WAXED_OXIDIZED_CUT_COPPER_SLAB);

    waxing(consumer, Items.CUT_COPPER_STAIRS, Items.WAXED_CUT_COPPER_STAIRS);
    waxing(consumer, Items.EXPOSED_CUT_COPPER_STAIRS, Items.WAXED_EXPOSED_CUT_COPPER_STAIRS);
    waxing(consumer, Items.WEATHERED_CUT_COPPER_STAIRS, Items.WAXED_WEATHERED_CUT_COPPER_STAIRS);
    waxing(consumer, Items.OXIDIZED_CUT_COPPER_STAIRS, Items.WAXED_OXIDIZED_CUT_COPPER_STAIRS);

    waxing(consumer, Items.COPPER_BULB, Items.WAXED_COPPER_BULB);
    waxing(consumer, Items.EXPOSED_COPPER_BULB, Items.WAXED_EXPOSED_COPPER_BULB);
    waxing(consumer, Items.WEATHERED_COPPER_BULB, Items.WAXED_WEATHERED_COPPER_BULB);
    waxing(consumer, Items.OXIDIZED_COPPER_BULB, Items.WAXED_OXIDIZED_COPPER_BULB);

    waxing(consumer, Items.COPPER_DOOR, Items.WAXED_COPPER_DOOR);
    waxing(consumer, Items.EXPOSED_COPPER_DOOR, Items.WAXED_EXPOSED_COPPER_DOOR);
    waxing(consumer, Items.WEATHERED_COPPER_DOOR, Items.WAXED_WEATHERED_COPPER_DOOR);
    waxing(consumer, Items.OXIDIZED_COPPER_DOOR, Items.WAXED_OXIDIZED_COPPER_DOOR);

    waxing(consumer, Items.COPPER_GRATE, Items.WAXED_COPPER_GRATE);
    waxing(consumer, Items.EXPOSED_COPPER_GRATE, Items.WAXED_EXPOSED_COPPER_GRATE);
    waxing(consumer, Items.WEATHERED_COPPER_GRATE, Items.WAXED_WEATHERED_COPPER_GRATE);
    waxing(consumer, Items.OXIDIZED_COPPER_GRATE, Items.WAXED_OXIDIZED_COPPER_GRATE);

    waxing(consumer, Items.COPPER_TRAPDOOR, Items.WAXED_COPPER_TRAPDOOR);
    waxing(consumer, Items.EXPOSED_COPPER_TRAPDOOR, Items.WAXED_EXPOSED_COPPER_TRAPDOOR);
    waxing(consumer, Items.WEATHERED_COPPER_TRAPDOOR, Items.WAXED_WEATHERED_COPPER_TRAPDOOR);
    waxing(consumer, Items.OXIDIZED_COPPER_TRAPDOOR, Items.WAXED_OXIDIZED_COPPER_TRAPDOOR);

    waxing(consumer, Items.CHISELED_COPPER, Items.WAXED_CHISELED_COPPER);
    waxing(consumer, Items.EXPOSED_CHISELED_COPPER, Items.WAXED_EXPOSED_CHISELED_COPPER);
    waxing(consumer, Items.WEATHERED_CHISELED_COPPER, Items.WAXED_WEATHERED_CHISELED_COPPER);
    waxing(consumer, Items.OXIDIZED_CHISELED_COPPER, Items.WAXED_OXIDIZED_CHISELED_COPPER);

    waxing(consumer, Items.COPPER_LANTERN.unaffected(), Items.COPPER_LANTERN.waxed());
    waxing(consumer, Items.COPPER_LANTERN.exposed(), Items.COPPER_LANTERN.waxedExposed());
    waxing(consumer, Items.COPPER_LANTERN.weathered(), Items.COPPER_LANTERN.waxedWeathered());
    waxing(consumer, Items.COPPER_LANTERN.oxidized(), Items.COPPER_LANTERN.waxedOxidized());

    waxing(consumer, Items.COPPER_CHEST, Items.WAXED_COPPER_CHEST);
    waxing(consumer, Items.EXPOSED_COPPER_CHEST, Items.WAXED_EXPOSED_COPPER_CHEST);
    waxing(consumer, Items.WEATHERED_COPPER_CHEST, Items.WAXED_WEATHERED_COPPER_CHEST);
    waxing(consumer, Items.OXIDIZED_COPPER_CHEST, Items.WAXED_OXIDIZED_COPPER_CHEST);
  }

  @Override
  public String getName() {
    return "Waxing Transformation";
  }

  public static class WaxingTransformationBuilder {
    private ResourceLocation id;
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
