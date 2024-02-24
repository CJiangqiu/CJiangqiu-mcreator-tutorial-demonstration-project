package net.epicjourney.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.epicjourney.entity.PlanktonicSporeGroupEntity;

public class PlanktonicSporeGroupModel extends GeoModel<PlanktonicSporeGroupEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlanktonicSporeGroupEntity entity) {
		return new ResourceLocation("epic_journey", "animations/planktonic_spore_group.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlanktonicSporeGroupEntity entity) {
		return new ResourceLocation("epic_journey", "geo/planktonic_spore_group.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlanktonicSporeGroupEntity entity) {
		return new ResourceLocation("epic_journey", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(PlanktonicSporeGroupEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("main");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
