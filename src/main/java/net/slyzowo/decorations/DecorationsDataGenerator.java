package net.slyzowo.decorations;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.slyzowo.decorations.datagen.ModBlockTagProvider;
import net.slyzowo.decorations.datagen.ModItemTagProvider;
import net.slyzowo.decorations.datagen.ModLootTableProvider;
import net.slyzowo.decorations.datagen.ModModelProvider;

public class DecorationsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
	FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

	pack.addProvider(ModBlockTagProvider::new);
	pack.addProvider(ModLootTableProvider::new);
	pack.addProvider(ModModelProvider::new);
	}
}
