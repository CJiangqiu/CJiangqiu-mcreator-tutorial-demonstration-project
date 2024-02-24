
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.epicjourney.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.epicjourney.item.TravelStaffItem;
import net.epicjourney.item.TestWeaponItem;
import net.epicjourney.item.SteelSwordItem;
import net.epicjourney.item.SteelShovelItem;
import net.epicjourney.item.SteelPickaxeItem;
import net.epicjourney.item.SteelIngotItem;
import net.epicjourney.item.SteelHoeItem;
import net.epicjourney.item.SteelHammerItem;
import net.epicjourney.item.SteelAxeItem;
import net.epicjourney.item.SteelArmorItem;
import net.epicjourney.item.SkinnerItem;
import net.epicjourney.item.SilverIngotItem;
import net.epicjourney.item.SilverDustItem;
import net.epicjourney.item.SilverCoinItem;
import net.epicjourney.item.ShepherdsStaffItem;
import net.epicjourney.item.ScrollItem;
import net.epicjourney.item.PurseItem;
import net.epicjourney.item.NotesOfScoutItem;
import net.epicjourney.item.LeafOfDeceivingDeathItem;
import net.epicjourney.item.HousePropertyMediumSizedWoodenHouseItem;
import net.epicjourney.item.HousePropertyBigSizedWoodenHouseItem;
import net.epicjourney.item.HarvestItem;
import net.epicjourney.item.GoldSilverMixedPowderItem;
import net.epicjourney.item.GoldDustItem;
import net.epicjourney.item.GoldCoinItem;
import net.epicjourney.item.ExchangeItem;
import net.epicjourney.item.EpicJourneyMusicItem;
import net.epicjourney.item.DungeonThePalaceOfFakeGodItem;
import net.epicjourney.item.CopperCoinItem;
import net.epicjourney.item.BuildingUndergroundTombItem;
import net.epicjourney.item.BuildingSpawnBankItem;
import net.epicjourney.item.BuildingSmallSizedWoodenHouseItem;
import net.epicjourney.item.BuildingSalesCenterItem;
import net.epicjourney.item.BlackCopperSwordItem;
import net.epicjourney.item.BlackCopperShovelItem;
import net.epicjourney.item.BlackCopperShieldItem;
import net.epicjourney.item.BlackCopperPickaxeItem;
import net.epicjourney.item.BlackCopperIngotItem;
import net.epicjourney.item.BlackCopperHoeItem;
import net.epicjourney.item.BlackCopperBowItem;
import net.epicjourney.item.BlackCopperAxeItem;
import net.epicjourney.item.BlackCopperArmorItem;
import net.epicjourney.item.AbattoirItem;
import net.epicjourney.EpicJourneyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EpicJourneyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EpicJourneyMod.MODID);
	public static final RegistryObject<Item> TEST_BOSS_SPAWN_EGG = REGISTRY.register("test_boss_spawn_egg", () -> new ForgeSpawnEggItem(EpicJourneyModEntities.TEST_BOSS, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TEST_WEAPON = REGISTRY.register("test_weapon", () -> new TestWeaponItem());
	public static final RegistryObject<Item> SCROLL = REGISTRY.register("scroll", () -> new ScrollItem());
	public static final RegistryObject<Item> EPIC_JOURNEY_MUSIC = REGISTRY.register("epic_journey_music", () -> new EpicJourneyMusicItem());
	public static final RegistryObject<Item> COPPER_COIN = REGISTRY.register("copper_coin", () -> new CopperCoinItem());
	public static final RegistryObject<Item> SILVER_COIN = REGISTRY.register("silver_coin", () -> new SilverCoinItem());
	public static final RegistryObject<Item> GOLD_COIN = REGISTRY.register("gold_coin", () -> new GoldCoinItem());
	public static final RegistryObject<Item> PURSE = REGISTRY.register("purse", () -> new PurseItem());
	public static final RegistryObject<Item> SKINNER = REGISTRY.register("skinner", () -> new SkinnerItem());
	public static final RegistryObject<Item> ABATTOIR = REGISTRY.register("abattoir", () -> new AbattoirItem());
	public static final RegistryObject<Item> HARVEST = REGISTRY.register("harvest", () -> new HarvestItem());
	public static final RegistryObject<Item> TRAVEL_STAFF = REGISTRY.register("travel_staff", () -> new TravelStaffItem());
	public static final RegistryObject<Item> SHEPHERDS_STAFF = REGISTRY.register("shepherds_staff", () -> new ShepherdsStaffItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> STEEL_BLOCK = block(EpicJourneyModBlocks.STEEL_BLOCK);
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> STEEL_HAMMER = REGISTRY.register("steel_hammer", () -> new SteelHammerItem());
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate", () -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());
	public static final RegistryObject<Item> SILVER_ORE = block(EpicJourneyModBlocks.SILVER_ORE);
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> SILVER_DUST = REGISTRY.register("silver_dust", () -> new SilverDustItem());
	public static final RegistryObject<Item> GOLD_DUST = REGISTRY.register("gold_dust", () -> new GoldDustItem());
	public static final RegistryObject<Item> GOLD_SILVER_MIXED_POWDER = REGISTRY.register("gold_silver_mixed_powder", () -> new GoldSilverMixedPowderItem());
	public static final RegistryObject<Item> BLACK_COPPER_INGOT = REGISTRY.register("black_copper_ingot", () -> new BlackCopperIngotItem());
	public static final RegistryObject<Item> BLACK_COPPER_BLOCK = block(EpicJourneyModBlocks.BLACK_COPPER_BLOCK);
	public static final RegistryObject<Item> BLACK_COPPER_AXE = REGISTRY.register("black_copper_axe", () -> new BlackCopperAxeItem());
	public static final RegistryObject<Item> BLACK_COPPER_PICKAXE = REGISTRY.register("black_copper_pickaxe", () -> new BlackCopperPickaxeItem());
	public static final RegistryObject<Item> BLACK_COPPER_SWORD = REGISTRY.register("black_copper_sword", () -> new BlackCopperSwordItem());
	public static final RegistryObject<Item> BLACK_COPPER_SHOVEL = REGISTRY.register("black_copper_shovel", () -> new BlackCopperShovelItem());
	public static final RegistryObject<Item> BLACK_COPPER_HOE = REGISTRY.register("black_copper_hoe", () -> new BlackCopperHoeItem());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_HELMET = REGISTRY.register("black_copper_armor_helmet", () -> new BlackCopperArmorItem.Helmet());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_CHESTPLATE = REGISTRY.register("black_copper_armor_chestplate", () -> new BlackCopperArmorItem.Chestplate());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_LEGGINGS = REGISTRY.register("black_copper_armor_leggings", () -> new BlackCopperArmorItem.Leggings());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_BOOTS = REGISTRY.register("black_copper_armor_boots", () -> new BlackCopperArmorItem.Boots());
	public static final RegistryObject<Item> BLACK_COPPER_SHIELD = REGISTRY.register("black_copper_shield", () -> new BlackCopperShieldItem());
	public static final RegistryObject<Item> NOTES_OF_SCOUT = REGISTRY.register("notes_of_scout", () -> new NotesOfScoutItem());
	public static final RegistryObject<Item> LEAF_OF_DECEIVING_DEATH = REGISTRY.register("leaf_of_deceiving_death", () -> new LeafOfDeceivingDeathItem());
	public static final RegistryObject<Item> BANK_TELLER_SPAWN_EGG = REGISTRY.register("bank_teller_spawn_egg", () -> new ForgeSpawnEggItem(EpicJourneyModEntities.BANK_TELLER, -16777063, -205, new Item.Properties()));
	public static final RegistryObject<Item> LAND_AGENT_SPAWN_EGG = REGISTRY.register("land_agent_spawn_egg", () -> new ForgeSpawnEggItem(EpicJourneyModEntities.LAND_AGENT, -10092544, -256, new Item.Properties()));
	public static final RegistryObject<Item> HUMAN_SOLDIER_DEATH_SPAWN_EGG = REGISTRY.register("human_soldier_death_spawn_egg", () -> new ForgeSpawnEggItem(EpicJourneyModEntities.HUMAN_SOLDIER_DEATH, -6710887, -1, new Item.Properties()));
	public static final RegistryObject<Item> THE_LOST_SPAWN_EGG = REGISTRY.register("the_lost_spawn_egg", () -> new ForgeSpawnEggItem(EpicJourneyModEntities.THE_LOST, -16724941, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> SPORE_AGGREGATE_SPAWN_EGG = REGISTRY.register("spore_aggregate_spawn_egg", () -> new ForgeSpawnEggItem(EpicJourneyModEntities.SPORE_AGGREGATE, -16737997, -16711936, new Item.Properties()));
	public static final RegistryObject<Item> PLANKTONIC_SPORE_GROUP_SPAWN_EGG = REGISTRY.register("planktonic_spore_group_spawn_egg",
			() -> new ForgeSpawnEggItem(EpicJourneyModEntities.PLANKTONIC_SPORE_GROUP, -16737997, -3342388, new Item.Properties()));
	public static final RegistryObject<Item> THE_INIQUITY_OF_FAKE_GOD_SPAWN_EGG = REGISTRY.register("the_iniquity_of_fake_god_spawn_egg",
			() -> new ForgeSpawnEggItem(EpicJourneyModEntities.THE_INIQUITY_OF_FAKE_GOD, -16737997, -16764109, new Item.Properties()));
	public static final RegistryObject<Item> BUILDING_SPAWN_BANK = REGISTRY.register("building_spawn_bank", () -> new BuildingSpawnBankItem());
	public static final RegistryObject<Item> BUILDING_SALES_CENTER = REGISTRY.register("building_sales_center", () -> new BuildingSalesCenterItem());
	public static final RegistryObject<Item> BUILDING_UNDERGROUND_TOMB = REGISTRY.register("building_underground_tomb", () -> new BuildingUndergroundTombItem());
	public static final RegistryObject<Item> HOUSE_PROPERTY_SMALL_SIZED_WOODEN_HOUSE = REGISTRY.register("house_property_small_sized_wooden_house", () -> new BuildingSmallSizedWoodenHouseItem());
	public static final RegistryObject<Item> HOUSE_PROPERTY_MEDIUM_SIZED_WOODEN_HOUSE = REGISTRY.register("house_property_medium_sized_wooden_house", () -> new HousePropertyMediumSizedWoodenHouseItem());
	public static final RegistryObject<Item> HOUSE_PROPERTY_BIG_SIZED_WOODEN_HOUSE = REGISTRY.register("house_property_big_sized_wooden_house", () -> new HousePropertyBigSizedWoodenHouseItem());
	public static final RegistryObject<Item> DUNGEON_THE_PALACE_OF_FAKE_GOD = REGISTRY.register("dungeon_the_palace_of_fake_god", () -> new DungeonThePalaceOfFakeGodItem());
	public static final RegistryObject<Item> EXCHANGE = REGISTRY.register("exchange", () -> new ExchangeItem());
	public static final RegistryObject<Item> BLACK_COPPER_BOW = REGISTRY.register("black_copper_bow", () -> new BlackCopperBowItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}
}
