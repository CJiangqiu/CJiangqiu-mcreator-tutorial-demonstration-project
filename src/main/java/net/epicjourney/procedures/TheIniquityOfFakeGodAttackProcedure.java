package net.epicjourney.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.epicjourney.init.EpicJourneyModMobEffects;
import net.epicjourney.entity.TheIniquityOfFakeGodEntity;
import net.epicjourney.EpicJourneyMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TheIniquityOfFakeGodAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof TheIniquityOfFakeGodEntity) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (sourceentity instanceof TheIniquityOfFakeGodEntity) {
				((TheIniquityOfFakeGodEntity) sourceentity).setAnimation("animation.model.attack");
			}
			EpicJourneyMod.queueServerWork(40, () -> {
				if (Math.sqrt(Math.pow(sourceentity.getX() - entity.getX(), 2) + Math.pow(sourceentity.getY() - entity.getY(), 2) + Math.pow(sourceentity.getZ() - entity.getZ(), 2)) <= 2
						&& (sourceentity instanceof LivingEntity _entity ? _entity.hasLineOfSight(entity) : false)) {
					if (!(entity instanceof LivingEntity && ((LivingEntity) entity).isUsingItem() && ((LivingEntity) entity).getUseItem().getItem().equals(Items.SHIELD))) {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)),
								(float) ((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getBaseValue());
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(EpicJourneyModMobEffects.SPORE_PARASITISM.get(), 100, 2));
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.block")), SoundSource.VOICE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.block")), SoundSource.VOICE, 1, 1, false);
							}
						}
						{
							ItemStack _ist = (entity instanceof LivingEntity _entUseItem14 ? _entUseItem14.getUseItem() : ItemStack.EMPTY);
							if (_ist.hurt(1, RandomSource.create(), null)) {
								_ist.shrink(1);
								_ist.setDamageValue(0);
							}
						}
					}
				}
			});
		}
	}
}
