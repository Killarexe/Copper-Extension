package github.killarexe.copper_extension;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;

import java.io.InputStream;
import java.io.InputStreamReader;

public record OxidationTransformation(Holder<Item> before, Holder<Item> after, float chanceMultiplier) {

  public static final Codec<OxidationTransformation> CODEC = RecordCodecBuilder.create(instance -> instance.group(
          Item.CODEC.fieldOf("before").forGetter(OxidationTransformation::before),
          Item.CODEC.fieldOf("after").forGetter(OxidationTransformation::after),
          Codec.floatRange(0.0f, 100.0f).fieldOf("chance_multiplier").forGetter(OxidationTransformation::chanceMultiplier)
  ).apply(instance, OxidationTransformation::new));

  public static OxidationTransformation fromInputStream(InputStream stream) {
    return fromJson(JsonParser.parseReader(new InputStreamReader(stream)).getAsJsonObject());
  }

  public static OxidationTransformation fromJson(JsonObject json) {
    return CODEC.decode(JsonOps.INSTANCE, json).getOrThrow().getFirst();
  }

  public Holder<Item> getBeforeItem() {
    return before;
  }

  public Holder<Item> getAfterItem() {
    return after;
  }

  public float getChanceMultiplier() {
    return chanceMultiplier;
  }
}
