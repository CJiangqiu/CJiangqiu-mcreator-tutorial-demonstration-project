package net.epicjourney.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import java.util.concurrent.atomic.AtomicReference;

public class TestWeaponShiTiBeiGongJuJiZhongShiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
				@Override
				public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
					String _translatekey = "death.attack." + "test";
					if (this.getEntity() == null && this.getDirectEntity() == null) {
						return _msgEntity.getKillCredit() != null
								? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
								: Component.translatable(_translatekey, _msgEntity.getDisplayName());
					} else {
						Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
						ItemStack _itemstack = ItemStack.EMPTY;
						if (this.getEntity() instanceof LivingEntity _livingentity)
							_itemstack = _livingentity.getMainHandItem();
						return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
								? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
								: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
					}
				}
			}, 1024);
		if (entity instanceof Player _player) {
			_player.getAbilities().invulnerable = true;
			_player.onUpdateAbilities();
		}
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = true;
			_player.onUpdateAbilities();
		}
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel(0);
		if (entity instanceof Player _player)
			_player.getInventory().clearContent();
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstackiterator.getItem(), (int) Double.POSITIVE_INFINITY);
					{
						ItemStack _ist = itemstackiterator;
						if (_ist.hurt(1024, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					itemstackiterator.setCount(0);
				}
			}
		}
		entity.setInvisible(false);
		entity.setMaxUpStep(0);
		entity.setShiftKeyDown(true);
		entity.setTicksFrozen((int) Double.POSITIVE_INFINITY);
		entity.setAirSupply(0);
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FELL_OUT_OF_WORLD)), 1024);
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 1024);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(0);
		entity.fallDistance = (float) Double.POSITIVE_INFINITY;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
