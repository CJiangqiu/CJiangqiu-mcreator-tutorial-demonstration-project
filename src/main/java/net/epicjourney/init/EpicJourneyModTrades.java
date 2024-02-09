
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.epicjourney.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EpicJourneyModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

				new ItemStack(Items.NETHERITE_INGOT, 2), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

				new ItemStack(Items.DIAMOND, 4), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

				new ItemStack(Items.EMERALD, 3), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 32),

				new ItemStack(EpicJourneyModItems.SILVER_COIN.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 16),

				new ItemStack(EpicJourneyModItems.GOLD_COIN.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

				new ItemStack(Items.TOTEM_OF_UNDYING, 2), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

				new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 2), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get(), 4),

				new ItemStack(Blocks.DRAGON_EGG), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get(), 4),

				new ItemStack(Items.NETHER_STAR), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get(), 64), new ItemStack(EpicJourneyModItems.GOLD_COIN.get(), 64), new ItemStack(EpicJourneyModItems.TEST_WEAPON.get()), 1, 100, 0.01f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()), new ItemStack(Items.IRON_INGOT), new ItemStack(EpicJourneyModItems.STEEL_INGOT.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 5),

					new ItemStack(EpicJourneyModItems.STEEL_ARMOR_HELMET.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 8),

					new ItemStack(EpicJourneyModItems.STEEL_ARMOR_CHESTPLATE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 7),

					new ItemStack(EpicJourneyModItems.STEEL_ARMOR_LEGGINGS.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 4),

					new ItemStack(EpicJourneyModItems.STEEL_ARMOR_BOOTS.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 5),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_ARMOR_HELMET.get()), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 8),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_ARMOR_CHESTPLATE.get()), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 7),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_ARMOR_LEGGINGS.get()), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 4),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_ARMOR_BOOTS.get()), 10, 10, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get(), 2),

					new ItemStack(Items.NETHERITE_HELMET), 5, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get(), 3),

					new ItemStack(Items.NETHERITE_CHESTPLATE), 5, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get(), 3),

					new ItemStack(Items.NETHERITE_LEGGINGS), 5, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get(), 2),

					new ItemStack(Items.NETHERITE_BOOTS), 5, 20, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_SHIELD.get()), 10, 20, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(EpicJourneyModItems.STEEL_INGOT.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 4),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_INGOT.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 4),

					new ItemStack(Items.LEAD), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.LEATHER), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.SADDLE), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(Items.RABBIT_FOOT, 2), 10, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.COOKED_BEEF, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.COOKED_PORKCHOP, 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.COOKED_CHICKEN, 5), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.COOKED_MUTTON, 3), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(EpicJourneyModItems.ABATTOIR.get()), 1, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(EpicJourneyModItems.ABATTOIR.get()), 1, 10, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(EpicJourneyModItems.ABATTOIR.get()), 10, 10, 0.05f));
		}
		if (event.getType() == VillagerProfession.CARTOGRAPHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 4),

					new ItemStack(Items.MAP), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.SPYGLASS), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 10),

					new ItemStack(Items.CLOCK), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 6),

					new ItemStack(Items.COMPASS), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 4),

					new ItemStack(Items.BRUSH), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 2),

					new ItemStack(Blocks.CARTOGRAPHY_TABLE), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 2),

					new ItemStack(EpicJourneyModItems.TRAVEL_STAFF.get()), 10, 10, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.APPLE, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.GLASS_BOTTLE),

					new ItemStack(EpicJourneyModItems.COPPER_COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(Items.GOLDEN_APPLE), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

					new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 4), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

					new ItemStack(Items.TOTEM_OF_UNDYING, 4), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 2),

					new ItemStack(Items.DRAGON_BREATH), 10, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 3),

					new ItemStack(Items.END_CRYSTAL), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 16),

					new ItemStack(Items.ENDER_PEARL), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(Items.ENDER_EYE), 10, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(Items.BREWING_STAND), 10, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.SPIDER_EYE, 2), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.FERMENTED_SPIDER_EYE, 2), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.NETHER_WART), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.BLAZE_ROD), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.MAGMA_CREAM), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 5),

					new ItemStack(Items.CAULDRON), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.CARROT, 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.POTATO, 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.BREAD, 3), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.MELON_SLICE, 8), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.BEETROOT, 4), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(Items.GOLDEN_CARROT, 4), 10, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Blocks.PUMPKIN), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Blocks.MELON), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(EpicJourneyModItems.HARVEST.get()), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(EpicJourneyModItems.HARVEST.get()), 1, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(EpicJourneyModItems.HARVEST.get()), 1, 10, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 2),

					new ItemStack(Items.FISHING_ROD), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.COD, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.SALMON, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.PUFFERFISH, 2), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.COOKED_COD, 2), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.COOKED_SALMON, 2), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 4),

					new ItemStack(Items.PRISMARINE_SHARD), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 8),

					new ItemStack(Items.HEART_OF_THE_SEA), 10, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 4),

					new ItemStack(Items.NAUTILUS_SHELL), 10, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 2),

					new ItemStack(Items.SCUTE), 10, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(Items.AXOLOTL_BUCKET), 10, 10, 0.05f));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.ARROW, 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.BOW), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(Items.CROSSBOW), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.SPECTRAL_ARROW, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 2),

					new ItemStack(Blocks.FLETCHING_TABLE), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.LEATHER, 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.LEATHER_HELMET), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 2),

					new ItemStack(Items.LEATHER_CHESTPLATE), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 2),

					new ItemStack(Items.LEATHER_LEGGINGS), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.LEATHER_BOOTS), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 4),

					new ItemStack(Items.LEATHER_HORSE_ARMOR), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.RABBIT_HIDE, 2), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(EpicJourneyModItems.SKINNER.get()), 1, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(EpicJourneyModItems.SKINNER.get()), 1, 10, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(EpicJourneyModItems.SKINNER.get()), 2, 10, 0.05f));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.BOOK), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 2),

					new ItemStack(Items.WRITABLE_BOOK), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 4),

					new ItemStack(Blocks.BOOKSHELF), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.EXPERIENCE_BOTTLE, 4), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get(), 4),

					new ItemStack(Blocks.ENCHANTING_TABLE), 10, 20, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.LAPIS_LAZULI), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.MASON) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 2),

					new ItemStack(Blocks.STONECUTTER), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(Blocks.OBSIDIAN), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()), new ItemStack(EpicJourneyModItems.COPPER_COIN.get()), new ItemStack(Blocks.CRYING_OBSIDIAN), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Blocks.COBBLESTONE, 16), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 4),

					new ItemStack(Items.FLINT), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.SHEPHERD) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 8),

					new ItemStack(Items.SHEARS), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Blocks.WHITE_WOOL), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 2),

					new ItemStack(EpicJourneyModItems.SHEPHERDS_STAFF.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 3),

					new ItemStack(EpicJourneyModItems.STEEL_PICKAXE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 3),

					new ItemStack(EpicJourneyModItems.STEEL_AXE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(EpicJourneyModItems.STEEL_SHOVEL.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 2),

					new ItemStack(EpicJourneyModItems.STEEL_HOE.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 3),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_PICKAXE.get()), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 3),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_AXE.get()), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_SHOVEL.get()), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 2),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_HOE.get()), 10, 10, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

					new ItemStack(Items.NETHERITE_SHOVEL), 10, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

					new ItemStack(Items.NETHERITE_PICKAXE), 10, 20, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

					new ItemStack(Items.NETHERITE_AXE), 10, 20, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

					new ItemStack(Items.NETHERITE_HOE), 10, 20, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get(), 2),

					new ItemStack(EpicJourneyModItems.STEEL_SWORD.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get(), 2),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_SWORD.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.COPPER_COIN.get()),

					new ItemStack(Items.SHIELD), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.SILVER_COIN.get()),

					new ItemStack(EpicJourneyModItems.BLACK_COPPER_SHIELD.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(EpicJourneyModItems.GOLD_COIN.get()),

					new ItemStack(Items.NETHERITE_SWORD), 10, 5, 0.05f));
		}
	}
}
