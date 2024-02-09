
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.epicjourney.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.epicjourney.potion.SporeParasitismMobEffect;
import net.epicjourney.EpicJourneyMod;

public class EpicJourneyModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, EpicJourneyMod.MODID);
	public static final RegistryObject<MobEffect> SPORE_PARASITISM = REGISTRY.register("spore_parasitism", () -> new SporeParasitismMobEffect());
}
