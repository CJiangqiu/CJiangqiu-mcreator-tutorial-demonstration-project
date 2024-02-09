package net.epicjourney.procedures;

import net.minecraft.world.entity.Entity;

public class SporeAggregateShiTiChuShiShengChengShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("cooldown", 1200);
	}
}
