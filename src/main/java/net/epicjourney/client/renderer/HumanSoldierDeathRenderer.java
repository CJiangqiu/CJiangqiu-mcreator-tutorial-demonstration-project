
package net.epicjourney.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.epicjourney.entity.HumanSoldierDeathEntity;
import net.epicjourney.client.model.Modelhuman_soldier_death;

public class HumanSoldierDeathRenderer extends MobRenderer<HumanSoldierDeathEntity, Modelhuman_soldier_death<HumanSoldierDeathEntity>> {
	public HumanSoldierDeathRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhuman_soldier_death(context.bakeLayer(Modelhuman_soldier_death.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HumanSoldierDeathEntity entity) {
		return new ResourceLocation("epic_journey:textures/entities/soldier_death.png");
	}
}
