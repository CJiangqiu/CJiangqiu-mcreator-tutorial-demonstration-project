package net.epicjourney.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.epicjourney.init.EpicJourneyModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LeafOfDeceivingDeathAbilityProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer && (!(entity instanceof Player _plrCldCheck1 && _plrCldCheck1.getCooldowns().isOnCooldown(EpicJourneyModItems.LEAF_OF_DECEIVING_DEATH.get())) && entity instanceof LivingEntity lv
				? CuriosApi.getCuriosHelper().findEquippedCurio(EpicJourneyModItems.LEAF_OF_DECEIVING_DEATH.get(), lv).isPresent()
				: false)) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(EpicJourneyModItems.LEAF_OF_DECEIVING_DEATH.get()));
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getBaseValue());
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(EpicJourneyModItems.LEAF_OF_DECEIVING_DEATH.get(), 1200);
			if (world.getDifficulty() == Difficulty.HARD) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(EpicJourneyModItems.LEAF_OF_DECEIVING_DEATH.get(), 600);
			}
		}
	}
}
