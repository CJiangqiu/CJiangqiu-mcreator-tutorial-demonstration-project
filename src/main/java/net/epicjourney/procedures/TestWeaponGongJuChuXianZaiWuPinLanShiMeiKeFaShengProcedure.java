package net.epicjourney.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.epicjourney.init.EpicJourneyModItems;

public class TestWeaponGongJuChuXianZaiWuPinLanShiMeiKeFaShengProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(EpicJourneyModItems.TEST_WEAPON.get(), 0);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
		entity.setShiftKeyDown(false);
		entity.setTicksFrozen(0);
		entity.clearFire();
		entity.setMaxUpStep(1);
		entity.setAirSupply(20);
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel(20);
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = true;
			_player.onUpdateAbilities();
		}
	}
}
