package net.clickycode.brutalbeasts;

import net.clickycode.brutalbeasts.data.ModLootTableGenerator;
import net.clickycode.brutalbeasts.data.ModModelProvider;
import net.clickycode.brutalbeasts.data.ModRecipeGenerator;
import net.clickycode.brutalbeasts.data.ModWorldGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BrutalBeastsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModLootTableGenerator::new);
        pack.addProvider(ModRecipeGenerator::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModWorldGenerator::new);
    }
}
