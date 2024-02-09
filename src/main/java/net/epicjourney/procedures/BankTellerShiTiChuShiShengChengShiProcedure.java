package net.epicjourney.procedures;

import net.minecraft.world.entity.Entity;

import net.epicjourney.entity.BankTellerEntity;

public class BankTellerShiTiChuShiShengChengShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.5) {
			if (entity instanceof BankTellerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(BankTellerEntity.DATA_texture, 1);
			if (Math.random() < 0.3) {
				if (entity instanceof BankTellerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BankTellerEntity.DATA_texture, 2);
			}
		}
		entity.getPersistentData().putDouble("potion_number", 3);
	}
}
