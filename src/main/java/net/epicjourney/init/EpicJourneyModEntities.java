
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.epicjourney.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.epicjourney.entity.TheLostEntity;
import net.epicjourney.entity.TheIniquityOfFakeGodEntity;
import net.epicjourney.entity.TestBossEntity;
import net.epicjourney.entity.SporeAggregateEntity;
import net.epicjourney.entity.PlanktonicSporeGroupEntity;
import net.epicjourney.entity.MagicDragonFireEntity;
import net.epicjourney.entity.LandAgentEntity;
import net.epicjourney.entity.HumanSoldierDeathEntity;
import net.epicjourney.entity.BankTellerEntity;
import net.epicjourney.EpicJourneyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EpicJourneyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EpicJourneyMod.MODID);
	public static final RegistryObject<EntityType<TestBossEntity>> TEST_BOSS = register("test_boss",
			EntityType.Builder.<TestBossEntity>of(TestBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TestBossEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BankTellerEntity>> BANK_TELLER = register("bank_teller",
			EntityType.Builder.<BankTellerEntity>of(BankTellerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BankTellerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LandAgentEntity>> LAND_AGENT = register("land_agent",
			EntityType.Builder.<LandAgentEntity>of(LandAgentEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LandAgentEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HumanSoldierDeathEntity>> HUMAN_SOLDIER_DEATH = register("human_soldier_death",
			EntityType.Builder.<HumanSoldierDeathEntity>of(HumanSoldierDeathEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HumanSoldierDeathEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheLostEntity>> THE_LOST = register("the_lost",
			EntityType.Builder.<TheLostEntity>of(TheLostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheLostEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SporeAggregateEntity>> SPORE_AGGREGATE = register("spore_aggregate",
			EntityType.Builder.<SporeAggregateEntity>of(SporeAggregateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SporeAggregateEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<PlanktonicSporeGroupEntity>> PLANKTONIC_SPORE_GROUP = register("planktonic_spore_group",
			EntityType.Builder.<PlanktonicSporeGroupEntity>of(PlanktonicSporeGroupEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(PlanktonicSporeGroupEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<TheIniquityOfFakeGodEntity>> THE_INIQUITY_OF_FAKE_GOD = register("the_iniquity_of_fake_god",
			EntityType.Builder.<TheIniquityOfFakeGodEntity>of(TheIniquityOfFakeGodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(TheIniquityOfFakeGodEntity::new)

					.sized(2f, 4f));
	public static final RegistryObject<EntityType<MagicDragonFireEntity>> MAGIC_DRAGON_FIRE = register("projectile_magic_dragon_fire", EntityType.Builder.<MagicDragonFireEntity>of(MagicDragonFireEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MagicDragonFireEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TestBossEntity.init();
			BankTellerEntity.init();
			LandAgentEntity.init();
			HumanSoldierDeathEntity.init();
			TheLostEntity.init();
			SporeAggregateEntity.init();
			PlanktonicSporeGroupEntity.init();
			TheIniquityOfFakeGodEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TEST_BOSS.get(), TestBossEntity.createAttributes().build());
		event.put(BANK_TELLER.get(), BankTellerEntity.createAttributes().build());
		event.put(LAND_AGENT.get(), LandAgentEntity.createAttributes().build());
		event.put(HUMAN_SOLDIER_DEATH.get(), HumanSoldierDeathEntity.createAttributes().build());
		event.put(THE_LOST.get(), TheLostEntity.createAttributes().build());
		event.put(SPORE_AGGREGATE.get(), SporeAggregateEntity.createAttributes().build());
		event.put(PLANKTONIC_SPORE_GROUP.get(), PlanktonicSporeGroupEntity.createAttributes().build());
		event.put(THE_INIQUITY_OF_FAKE_GOD.get(), TheIniquityOfFakeGodEntity.createAttributes().build());
	}
}
