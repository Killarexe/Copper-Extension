package github.killarexe.copper_extension;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ToolMaterial;

public class CEToolMaterials {
  public static final ToolMaterial WAXED_COPPER_MATERIAL = new ToolMaterial(
          BlockTags.INCORRECT_FOR_COPPER_TOOL,
          190, 5.0F, 1.0F, 13,
          ItemTags.COPPER_TOOL_MATERIALS
  );
}
