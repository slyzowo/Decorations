package net.slyzowo.decorations;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.slyzowo.decorations.block.ModBlocks;

public class DecorationsClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLEAR_GLASS, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SCRATCHED_GLASS, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_REINFORCED_GLASS, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IRON_REINFORCED_GLASS, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GOLD_REINFORCED_GLASS, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DIAMOND_REINFORCED_GLASS, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OBSIDIAN_REINFORCED_GLASS, RenderLayer.getCutout());
  }
}
