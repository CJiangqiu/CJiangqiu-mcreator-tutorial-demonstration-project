package net.epicjourney.procedures;

import net.minecraft.world.entity.Entity;

import net.epicjourney.entity.LandAgentEntity;

public class LandAgentTextureShow2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LandAgentEntity _datEntI ? _datEntI.getEntityData().get(LandAgentEntity.DATA_texture) : 0) == 2) {
			return true;
		}
		return false;
	}
}
