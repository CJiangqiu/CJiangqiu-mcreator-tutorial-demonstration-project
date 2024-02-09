
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.epicjourney.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.epicjourney.client.model.Modelmagic_dragon_fire;
import net.epicjourney.client.model.Modelhuman_soldier_death;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EpicJourneyModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelhuman_soldier_death.LAYER_LOCATION, Modelhuman_soldier_death::createBodyLayer);
		event.registerLayerDefinition(Modelmagic_dragon_fire.LAYER_LOCATION, Modelmagic_dragon_fire::createBodyLayer);
	}
}
