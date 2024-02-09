
package net.epicjourney.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.epicjourney.procedures.LandAgentTextureShow2Procedure;
import net.epicjourney.procedures.LandAgentTextureShow1Procedure;
import net.epicjourney.entity.LandAgentEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LandAgentRenderer extends HumanoidMobRenderer<LandAgentEntity, HumanoidModel<LandAgentEntity>> {
	public LandAgentRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<LandAgentEntity, HumanoidModel<LandAgentEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("epic_journey:textures/entities/land_agent.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LandAgentEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
		this.addLayer(new RenderLayer<LandAgentEntity, HumanoidModel<LandAgentEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("epic_journey:textures/entities/land_agent_2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LandAgentEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (LandAgentTextureShow1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<LandAgentEntity, HumanoidModel<LandAgentEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("epic_journey:textures/entities/land_agent_3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LandAgentEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (LandAgentTextureShow2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LandAgentEntity entity) {
		return new ResourceLocation("epic_journey:textures/entities/land_agent.png");
	}
}
