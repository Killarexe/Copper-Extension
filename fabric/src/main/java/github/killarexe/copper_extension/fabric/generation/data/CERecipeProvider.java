package github.killarexe.copper_extension.fabric.generation.data;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.fabric.registry.CEItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class CERecipeProvider extends FabricRecipeProvider {

    public CERecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NonNull RecipeProvider createRecipeProvider(
        HolderLookup.@NonNull Provider registries,
        @NonNull BootstrapContext<Recipe<?>> recipes,
        @NonNull BootstrapContext<Advancement> advancements
    ) {
        return new Provider(recipes, advancements);
    }

    @Override
    public @NotNull String getName() {
        return CEMod.MOD_ID;
    }

    public static class Provider extends RecipeProvider {

        protected Provider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
            super(recipeOutput, advancementOutput);
        }

        @Override
        public void buildRecipes() {
            copperSet(
                    CEItems.EXPOSED_COPPER_INGOT,
                    CEItems.EXPOSED_COPPER_NUGGET,
                    Blocks.COPPER_BLOCK.weathering().exposed(),
                    Optional.of(Blocks.COPPER_BLOCK.waxed().exposed()),
                    Blocks.COPPER_DOOR.weathering().exposed(),
                    Blocks.COPPER_TRAPDOOR.weathering().exposed(),
                    Blocks.COPPER_CHEST.weathering().exposed(),
                    Blocks.COPPER_LANTERN.weathering().exposed(),
                    Blocks.COPPER_CHAIN.weathering().exposed(),
                    Blocks.COPPER_BARS.weathering().exposed(),
                    CEItems.EXPOSED_COPPER_HELMET,
                    CEItems.EXPOSED_COPPER_CHESTPLATE,
                    CEItems.EXPOSED_COPPER_LEGGINGS,
                    CEItems.EXPOSED_COPPER_BOOTS,
                    CEItems.EXPOSED_COPPER_SWORD,
                    CEItems.EXPOSED_COPPER_PICKAXE,
                    CEItems.EXPOSED_COPPER_AXE,
                    CEItems.EXPOSED_COPPER_SHOVEL,
                    CEItems.EXPOSED_COPPER_HOE
            );

            copperSet(
                    CEItems.WEATHERED_COPPER_INGOT,
                    CEItems.WEATHERED_COPPER_NUGGET,
                    Blocks.COPPER_BLOCK.weathering().weathered(),
                    Optional.of(Blocks.COPPER_BLOCK.waxed().weathered()),
                    Blocks.COPPER_DOOR.weathering().weathered(),
                    Blocks.COPPER_TRAPDOOR.weathering().weathered(),
                    Blocks.COPPER_CHEST.weathering().weathered(),
                    Blocks.COPPER_LANTERN.weathering().weathered(),
                    Blocks.COPPER_CHAIN.weathering().weathered(),
                    Blocks.COPPER_BARS.weathering().weathered(),
                    CEItems.WEATHERED_COPPER_HELMET,
                    CEItems.WEATHERED_COPPER_CHESTPLATE,
                    CEItems.WEATHERED_COPPER_LEGGINGS,
                    CEItems.WEATHERED_COPPER_BOOTS,
                    CEItems.WEATHERED_COPPER_SWORD,
                    CEItems.WEATHERED_COPPER_PICKAXE,
                    CEItems.WEATHERED_COPPER_AXE,
                    CEItems.WEATHERED_COPPER_SHOVEL,
                    CEItems.WEATHERED_COPPER_HOE
            );

            copperSet(
                    CEItems.OXIDIZED_COPPER_INGOT,
                    CEItems.OXIDIZED_COPPER_NUGGET,
                    Blocks.COPPER_BLOCK.weathering().oxidized(),
                    Optional.of(Blocks.COPPER_BLOCK.waxed().oxidized()),
                    Blocks.COPPER_DOOR.weathering().oxidized(),
                    Blocks.COPPER_TRAPDOOR.weathering().oxidized(),
                    Blocks.COPPER_CHEST.weathering().oxidized(),
                    Blocks.COPPER_LANTERN.weathering().oxidized(),
                    Blocks.COPPER_CHAIN.weathering().oxidized(),
                    Blocks.COPPER_BARS.weathering().oxidized(),
                    CEItems.OXIDIZED_COPPER_HELMET,
                    CEItems.OXIDIZED_COPPER_CHESTPLATE,
                    CEItems.OXIDIZED_COPPER_LEGGINGS,
                    CEItems.OXIDIZED_COPPER_BOOTS,
                    CEItems.OXIDIZED_COPPER_SWORD,
                    CEItems.OXIDIZED_COPPER_PICKAXE,
                    CEItems.OXIDIZED_COPPER_AXE,
                    CEItems.OXIDIZED_COPPER_SHOVEL,
                    CEItems.OXIDIZED_COPPER_HOE
            );

            copperSet(
                    CEItems.WAXED_COPPER_INGOT,
                    CEItems.WAXED_COPPER_NUGGET,
                    Blocks.COPPER_BLOCK.waxed().unaffected(),
                    Optional.empty(),
                    Blocks.COPPER_DOOR.waxed().unaffected(),
                    Blocks.COPPER_TRAPDOOR.waxed().unaffected(),
                    Blocks.COPPER_CHEST.waxed().unaffected(),
                    Blocks.COPPER_LANTERN.waxed().unaffected(),
                    Blocks.COPPER_CHAIN.waxed().unaffected(),
                    Blocks.COPPER_BARS.waxed().unaffected(),
                    CEItems.WAXED_COPPER_HELMET,
                    CEItems.WAXED_COPPER_CHESTPLATE,
                    CEItems.WAXED_COPPER_LEGGINGS,
                    CEItems.WAXED_COPPER_BOOTS,
                    CEItems.WAXED_COPPER_SWORD,
                    CEItems.WAXED_COPPER_PICKAXE,
                    CEItems.WAXED_COPPER_AXE,
                    CEItems.WAXED_COPPER_SHOVEL,
                    CEItems.WAXED_COPPER_HOE
            );

            copperSet(
                    CEItems.WAXED_EXPOSED_COPPER_INGOT,
                    CEItems.WAXED_EXPOSED_COPPER_NUGGET,
                    Blocks.COPPER_BLOCK.waxed().exposed(),
                    Optional.empty(),
                    Blocks.COPPER_DOOR.waxed().exposed(),
                    Blocks.COPPER_TRAPDOOR.waxed().exposed(),
                    Blocks.COPPER_CHEST.waxed().exposed(),
                    Blocks.COPPER_LANTERN.waxed().exposed(),
                    Blocks.COPPER_CHAIN.waxed().exposed(),
                    Blocks.COPPER_BARS.waxed().exposed(),
                    CEItems.WAXED_EXPOSED_COPPER_HELMET,
                    CEItems.WAXED_EXPOSED_COPPER_CHESTPLATE,
                    CEItems.WAXED_EXPOSED_COPPER_LEGGINGS,
                    CEItems.WAXED_EXPOSED_COPPER_BOOTS,
                    CEItems.WAXED_EXPOSED_COPPER_SWORD,
                    CEItems.WAXED_EXPOSED_COPPER_PICKAXE,
                    CEItems.WAXED_EXPOSED_COPPER_AXE,
                    CEItems.WAXED_EXPOSED_COPPER_SHOVEL,
                    CEItems.WAXED_EXPOSED_COPPER_HOE
            );

            copperSet(
                    CEItems.WAXED_WEATHERED_COPPER_INGOT,
                    CEItems.WAXED_WEATHERED_COPPER_NUGGET,
                    Blocks.COPPER_BLOCK.waxed().weathered(),
                    Optional.empty(),
                    Blocks.COPPER_DOOR.waxed().weathered(),
                    Blocks.COPPER_TRAPDOOR.waxed().weathered(),
                    Blocks.COPPER_CHEST.waxed().weathered(),
                    Blocks.COPPER_LANTERN.waxed().weathered(),
                    Blocks.COPPER_CHAIN.waxed().weathered(),
                    Blocks.COPPER_BARS.waxed().weathered(),
                    CEItems.WAXED_WEATHERED_COPPER_HELMET,
                    CEItems.WAXED_WEATHERED_COPPER_CHESTPLATE,
                    CEItems.WAXED_WEATHERED_COPPER_LEGGINGS,
                    CEItems.WAXED_WEATHERED_COPPER_BOOTS,
                    CEItems.WAXED_WEATHERED_COPPER_SWORD,
                    CEItems.WAXED_WEATHERED_COPPER_PICKAXE,
                    CEItems.WAXED_WEATHERED_COPPER_AXE,
                    CEItems.WAXED_WEATHERED_COPPER_SHOVEL,
                    CEItems.WAXED_WEATHERED_COPPER_HOE
            );

            copperSet(
                    CEItems.WAXED_OXIDIZED_COPPER_INGOT,
                    CEItems.WAXED_OXIDIZED_COPPER_NUGGET,
                    Blocks.COPPER_BLOCK.waxed().oxidized(),
                    Optional.empty(),
                    Blocks.COPPER_DOOR.waxed().oxidized(),
                    Blocks.COPPER_TRAPDOOR.waxed().oxidized(),
                    Blocks.COPPER_CHEST.waxed().oxidized(),
                    Blocks.COPPER_LANTERN.waxed().oxidized(),
                    Blocks.COPPER_CHAIN.waxed().oxidized(),
                    Blocks.COPPER_BARS.waxed().oxidized(),
                    CEItems.WAXED_OXIDIZED_COPPER_HELMET,
                    CEItems.WAXED_OXIDIZED_COPPER_CHESTPLATE,
                    CEItems.WAXED_OXIDIZED_COPPER_LEGGINGS,
                    CEItems.WAXED_OXIDIZED_COPPER_BOOTS,
                    CEItems.WAXED_OXIDIZED_COPPER_SWORD,
                    CEItems.WAXED_OXIDIZED_COPPER_PICKAXE,
                    CEItems.WAXED_OXIDIZED_COPPER_AXE,
                    CEItems.WAXED_OXIDIZED_COPPER_SHOVEL,
                    CEItems.WAXED_OXIDIZED_COPPER_HOE
            );
        }

        private void copperSet(
                ItemLike ingot, ItemLike nugget, ItemLike block,
                Optional<ItemLike> waxedBlock, ItemLike door, ItemLike trapdoor,
                ItemLike chest, ItemLike lantern, ItemLike chain, ItemLike bars,
                ItemLike helmet, ItemLike chestplate, ItemLike leggings, ItemLike boots,
                ItemLike sword, ItemLike pickaxe, ItemLike axe, ItemLike shovel, ItemLike hoe) {
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

            this.nineBlockStorageRecipes(
                    RecipeCategory.MISC,
                    nugget,
                    RecipeCategory.MISC,
                    ingot,
                    getNameWithId(ingot, CEMod.MOD_ID) + "_from_nuggets",
                    null,
                    getNameWithId(nugget, CEMod.MOD_ID),
                    getItemName(nugget)
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

            this.shaped(RecipeCategory.BUILDING_BLOCKS, chest)
                    .define('#', ingot)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("###")
                    .group(getItemName(chest))
                    .unlockedBy(getHasName(ingot), this.has(ingot))
                    .save(this.output);

            this.shaped(RecipeCategory.BUILDING_BLOCKS, lantern)
                    .define('.', ingot)
                    .define('/', Items.SOUL_TORCH)
                    .pattern("...")
                    .pattern("./.")
                    .pattern("...")
                    .group(getItemName(lantern))
                    .unlockedBy(getHasName(nugget), this.has(nugget))
                    .save(this.output);

            this.shaped(RecipeCategory.BUILDING_BLOCKS, bars)
                    .define('#', ingot)
                    .pattern("###")
                    .pattern("###")
                    .group(getItemName(bars))
                    .unlockedBy(getHasName(ingot), this.has(ingot))
                    .save(this.output);

            this.shaped(RecipeCategory.BUILDING_BLOCKS, chain)
                    .define('#', ingot)
                    .define('.', nugget)
                    .pattern(" . ")
                    .pattern(" # ")
                    .pattern(" . ")
                    .group(getItemName(chain))
                    .unlockedBy(getHasName(nugget), this.has(nugget))
                    .save(this.output);

            this.shaped(RecipeCategory.COMBAT, helmet)
                    .define('#', ingot)
                    .pattern("###")
                    .pattern("# #")
                    .group(getItemName(helmet))
                    .unlockedBy(getHasName(ingot), this.has(ingot))
                    .save(this.output);

            this.shaped(RecipeCategory.COMBAT, chestplate)
                    .define('#', ingot)
                    .pattern("# #")
                    .pattern("###")
                    .pattern("###")
                    .group(getItemName(chestplate))
                    .unlockedBy(getHasName(ingot), this.has(ingot))
                    .save(this.output);

            this.shaped(RecipeCategory.COMBAT, leggings)
                    .define('#', ingot)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("# #")
                    .group(getItemName(leggings))
                    .unlockedBy(getHasName(ingot), this.has(ingot))
                    .save(this.output);

            this.shaped(RecipeCategory.COMBAT, boots)
                    .define('#', ingot)
                    .pattern("# #")
                    .pattern("# #")
                    .group(getItemName(boots))
                    .unlockedBy(getHasName(ingot), this.has(ingot))
                    .save(this.output);

          this.shaped(RecipeCategory.COMBAT, sword)
                  .define('#', ingot)
                  .define('/', Items.STICK)
                  .pattern(" # ")
                  .pattern(" # ")
                  .pattern(" / ")
                  .group(getItemName(sword))
                  .unlockedBy(getHasName(ingot), this.has(ingot))
                  .save(this.output);

          this.shaped(RecipeCategory.COMBAT, axe)
                  .define('#', ingot)
                  .define('/', Items.STICK)
                  .pattern(" ##")
                  .pattern(" /#")
                  .pattern(" / ")
                  .group(getItemName(axe))
                  .unlockedBy(getHasName(ingot), this.has(ingot))
                  .save(this.output);

          this.shaped(RecipeCategory.TOOLS, pickaxe)
                  .define('#', ingot)
                  .define('/', Items.STICK)
                  .pattern("###")
                  .pattern(" / ")
                  .pattern(" / ")
                  .group(getItemName(pickaxe))
                  .unlockedBy(getHasName(ingot), this.has(ingot))
                  .save(this.output);

          this.shaped(RecipeCategory.TOOLS, shovel)
                  .define('#', ingot)
                  .define('/', Items.STICK)
                  .pattern(" # ")
                  .pattern(" / ")
                  .pattern(" / ")
                  .group(getItemName(shovel))
                  .unlockedBy(getHasName(ingot), this.has(ingot))
                  .save(this.output);

          this.shaped(RecipeCategory.TOOLS, hoe)
                  .define('#', ingot)
                  .define('/', Items.STICK)
                  .pattern(" ##")
                  .pattern(" / ")
                  .pattern(" / ")
                  .group(getItemName(hoe))
                  .unlockedBy(getHasName(ingot), this.has(ingot))
                  .save(this.output);

          SimpleCookingRecipeBuilder.smelting(
                  Ingredient.of(
                          pickaxe, shovel, axe, hoe,
                          sword, helmet, chestplate, leggings,
                          boots
                  ), RecipeCategory.MISC, CookingBookCategory.MISC, Items.COPPER_NUGGET, 0.1F, 200)
                  .unlockedBy("has_" + getItemName(pickaxe), this.has(pickaxe))
                  .unlockedBy("has_" + getItemName(shovel), this.has(shovel))
                  .unlockedBy("has_" + getItemName(axe), this.has(axe))
                  .unlockedBy("has_" + getItemName(hoe), this.has(hoe))
                  .unlockedBy("has_" + getItemName(sword), this.has(sword))
                  .unlockedBy("has_" + getItemName(helmet), this.has(helmet))
                  .unlockedBy("has_" + getItemName(chestplate), this.has(chestplate))
                  .unlockedBy("has_" + getItemName(leggings), this.has(leggings))
                  .unlockedBy("has_" + getItemName(boots), this.has(boots))
                  .group(getItemName(nugget))
                  .save(this.output, getSmeltingRecipeName(nugget));
        }

        private static String getNameWithId(ItemLike itemLike, String id) {
            String base = getItemName(itemLike);
            return id + ":" + base;
        }
    }
}
