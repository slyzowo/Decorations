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
    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.COPPER_REINFORCED_GLASS)
            .add(ModBlocks.IRON_REINFORCED_GLASS)
            .add(ModBlocks.GOLD_REINFORCED_GLASS)
            .add(ModBlocks.DIAMOND_REINFORCED_GLASS)
            .add(ModBlocks.OBSIDIAN_REINFORCED_GLASS);

    getOrCreateTagBuilder(BlockTags.DAMPENS_VIBRATIONS)
            .add(ModBlocks.TRANSGENDER_WOOL)
            .add(ModBlocks.PRIDE_WOOL);

    getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.OBSIDIAN_REINFORCED_GLASS);
  }
}
