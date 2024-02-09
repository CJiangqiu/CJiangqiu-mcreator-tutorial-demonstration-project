package net.epicjourney.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.epicjourney.init.EpicJourneyModEntities;
import net.epicjourney.EpicJourneyMod;

public class SporeAggregateDangShiTiGengXinKeShiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("cooldown") > 0) {
			entity.getPersistentData().putDouble("cooldown", (entity.getPersistentData().getDouble("cooldown") - 1));
		}
		if (entity.getPersistentData().getDouble("cooldown") == 660) {
			EpicJourneyMod.queueServerWork(60, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EpicJourneyModEntities.PLANKTONIC_SPORE_GROUP.get().spawn(_level,
							BlockPos.containing(entity.getX() + Mth.nextInt(RandomSource.create(), 1, 5), entity.getY(), entity.getZ() + Mth.nextInt(RandomSource.create(), 1, 10)), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
		}
		if (entity.getPersistentData().getDouble("cooldown") < 660 && entity.getPersistentData().getDouble("cooldown") >= 600) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ENCHANT, (entity.getX()), (entity.getY()), (entity.getZ()), 2, 0, 1, 0, 1);
		}
		if (entity.getPersistentData().getDouble("cooldown") == 60) {
			EpicJourneyMod.queueServerWork(60, () -> {
				if (world.canSeeSkyFromBelowWater(BlockPos.containing(entity.getX() + 5, entity.getY(), entity.getZ() + 5))) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EpicJourneyModEntities.SPORE_AGGREGATE.get().spawn(_level, BlockPos.containing(entity.getX() + 5, entity.getY(), entity.getZ() + 5), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EpicJourneyModEntities.SPORE_AGGREGATE.get().spawn(_level, BlockPos.containing(entity.getX() + 5, entity.getY() + 2, entity.getZ() + 5), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			});
			entity.getPersistentData().putDouble("cooldown", 1200);
		}
		if (entity.getPersistentData().getDouble("cooldown") < 60) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, (entity.getX()), (entity.getY()), (entity.getZ()), 2, 0, 1, 0, 1);
		}
	}
}
