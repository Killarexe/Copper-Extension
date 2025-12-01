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

public record OxidationTransformation(Holder<Item> base, Holder<Item> oxidized, float chanceMultiplier) {

  public static final Codec<OxidationTransformation> CODEC = RecordCodecBuilder.create(instance -> instance.group(
          Item.CODEC.fieldOf("base").forGetter(OxidationTransformation::base),
          Item.CODEC.fieldOf("oxidized").forGetter(OxidationTransformation::oxidized),
          Codec.FLOAT.flatXmap(Codec.checkRange(0.0f, 100.0f), Codec.checkRange(0.0f, 100.0f)).optionalFieldOf("chanceMultiplier", 1.0f).forGetter(OxidationTransformation::chanceMultiplier)
  ).apply(instance, OxidationTransformation::new));

  public static OxidationTransformation fromInputStream(InputStream stream) throws IllegalStateException {
    return fromJson(JsonParser.parseReader(new InputStreamReader(stream)).getAsJsonObject());
  }

  public static OxidationTransformation fromJson(JsonObject json) throws IllegalStateException {
    return CODEC.decode(JsonOps.INSTANCE, json).getOrThrow().getFirst();
  }
}
