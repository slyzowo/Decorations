package net.slyzowo.decorations.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.slyzowo.decorations.block.ModBlocks;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
  public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
    super(output, registriesFuture);

  }

  @Override
  public void generate(RecipeExporter recipeExporter) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.OAK_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.OAK_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.OAK_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_OAK_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_OAK_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.OAK_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_OAK_LOG));

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.SPRUCE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.SPRUCE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.SPRUCE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.SPRUCE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_SPRUCE_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_SPRUCE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.SPRUCE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_SPRUCE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_SPRUCE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.BIRCH_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.BIRCH_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.BIRCH_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.BIRCH_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_BIRCH_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_BIRCH_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.BIRCH_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_BIRCH_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_BIRCH_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.JUNGLE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.JUNGLE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.JUNGLE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_JUNGLE_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_JUNGLE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.JUNGLE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_JUNGLE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_JUNGLE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.ACACIA_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.ACACIA_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.ACACIA_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.ACACIA_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ACACIA_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_ACACIA_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.ACACIA_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_ACACIA_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_ACACIA_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.DARK_OAK_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.DARK_OAK_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.DARK_OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DARK_OAK_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_DARK_OAK_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.DARK_OAK_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_DARK_OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_DARK_OAK_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.MANGROVE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.MANGROVE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.MANGROVE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_MANGROVE_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_MANGROVE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.MANGROVE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_MANGROVE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_MANGROVE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.CHERRY_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.CHERRY_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.CHERRY_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.CHERRY_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CHERRY_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_CHERRY_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.CHERRY_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_CHERRY_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_CHERRY_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.BAMBOO_BLOCK)
            .input('S', Items.STICK)
            .input('P', Blocks.BAMBOO_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.BAMBOO_BLOCK),
                    FabricRecipeProvider.conditionsFromItem(Items.BAMBOO_BLOCK))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_BAMBOO_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_BAMBOO_BLOCK)
            .input('S', Items.STICK)
            .input('P', Blocks.BAMBOO_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_BAMBOO_BLOCK),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_BAMBOO_BLOCK))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.CRIMSON_STEM)
            .input('S', Items.STICK)
            .input('P', Blocks.CRIMSON_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.CRIMSON_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CRIMSON_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_CRIMSON_STEM)
            .input('S', Items.STICK)
            .input('P', Blocks.CRIMSON_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_CRIMSON_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_CRIMSON_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.WARPED_STEM)
            .input('S', Items.STICK)
            .input('P', Blocks.WARPED_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.WARPED_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.WARPED_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_WARPED_DINING_CHAIR, 4)
            .pattern("L  ")
            .pattern("LPL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_WARPED_STEM)
            .input('S', Items.STICK)
            .input('P', Blocks.WARPED_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_WARPED_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_WARPED_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.OAK_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.OAK_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.OAK_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_OAK_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.STRIPPED_OAK_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.OAK_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_OAK_LOG));

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.SPRUCE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.SPRUCE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.SPRUCE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.SPRUCE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_SPRUCE_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.STRIPPED_SPRUCE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.SPRUCE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_SPRUCE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_SPRUCE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.BIRCH_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.BIRCH_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.BIRCH_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.BIRCH_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_BIRCH_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.STRIPPED_BIRCH_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.BIRCH_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_BIRCH_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_BIRCH_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.JUNGLE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.JUNGLE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.JUNGLE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_JUNGLE_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.STRIPPED_JUNGLE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.JUNGLE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_JUNGLE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_JUNGLE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.ACACIA_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.ACACIA_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.ACACIA_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.ACACIA_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ACACIA_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.STRIPPED_ACACIA_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.ACACIA_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_ACACIA_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_ACACIA_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.DARK_OAK_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.DARK_OAK_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.DARK_OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DARK_OAK_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.STRIPPED_DARK_OAK_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.DARK_OAK_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_DARK_OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_DARK_OAK_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.MANGROVE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.MANGROVE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.MANGROVE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_MANGROVE_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.STRIPPED_MANGROVE_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.MANGROVE_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_MANGROVE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_MANGROVE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.CHERRY_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.CHERRY_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.CHERRY_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.CHERRY_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CHERRY_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.STRIPPED_CHERRY_LOG)
            .input('S', Items.STICK)
            .input('P', Blocks.CHERRY_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_CHERRY_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_CHERRY_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.BAMBOO_BLOCK)
            .input('S', Items.STICK)
            .input('P', Blocks.BAMBOO_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.BAMBOO_BLOCK),
                    FabricRecipeProvider.conditionsFromItem(Items.BAMBOO_BLOCK))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_BAMBOO_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.STRIPPED_BAMBOO_BLOCK)
            .input('S', Items.STICK)
            .input('P', Blocks.BAMBOO_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_BAMBOO_BLOCK),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_BAMBOO_BLOCK))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.CRIMSON_STEM)
            .input('S', Items.STICK)
            .input('P', Blocks.CRIMSON_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.CRIMSON_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CRIMSON_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.STRIPPED_CRIMSON_STEM)
            .input('S', Items.STICK)
            .input('P', Blocks.CRIMSON_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_CRIMSON_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_CRIMSON_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.WARPED_STEM)
            .input('S', Items.STICK)
            .input('P', Blocks.WARPED_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.WARPED_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.WARPED_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_WARPED_LADDERBACK_CHAIR, 4)
            .pattern("A  ")
            .pattern("LPL")
            .pattern("S S")
            .input('A', Blocks.LADDER)
            .input('L', Blocks.STRIPPED_WARPED_STEM)
            .input('S', Items.STICK)
            .input('P', Blocks.WARPED_PLANKS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_WARPED_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_WARPED_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.OAK_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.OAK_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_OAK_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_OAK_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_OAK_LOG));

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.SPRUCE_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.SPRUCE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.SPRUCE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_SPRUCE_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_SPRUCE_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_SPRUCE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_SPRUCE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.BIRCH_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.BIRCH_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.BIRCH_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_BIRCH_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_BIRCH_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_BIRCH_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_BIRCH_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.JUNGLE_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.JUNGLE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_JUNGLE_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_JUNGLE_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_JUNGLE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_JUNGLE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.ACACIA_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.ACACIA_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.ACACIA_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ACACIA_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_ACACIA_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_ACACIA_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_ACACIA_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.DARK_OAK_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.DARK_OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DARK_OAK_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_DARK_OAK_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_DARK_OAK_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_DARK_OAK_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.MANGROVE_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.MANGROVE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_MANGROVE_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_MANGROVE_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_MANGROVE_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_MANGROVE_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.CHERRY_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.CHERRY_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.CHERRY_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CHERRY_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_CHERRY_LOG)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_CHERRY_LOG),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_CHERRY_LOG))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.BAMBOO_BLOCK)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.BAMBOO_BLOCK),
                    FabricRecipeProvider.conditionsFromItem(Items.BAMBOO_BLOCK))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_BAMBOO_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_BAMBOO_BLOCK)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_BAMBOO_BLOCK),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_BAMBOO_BLOCK))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.CRIMSON_STEM)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.CRIMSON_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CRIMSON_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_CRIMSON_STEM)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_CRIMSON_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_CRIMSON_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.WARPED_STEM)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.WARPED_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.WARPED_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_WARPED_TABLE, 4)
            .pattern("   ")
            .pattern("LLL")
            .pattern("S S")
            .input('L', Blocks.STRIPPED_WARPED_STEM)
            .input('S', Items.STICK)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.STRIPPED_WARPED_STEM),
                    FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_WARPED_STEM))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_REINFORCED_GLASS, 4)
            .pattern(" C ")
            .pattern("CGC")
            .pattern(" C ")
            .input('C', Items.COPPER_INGOT)
            .input('G', Blocks.GLASS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                    FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_REINFORCED_GLASS, 4)
            .pattern(" C ")
            .pattern("CGC")
            .pattern(" C ")
            .input('C', Items.IRON_INGOT)
            .input('G', Blocks.GLASS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                    FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_REINFORCED_GLASS, 4)
            .pattern(" C ")
            .pattern("CGC")
            .pattern(" C ")
            .input('C', Items.DIAMOND)
            .input('G', Blocks.GLASS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.DIAMOND),
                    FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
            .offerTo(recipeExporter);

    ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_REINFORCED_GLASS, 4)
            .pattern(" C ")
            .pattern("CGC")
            .pattern(" C ")
            .input('C', Items.OBSIDIAN)
            .input('G', Blocks.GLASS)
            .group("multi_bench")
            .criterion(
                    FabricRecipeProvider.hasItem(Items.OBSIDIAN),
                    FabricRecipeProvider.conditionsFromItem(Items.OBSIDIAN))
            .offerTo(recipeExporter);

  }
}
