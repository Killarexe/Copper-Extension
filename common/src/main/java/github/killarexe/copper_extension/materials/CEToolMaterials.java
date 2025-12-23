package github.killarexe.copper_extension.materials;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ToolMaterial;

public class CEToolMaterials {
  public static final ToolMaterial WAXED_COPPER_MATERIAL = new ToolMaterial(
          BlockTags.INCORRECT_FOR_COPPER_TOOL,
          190, 6.0F, 1.5F, 15,
          ItemTags.COPPER_TOOL_MATERIALS
  );
  public static final ToolMaterial WAXED_EXPOSED_COPPER_MATERIAL = new ToolMaterial(
          BlockTags.INCORRECT_FOR_COPPER_TOOL,
          210, 5.5F, 1.75F, 13,
          ItemTags.COPPER_TOOL_MATERIALS
  );
  public static final ToolMaterial WAXED_WEATHERED_COPPER_MATERIAL = new ToolMaterial(
          BlockTags.INCORRECT_FOR_COPPER_TOOL,
          230, 5.5F, 1.5F, 11,
          ItemTags.COPPER_TOOL_MATERIALS
  );
  public static final ToolMaterial WAXED_OXIDIZED_COPPER_MATERIAL = new ToolMaterial(
          BlockTags.INCORRECT_FOR_COPPER_TOOL,
          250, 5.5F, 1.5F, 9,
          ItemTags.COPPER_TOOL_MATERIALS
  );

  public static final ToolMaterial EXPOSED_COPPER_MATERIAL = new ToolMaterial(
          BlockTags.INCORRECT_FOR_COPPER_TOOL,
          210, 5.0F, 1.25F, 11,
          ItemTags.COPPER_TOOL_MATERIALS
  );
  public static final ToolMaterial WEATHERED_COPPER_MATERIAL = new ToolMaterial(
          BlockTags.INCORRECT_FOR_COPPER_TOOL,
          230, 5.0F, 1.0F, 9,
          ItemTags.COPPER_TOOL_MATERIALS
  );
  public static final ToolMaterial OXIDIZED_COPPER_MATERIAL = new ToolMaterial(
          BlockTags.INCORRECT_FOR_COPPER_TOOL,
          250, 5.0F, 1.0F, 7,
          ItemTags.COPPER_TOOL_MATERIALS
  );
}
