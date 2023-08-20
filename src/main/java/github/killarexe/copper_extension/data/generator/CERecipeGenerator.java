package github.killarexe.copper_extension.data.generator;

import java.util.function.Consumer;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class CERecipeGenerator extends RecipeProvider implements IConditionBuilder{

	public CERecipeGenerator(PackOutput pOutput) {
		super(pOutput);
	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> writer) {
		
	}

}
