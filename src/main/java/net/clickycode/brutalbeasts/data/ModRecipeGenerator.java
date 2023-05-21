package net.clickycode.brutalbeasts.data;

import net.clickycode.brutalbeasts.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TROLL_HIDE_CLOAK)
                .pattern("H H")
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.TROLL_HIDE)
                .input('H', ModItems.TROLL_HORN)
//                .criterion(FabricRecipeProvider.hasItem(ModItems.TROLL_HIDE),
//                        FabricRecipeProvider.conditionsFromItem(ModItems.TROLL_HORN))
//                .criterion(FabricRecipeProvider.hasItem(ModItems.TROLL_HORN),
//                        FabricRecipeProvider.conditionsFromItem(ModItems.TROLL_HORN))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TROLL_HIDE_CLOAK)));
    }
}
