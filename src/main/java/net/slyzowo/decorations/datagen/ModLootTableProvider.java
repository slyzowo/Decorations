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
    addDrop(ModBlocks.PRIDE_WOOL);
    addDrop(ModBlocks.TRANSGENDER_WOOL);
    addDrop(ModBlocks.COPPER_REINFORCED_GLASS);
    addDrop(ModBlocks.IRON_REINFORCED_GLASS);
    addDrop(ModBlocks.GOLD_REINFORCED_GLASS);
    addDrop(ModBlocks.DIAMOND_REINFORCED_GLASS);
    addDrop(ModBlocks.OBSIDIAN_REINFORCED_GLASS);
  }
}
