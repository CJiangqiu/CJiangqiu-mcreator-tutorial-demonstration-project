package net.epicjourney.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.epicjourney.init.EpicJourneyModMobEffects;

public class PlanktonicSporeGroupDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(EpicJourneyModMobEffects.SPORE_PARASITISM.get(), 100, 0));
	}
}
