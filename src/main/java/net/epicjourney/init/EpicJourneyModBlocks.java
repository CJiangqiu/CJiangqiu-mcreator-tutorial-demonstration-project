
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.epicjourney.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.epicjourney.block.SteelBlockBlock;
import net.epicjourney.block.SilverOreBlock;
import net.epicjourney.block.BlackCopperBlockBlock;
import net.epicjourney.EpicJourneyMod;

public class EpicJourneyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EpicJourneyMod.MODID);
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> BLACK_COPPER_BLOCK = REGISTRY.register("black_copper_block", () -> new BlackCopperBlockBlock());
}
