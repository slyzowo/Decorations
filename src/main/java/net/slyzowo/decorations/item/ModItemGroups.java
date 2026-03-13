package net.slyzowo.decorations.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slyzowo.decorations.Decorations;
import net.slyzowo.decorations.block.ModBlocks;

public class ModItemGroups {

  public static final ItemGroup DECORATIONS_GROUP = Registry.register(Registries.ITEM_GROUP,
  Identifier.of(Decorations.MOD_ID, "decorations_group"),
          FabricItemGroup.builder()
                  .icon(() -> new ItemStack(ModBlocks.OAK_DINING_CHAIR)) // Oak Chair as the icon
                  .displayName(Text.translatable("itemgroup.decorations.decorations_group"))
                  .entries(((displayContext, entries) -> {
                    entries.add(ModBlocks.OAK_DINING_CHAIR);
                    entries.add(ModBlocks.OAK_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_OAK_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_OAK_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.SPRUCE_DINING_CHAIR);
                    entries.add(ModBlocks.SPRUCE_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_SPRUCE_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_SPRUCE_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.BIRCH_DINING_CHAIR);
                    entries.add(ModBlocks.BIRCH_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_BIRCH_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_BIRCH_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.JUNGLE_DINING_CHAIR);
                    entries.add(ModBlocks.JUNGLE_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_JUNGLE_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_JUNGLE_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.ACACIA_DINING_CHAIR);
                    entries.add(ModBlocks.ACACIA_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_ACACIA_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_ACACIA_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.DARK_OAK_DINING_CHAIR);
                    entries.add(ModBlocks.DARK_OAK_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_DARK_OAK_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_DARK_OAK_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.MANGROVE_DINING_CHAIR);
                    entries.add(ModBlocks.MANGROVE_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_MANGROVE_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_MANGROVE_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.CHERRY_DINING_CHAIR);
                    entries.add(ModBlocks.CHERRY_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_CHERRY_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_CHERRY_LADDERBACK_CHAIR);
/*
                    entries.add(ModBlocks.PALE_OAK_DINING_CHAIR);
                    entries.add(ModBlocks.PALE_OAK_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_PALE_OAK_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_PALE_OAK_LADDERBACK_CHAIR);
*/
                    entries.add(ModBlocks.BAMBOO_DINING_CHAIR);
                    entries.add(ModBlocks.BAMBOO_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_BAMBOO_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_BAMBOO_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.CRIMSON_DINING_CHAIR);
                    entries.add(ModBlocks.CRIMSON_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_CRIMSON_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_CRIMSON_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.WARPED_DINING_CHAIR);
                    entries.add(ModBlocks.WARPED_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.STRIPPED_WARPED_DINING_CHAIR);
                    entries.add(ModBlocks.STRIPPED_WARPED_LADDERBACK_CHAIR);

                    entries.add(ModBlocks.CLEAR_GLASS);
                    entries.add(ModBlocks.SCRATCHED_GLASS);
                    entries.add(ModBlocks.COPPER_REINFORCED_GLASS);
                    entries.add(ModBlocks.IRON_REINFORCED_GLASS);
                    entries.add(ModBlocks.GOLD_REINFORCED_GLASS);
                    entries.add(ModBlocks.DIAMOND_REINFORCED_GLASS);
                    entries.add(ModBlocks.OBSIDIAN_REINFORCED_GLASS);

                    entries.add(ModBlocks.PRIDE_WOOL);
                    entries.add(ModBlocks.PRIDE_CARPET);
                    entries.add(ModBlocks.TRANSGENDER_WOOL);
                    entries.add(ModBlocks.TRANSGENDER_CARPET);
                  }))
                  .build());


  public static void registerItemGroups(){
    Decorations.LOGGER.info("Registering Creative Mode Tab(s) for " + Decorations.MOD_ID);
  }
}
