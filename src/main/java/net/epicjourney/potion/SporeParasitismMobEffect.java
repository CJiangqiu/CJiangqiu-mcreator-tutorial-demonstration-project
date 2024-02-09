
package net.epicjourney.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SporeParasitismMobEffect extends MobEffect {
	public SporeParasitismMobEffect() {
		super(MobEffectCategory.HARMFUL, -10027162);
	}

	@Override
	public String getDescriptionId() {
		return "effect.epic_journey.spore_parasitism";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
