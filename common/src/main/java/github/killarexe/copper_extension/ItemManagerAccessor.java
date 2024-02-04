package github.killarexe.copper_extension;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public interface ItemManagerAccessor {
  Item getItemFromId(ResourceLocation itemId);
}
