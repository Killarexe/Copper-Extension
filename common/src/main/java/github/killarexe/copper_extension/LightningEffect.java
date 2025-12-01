package github.killarexe.copper_extension;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Item;

import java.io.InputStream;
import java.io.InputStreamReader;

public record LightningEffect(Holder<Item> item, MobEffectInstance effect) {

  public static final Codec<LightningEffect> CODEC = RecordCodecBuilder.create(instance -> instance.group(
          Item.CODEC.fieldOf("item").forGetter(LightningEffect::item),
          MobEffectInstance.CODEC.fieldOf("effect").forGetter(LightningEffect::effect)
  ).apply(instance, LightningEffect::new));

  public static LightningEffect fromInputStream(InputStream stream) throws IllegalStateException {
    return fromJson(JsonParser.parseReader(new InputStreamReader(stream)).getAsJsonObject());
  }

  public static LightningEffect fromJson(JsonObject json) throws IllegalStateException {
    return CODEC.decode(JsonOps.INSTANCE, json).getOrThrow().getFirst();
  }
}
