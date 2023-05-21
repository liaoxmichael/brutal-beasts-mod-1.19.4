package net.clickycode.brutalbeasts;

import net.clickycode.brutalbeasts.item.ModItems;
import net.clickycode.brutalbeasts.item.custom.TrollHideArmorItem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class BrutalBeastsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> tintIndex > 0 ? -1 : ((TrollHideArmorItem) stack.getItem()).getColor(stack), ModItems.TROLL_HIDE_CLOAK);

    }
}
