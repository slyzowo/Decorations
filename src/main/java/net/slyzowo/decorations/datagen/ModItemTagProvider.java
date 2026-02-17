package net.slyzowo.decorations.datagen;

import net.minecraft.block.Block;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.ItemTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.slyzowo.decorations.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagProvider {
  public ModItemTagProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture, CompletableFuture<TagLookup<Block>> blockTagLookupFuture) {
    super(output, registryLookupFuture, blockTagLookupFuture);
  }

  @Override
  protected void configure(RegistryWrapper.WrapperLookup lookup) {

  }
}
