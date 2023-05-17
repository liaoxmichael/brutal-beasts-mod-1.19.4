package net.clickycode.brutalbeasts.item;

import net.clickycode.brutalbeasts.BrutalBeasts;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup BRUTAL_BEASTS_GROUP;

    public static void registerItemGroups() {
        BrutalBeasts.LOGGER.info(BrutalBeasts.MOD_ID + ": Registering item groups...");
        BRUTAL_BEASTS_GROUP = FabricItemGroup.builder(
                new Identifier(BrutalBeasts.MOD_ID, "brutal_beasts_group"))
                .displayName(Text.translatable("itemgroup.brutalbeasts"))
                .icon(() -> new ItemStack(ModItems.TROLL_HORN)).build();
    }
}
