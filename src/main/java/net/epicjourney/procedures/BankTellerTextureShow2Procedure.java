package net.epicjourney.procedures;

import net.minecraft.world.entity.Entity;

import net.epicjourney.entity.BankTellerEntity;

public class BankTellerTextureShow2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof BankTellerEntity _datEntI ? _datEntI.getEntityData().get(BankTellerEntity.DATA_texture) : 0) == 2) {
			return true;
		}
		return false;
	}
}
