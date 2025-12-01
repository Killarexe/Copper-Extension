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

public record WaxingTransformation(Holder<Item> base, Holder<Item> waxed) {

  public static final Codec<WaxingTransformation> CODEC = RecordCodecBuilder.create(instance -> instance.group(
          Item.CODEC.fieldOf("base").forGetter(WaxingTransformation::base),
          Item.CODEC.fieldOf("waxed").forGetter(WaxingTransformation::waxed)
  ).apply(instance, WaxingTransformation::new));

  public static WaxingTransformation fromInputStream(InputStream stream) throws IllegalStateException {
    return fromJson(JsonParser.parseReader(new InputStreamReader(stream)).getAsJsonObject());
  }

  public static WaxingTransformation fromJson(JsonObject json) throws IllegalStateException {
    return CODEC.decode(JsonOps.INSTANCE, json).getOrThrow().getFirst();
  }
}
