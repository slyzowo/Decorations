package net.slyzowo.decorations.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.slyzowo.decorations.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
  public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
    super(dataOutput, registryLookup);
  }

  @Override
  public void generate() {
    addDrop(ModBlocks.OAK_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_OAK_DINING_CHAIR);
    addDrop(ModBlocks.SPRUCE_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_SPRUCE_DINING_CHAIR);
    addDrop(ModBlocks.BIRCH_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_BIRCH_DINING_CHAIR);
    addDrop(ModBlocks.JUNGLE_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_JUNGLE_DINING_CHAIR);
    addDrop(ModBlocks.ACACIA_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_ACACIA_DINING_CHAIR);
    addDrop(ModBlocks.DARK_OAK_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_DARK_OAK_DINING_CHAIR);
    addDrop(ModBlocks.MANGROVE_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_MANGROVE_DINING_CHAIR);
    addDrop(ModBlocks.CHERRY_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_CHERRY_DINING_CHAIR);
    addDrop(ModBlocks.PALE_OAK_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_PALE_OAK_DINING_CHAIR);
    addDrop(ModBlocks.BAMBOO_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_BAMBOO_DINING_CHAIR);
    addDrop(ModBlocks.CRIMSON_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_CRIMSON_DINING_CHAIR);
    addDrop(ModBlocks.WARPED_DINING_CHAIR);
    addDrop(ModBlocks.STRIPPED_WARPED_DINING_CHAIR);

    addDrop(ModBlocks.OAK_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_OAK_LADDERBACK_CHAIR);
    addDrop(ModBlocks.SPRUCE_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_SPRUCE_LADDERBACK_CHAIR);
    addDrop(ModBlocks.BIRCH_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_BIRCH_LADDERBACK_CHAIR);
    addDrop(ModBlocks.JUNGLE_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_JUNGLE_LADDERBACK_CHAIR);
    addDrop(ModBlocks.ACACIA_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_ACACIA_LADDERBACK_CHAIR);
    addDrop(ModBlocks.DARK_OAK_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_DARK_OAK_LADDERBACK_CHAIR);
    addDrop(ModBlocks.MANGROVE_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_MANGROVE_LADDERBACK_CHAIR);
    addDrop(ModBlocks.CHERRY_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_CHERRY_LADDERBACK_CHAIR);
    addDrop(ModBlocks.PALE_OAK_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_PALE_OAK_LADDERBACK_CHAIR);
    addDrop(ModBlocks.BAMBOO_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_BAMBOO_LADDERBACK_CHAIR);
    addDrop(ModBlocks.CRIMSON_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_CRIMSON_LADDERBACK_CHAIR);
    addDrop(ModBlocks.WARPED_LADDERBACK_CHAIR);
    addDrop(ModBlocks.STRIPPED_WARPED_LADDERBACK_CHAIR);

    addDrop(ModBlocks.OAK_TABLE);
    addDrop(ModBlocks.STRIPPED_OAK_TABLE);
    addDrop(ModBlocks.SPRUCE_TABLE);
    addDrop(ModBlocks.STRIPPED_SPRUCE_TABLE);
    addDrop(ModBlocks.BIRCH_TABLE);
    addDrop(ModBlocks.STRIPPED_BIRCH_TABLE);
    addDrop(ModBlocks.JUNGLE_TABLE);
    addDrop(ModBlocks.STRIPPED_JUNGLE_TABLE);
    addDrop(ModBlocks.ACACIA_TABLE);
    addDrop(ModBlocks.STRIPPED_ACACIA_TABLE);
    addDrop(ModBlocks.DARK_OAK_TABLE);
    addDrop(ModBlocks.STRIPPED_DARK_OAK_TABLE);
    addDrop(ModBlocks.MANGROVE_TABLE);
    addDrop(ModBlocks.STRIPPED_MANGROVE_TABLE);
    addDrop(ModBlocks.CHERRY_TABLE);
    addDrop(ModBlocks.STRIPPED_CHERRY_TABLE);
    addDrop(ModBlocks.PALE_OAK_TABLE);
    addDrop(ModBlocks.STRIPPED_PALE_OAK_TABLE);
    addDrop(ModBlocks.BAMBOO_TABLE);
    addDrop(ModBlocks.STRIPPED_BAMBOO_TABLE);
    addDrop(ModBlocks.CRIMSON_TABLE);
    addDrop(ModBlocks.STRIPPED_CRIMSON_TABLE);
    addDrop(ModBlocks.WARPED_TABLE);
    addDrop(ModBlocks.STRIPPED_WARPED_TABLE);

    addDrop(ModBlocks.PRIDE_WOOL);
    addDrop(ModBlocks.PRIDE_CARPET);

    addDrop(ModBlocks.TRANSGENDER_WOOL);
    addDrop(ModBlocks.TRANSGENDER_CARPET);

    addDrop(ModBlocks.COPPER_REINFORCED_GLASS);
    addDrop(ModBlocks.IRON_REINFORCED_GLASS);
    addDrop(ModBlocks.GOLD_REINFORCED_GLASS);
    addDrop(ModBlocks.DIAMOND_REINFORCED_GLASS);
    addDrop(ModBlocks.OBSIDIAN_REINFORCED_GLASS);
  }
}
