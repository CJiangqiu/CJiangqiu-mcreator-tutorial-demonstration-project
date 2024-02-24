
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.epicjourney.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.epicjourney.EpicJourneyMod;

public class EpicJourneyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EpicJourneyMod.MODID);
	public static final RegistryObject<CreativeModeTab> EPIC_JOURNEY = REGISTRY.register("epic_journey",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.epic_journey.epic_journey")).icon(() -> new ItemStack(EpicJourneyModItems.SCROLL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EpicJourneyModItems.TEST_BOSS_SPAWN_EGG.get());
				tabData.accept(EpicJourneyModItems.TEST_WEAPON.get());
				tabData.accept(EpicJourneyModItems.SCROLL.get());
				tabData.accept(EpicJourneyModItems.EPIC_JOURNEY_MUSIC.get());
				tabData.accept(EpicJourneyModItems.COPPER_COIN.get());
				tabData.accept(EpicJourneyModItems.SILVER_COIN.get());
				tabData.accept(EpicJourneyModItems.GOLD_COIN.get());
				tabData.accept(EpicJourneyModItems.PURSE.get());
				tabData.accept(EpicJourneyModItems.SKINNER.get());
				tabData.accept(EpicJourneyModItems.ABATTOIR.get());
				tabData.accept(EpicJourneyModItems.HARVEST.get());
				tabData.accept(EpicJourneyModItems.TRAVEL_STAFF.get());
				tabData.accept(EpicJourneyModItems.SHEPHERDS_STAFF.get());
				tabData.accept(EpicJourneyModItems.STEEL_INGOT.get());
				tabData.accept(EpicJourneyModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(EpicJourneyModItems.STEEL_AXE.get());
				tabData.accept(EpicJourneyModItems.STEEL_PICKAXE.get());
				tabData.accept(EpicJourneyModItems.STEEL_SWORD.get());
				tabData.accept(EpicJourneyModItems.STEEL_SHOVEL.get());
				tabData.accept(EpicJourneyModItems.STEEL_HOE.get());
				tabData.accept(EpicJourneyModItems.STEEL_HAMMER.get());
				tabData.accept(EpicJourneyModItems.STEEL_ARMOR_HELMET.get());
				tabData.accept(EpicJourneyModItems.STEEL_ARMOR_CHESTPLATE.get());
				tabData.accept(EpicJourneyModItems.STEEL_ARMOR_LEGGINGS.get());
				tabData.accept(EpicJourneyModItems.STEEL_ARMOR_BOOTS.get());
				tabData.accept(EpicJourneyModBlocks.SILVER_ORE.get().asItem());
				tabData.accept(EpicJourneyModItems.SILVER_INGOT.get());
				tabData.accept(EpicJourneyModItems.SILVER_DUST.get());
				tabData.accept(EpicJourneyModItems.GOLD_DUST.get());
				tabData.accept(EpicJourneyModItems.GOLD_SILVER_MIXED_POWDER.get());
				tabData.accept(EpicJourneyModItems.BLACK_COPPER_INGOT.get());
				tabData.accept(EpicJourneyModBlocks.BLACK_COPPER_BLOCK.get().asItem());
				tabData.accept(EpicJourneyModItems.BLACK_COPPER_AXE.get());
				tabData.accept(EpicJourneyModItems.BLACK_COPPER_PICKAXE.get());
				tabData.accept(EpicJourneyModItems.BLACK_COPPER_SWORD.get());
				tabData.accept(EpicJourneyModItems.BLACK_COPPER_SHOVEL.get());
				tabData.accept(EpicJourneyModItems.BLACK_COPPER_HOE.get());
				tabData.accept(EpicJourneyModItems.BLACK_COPPER_ARMOR_HELMET.get());
				tabData.accept(EpicJourneyModItems.BLACK_COPPER_ARMOR_CHESTPLATE.get());
				tabData.accept(EpicJourneyModItems.BLACK_COPPER_ARMOR_LEGGINGS.get());
				tabData.accept(EpicJourneyModItems.BLACK_COPPER_ARMOR_BOOTS.get());
				tabData.accept(EpicJourneyModItems.BLACK_COPPER_SHIELD.get());
				tabData.accept(EpicJourneyModItems.NOTES_OF_SCOUT.get());
				tabData.accept(EpicJourneyModItems.LEAF_OF_DECEIVING_DEATH.get());
				tabData.accept(EpicJourneyModItems.BANK_TELLER_SPAWN_EGG.get());
				tabData.accept(EpicJourneyModItems.LAND_AGENT_SPAWN_EGG.get());
				tabData.accept(EpicJourneyModItems.HUMAN_SOLDIER_DEATH_SPAWN_EGG.get());
				tabData.accept(EpicJourneyModItems.THE_LOST_SPAWN_EGG.get());
				tabData.accept(EpicJourneyModItems.SPORE_AGGREGATE_SPAWN_EGG.get());
				tabData.accept(EpicJourneyModItems.PLANKTONIC_SPORE_GROUP_SPAWN_EGG.get());
				tabData.accept(EpicJourneyModItems.THE_INIQUITY_OF_FAKE_GOD_SPAWN_EGG.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> EPIC_JOURNEY_BUILDING = REGISTRY.register("epic_journey_building",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.epic_journey.epic_journey_building")).icon(() -> new ItemStack(EpicJourneyModItems.BUILDING_SPAWN_BANK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EpicJourneyModItems.BUILDING_SPAWN_BANK.get());
				tabData.accept(EpicJourneyModItems.BUILDING_SALES_CENTER.get());
				tabData.accept(EpicJourneyModItems.BUILDING_UNDERGROUND_TOMB.get());
				tabData.accept(EpicJourneyModItems.HOUSE_PROPERTY_SMALL_SIZED_WOODEN_HOUSE.get());
				tabData.accept(EpicJourneyModItems.HOUSE_PROPERTY_MEDIUM_SIZED_WOODEN_HOUSE.get());
				tabData.accept(EpicJourneyModItems.HOUSE_PROPERTY_BIG_SIZED_WOODEN_HOUSE.get());
				tabData.accept(EpicJourneyModItems.DUNGEON_THE_PALACE_OF_FAKE_GOD.get());
			})

					.build());
}
