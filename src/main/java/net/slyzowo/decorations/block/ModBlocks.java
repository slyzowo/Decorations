package net.slyzowo.decorations.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
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

  public static final Block GLASS = registerBlock("transgender_wool",
          new Block(AbstractBlock.Settings.create()
                  .mapColor(MapColor.BLUE)
                  .instrument(NoteBlockInstrument.GUITAR)
                  .strength(0.8F)
                  .sounds(BlockSoundGroup.WOOL)
                  .burnable()));

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
