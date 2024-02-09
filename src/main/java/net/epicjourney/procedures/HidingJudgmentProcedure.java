package net.epicjourney.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class HidingJudgmentProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean hiding_judgment_step1 = false;
		if (world instanceof ServerLevel _level0 && _level0.isRaided(BlockPos.containing(x, y, z)) || world.getLevelData().isRaining() || world.getLevelData().isThundering()) {
			hiding_judgment_step1 = true;
			return true;
		}
		if (world instanceof Level _lvl3 && _lvl3.isDay()) {
		} else {
			return true;
		}
		if (hiding_judgment_step1 == true) {
			return true;
		}
		return false;
	}
}
