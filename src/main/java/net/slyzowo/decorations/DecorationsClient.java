package net.slyzowo.decorations;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.slyzowo.decorations.block.ModBlocks;
import net.slyzowo.decorations.entity.ModEntities;
import net.slyzowo.decorations.entity.client.ChairRenderer;

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

    EntityRendererRegistry.register(ModEntities.CHAIR, ChairRenderer::new);
  }
}
