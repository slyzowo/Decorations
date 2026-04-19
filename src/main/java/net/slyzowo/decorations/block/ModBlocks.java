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
import net.slyzowo.decorations.block.custom.TableBlock;

public class ModBlocks {

  public static final Block OAK_DINING_CHAIR = registerBlock("oak_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OAK_TAN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_OAK_DINING_CHAIR = registerBlock("stripped_oak_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OAK_TAN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block SPRUCE_DINING_CHAIR = registerBlock("spruce_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.SPRUCE_BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_SPRUCE_DINING_CHAIR = registerBlock("stripped_spruce_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.SPRUCE_BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block BIRCH_DINING_CHAIR = registerBlock("birch_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PALE_YELLOW).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_BIRCH_DINING_CHAIR = registerBlock("stripped_birch_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PALE_YELLOW).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block JUNGLE_DINING_CHAIR = registerBlock("jungle_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_JUNGLE_DINING_CHAIR = registerBlock("stripped_jungle_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block ACACIA_DINING_CHAIR = registerBlock("acacia_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_ACACIA_DINING_CHAIR = registerBlock("stripped_acacia_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block DARK_OAK_DINING_CHAIR = registerBlock("dark_oak_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_DARK_OAK_DINING_CHAIR = registerBlock("stripped_dark_oak_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block MANGROVE_DINING_CHAIR = registerBlock("mangrove_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.RED).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_MANGROVE_DINING_CHAIR = registerBlock("stripped_mangrove_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.GRAY).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block CHERRY_DINING_CHAIR = registerBlock("cherry_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PINK).strength(0.8F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));

  public static final Block STRIPPED_CHERRY_DINING_CHAIR = registerBlock("stripped_cherry_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PINK).strength(0.8F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));

  public static final Block PALE_OAK_DINING_CHAIR = registerBlock("pale_oak_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OFF_WHITE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_PALE_OAK_DINING_CHAIR = registerBlock("stripped_pale_oak_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OFF_WHITE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block BAMBOO_DINING_CHAIR = registerBlock("bamboo_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.YELLOW).strength(0.8F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));

  public static final Block STRIPPED_BAMBOO_DINING_CHAIR = registerBlock("stripped_bamboo_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.YELLOW).strength(0.8F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));

  public static final Block CRIMSON_DINING_CHAIR = registerBlock("crimson_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.DARK_CRIMSON).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block STRIPPED_CRIMSON_DINING_CHAIR = registerBlock("stripped_crimson_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.DARK_CRIMSON).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block WARPED_DINING_CHAIR = registerBlock("warped_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BLUE).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block STRIPPED_WARPED_DINING_CHAIR = registerBlock("stripped_warped_dining_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BLUE).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block OAK_LADDERBACK_CHAIR = registerBlock("oak_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OAK_TAN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_OAK_LADDERBACK_CHAIR = registerBlock("stripped_oak_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OAK_TAN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block SPRUCE_LADDERBACK_CHAIR = registerBlock("spruce_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.SPRUCE_BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_SPRUCE_LADDERBACK_CHAIR = registerBlock("stripped_spruce_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.SPRUCE_BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block BIRCH_LADDERBACK_CHAIR = registerBlock("birch_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PALE_YELLOW).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_BIRCH_LADDERBACK_CHAIR = registerBlock("stripped_birch_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PALE_YELLOW).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block JUNGLE_LADDERBACK_CHAIR = registerBlock("jungle_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_JUNGLE_LADDERBACK_CHAIR = registerBlock("stripped_jungle_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block ACACIA_LADDERBACK_CHAIR = registerBlock("acacia_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_ACACIA_LADDERBACK_CHAIR = registerBlock("stripped_acacia_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block DARK_OAK_LADDERBACK_CHAIR = registerBlock("dark_oak_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_DARK_OAK_LADDERBACK_CHAIR = registerBlock("stripped_dark_oak_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block MANGROVE_LADDERBACK_CHAIR = registerBlock("mangrove_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.RED).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_MANGROVE_LADDERBACK_CHAIR = registerBlock("stripped_mangrove_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.GRAY).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block CHERRY_LADDERBACK_CHAIR = registerBlock("cherry_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PINK).strength(0.8F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));

  public static final Block STRIPPED_CHERRY_LADDERBACK_CHAIR = registerBlock("stripped_cherry_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PINK).strength(0.8F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));

  public static final Block PALE_OAK_LADDERBACK_CHAIR = registerBlock("pale_oak_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OFF_WHITE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_PALE_OAK_LADDERBACK_CHAIR = registerBlock("stripped_pale_oak_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OFF_WHITE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block BAMBOO_LADDERBACK_CHAIR = registerBlock("bamboo_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.YELLOW).strength(0.8F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));

  public static final Block STRIPPED_BAMBOO_LADDERBACK_CHAIR = registerBlock("stripped_bamboo_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.YELLOW).strength(0.8F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));

  public static final Block CRIMSON_LADDERBACK_CHAIR = registerBlock("crimson_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.DARK_CRIMSON).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block STRIPPED_CRIMSON_LADDERBACK_CHAIR = registerBlock("stripped_crimson_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.DARK_CRIMSON).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block WARPED_LADDERBACK_CHAIR = registerBlock("warped_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BLUE).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block STRIPPED_WARPED_LADDERBACK_CHAIR = registerBlock("stripped_warped_ladderback_chair",
          new ChairBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BLUE).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block OAK_TABLE = registerBlock("oak_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OAK_TAN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_OAK_TABLE = registerBlock("stripped_oak_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OAK_TAN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block SPRUCE_TABLE = registerBlock("spruce_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.SPRUCE_BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_SPRUCE_TABLE = registerBlock("stripped_spruce_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.SPRUCE_BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block BIRCH_TABLE = registerBlock("birch_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PALE_YELLOW).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_BIRCH_TABLE = registerBlock("stripped_birch_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PALE_YELLOW).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block JUNGLE_TABLE = registerBlock("jungle_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_JUNGLE_TABLE = registerBlock("stripped_jungle_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block ACACIA_TABLE = registerBlock("acacia_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_ACACIA_TABLE = registerBlock("stripped_acacia_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.ORANGE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block DARK_OAK_TABLE = registerBlock("dark_oak_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_DARK_OAK_TABLE = registerBlock("stripped_dark_oak_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BROWN).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block MANGROVE_TABLE = registerBlock("mangrove_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.RED).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_MANGROVE_TABLE = registerBlock("stripped_mangrove_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.GRAY).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block CHERRY_TABLE = registerBlock("cherry_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PINK).strength(0.8F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));

  public static final Block STRIPPED_CHERRY_TABLE = registerBlock("stripped_cherry_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.PINK).strength(0.8F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));

  public static final Block PALE_OAK_TABLE = registerBlock("pale_oak_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OFF_WHITE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block STRIPPED_PALE_OAK_TABLE = registerBlock("stripped_pale_oak_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.OFF_WHITE).strength(0.8F).sounds(BlockSoundGroup.WOOD).burnable()));

  public static final Block BAMBOO_TABLE = registerBlock("bamboo_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.YELLOW).strength(0.8F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));

  public static final Block STRIPPED_BAMBOO_TABLE = registerBlock("stripped_bamboo_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.YELLOW).strength(0.8F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));

  public static final Block CRIMSON_TABLE = registerBlock("crimson_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.DARK_CRIMSON).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block STRIPPED_CRIMSON_TABLE = registerBlock("stripped_crimson_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.DARK_CRIMSON).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block WARPED_TABLE = registerBlock("warped_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BLUE).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block STRIPPED_WARPED_TABLE = registerBlock("stripped_warped_table",
          new TableBlock(AbstractBlock.Settings.create().nonOpaque().mapColor(MapColor.BLUE).strength(0.8F).sounds(BlockSoundGroup.NETHER_WOOD)));

  public static final Block PRIDE_WOOL = registerBlock("pride_wool",
          new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.GUITAR).strength(0.8F)
                  .sounds(BlockSoundGroup.WOOL).burnable()));

  public static final Block PRIDE_CARPET = registerBlock("pride_carpet",
          new CarpetBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.GUITAR).strength(0.1F)
                  .sounds(BlockSoundGroup.WOOL).burnable()));

  public static final Block TRANSGENDER_WOOL = registerBlock("transgender_wool",
          new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).instrument(NoteBlockInstrument.GUITAR).strength(0.8F)
                  .sounds(BlockSoundGroup.WOOL).burnable()));

  public static final Block TRANSGENDER_CARPET = registerBlock("transgender_carpet",
          new CarpetBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).instrument(NoteBlockInstrument.GUITAR).strength(0.1F)
                  .sounds(BlockSoundGroup.WOOL).burnable()));

  public static final Block CLEAR_GLASS = registerBlock("clear_glass",
          new TransparentBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()
                  .allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));

  public static final Block SCRATCHED_GLASS = registerBlock("scratched_glass",
          new TransparentBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()
                  .allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));

  public static final Block COPPER_REINFORCED_GLASS = registerBlock("copper_reinforced_glass",
          new TransparentBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(5.0F, 6.0F)
                  .sounds(BlockSoundGroup.GLASS).mapColor(MapColor.ORANGE).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never)
                  .suffocates(Blocks::never).blockVision(Blocks::never)));

  public static final Block IRON_REINFORCED_GLASS = registerBlock("iron_reinforced_glass",
          new TransparentBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(5.0F, 6.0F)
                  .sounds(BlockSoundGroup.GLASS).mapColor(MapColor.IRON_GRAY).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never)
                  .suffocates(Blocks::never).blockVision(Blocks::never)));

  public static final Block GOLD_REINFORCED_GLASS = registerBlock("gold_reinforced_glass",
          new TransparentBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(5.0F, 6.0F)
                  .sounds(BlockSoundGroup.GLASS).mapColor(MapColor.GOLD).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never)
                  .suffocates(Blocks::never).blockVision(Blocks::never)));

  public static final Block DIAMOND_REINFORCED_GLASS = registerBlock("diamond_reinforced_glass",
          new TransparentBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(5.0F, 6.0F)
                  .sounds(BlockSoundGroup.GLASS).mapColor(MapColor.DIAMOND_BLUE).nonOpaque().allowsSpawning(Blocks::never)
                  .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));

  public static final Block OBSIDIAN_REINFORCED_GLASS = registerBlock("obsidian_reinforced_glass",
          new TransparentBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.HAT)
                  .strength(50.0F, 1200.0F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never)
                  .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));


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
