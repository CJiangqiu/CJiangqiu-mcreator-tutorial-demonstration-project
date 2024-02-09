package net.epicjourney.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.epicjourney.entity.TheLostEntity;

public class TheLostModel extends GeoModel<TheLostEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheLostEntity entity) {
		return new ResourceLocation("epic_journey", "animations/the_lost.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheLostEntity entity) {
		return new ResourceLocation("epic_journey", "geo/the_lost.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheLostEntity entity) {
		return new ResourceLocation("epic_journey", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TheLostEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}
