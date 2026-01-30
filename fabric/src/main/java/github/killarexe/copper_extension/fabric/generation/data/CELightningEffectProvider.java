package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.fabric.generation.data.provider.LightningEffectProvider;
import github.killarexe.copper_extension.fabric.registry.CEItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class CELightningEffectProvider extends LightningEffectProvider {

  public CELightningEffectProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void generate(BiConsumer<Identifier, LightningEffectBuilder> consumer) {
    addVanillaLightningEffects(consumer);

    lightningEffect(consumer, CEItems.EXPOSED_COPPER_HELMET, new MobEffectInstance(MobEffects.SPEED, 300, 0));
    lightningEffect(consumer, CEItems.EXPOSED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.SPEED, 480, 0));
    lightningEffect(consumer, CEItems.EXPOSED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.SPEED, 420, 0));
    lightningEffect(consumer, CEItems.EXPOSED_COPPER_BOOTS, new MobEffectInstance(MobEffects.SPEED, 240, 0));

    lightningEffect(consumer, CEItems.WEATHERED_COPPER_HELMET, new MobEffectInstance(MobEffects.RESISTANCE, 300, 0));
    lightningEffect(consumer, CEItems.WEATHERED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.RESISTANCE, 480, 0));
    lightningEffect(consumer, CEItems.WEATHERED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.RESISTANCE, 420, 0));
    lightningEffect(consumer, CEItems.WEATHERED_COPPER_BOOTS, new MobEffectInstance(MobEffects.RESISTANCE, 240, 0));

    lightningEffect(consumer, CEItems.WAXED_COPPER_HELMET, new MobEffectInstance(MobEffects.HASTE, 300, 1));
    lightningEffect(consumer, CEItems.WAXED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.HASTE, 480, 1));
    lightningEffect(consumer, CEItems.WAXED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.HASTE, 420, 1));
    lightningEffect(consumer, CEItems.WAXED_COPPER_BOOTS, new MobEffectInstance(MobEffects.HASTE, 240, 1));

    lightningEffect(consumer, CEItems.WAXED_EXPOSED_COPPER_HELMET, new MobEffectInstance(MobEffects.SPEED, 300, 1));
    lightningEffect(consumer, CEItems.WAXED_EXPOSED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.SPEED, 480, 1));
    lightningEffect(consumer, CEItems.WAXED_EXPOSED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.SPEED, 420, 1));
    lightningEffect(consumer, CEItems.WAXED_EXPOSED_COPPER_BOOTS, new MobEffectInstance(MobEffects.SPEED, 240, 1));

    lightningEffect(consumer, CEItems.WAXED_WEATHERED_COPPER_HELMET, new MobEffectInstance(MobEffects.RESISTANCE, 300, 1));
    lightningEffect(consumer, CEItems.WAXED_WEATHERED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.RESISTANCE, 480, 1));
    lightningEffect(consumer, CEItems.WAXED_WEATHERED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.RESISTANCE, 460, 1));
    lightningEffect(consumer, CEItems.WAXED_WEATHERED_COPPER_BOOTS, new MobEffectInstance(MobEffects.RESISTANCE, 240, 1));

    lightningEffect(consumer, CEItems.WAXED_OXIDIZED_COPPER_HELMET, new MobEffectInstance(MobEffects.WATER_BREATHING, 300, 0));
    lightningEffect(consumer, CEItems.WAXED_OXIDIZED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.WATER_BREATHING, 480, 0));
    lightningEffect(consumer, CEItems.WAXED_OXIDIZED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.WATER_BREATHING, 460, 0));
    lightningEffect(consumer, CEItems.WAXED_OXIDIZED_COPPER_BOOTS, new MobEffectInstance(MobEffects.WATER_BREATHING, 240, 0));
  }
}
