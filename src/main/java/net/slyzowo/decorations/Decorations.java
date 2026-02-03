package net.slyzowo.decorations;

import net.fabricmc.api.ModInitializer;

import net.slyzowo.decorations.block.ModBlocks;
import net.slyzowo.decorations.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Decorations implements ModInitializer {
	public static final String MOD_ID = "decorations";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Thank you for downloading Decorations ^w^");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}