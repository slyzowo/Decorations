package net.slyzowo.decorations.block;

// Minecraft libraries
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

// Decorations parts
import net.slyzowo.decorations.Decorations;

public class ModBlocks {

  /* Dining Chairs */

  public static final Block OAK_DINING_CHAIR = registerBlock("oak_dining_chair",
          createWoodChairBlock(MapColor.OAK_TAN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_OAK_DINING_CHAIR = registerBlock("stripped_oak_dining_chair",
          createWoodChairBlock(MapColor.OAK_TAN, BlockSoundGroup.WOOD));

  public static final Block SPRUCE_DINING_CHAIR = registerBlock("spruce_dining_chair",
          createWoodChairBlock(MapColor.SPRUCE_BROWN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_SPRUCE_DINING_CHAIR = registerBlock("stripped_spruce_dining_chair",
          createWoodChairBlock(MapColor.SPRUCE_BROWN, BlockSoundGroup.WOOD));

  public static final Block BIRCH_DINING_CHAIR = registerBlock("birch_dining_chair",
          createWoodChairBlock(MapColor.PALE_YELLOW, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_BIRCH_DINING_CHAIR = registerBlock("stripped_birch_dining_chair",
          createWoodChairBlock(MapColor.PALE_YELLOW, BlockSoundGroup.WOOD));

  public static final Block JUNGLE_DINING_CHAIR = registerBlock("jungle_dining_chair",
          createWoodChairBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_JUNGLE_DINING_CHAIR = registerBlock("stripped_jungle_dining_chair",
          createWoodChairBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block ACACIA_DINING_CHAIR = registerBlock("acacia_dining_chair",
          createWoodChairBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_ACACIA_DINING_CHAIR = registerBlock("stripped_acacia_dining_chair",
          createWoodChairBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block DARK_OAK_DINING_CHAIR = registerBlock("dark_oak_dining_chair",
          createWoodChairBlock(MapColor.BROWN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_DARK_OAK_DINING_CHAIR = registerBlock("stripped_dark_oak_dining_chair",
          createWoodChairBlock(MapColor.BROWN, BlockSoundGroup.WOOD));

  public static final Block MANGROVE_DINING_CHAIR = registerBlock("mangrove_dining_chair",
          createWoodChairBlock(MapColor.RED, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_MANGROVE_DINING_CHAIR = registerBlock("stripped_mangrove_dining_chair",
          createWoodChairBlock(MapColor.GRAY, BlockSoundGroup.WOOD));

  public static final Block CHERRY_DINING_CHAIR = registerBlock("cherry_dining_chair",
          createWoodChairBlock(MapColor.PINK, BlockSoundGroup.CHERRY_WOOD));

  public static final Block STRIPPED_CHERRY_DINING_CHAIR = registerBlock("stripped_cherry_dining_chair",
          createWoodChairBlock(MapColor.PINK, BlockSoundGroup.CHERRY_WOOD));

  public static final Block BAMBOO_DINING_CHAIR = registerBlock("bamboo_dining_chair",
          createWoodChairBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD));

  public static final Block STRIPPED_BAMBOO_DINING_CHAIR = registerBlock("stripped_bamboo_dining_chair",
          createWoodChairBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD));

  public static final Block CRIMSON_DINING_CHAIR = registerBlock("crimson_dining_chair",
          createChairBlock(MapColor.DARK_CRIMSON, BlockSoundGroup.NETHER_WOOD));

  public static final Block STRIPPED_CRIMSON_DINING_CHAIR = registerBlock("stripped_crimson_dining_chair",
          createChairBlock(MapColor.DARK_CRIMSON, BlockSoundGroup.NETHER_WOOD));

  public static final Block WARPED_DINING_CHAIR = registerBlock("warped_dining_chair",
          createChairBlock(MapColor.BLUE, BlockSoundGroup.NETHER_WOOD));

  public static final Block STRIPPED_WARPED_DINING_CHAIR = registerBlock("stripped_warped_dining_chair",
          createChairBlock(MapColor.DARK_CRIMSON, BlockSoundGroup.NETHER_WOOD));

  /* Ladderback Chairs */

  public static final Block OAK_LADDERBACK_CHAIR = registerBlock("oak_ladderback_chair",
          createWoodChairBlock(MapColor.OAK_TAN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_OAK_LADDERBACK_CHAIR = registerBlock("stripped_oak_ladderback_chair",
          createWoodChairBlock(MapColor.OAK_TAN, BlockSoundGroup.WOOD));

  public static final Block SPRUCE_LADDERBACK_CHAIR = registerBlock("spruce_ladderback_chair",
          createWoodChairBlock(MapColor.SPRUCE_BROWN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_SPRUCE_LADDERBACK_CHAIR = registerBlock("stripped_spruce_ladderback_chair",
          createWoodChairBlock(MapColor.SPRUCE_BROWN, BlockSoundGroup.WOOD));

  public static final Block BIRCH_LADDERBACK_CHAIR = registerBlock("birch_ladderback_chair",
          createWoodChairBlock(MapColor.PALE_YELLOW, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_BIRCH_LADDERBACK_CHAIR = registerBlock("stripped_birch_ladderback_chair",
          createWoodChairBlock(MapColor.PALE_YELLOW, BlockSoundGroup.WOOD));

  public static final Block JUNGLE_LADDERBACK_CHAIR = registerBlock("jungle_ladderback_chair",
          createWoodChairBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_JUNGLE_LADDERBACK_CHAIR = registerBlock("stripped_jungle_ladderback_chair",
          createWoodChairBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block ACACIA_LADDERBACK_CHAIR = registerBlock("acacia_ladderback_chair",
          createWoodChairBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_ACACIA_LADDERBACK_CHAIR = registerBlock("stripped_acacia_ladderback_chair",
          createWoodChairBlock(MapColor.SPRUCE_BROWN, BlockSoundGroup.WOOD));

  public static final Block DARK_OAK_LADDERBACK_CHAIR = registerBlock("dark_oak_ladderback_chair",
          createWoodChairBlock(MapColor.BROWN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_DARK_OAK_LADDERBACK_CHAIR = registerBlock("stripped_dark_oak_ladderback_chair",
          createWoodChairBlock(MapColor.BROWN, BlockSoundGroup.WOOD));

  public static final Block MANGROVE_LADDERBACK_CHAIR = registerBlock("mangrove_ladderback_chair",
          createWoodChairBlock(MapColor.RED, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_MANGROVE_LADDERBACK_CHAIR = registerBlock("stripped_mangrove_ladderback_chair",
          createWoodChairBlock(MapColor.GRAY, BlockSoundGroup.WOOD));

  public static final Block CHERRY_LADDERBACK_CHAIR = registerBlock("cherry_ladderback_chair",
          createWoodChairBlock(MapColor.PINK, BlockSoundGroup.CHERRY_WOOD));

  public static final Block STRIPPED_CHERRY_LADDERBACK_CHAIR = registerBlock("stripped_cherry_ladderback_chair",
          createWoodChairBlock(MapColor.PINK, BlockSoundGroup.CHERRY_WOOD));

  public static final Block BAMBOO_LADDERBACK_CHAIR = registerBlock("bamboo_ladderback_chair",
          createWoodChairBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD));

  public static final Block STRIPPED_BAMBOO_LADDERBACK_CHAIR = registerBlock("stripped_bamboo_ladderback_chair",
          createWoodChairBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD));

  public static final Block CRIMSON_LADDERBACK_CHAIR = registerBlock("crimson_ladderback_chair",
          createChairBlock(MapColor.DARK_CRIMSON, BlockSoundGroup.NETHER_WOOD));

  public static final Block STRIPPED_CRIMSON_LADDERBACK_CHAIR = registerBlock("stripped_crimson_ladderback_chair",
          createChairBlock(MapColor.DARK_CRIMSON, BlockSoundGroup.NETHER_WOOD));

  public static final Block WARPED_LADDERBACK_CHAIR = registerBlock("warped_ladderback_chair",
          createChairBlock(MapColor.BLUE, BlockSoundGroup.NETHER_WOOD));

  public static final Block STRIPPED_WARPED_LADDERBACK_CHAIR = registerBlock("stripped_warped_ladderback_chair",
          createChairBlock(MapColor.BLUE, BlockSoundGroup.NETHER_WOOD));


  /* Tables */

  public static final Block OAK_TABLE = registerBlock("oak_table",
          createWoodTableBlock(MapColor.OAK_TAN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_OAK_TABLE = registerBlock("stripped_oak_table",
          createWoodTableBlock(MapColor.OAK_TAN, BlockSoundGroup.WOOD));

  public static final Block SPRUCE_TABLE = registerBlock("spruce_table",
          createWoodTableBlock(MapColor.SPRUCE_BROWN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_SPRUCE_TABLE = registerBlock("stripped_spruce_table",
          createWoodTableBlock(MapColor.SPRUCE_BROWN, BlockSoundGroup.WOOD));

  public static final Block BIRCH_TABLE = registerBlock("birch_table",
          createWoodTableBlock(MapColor.PALE_YELLOW, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_BIRCH_TABLE = registerBlock("stripped_birch_table",
          createWoodTableBlock(MapColor.PALE_YELLOW, BlockSoundGroup.WOOD));

  public static final Block JUNGLE_TABLE = registerBlock("jungle_table",
          createWoodTableBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_JUNGLE_TABLE = registerBlock("stripped_jungle_table",
          createWoodTableBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block ACACIA_TABLE = registerBlock("acacia_table",
          createWoodTableBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_ACACIA_TABLE = registerBlock("stripped_acacia_table",
          createWoodTableBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block DARK_OAK_TABLE = registerBlock("dark_oak_table",
          createWoodTableBlock(MapColor.BROWN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_DARK_OAK_TABLE = registerBlock("stripped_dark_oak_table",
          createWoodTableBlock(MapColor.BROWN, BlockSoundGroup.WOOD));

  public static final Block MANGROVE_TABLE = registerBlock("mangrove_table",
          createWoodTableBlock(MapColor.RED, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_MANGROVE_TABLE = registerBlock("stripped_mangrove_table",
          createWoodTableBlock(MapColor.GRAY, BlockSoundGroup.WOOD));

  public static final Block CHERRY_TABLE = registerBlock("cherry_table",
          createWoodTableBlock(MapColor.PINK, BlockSoundGroup.CHERRY_WOOD));

  public static final Block STRIPPED_CHERRY_TABLE = registerBlock("stripped_cherry_table",
          createWoodTableBlock(MapColor.PINK, BlockSoundGroup.CHERRY_WOOD));

  public static final Block BAMBOO_TABLE = registerBlock("bamboo_table",
          createWoodTableBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD));

  public static final Block STRIPPED_BAMBOO_TABLE = registerBlock("stripped_bamboo_table",
          createWoodTableBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD));

  public static final Block CRIMSON_TABLE = registerBlock("crimson_table",
          createTableBlock(MapColor.DARK_CRIMSON, BlockSoundGroup.NETHER_WOOD));

  public static final Block STRIPPED_CRIMSON_TABLE = registerBlock("stripped_crimson_table",
          createTableBlock(MapColor.DARK_CRIMSON, BlockSoundGroup.NETHER_WOOD));

  public static final Block WARPED_TABLE = registerBlock("warped_table",
          createTableBlock(MapColor.BLUE, BlockSoundGroup.NETHER_WOOD));

  public static final Block STRIPPED_WARPED_TABLE = registerBlock("stripped_warped_table",
          createTableBlock(MapColor.BLUE, BlockSoundGroup.NETHER_WOOD));

  public static final Block GLASS_TABLE = registerBlock("glass_table",
          createWoodTableBlock(MapColor.CLEAR, BlockSoundGroup.GLASS));

  /* Stools */

  public static final Block OAK_STOOL = registerBlock("oak_stool",
          createWoodStoolBlock(MapColor.OAK_TAN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_OAK_STOOL = registerBlock("stripped_oak_stool",
          createWoodStoolBlock(MapColor.OAK_TAN, BlockSoundGroup.WOOD));

  public static final Block SPRUCE_STOOL = registerBlock("spruce_stool",
          createWoodStoolBlock(MapColor.SPRUCE_BROWN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_SPRUCE_STOOL = registerBlock("stripped_spruce_stool",
          createWoodStoolBlock(MapColor.SPRUCE_BROWN, BlockSoundGroup.WOOD));

  public static final Block BIRCH_STOOL = registerBlock("birch_stool",
          createWoodStoolBlock(MapColor.PALE_YELLOW, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_BIRCH_STOOL = registerBlock("stripped_birch_stool",
          createWoodStoolBlock(MapColor.PALE_YELLOW, BlockSoundGroup.WOOD));

  public static final Block JUNGLE_STOOL = registerBlock("jungle_stool",
          createWoodStoolBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_JUNGLE_STOOL = registerBlock("stripped_jungle_stool",
          createWoodStoolBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block ACACIA_STOOL = registerBlock("acacia_stool",
          createWoodStoolBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_ACACIA_STOOL = registerBlock("stripped_acacia_stool",
          createWoodStoolBlock(MapColor.ORANGE, BlockSoundGroup.WOOD));

  public static final Block DARK_OAK_STOOL = registerBlock("dark_oak_stool",
          createWoodStoolBlock(MapColor.BROWN, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_DARK_OAK_STOOL = registerBlock("stripped_dark_oak_stool",
          createWoodStoolBlock(MapColor.BROWN, BlockSoundGroup.WOOD));

  public static final Block MANGROVE_STOOL = registerBlock("mangrove_stool",
          createWoodStoolBlock(MapColor.RED, BlockSoundGroup.WOOD));

  public static final Block STRIPPED_MANGROVE_STOOL = registerBlock("stripped_mangrove_stool",
          createWoodStoolBlock(MapColor.GRAY, BlockSoundGroup.WOOD));

  public static final Block CHERRY_STOOL = registerBlock("cherry_stool",
          createWoodStoolBlock(MapColor.PINK, BlockSoundGroup.CHERRY_WOOD));

  public static final Block STRIPPED_CHERRY_STOOL = registerBlock("stripped_cherry_stool",
          createWoodStoolBlock(MapColor.PINK, BlockSoundGroup.CHERRY_WOOD));

  public static final Block BAMBOO_STOOL = registerBlock("bamboo_stool",
          createWoodStoolBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD));

  public static final Block STRIPPED_BAMBOO_STOOL = registerBlock("stripped_bamboo_stool",
        createWoodStoolBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD));

  public static final Block CRIMSON_STOOL = registerBlock("crimson_stool",
          createStoolBlock(MapColor.DARK_CRIMSON, BlockSoundGroup.NETHER_WOOD));

  public static final Block STRIPPED_CRIMSON_STOOL = registerBlock("stripped_crimson_stool",
          createStoolBlock(MapColor.DARK_CRIMSON, BlockSoundGroup.NETHER_WOOD));

  public static final Block WARPED_STOOL = registerBlock("warped_stool",
          createStoolBlock(MapColor.BLUE, BlockSoundGroup.NETHER_WOOD));

  public static final Block STRIPPED_WARPED_STOOL = registerBlock("stripped_warped_stool",
          createStoolBlock(MapColor.BLUE, BlockSoundGroup.NETHER_WOOD));

  /* Froggy Chair */

  public static final Block FROGGY_CHAIR = registerBlock("froggy_chair",
          createChairBlock(MapColor.BLUE, BlockSoundGroup.FROGLIGHT));

  /* Wool */

  public static final Block PRIDE_WOOL = registerBlock("pride_wool",
          new Block(AbstractBlock.Settings.create()
                  .mapColor(MapColor.RED)
                  .instrument(NoteBlockInstrument.GUITAR)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOL)
                  .burnable()));

  public static final Block PRIDE_CARPET = registerBlock("pride_carpet",
          new CarpetBlock(AbstractBlock.Settings.create()
                  .mapColor(MapColor.RED)
                  .instrument(NoteBlockInstrument.GUITAR)
                  .strength(0.1F)
                  .sounds(BlockSoundGroup.WOOL)
                  .burnable()));

  public static final Block TRANSGENDER_WOOL = registerBlock("transgender_wool",
          new Block(AbstractBlock.Settings.create()
                  .mapColor(MapColor.LIGHT_BLUE)
                  .instrument(NoteBlockInstrument.GUITAR)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOL)
                  .burnable()));

  public static final Block TRANSGENDER_CARPET = registerBlock("transgender_carpet",
          new CarpetBlock(AbstractBlock.Settings.create()
                  .mapColor(MapColor.LIGHT_BLUE)
                  .instrument(NoteBlockInstrument.GUITAR)
                  .strength(0.1F)
                  .sounds(BlockSoundGroup.WOOL)
                  .burnable()));

  /* Glass */

  public static final Block CLEAR_GLASS = registerBlock("clear_glass",
          createGlassBlock(MapColor.CLEAR, 0.3f));

  public static final Block SCRATCHED_GLASS = registerBlock("scratched_glass",
          createGlassBlock(MapColor.CLEAR, 0.3f));

  public static final Block COPPER_REINFORCED_GLASS = registerBlock("copper_reinforced_glass",
          createReinforcedGlassBlock(MapColor.ORANGE, 5.0f, 6f));

  public static final Block IRON_REINFORCED_GLASS = registerBlock("iron_reinforced_glass",
          createReinforcedGlassBlock(MapColor.IRON_GRAY, 5.0f, 6f));

  public static final Block GOLD_REINFORCED_GLASS = registerBlock("gold_reinforced_glass",
          createReinforcedGlassBlock(MapColor.GOLD, 5.0f, 6f));

  public static final Block DIAMOND_REINFORCED_GLASS = registerBlock("diamond_reinforced_glass",
          createReinforcedGlassBlock(MapColor.DIAMOND_BLUE, 5.0f, 6f));

  public static final Block OBSIDIAN_REINFORCED_GLASS = registerBlock("obsidian_reinforced_glass",
          createReinforcedGlassBlock(MapColor.BLACK, 50.0f, 1200f));

  public static Block createWoodChairBlock(MapColor mapColor, BlockSoundGroup blockSoundGroup){
    return new ChairBlock(AbstractBlock.Settings.create()
            .nonOpaque()
            .mapColor(mapColor)
            .strength(0.8F)
            .sounds(blockSoundGroup)
            .burnable());
  }

  public static Block createChairBlock(MapColor mapColor, BlockSoundGroup blockSoundGroup){
    return new ChairBlock(AbstractBlock.Settings.create()
            .nonOpaque()
            .mapColor(mapColor)
            .strength(0.8F)
            .sounds(blockSoundGroup));
  }

  public static Block createWoodTableBlock(MapColor mapColor, BlockSoundGroup blockSoundGroup){
    return new TableBlock(AbstractBlock.Settings.create()
            .nonOpaque()
            .mapColor(mapColor)
            .strength(0.8F)
            .sounds(blockSoundGroup)
            .burnable());
  }

  public static Block createTableBlock(MapColor mapColor, BlockSoundGroup blockSoundGroup){
    return new TableBlock(AbstractBlock.Settings.create()
            .nonOpaque()
            .mapColor(mapColor)
            .strength(0.8F)
            .sounds(blockSoundGroup));
  }

  public static Block createWoodStoolBlock(MapColor mapColor, BlockSoundGroup blockSoundGroup){
    return new StoolBlock(AbstractBlock.Settings.create()
            .nonOpaque()
            .mapColor(mapColor)
            .strength(0.8F)
            .sounds(blockSoundGroup)
            .burnable());
  }

  public static Block createStoolBlock(MapColor mapColor, BlockSoundGroup blockSoundGroup){
    return new TableBlock(AbstractBlock.Settings.create()
            .nonOpaque()
            .mapColor(mapColor)
            .strength(0.8F)
            .sounds(blockSoundGroup));
  }

  public static Block createGlassBlock(MapColor mapColor, float hardness){
    return new TransparentBlock(AbstractBlock.Settings.create()
            .mapColor(mapColor)
            .instrument(NoteBlockInstrument.HAT)
            .strength(hardness)
            .sounds(BlockSoundGroup.GLASS)
            .nonOpaque()
            .allowsSpawning(Blocks::never)
            .solidBlock(Blocks::never)
            .suffocates(Blocks::never)
            .blockVision(Blocks::never));
  }

  public static Block createReinforcedGlassBlock(MapColor mapColor, float hardness, float resistance){
    return new TransparentBlock(AbstractBlock.Settings.create()
            .mapColor(mapColor)
            .instrument(NoteBlockInstrument.HAT)
            .strength(hardness, resistance)
            .sounds(BlockSoundGroup.GLASS)
            .nonOpaque()
            .allowsSpawning(Blocks::never)
            .solidBlock(Blocks::never)
            .suffocates(Blocks::never)
            .blockVision(Blocks::never));
  }

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
