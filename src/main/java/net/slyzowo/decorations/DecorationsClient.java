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
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_OAK_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_SPRUCE_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_BIRCH_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_JUNGLE_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_ACACIA_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_DARK_OAK_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_MANGROVE_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_CHERRY_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALE_OAK_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_PALE_OAK_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_BAMBOO_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_CRIMSON_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_LADDERBACK_CHAIR, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_WARPED_LADDERBACK_CHAIR, RenderLayer.getCutout());

    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_OAK_LADDERBACK_CHAIR, RenderLayer.getCutout());
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
