
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.epicjourney.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.epicjourney.client.renderer.TheLostRenderer;
import net.epicjourney.client.renderer.TheIniquityOfFakeGodRenderer;
import net.epicjourney.client.renderer.TestBossRenderer;
import net.epicjourney.client.renderer.SporeAggregateRenderer;
import net.epicjourney.client.renderer.PlanktonicSporeGroupRenderer;
import net.epicjourney.client.renderer.MagicDragonFireRenderer;
import net.epicjourney.client.renderer.LandAgentRenderer;
import net.epicjourney.client.renderer.HumanSoldierDeathRenderer;
import net.epicjourney.client.renderer.BankTellerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EpicJourneyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EpicJourneyModEntities.TEST_BOSS.get(), TestBossRenderer::new);
		event.registerEntityRenderer(EpicJourneyModEntities.BANK_TELLER.get(), BankTellerRenderer::new);
		event.registerEntityRenderer(EpicJourneyModEntities.LAND_AGENT.get(), LandAgentRenderer::new);
		event.registerEntityRenderer(EpicJourneyModEntities.HUMAN_SOLDIER_DEATH.get(), HumanSoldierDeathRenderer::new);
		event.registerEntityRenderer(EpicJourneyModEntities.THE_LOST.get(), TheLostRenderer::new);
		event.registerEntityRenderer(EpicJourneyModEntities.SPORE_AGGREGATE.get(), SporeAggregateRenderer::new);
		event.registerEntityRenderer(EpicJourneyModEntities.PLANKTONIC_SPORE_GROUP.get(), PlanktonicSporeGroupRenderer::new);
		event.registerEntityRenderer(EpicJourneyModEntities.THE_INIQUITY_OF_FAKE_GOD.get(), TheIniquityOfFakeGodRenderer::new);
		event.registerEntityRenderer(EpicJourneyModEntities.MAGIC_DRAGON_FIRE.get(), MagicDragonFireRenderer::new);
	}
}
