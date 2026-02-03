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

public class ModBlocks {

  public static final Block RAINBOW_WOOL = registerBlock("rainbow_wool",
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

  public static final Block SCRATCHED_GLASS_PANE = registerBlock("scratched_glass_pane",
          new PaneBlock(AbstractBlock.Settings.create()
                  .instrument(NoteBlockInstrument.HAT)
                  .strength(0.3F)
                  .sounds(BlockSoundGroup.GLASS)
                  .nonOpaque()));

  public static final Block COPPER_REINFORCED_GLASS = registerBlock("copper_reinforced_glass",
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

  public static final Block IRON_REINFORCED_GLASS = registerBlock("iron_reinforced_glass",
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

  public static final Block GOLD_REINFORCED_GLASS = registerBlock("gold_reinforced_glass",
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

  public static final Block DIAMOND_REINFORCED_GLASS = registerBlock("diamond_reinforced_glass",
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

  public static final Block OBSIDIAN_REINFORCED_GLASS = registerBlock("obsidian_reinforced_glass",
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
