package net.epicjourney.procedures;

import net.minecraft.world.entity.Entity;

import net.epicjourney.entity.TheLostEntity;

public class TheLostTextureShow1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TheLostEntity _datEntI ? _datEntI.getEntityData().get(TheLostEntity.DATA_texture) : 0) == 1) {
			return true;
		}
		return true;
	}
}
