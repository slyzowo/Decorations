package net.slyzowo.decorations.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.slyzowo.decorations.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
  public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
    getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT);

    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.COPPER_REINFORCED_GLASS)
            .add(ModBlocks.IRON_REINFORCED_GLASS)
            .add(ModBlocks.GOLD_REINFORCED_GLASS)
            .add(ModBlocks.DIAMOND_REINFORCED_GLASS)
            .add(ModBlocks.OBSIDIAN_REINFORCED_GLASS);

    getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .add(ModBlocks.OAK_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_OAK_DINING_CHAIR)
            .add(ModBlocks.SPRUCE_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_SPRUCE_DINING_CHAIR)
            .add(ModBlocks.BIRCH_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_BIRCH_DINING_CHAIR)
            .add(ModBlocks.JUNGLE_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_JUNGLE_DINING_CHAIR)
            .add(ModBlocks.ACACIA_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_ACACIA_DINING_CHAIR)
            .add(ModBlocks.DARK_OAK_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_DARK_OAK_DINING_CHAIR)
            .add(ModBlocks.MANGROVE_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_MANGROVE_DINING_CHAIR)
            .add(ModBlocks.CHERRY_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_CHERRY_DINING_CHAIR)
            .add(ModBlocks.PALE_OAK_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_PALE_OAK_DINING_CHAIR)
            .add(ModBlocks.BAMBOO_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_BAMBOO_DINING_CHAIR)
            .add(ModBlocks.CRIMSON_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_CRIMSON_DINING_CHAIR)
            .add(ModBlocks.WARPED_DINING_CHAIR)
            .add(ModBlocks.STRIPPED_WARPED_DINING_CHAIR)

            .add(ModBlocks.OAK_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_OAK_LADDERBACK_CHAIR)
            .add(ModBlocks.SPRUCE_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_SPRUCE_LADDERBACK_CHAIR)
            .add(ModBlocks.BIRCH_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_BIRCH_LADDERBACK_CHAIR)
            .add(ModBlocks.JUNGLE_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_JUNGLE_LADDERBACK_CHAIR)
            .add(ModBlocks.ACACIA_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_ACACIA_LADDERBACK_CHAIR)
            .add(ModBlocks.DARK_OAK_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_DARK_OAK_LADDERBACK_CHAIR)
            .add(ModBlocks.MANGROVE_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_MANGROVE_LADDERBACK_CHAIR)
            .add(ModBlocks.CHERRY_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_CHERRY_LADDERBACK_CHAIR)
            .add(ModBlocks.PALE_OAK_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_PALE_OAK_LADDERBACK_CHAIR)
            .add(ModBlocks.BAMBOO_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_BAMBOO_LADDERBACK_CHAIR)
            .add(ModBlocks.CRIMSON_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_CRIMSON_LADDERBACK_CHAIR)
            .add(ModBlocks.WARPED_LADDERBACK_CHAIR)
            .add(ModBlocks.STRIPPED_WARPED_LADDERBACK_CHAIR)

            .add(ModBlocks.OAK_TABLE)
            .add(ModBlocks.STRIPPED_OAK_TABLE)
            .add(ModBlocks.SPRUCE_TABLE)
            .add(ModBlocks.STRIPPED_SPRUCE_TABLE)
            .add(ModBlocks.BIRCH_TABLE)
            .add(ModBlocks.STRIPPED_BIRCH_TABLE)
            .add(ModBlocks.JUNGLE_TABLE)
            .add(ModBlocks.STRIPPED_JUNGLE_TABLE)
            .add(ModBlocks.ACACIA_TABLE)
            .add(ModBlocks.STRIPPED_ACACIA_TABLE)
            .add(ModBlocks.DARK_OAK_TABLE)
            .add(ModBlocks.STRIPPED_DARK_OAK_TABLE)
            .add(ModBlocks.MANGROVE_TABLE)
            .add(ModBlocks.STRIPPED_MANGROVE_TABLE)
            .add(ModBlocks.CHERRY_TABLE)
            .add(ModBlocks.STRIPPED_CHERRY_TABLE)
            .add(ModBlocks.PALE_OAK_TABLE)
            .add(ModBlocks.STRIPPED_PALE_OAK_TABLE)
            .add(ModBlocks.BAMBOO_TABLE)
            .add(ModBlocks.STRIPPED_BAMBOO_TABLE)
            .add(ModBlocks.CRIMSON_TABLE)
            .add(ModBlocks.STRIPPED_CRIMSON_TABLE)
            .add(ModBlocks.WARPED_TABLE)
            .add(ModBlocks.STRIPPED_WARPED_TABLE);

    getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE);
    getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);

    getOrCreateTagBuilder(BlockTags.DAMPENS_VIBRATIONS)
            .add(ModBlocks.TRANSGENDER_WOOL)
            .add(ModBlocks.TRANSGENDER_CARPET)
            .add(ModBlocks.PRIDE_WOOL)
            .add(ModBlocks.PRIDE_CARPET);

    getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
            .add(ModBlocks.COPPER_REINFORCED_GLASS)
            .add(ModBlocks.IRON_REINFORCED_GLASS)
            .add(ModBlocks.DIAMOND_REINFORCED_GLASS);

    getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

    getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.OBSIDIAN_REINFORCED_GLASS);

    getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
            .add(ModBlocks.OBSIDIAN_REINFORCED_GLASS);

    getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL)
            .add(ModBlocks.OBSIDIAN_REINFORCED_GLASS);

    getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_GOLD_TOOL)
            .add(ModBlocks.OBSIDIAN_REINFORCED_GLASS);

    getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);

    getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);

  }
}
