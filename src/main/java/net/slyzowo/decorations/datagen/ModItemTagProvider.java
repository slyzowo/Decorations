package net.slyzowo.decorations.datagen;

import net.minecraft.block.Block;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.ItemTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.slyzowo.decorations.block.ModBlocks;
import net.slyzowo.decorations.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagProvider {
  public ModItemTagProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture, CompletableFuture<TagLookup<Block>> blockTagLookupFuture) {
    super(output, registryLookupFuture, blockTagLookupFuture);
  }

  @Override
  protected void configure(RegistryWrapper.WrapperLookup lookup) {
    getOrCreateTagBuilder(ItemTags.WOOL)
            .add(ModBlocks.PRIDE_WOOL.asItem())
            .add(ModBlocks.PRIDE_CARPET.asItem())
            .add(ModBlocks.TRANSGENDER_WOOL.asItem())
            .add(ModBlocks.TRANSGENDER_CARPET.asItem());

    getOrCreateTagBuilder(ItemTags.PLANKS)
            .add(ModBlocks.OAK_DINING_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_OAK_DINING_CHAIR.asItem())
            .add(ModBlocks.SPRUCE_DINING_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_SPRUCE_DINING_CHAIR.asItem())
            .add(ModBlocks.BIRCH_DINING_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_BIRCH_DINING_CHAIR.asItem())
            .add(ModBlocks.JUNGLE_DINING_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_JUNGLE_DINING_CHAIR.asItem())
            .add(ModBlocks.ACACIA_DINING_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_ACACIA_DINING_CHAIR.asItem())
            .add(ModBlocks.DARK_OAK_DINING_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_DARK_OAK_DINING_CHAIR.asItem())
            .add(ModBlocks.MANGROVE_DINING_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_MANGROVE_DINING_CHAIR.asItem())
            .add(ModBlocks.CHERRY_DINING_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_CHERRY_DINING_CHAIR.asItem())
            .add(ModBlocks.BAMBOO_DINING_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_BAMBOO_DINING_CHAIR.asItem())
            .add(ModBlocks.CRIMSON_DINING_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_CRIMSON_DINING_CHAIR.asItem())
            .add(ModBlocks.WARPED_DINING_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_WARPED_DINING_CHAIR.asItem())

            .add(ModBlocks.OAK_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_OAK_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.SPRUCE_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_SPRUCE_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.BIRCH_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_BIRCH_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.JUNGLE_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_JUNGLE_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.ACACIA_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_ACACIA_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.DARK_OAK_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_DARK_OAK_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.MANGROVE_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_MANGROVE_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.CHERRY_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_CHERRY_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.BAMBOO_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_BAMBOO_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.CRIMSON_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_CRIMSON_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.WARPED_LADDERBACK_CHAIR.asItem())
            .add(ModBlocks.STRIPPED_WARPED_LADDERBACK_CHAIR.asItem())

            .add(ModBlocks.OAK_TABLE.asItem())
            .add(ModBlocks.STRIPPED_OAK_TABLE.asItem())
            .add(ModBlocks.SPRUCE_TABLE.asItem())
            .add(ModBlocks.STRIPPED_SPRUCE_TABLE.asItem())
            .add(ModBlocks.BIRCH_TABLE.asItem())
            .add(ModBlocks.STRIPPED_BIRCH_TABLE.asItem())
            .add(ModBlocks.JUNGLE_TABLE.asItem())
            .add(ModBlocks.STRIPPED_JUNGLE_TABLE.asItem())
            .add(ModBlocks.ACACIA_TABLE.asItem())
            .add(ModBlocks.STRIPPED_ACACIA_TABLE.asItem())
            .add(ModBlocks.DARK_OAK_TABLE.asItem())
            .add(ModBlocks.STRIPPED_DARK_OAK_TABLE.asItem())
            .add(ModBlocks.MANGROVE_TABLE.asItem())
            .add(ModBlocks.STRIPPED_MANGROVE_TABLE.asItem())
            .add(ModBlocks.CHERRY_TABLE.asItem())
            .add(ModBlocks.STRIPPED_CHERRY_TABLE.asItem())
            .add(ModBlocks.BAMBOO_TABLE.asItem())
            .add(ModBlocks.STRIPPED_BAMBOO_TABLE.asItem())
            .add(ModBlocks.CRIMSON_TABLE.asItem())
            .add(ModBlocks.STRIPPED_CRIMSON_TABLE.asItem())
            .add(ModBlocks.WARPED_TABLE.asItem())
            .add(ModBlocks.STRIPPED_WARPED_TABLE.asItem())

            .add(ModBlocks.OAK_STOOL.asItem())
            .add(ModBlocks.STRIPPED_OAK_STOOL.asItem())
            .add(ModBlocks.SPRUCE_STOOL.asItem())
            .add(ModBlocks.STRIPPED_SPRUCE_STOOL.asItem())
            .add(ModBlocks.BIRCH_STOOL.asItem())
            .add(ModBlocks.STRIPPED_BIRCH_STOOL.asItem())
            .add(ModBlocks.JUNGLE_STOOL.asItem())
            .add(ModBlocks.STRIPPED_JUNGLE_STOOL.asItem())
            .add(ModBlocks.ACACIA_STOOL.asItem())
            .add(ModBlocks.STRIPPED_ACACIA_STOOL.asItem())
            .add(ModBlocks.DARK_OAK_STOOL.asItem())
            .add(ModBlocks.STRIPPED_DARK_OAK_STOOL.asItem())
            .add(ModBlocks.MANGROVE_STOOL.asItem())
            .add(ModBlocks.STRIPPED_MANGROVE_STOOL.asItem())
            .add(ModBlocks.CHERRY_STOOL.asItem())
            .add(ModBlocks.STRIPPED_CHERRY_STOOL.asItem())
            .add(ModBlocks.BAMBOO_STOOL.asItem())
            .add(ModBlocks.STRIPPED_BAMBOO_STOOL.asItem())
            .add(ModBlocks.CRIMSON_STOOL.asItem())
            .add(ModBlocks.STRIPPED_CRIMSON_STOOL.asItem())
            .add(ModBlocks.WARPED_STOOL.asItem())
            .add(ModBlocks.STRIPPED_WARPED_STOOL.asItem());
  }
}
