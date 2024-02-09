package net.epicjourney.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.epicjourney.entity.MagicDragonFireEntity;
import net.epicjourney.client.model.Modelmagic_dragon_fire;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MagicDragonFireRenderer extends EntityRenderer<MagicDragonFireEntity> {
	private static final ResourceLocation texture = new ResourceLocation("epic_journey:textures/entities/magic_dragon_fire.png");
	private final Modelmagic_dragon_fire model;

	public MagicDragonFireRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelmagic_dragon_fire(context.bakeLayer(Modelmagic_dragon_fire.LAYER_LOCATION));
	}

	@Override
	public void render(MagicDragonFireEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(MagicDragonFireEntity entity) {
		return texture;
	}
}
