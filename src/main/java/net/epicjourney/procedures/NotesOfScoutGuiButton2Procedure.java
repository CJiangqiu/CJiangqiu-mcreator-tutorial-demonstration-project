package net.epicjourney.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.epicjourney.network.EpicJourneyModVariables;

public class NotesOfScoutGuiButton2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(EpicJourneyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicJourneyModVariables.PlayerVariables())).human_empire_reputation + 2;
			entity.getCapability(EpicJourneyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.human_empire_reputation = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.giveExperiencePoints(5);
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
