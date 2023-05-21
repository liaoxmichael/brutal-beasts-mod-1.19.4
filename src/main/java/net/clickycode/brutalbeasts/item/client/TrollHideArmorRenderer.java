package net.clickycode.brutalbeasts.item.client;

import net.clickycode.brutalbeasts.BrutalBeasts;
import net.clickycode.brutalbeasts.item.custom.TrollHideArmorItem;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.object.Color;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.ItemArmorGeoLayer;

public class TrollHideArmorRenderer extends GeoArmorRenderer<TrollHideArmorItem> {
     public TrollHideArmorRenderer() {
         super(new TrollHideArmorModel());
         // trying to add a RenderLayer, but not working
//         addRenderLayer(new ItemArmorGeoLayer<>((GeoRenderer)this) {
//            public static final Identifier TEXTURE = new Identifier(BrutalBeasts.MOD_ID, "textures/item/armor/troll_hide_armor_overlay.png");
//
//             @Override
//             public void render(MatrixStack poseStack, GeoAnimatable animatable, BakedGeoModel bakedModel, RenderLayer renderType, VertexConsumerProvider bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
//                 RenderLayer armorRenderType = RenderLayer.getArmorCutoutNoCull(TEXTURE);
//                 getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, armorRenderType,
//                         bufferSource.getBuffer(armorRenderType), partialTick, packedLight, OverlayTexture.DEFAULT_UV,
//                         1, 1, 1, 1);
//             }
//         });
    }

    @Override
    public Color getRenderColor(TrollHideArmorItem animatable, float partialTick, int packedLight) {
        return Color.ofOpaque(animatable.getColor(getCurrentStack()));
    }

}
