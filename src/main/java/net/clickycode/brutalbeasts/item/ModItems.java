package net.clickycode.brutalbeasts.item;

import net.clickycode.brutalbeasts.BrutalBeasts;
import net.clickycode.brutalbeasts.item.custom.TrollHideArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TROLL_HIDE = registerItem("troll_hide",
            new Item(new FabricItemSettings()));
    public static final Item TROLL_HORN = registerItem("troll_horn",
            new Item(new FabricItemSettings()));
    public static final Item TROLL_HIDE_CLOAK = registerItem("troll_hide_cloak",
            new TrollHideArmorItem(ModArmorMaterials.TROLL_HIDE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static void addItemsToGroup() {
//        addToGroup(ItemGroups.INGREDIENTS, TROLL_HORN);
//        addToGroup(ItemGroups.TOOLS, TROLL_HORN);
//        addToGroup(ItemGroups.INGREDIENTS, TROLL_HIDE);
//        addToGroup(ItemGroups.COMBAT, TROLL_HIDE_CLOAK);

        addToGroup(ModItemGroup.BRUTAL_BEASTS_GROUP, TROLL_HORN);
        addToGroup(ModItemGroup.BRUTAL_BEASTS_GROUP, TROLL_HIDE);
        addToGroup(ModItemGroup.BRUTAL_BEASTS_GROUP, TROLL_HIDE_CLOAK);
    }

    public static void addToGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BrutalBeasts.MOD_ID, name), item);
    }

    public static void registerItems() {
        BrutalBeasts.LOGGER.info(BrutalBeasts.MOD_ID + ": Registering items...");
        addItemsToGroup();
    }
}
