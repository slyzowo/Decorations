package net.slyzowo.decorations.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.slyzowo.decorations.Decorations;
import net.slyzowo.decorations.block.custom.ChairBlock;

public class ModBlocks {

  public static final Block OAK_CHAIR = registerBlock("oak_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.OAK_TAN)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block STRIPPED_OAK_CHAIR = registerBlock("stripped_oak_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.OAK_TAN)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block SPRUCE_CHAIR = registerBlock("spruce_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.SPRUCE_BROWN)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block STRIPPED_SPRUCE_CHAIR = registerBlock("stripped_spruce_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.SPRUCE_BROWN)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block BIRCH_CHAIR = registerBlock("birch_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.PALE_YELLOW)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block STRIPPED_BIRCH_CHAIR = registerBlock("stripped_birch_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.PALE_YELLOW)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block JUNGLE_CHAIR = registerBlock("jungle_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.ORANGE)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block STRIPPED_JUNGLE_CHAIR = registerBlock("stripped_jungle_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.ORANGE)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block ACACIA_CHAIR = registerBlock("acacia_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.ORANGE)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block STRIPPED_ACACIA_CHAIR = registerBlock("stripped_acacia_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.ORANGE)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.BROWN)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block STRIPPED_DARK_OAK_CHAIR = registerBlock("stripped_dark_oak_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.BROWN)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block MANGROVE_CHAIR = registerBlock("mangrove_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.GRAY)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block STRIPPED_MANGROVE_CHAIR = registerBlock("stripped_mangrove_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.GRAY)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block CHERRY_CHAIR = registerBlock("cherry_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.PINK)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.CHERRY_WOOD)
                  .burnable()));

  public static final Block STRIPPED_CHERRY_CHAIR = registerBlock("stripped_cherry_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.PINK)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.CHERRY_WOOD)
                  .burnable()));

  public static final Block PALE_OAK_CHAIR = registerBlock("pale_oak_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.OFF_WHITE)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block STRIPPED_PALE_OAK_CHAIR = registerBlock("stripped_pale_oak_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.OFF_WHITE)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOD)
                  .burnable()));

  public static final Block BAMBOO_CHAIR = registerBlock("bamboo_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.YELLOW)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.BAMBOO_WOOD)
                  .burnable()));

  public static final Block STRIPPED_BAMBOO_CHAIR = registerBlock("stripped_bamboo_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.YELLOW)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.BAMBOO_WOOD)
                  .burnable()));

  public static final Block CRIMSON_CHAIR = registerBlock("crimson_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.DARK_CRIMSON)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block STRIPPED_CRIMSON_CHAIR = registerBlock("stripped_crimson_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.DARK_CRIMSON)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block WARPED_CHAIR = registerBlock("warped_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.BLUE)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block STRIPPED_WARPED_CHAIR = registerBlock("stripped_warped_chair",
          new ChairBlock(AbstractBlock.Settings.create()
                  .nonOpaque()
                  .mapColor(MapColor.BLUE)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.NETHER_WOOD)));



  public static final Block PRIDE_WOOL = registerBlock("pride_wool",
          new Block(AbstractBlock.Settings.create()
                  .mapColor(MapColor.RED)
                  .instrument(NoteBlockInstrument.GUITAR)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOL)
                  .burnable()));

  public static final Block TRANSGENDER_WOOL = registerBlock("transgender_wool",
          new Block(AbstractBlock.Settings.create()
                  .mapColor(MapColor.BLUE)
                  .instrument(NoteBlockInstrument.GUITAR)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOL)
                  .burnable()));

  public static final Block CLEAR_GLASS = registerBlock("clear_glass",
          new TransparentBlock(
                  AbstractBlock.Settings.create()
                          .instrument(NoteBlockInstrument.HAT)
                          .strength(0.3F)
                          .sounds(BlockSoundGroup.GLASS)
                          .nonOpaque()
                          .allowsSpawning(Blocks::never)
                          .solidBlock(Blocks::never)
                          .suffocates(Blocks::never)
                          .blockVision(Blocks::never)
          ));

  public static final Block SCRATCHED_GLASS = registerBlock("scratched_glass",
          new TransparentBlock(
                  AbstractBlock.Settings.create()
                          .instrument(NoteBlockInstrument.HAT)
                          .strength(0.3F)
                          .sounds(BlockSoundGroup.GLASS)
                          .nonOpaque()
                          .allowsSpawning(Blocks::never)
                          .solidBlock(Blocks::never)
                          .suffocates(Blocks::never)
                          .blockVision(Blocks::never)
          ));

/*
  public static final Block SCRATCHED_GLASS_PANE = registerBlock("scratched_glass_pane",
          new PaneBlock(AbstractBlock.Settings.create()
                  .instrument(NoteBlockInstrument.HAT)
                  .strength(0.3F)
                  .sounds(BlockSoundGroup.GLASS)
                  .nonOpaque()));
*/

  public static final Block COPPER_REINFORCED_GLASS = registerBlock("copper_reinforced_glass",
          new TransparentBlock(
                  AbstractBlock.Settings.create()
                          .instrument(NoteBlockInstrument.HAT)
                          .strength(5.0F, 6.0F)
                          .sounds(BlockSoundGroup.GLASS)
                          .mapColor(MapColor.ORANGE)
                          .nonOpaque()
                          .allowsSpawning(Blocks::never)
                          .solidBlock(Blocks::never)
                          .suffocates(Blocks::never)
                          .blockVision(Blocks::never)
          ));

  public static final Block IRON_REINFORCED_GLASS = registerBlock("iron_reinforced_glass",
          new TransparentBlock(
                  AbstractBlock.Settings.create()
                          .instrument(NoteBlockInstrument.HAT)
                          .strength(5.0F, 6.0F)
                          .sounds(BlockSoundGroup.GLASS)
                          .mapColor(MapColor.IRON_GRAY)
                          .nonOpaque()
                          .allowsSpawning(Blocks::never)
                          .solidBlock(Blocks::never)
                          .suffocates(Blocks::never)
                          .blockVision(Blocks::never)
          ));

  public static final Block GOLD_REINFORCED_GLASS = registerBlock("gold_reinforced_glass",
          new TransparentBlock(
                  AbstractBlock.Settings.create()
                          .instrument(NoteBlockInstrument.HAT)
                          .strength(5.0F, 6.0F)
                          .sounds(BlockSoundGroup.GLASS)
                          .mapColor(MapColor.GOLD)
                          .nonOpaque()
                          .allowsSpawning(Blocks::never)
                          .solidBlock(Blocks::never)
                          .suffocates(Blocks::never)
                          .blockVision(Blocks::never)
          ));

  public static final Block DIAMOND_REINFORCED_GLASS = registerBlock("diamond_reinforced_glass",
          new TransparentBlock(
                  AbstractBlock.Settings.create()
                          .instrument(NoteBlockInstrument.HAT)
                          .strength(5.0F, 6.0F)
                          .sounds(BlockSoundGroup.GLASS)
                          .mapColor(MapColor.DIAMOND_BLUE)
                          .nonOpaque()
                          .allowsSpawning(Blocks::never)
                          .solidBlock(Blocks::never)
                          .suffocates(Blocks::never)
                          .blockVision(Blocks::never)
          ));

  public static final Block OBSIDIAN_REINFORCED_GLASS = registerBlock("obsidian_reinforced_glass",
          new TransparentBlock(
                  AbstractBlock.Settings.create()
                          .mapColor(MapColor.BLACK)
                          .instrument(NoteBlockInstrument.HAT)
                          .strength(50.0F, 1200.0F)
                          .sounds(BlockSoundGroup.GLASS)
                          .nonOpaque()
                          .allowsSpawning(Blocks::never)
                          .solidBlock(Blocks::never)
                          .suffocates(Blocks::never)
                          .blockVision(Blocks::never)
          ));

  private static Block registerBlock(String name, Block block){
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, Identifier.of(Decorations.MOD_ID, name), block);
  }

  private static void registerBlockItem(String name, Block block){
    Registry.register(Registries.ITEM, Identifier.of(Decorations.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
  }

  public static void registerModBlocks(){
    Decorations.LOGGER.info("Registering Mod Blocks for " + Decorations.MOD_ID);
  }
}
