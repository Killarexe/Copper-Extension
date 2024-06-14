package github.killarexe.copper_extension;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public interface ItemAccessor {
    Item getItemFromId(ResourceLocation itemId);
}
