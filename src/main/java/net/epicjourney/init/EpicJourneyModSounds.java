
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.epicjourney.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.epicjourney.EpicJourneyMod;

public class EpicJourneyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EpicJourneyMod.MODID);
	public static final RegistryObject<SoundEvent> THE_LOST_HURT = REGISTRY.register("the_lost_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("epic_journey", "the_lost_hurt")));
	public static final RegistryObject<SoundEvent> THE_LOST_DEATH = REGISTRY.register("the_lost_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("epic_journey", "the_lost_death")));
	public static final RegistryObject<SoundEvent> THE_LOST_AMBIENT = REGISTRY.register("the_lost_ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("epic_journey", "the_lost_ambient")));
	public static final RegistryObject<SoundEvent> EPIC_JOURNEY = REGISTRY.register("epic_journey", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("epic_journey", "epic_journey")));
}
