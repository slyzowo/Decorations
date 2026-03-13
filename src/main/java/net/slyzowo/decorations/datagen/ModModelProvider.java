package net.slyzowo.decorations.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.slyzowo.decorations.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
  public ModModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.OAK_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_OAK_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPRUCE_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_SPRUCE_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BIRCH_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_BIRCH_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.JUNGLE_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_JUNGLE_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACACIA_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_ACACIA_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DARK_OAK_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_DARK_OAK_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MANGROVE_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_MANGROVE_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHERRY_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_CHERRY_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PALE_OAK_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_PALE_OAK_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BAMBOO_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_BAMBOO_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CRIMSON_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_CRIMSON_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WARPED_DINING_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_WARPED_DINING_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.OAK_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_OAK_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPRUCE_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_SPRUCE_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BIRCH_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_BIRCH_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.JUNGLE_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_JUNGLE_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACACIA_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_ACACIA_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DARK_OAK_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_DARK_OAK_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MANGROVE_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_MANGROVE_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHERRY_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_CHERRY_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PALE_OAK_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_PALE_OAK_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BAMBOO_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_BAMBOO_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CRIMSON_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_CRIMSON_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WARPED_LADDERBACK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_WARPED_LADDERBACK_CHAIR);

    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLEAR_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCRATCHED_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COPPER_REINFORCED_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_REINFORCED_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLD_REINFORCED_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIAMOND_REINFORCED_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBSIDIAN_REINFORCED_GLASS);

    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRANSGENDER_WOOL);
    blockStateModelGenerator.registerSingleton(ModBlocks.PRIDE_WOOL, TexturedModel.CARPET);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRIDE_WOOL);
    blockStateModelGenerator.registerSingleton(ModBlocks.TRANSGENDER_WOOL, TexturedModel.CARPET);
  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {

  }
}
