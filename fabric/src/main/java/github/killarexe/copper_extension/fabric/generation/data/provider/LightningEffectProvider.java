package github.killarexe.copper_extension.fabric.generation.data.provider;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import github.killarexe.copper_extension.resource.LightningEffect;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public abstract class LightningEffectProvider implements DataProvider {

  private final PackOutput.PathProvider pathProvider;
  private final CompletableFuture<HolderLookup.Provider> registriesFuture;
  private final List<LightningEffectBuilder> builders = new ArrayList<>();

  public LightningEffectProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    this.pathProvider = output.createPathProvider(PackOutput.Target.DATA_PACK, "lightning_effect");
    this.registriesFuture = registriesFuture;
  }

  protected abstract void generate(BiConsumer<Identifier, LightningEffectBuilder> consumer);

  @Override
  public @NotNull CompletableFuture<?> run(CachedOutput cache) {
    return this.registriesFuture.thenCompose(provider -> {
      builders.clear();

      List<Identifier> usedIds = new ArrayList<>();

      generate((id, builder) -> {
        builder.id = id;
        if (usedIds.contains(id)) {
          throw new IllegalStateException("Try to build Lightning Effect with same id: \"" + id + "\".");
        }
        usedIds.add(id);
        builders.add(builder);
      });

      List<CompletableFuture<?>> futures = new ArrayList<>();
      for (LightningEffectBuilder builder : builders) {
        futures.add(builder.save(cache, pathProvider, provider));
      }

      return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
    });
  }

  protected LightningEffectBuilder createLightningEffect(Item item, MobEffectInstance effect) {
    return new LightningEffectBuilder(item, effect);
  }

  protected void lightningEffect(BiConsumer<Identifier, LightningEffectBuilder> consumer, Item item, MobEffectInstance effect, Identifier location) {
    consumer.accept(location, createLightningEffect(item, effect));
  }

  protected void lightningEffect(BiConsumer<Identifier, LightningEffectBuilder> consumer, Item item, MobEffectInstance effect) {
    lightningEffect(consumer, item, effect, BuiltInRegistries.ITEM.getKey(item));
  }

  protected void addVanillaLightningEffects(BiConsumer<Identifier, LightningEffectBuilder> consumer) {
    lightningEffect(consumer, Items.COPPER_HELMET, new MobEffectInstance(MobEffects.HASTE, 600, 0));
    lightningEffect(consumer, Items.COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.HASTE, 600, 0));
    lightningEffect(consumer, Items.COPPER_LEGGINGS, new MobEffectInstance(MobEffects.HASTE, 600, 0));
    lightningEffect(consumer, Items.COPPER_BOOTS, new MobEffectInstance(MobEffects.HASTE, 600, 0));
  }

  @Override
  public String getName() {
    return "Lightning Effect";
  }

  public static class LightningEffectBuilder {
    private Identifier id;
    private final Item item;
    private final MobEffectInstance effect;

    private LightningEffectBuilder(Item item, MobEffectInstance effect) {
      this.item = item;
      this.effect = effect;
    }

    private CompletableFuture<?> save(CachedOutput output, PackOutput.PathProvider pathProvider, HolderLookup.Provider registries) {
      LightningEffect transformation = new LightningEffect(
              BuiltInRegistries.ITEM.wrapAsHolder(item),
              effect,
              false
      );

      JsonElement json = LightningEffect.CODEC.encodeStart(JsonOps.INSTANCE, transformation).getOrThrow();
      Path path = pathProvider.json(id);

      return DataProvider.saveStable(output, json, path);
    }
  }
}
