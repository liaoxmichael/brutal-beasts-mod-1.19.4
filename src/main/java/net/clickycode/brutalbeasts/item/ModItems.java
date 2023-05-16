package net.clickycode.brutalbeasts.item;

import net.clickycode.brutalbeasts.BrutalBeasts;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TROLL_HIDE = registerItem("troll_hide",
            new Item(new FabricItemSettings()),
            ItemGroups.INGREDIENTS);
    public static final Item TROLL_HORN = registerItem("troll_horn",
            new Item(new FabricItemSettings()),
            ItemGroups.INGREDIENTS);

    public static final Item TROLL_HIDE_CLOAK = registerItem("troll_hide_cloak",
            new Item(new FabricItemSettings()),
            ItemGroups.COMBAT);

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(BrutalBeasts.MOD_ID, name), item);
    }

    public static void registerItems() {
        BrutalBeasts.LOGGER.info(BrutalBeasts.MOD_ID + ": Registering items...");
    }
}
