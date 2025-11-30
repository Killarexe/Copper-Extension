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

public record WaxingTransformation(Holder<Item> before, Holder<Item> after) {

  public static final Codec<WaxingTransformation> CODEC = RecordCodecBuilder.create(instance -> instance.group(
          Item.CODEC.fieldOf("before").forGetter(WaxingTransformation::before),
          Item.CODEC.fieldOf("after").forGetter(WaxingTransformation::after)
  ).apply(instance, WaxingTransformation::new));

  public static WaxingTransformation fromInputStream(InputStream stream) {
    return fromJson(JsonParser.parseReader(new InputStreamReader(stream)).getAsJsonObject());
  }

  public static WaxingTransformation fromJson(JsonObject json) {
    return CODEC.decode(JsonOps.INSTANCE, json).getOrThrow().getFirst();
  }

  public Holder<Item> getBeforeItem() {
    return before;
  }

  public Holder<Item> getAfterItem() {
    return after;
  }
}
