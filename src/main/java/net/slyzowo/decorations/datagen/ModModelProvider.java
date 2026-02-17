package net.slyzowo.decorations.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.slyzowo.decorations.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
  public ModModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.OAK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_OAK_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPRUCE_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_SPRUCE_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BIRCH_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_BIRCH_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.JUNGLE_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_JUNGLE_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACACIA_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_ACACIA_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DARK_OAK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_DARK_OAK_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MANGROVE_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_MANGROVE_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHERRY_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_CHERRY_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PALE_OAK_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_PALE_OAK_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BAMBOO_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_BAMBOO_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CRIMSON_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_CRIMSON_CHAIR);

    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WARPED_CHAIR);
    blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STRIPPED_WARPED_CHAIR);

    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLEAR_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCRATCHED_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COPPER_REINFORCED_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_REINFORCED_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLD_REINFORCED_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIAMOND_REINFORCED_GLASS);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBSIDIAN_REINFORCED_GLASS);

    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRANSGENDER_WOOL);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRIDE_WOOL);
  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {

  }
}
