package net.epicjourney.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.epicjourney.entity.model.TheLostModel;
import net.epicjourney.entity.TheLostEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TheLostRenderer extends GeoEntityRenderer<TheLostEntity> {
    final ResourceLocation TEXTURE_1 = new ResourceLocation("epic_journey:textures/entities/the_lost.png");
    final ResourceLocation TEXTURE_2 = new ResourceLocation("epic_journey:textures/entities/the_lost_2.png");

    public TheLostRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TheLostModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public RenderType getRenderType(TheLostEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        ResourceLocation selectedTexture = (animatable.getEntityData().get(TheLostEntity.DATA_texture) == 1) ? TEXTURE_1 : TEXTURE_2;
        return RenderType.entityTranslucent(selectedTexture);
    }

    @Override
    public void preRender(PoseStack poseStack, TheLostEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
            float blue, float alpha) {
        float scale = 1f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
