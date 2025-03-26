package github.killarexe.copper_extension.neoforge.data.generation;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.neoforge.registry.CEItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CERecipeProvider extends RecipeProvider {

    public CERecipeProvider(HolderLookup.Provider lookup, RecipeOutput output) {
        super(lookup, output);
    }

    @Override
    protected void buildRecipes() {
        this.nineBlockStorageRecipesRecipesWithCustomUnpacking(
                RecipeCategory.MISC,
                CEItems.EXPOSED_COPPER_INGOT.get(),
                RecipeCategory.BUILDING_BLOCKS,
                Items.EXPOSED_COPPER,
                getSimpleRecipeName(CEItems.EXPOSED_COPPER_INGOT.get()),
                getItemName(CEItems.EXPOSED_COPPER_INGOT.get())
        );

        this.shapeless(
                RecipeCategory.MISC,
                CEItems.EXPOSED_COPPER_INGOT.get(),
                9
        ).requires(Blocks.WAXED_EXPOSED_COPPER)
        .group(getItemName(CEItems.EXPOSED_COPPER_INGOT.get()))
        .unlockedBy(getHasName(Blocks.WAXED_EXPOSED_COPPER), this.has(Blocks.WAXED_EXPOSED_COPPER))
        .save(this.output, getConversionRecipeName(CEItems.EXPOSED_COPPER_INGOT.get(), Blocks.WAXED_EXPOSED_COPPER));

        this.doorBuilder(
                Blocks.EXPOSED_COPPER_DOOR,
                Ingredient.of(CEItems.EXPOSED_COPPER_INGOT.get())
        ).unlockedBy(getHasName(CEItems.EXPOSED_COPPER_INGOT.get()), this.has(CEItems.EXPOSED_COPPER_INGOT.get()))
        .save(this.output);

        this.trapdoorBuilder(
                Blocks.EXPOSED_COPPER_TRAPDOOR,
                Ingredient.of(CEItems.EXPOSED_COPPER_INGOT.get())
        ).unlockedBy(getHasName(CEItems.EXPOSED_COPPER_INGOT.get()), this.has(CEItems.EXPOSED_COPPER_INGOT.get())).save(this.output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider arg, RecipeOutput arg2) {
            return new CERecipeProvider(arg, arg2);
        }

        @Override
        public @NotNull String getName() {
            return CEMod.MOD_ID;
        }
    }
}
