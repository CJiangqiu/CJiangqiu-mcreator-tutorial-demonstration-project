package net.epicjourney.procedures;

import net.minecraft.world.entity.Entity;

import net.epicjourney.entity.TheLostEntity;

public class TheLostShiTiChuShiShengChengShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.5) {
			if (entity instanceof TheLostEntity _datEntSetI)
				_datEntSetI.getEntityData().set(TheLostEntity.DATA_texture, 1);
		}
	}
}
