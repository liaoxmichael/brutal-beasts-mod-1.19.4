package net.clickycode.brutalbeasts.item.client;

import net.clickycode.brutalbeasts.BrutalBeasts;
import net.clickycode.brutalbeasts.item.custom.TrollHideArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import net.minecraft.util.Identifier;
public class TrollHideArmorModel extends DefaultedItemGeoModel<TrollHideArmorItem> {
    public TrollHideArmorModel() {
        super(new Identifier(BrutalBeasts.MOD_ID, "troll_hide_armor"));
    }

    @Override
    protected String subtype() {
        return "armor";
    }
}
