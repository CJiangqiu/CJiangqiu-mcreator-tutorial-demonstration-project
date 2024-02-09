package net.epicjourney.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.epicjourney.init.EpicJourneyModMobEffects;
import net.epicjourney.init.EpicJourneyModEntities;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SporeEntityKillOtherEntityProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(EpicJourneyModMobEffects.SPORE_PARASITISM.get())) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) <= 20) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EpicJourneyModEntities.PLANKTONIC_SPORE_GROUP.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) < 100 && (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) > 20) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EpicJourneyModEntities.SPORE_AGGREGATE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 100) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EpicJourneyModEntities.THE_INIQUITY_OF_FAKE_GOD.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			}
		}
	}
}
