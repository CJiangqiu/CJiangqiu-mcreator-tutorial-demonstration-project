package net.epicjourney.entity.model;

import software.bernie.geckolib.model.GeoModel;

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

}
