package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.fabric.generation.data.provider.LightningEffectProvider;
import github.killarexe.copper_extension.fabric.registry.CEItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class CELightningEffectProvider extends LightningEffectProvider {

  public CELightningEffectProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void generate(BiConsumer<ResourceLocation, LightningEffectBuilder> consumer) {
    addVanillaLightningEffects(consumer);

    lightningEffect(consumer, CEItems.EXPOSED_COPPER_HELMET, new MobEffectInstance(MobEffects.SPEED, 600, 0));
    lightningEffect(consumer, CEItems.EXPOSED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.SPEED, 600, 0));
    lightningEffect(consumer, CEItems.EXPOSED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.SPEED, 600, 0));
    lightningEffect(consumer, CEItems.EXPOSED_COPPER_BOOTS, new MobEffectInstance(MobEffects.SPEED, 600, 0));

    lightningEffect(consumer, CEItems.WEATHERED_COPPER_HELMET, new MobEffectInstance(MobEffects.RESISTANCE, 600, 0));
    lightningEffect(consumer, CEItems.WEATHERED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.RESISTANCE, 600, 0));
    lightningEffect(consumer, CEItems.WEATHERED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.RESISTANCE, 600, 0));
    lightningEffect(consumer, CEItems.WEATHERED_COPPER_BOOTS, new MobEffectInstance(MobEffects.RESISTANCE, 600, 0));

    lightningEffect(consumer, CEItems.WAXED_COPPER_HELMET, new MobEffectInstance(MobEffects.HASTE, 600, 1));
    lightningEffect(consumer, CEItems.WAXED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.HASTE, 600, 1));
    lightningEffect(consumer, CEItems.WAXED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.HASTE, 600, 1));
    lightningEffect(consumer, CEItems.WAXED_COPPER_BOOTS, new MobEffectInstance(MobEffects.HASTE, 600, 1));

    lightningEffect(consumer, CEItems.WAXED_EXPOSED_COPPER_HELMET, new MobEffectInstance(MobEffects.SPEED, 600, 1));
    lightningEffect(consumer, CEItems.WAXED_EXPOSED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.SPEED, 600, 1));
    lightningEffect(consumer, CEItems.WAXED_EXPOSED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.SPEED, 600, 1));
    lightningEffect(consumer, CEItems.WAXED_EXPOSED_COPPER_BOOTS, new MobEffectInstance(MobEffects.SPEED, 600, 1));

    lightningEffect(consumer, CEItems.WAXED_WEATHERED_COPPER_HELMET, new MobEffectInstance(MobEffects.RESISTANCE, 600, 1));
    lightningEffect(consumer, CEItems.WAXED_WEATHERED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.RESISTANCE, 600, 1));
    lightningEffect(consumer, CEItems.WAXED_WEATHERED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.RESISTANCE, 600, 1));
    lightningEffect(consumer, CEItems.WAXED_WEATHERED_COPPER_BOOTS, new MobEffectInstance(MobEffects.RESISTANCE, 600, 1));

    lightningEffect(consumer, CEItems.WAXED_OXIDIZED_COPPER_HELMET, new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0));
    lightningEffect(consumer, CEItems.WAXED_OXIDIZED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0));
    lightningEffect(consumer, CEItems.WAXED_OXIDIZED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0));
    lightningEffect(consumer, CEItems.WAXED_OXIDIZED_COPPER_BOOTS, new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0));
  }
}
