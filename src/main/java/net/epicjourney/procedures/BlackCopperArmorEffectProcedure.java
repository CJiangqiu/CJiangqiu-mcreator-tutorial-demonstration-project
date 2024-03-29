package net.epicjourney.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.epicjourney.init.EpicJourneyModItems;

public class BlackCopperArmorEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == EpicJourneyModItems.BLACK_COPPER_ARMOR_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == EpicJourneyModItems.BLACK_COPPER_ARMOR_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == EpicJourneyModItems.BLACK_COPPER_ARMOR_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == EpicJourneyModItems.BLACK_COPPER_ARMOR_BOOTS.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WEAKNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DARKNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.UNLUCK);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BLINDNESS);
		}
	}
}
