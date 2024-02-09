package net.epicjourney.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmagic_dragon_fire<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("epic_journey", "modelmagic_dragon_fire"), "main");
	public final ModelPart magic_dragon_fire;

	public Modelmagic_dragon_fire(ModelPart root) {
		this.magic_dragon_fire = root.getChild("magic_dragon_fire");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition magic_dragon_fire = partdefinition.addOrReplaceChild("magic_dragon_fire",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(32, 38).addBox(-4.0F, 0.0F, -1.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(16, 37)
						.addBox(3.0F, 0.0F, -1.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(34, 0).addBox(-2.0F, 5.0F, -1.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(30, 30)
						.addBox(-2.0F, -2.0F, -1.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(36, 21).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 10)
						.addBox(-5.0F, 0.0F, 0.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(4.0F, 0.0F, 0.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(15, 29)
						.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-2.0F, 6.0F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(24, 19)
						.addBox(-4.0F, -2.0F, 1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 7).addBox(2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-4.0F, 4.0F, 1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(2.0F, 4.0F, 1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
						.addBox(-2.0F, 0.0F, 7.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 1.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 18)
						.addBox(0.0F, 2.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(3.0F, 5.0F, 13.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 15)
						.addBox(4.0F, -2.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-5.0F, 2.0F, 13.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-4.0F, -4.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		magic_dragon_fire.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
