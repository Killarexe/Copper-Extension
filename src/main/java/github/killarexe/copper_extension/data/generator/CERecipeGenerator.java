package github.killarexe.copper_extension.data.generator;

import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class CERecipeGenerator extends RecipeProvider implements IConditionBuilder{

	public CERecipeGenerator(PackOutput pOutput) {
		super(pOutput);
	}

	@Override
	protected void buildRecipes(RecipeOutput output) {
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CEItems.WAXED_COPPER_INGOT.get())
			.requires(Items.COPPER_INGOT)
			.requires(Items.HONEYCOMB)
			.unlockedBy("has_material", has(Items.COPPER_INGOT))
			.save(output);
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CEItems.WAXED_WEATHERED_COPPER_INGOT.get())
			.requires(CEItems.WEATHERED_COPPER_INGOT.get())
			.requires(Items.HONEYCOMB)
			.unlockedBy("has_material", has(CEItems.WAXED_COPPER_INGOT.get()))
			.save(output);
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, CEItems.WAXED_EXPOSED_COPPER_INGOT.get())
			.requires(CEItems.EXPOSED_COPPER_INGOT.get())
			.requires(Items.HONEYCOMB)
			.unlockedBy("has_material", has(CEItems.EXPOSED_COPPER_INGOT.get()))
			.save(output);
		
		blockRecipe(output, Blocks.WAXED_COPPER_BLOCK, CEItems.WAXED_COPPER_INGOT.get());
		blockRecipe(output, Blocks.WAXED_EXPOSED_COPPER, CEItems.WAXED_EXPOSED_COPPER_INGOT.get());
		blockRecipe(output, Blocks.WAXED_WEATHERED_COPPER, CEItems.WAXED_WEATHERED_COPPER_INGOT.get());
		blockRecipe(output, Blocks.EXPOSED_COPPER, CEItems.EXPOSED_COPPER_INGOT.get());
		blockRecipe(output, Blocks.WEATHERED_COPPER, CEItems.WEATHERED_COPPER_INGOT.get());
		blockRecipe(output, Blocks.OXIDIZED_COPPER, CEItems.OXIDIZED_COPPER_INGOT.get());
	}
	
	private void blockRecipe(RecipeOutput output, ItemLike result, ItemLike input) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
      		.define('#', input)
      		.pattern("###")
      		.pattern("###")
			.pattern("###")
			.unlockedBy("has_material", has(input))
			.save(output);
	}
}
