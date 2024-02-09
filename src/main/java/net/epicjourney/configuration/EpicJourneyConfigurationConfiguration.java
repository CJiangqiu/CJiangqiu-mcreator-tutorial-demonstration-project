package net.epicjourney.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class EpicJourneyConfigurationConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> PLAYER_RESPAWN_PROTECTION;
	public static final ForgeConfigSpec.ConfigValue<Boolean> BOSS_DIFFICULTY_DYNAMIC_VALUE;
	static {
		BUILDER.push("player_respawn_protection");
		PLAYER_RESPAWN_PROTECTION = BUILDER.comment("When this is true, players will receive some buffs every time they respawn.").define("player_respawn_protection", true);
		BOSS_DIFFICULTY_DYNAMIC_VALUE = BUILDER.comment("When this is true, all the values of the epic journey bosses will increase significantly due to the difficulty of the game, which is really significant!")
				.define("boss_difficulty_dynamic_value", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
