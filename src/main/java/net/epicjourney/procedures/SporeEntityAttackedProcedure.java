package net.epicjourney.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.epicjourney.entity.TheLostEntity;
import net.epicjourney.entity.TheIniquityOfFakeGodEntity;
import net.epicjourney.entity.SporeAggregateEntity;
import net.epicjourney.entity.PlanktonicSporeGroupEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SporeEntityAttackedProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource(), event.getEntity());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity) {
		execute(null, damagesource, entity);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if (entity instanceof PlanktonicSporeGroupEntity || entity instanceof SporeAggregateEntity || entity instanceof TheIniquityOfFakeGodEntity || entity instanceof TheLostEntity) {
			if ((damagesource.getEntity()) instanceof SporeAggregateEntity || (damagesource.getEntity()) instanceof PlanktonicSporeGroupEntity || (damagesource.getEntity()) instanceof TheIniquityOfFakeGodEntity
					|| (damagesource.getEntity()) instanceof TheLostEntity) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}
