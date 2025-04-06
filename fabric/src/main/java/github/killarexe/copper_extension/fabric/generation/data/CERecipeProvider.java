package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.fabric.registry.CEItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class CERecipeProvider extends FabricRecipeProvider {

    public CERecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new Provider(provider, recipeOutput);
    }


    @Override
    public @NotNull String getName() {
        return CEMod.MOD_ID;
    }

    public static class Provider extends RecipeProvider {

        protected Provider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            super(provider, recipeOutput);
        }

        @Override
        public void buildRecipes() {
            copperSet(
                    CEItems.EXPOSED_COPPER_INGOT,
                    Blocks.EXPOSED_COPPER,
                    Optional.of(Blocks.WAXED_EXPOSED_COPPER),
                    Blocks.EXPOSED_COPPER_DOOR,
                    Blocks.EXPOSED_COPPER_TRAPDOOR
            );

            copperSet(
                    CEItems.WEATHERED_COPPER_INGOT,
                    Blocks.WEATHERED_COPPER,
                    Optional.of(Blocks.WAXED_WEATHERED_COPPER),
                    Blocks.WEATHERED_COPPER_DOOR,
                    Blocks.WEATHERED_COPPER_TRAPDOOR
            );

            copperSet(
                    CEItems.OXIDIZED_COPPER_INGOT,
                    Blocks.OXIDIZED_COPPER,
                    Optional.of(Blocks.WAXED_OXIDIZED_COPPER),
                    Blocks.OXIDIZED_COPPER_DOOR,
                    Blocks.OXIDIZED_COPPER_TRAPDOOR
            );

            copperSet(
                    CEItems.WAXED_COPPER_INGOT,
                    Blocks.WAXED_COPPER_BLOCK,
                    Optional.empty(),
                    Blocks.WAXED_COPPER_DOOR,
                    Blocks.WAXED_COPPER_TRAPDOOR
            );

            copperSet(
                    CEItems.WAXED_EXPOSED_COPPER_INGOT,
                    Blocks.WAXED_EXPOSED_COPPER,
                    Optional.empty(),
                    Blocks.WAXED_EXPOSED_COPPER_DOOR,
                    Blocks.WAXED_EXPOSED_COPPER_TRAPDOOR
            );

            copperSet(
                    CEItems.WAXED_WEATHERED_COPPER_INGOT,
                    Blocks.WAXED_WEATHERED_COPPER,
                    Optional.empty(),
                    Blocks.WAXED_WEATHERED_COPPER_DOOR,
                    Blocks.WAXED_WEATHERED_COPPER_TRAPDOOR
            );

            copperSet(
                    CEItems.WAXED_OXIDIZED_COPPER_INGOT,
                    Blocks.WAXED_OXIDIZED_COPPER,
                    Optional.empty(),
                    Blocks.WAXED_OXIDIZED_COPPER_DOOR,
                    Blocks.WAXED_OXIDIZED_COPPER_TRAPDOOR
            );
        }

        private void copperSet(ItemLike ingot, ItemLike block, Optional<ItemLike> waxedBlock, ItemLike door, ItemLike trapdoor) {
            this.nineBlockStorageRecipes(
                    RecipeCategory.MISC,
                    ingot,
                    RecipeCategory.BUILDING_BLOCKS,
                    block,
                    getNameWithId(block, CEMod.MOD_ID),
                    null,
                    getNameWithId(ingot, CEMod.MOD_ID),
                    getItemName(ingot)
            );

            waxedBlock.ifPresent(itemLike -> this.shapeless(
                            RecipeCategory.MISC,
                            ingot,
                            9
                    ).requires(itemLike)
                    .group(getItemName(ingot))
                    .unlockedBy(getHasName(itemLike), this.has(itemLike))
                    .save(this.output, CEMod.MOD_ID + ":" + getConversionRecipeName(ingot, itemLike)));

            this.doorBuilder(
                            door,
                            Ingredient.of(ingot)
                    ).unlockedBy(getHasName(ingot), this.has(ingot))
                    .save(this.output, getNameWithId(door, CEMod.MOD_ID));

            this.trapdoorBuilder(
                    trapdoor,
                    Ingredient.of(ingot)
            ).unlockedBy(getHasName(ingot), this.has(ingot)).save(this.output, getNameWithId(trapdoor, CEMod.MOD_ID));
        }

        private static String getNameWithId(ItemLike itemLike, String id) {
            String base = getItemName(itemLike);
            return id + ":" + base;
        }
    }
}
