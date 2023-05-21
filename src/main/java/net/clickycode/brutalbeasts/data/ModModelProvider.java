package net.clickycode.brutalbeasts.data;

import net.clickycode.brutalbeasts.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // blockStateModelGenerator
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TROLL_HIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TROLL_HORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TROLL_HIDE_CLOAK, Models.GENERATED);
    }
}
