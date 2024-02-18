package net.epicjourney.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.epicjourney.entity.TheIniquityOfFakeGodEntity;

public class TheIniquityOfFakeGodModel extends GeoModel<TheIniquityOfFakeGodEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheIniquityOfFakeGodEntity entity) {
		return new ResourceLocation("epic_journey", "animations/the_iniquity_of_fake_god.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheIniquityOfFakeGodEntity entity) {
		return new ResourceLocation("epic_journey", "geo/the_iniquity_of_fake_god.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheIniquityOfFakeGodEntity entity) {
		return new ResourceLocation("epic_journey", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TheIniquityOfFakeGodEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
