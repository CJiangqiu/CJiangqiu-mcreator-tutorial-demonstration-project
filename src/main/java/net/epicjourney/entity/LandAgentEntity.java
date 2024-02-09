
package net.epicjourney.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.items.wrapper.EntityHandsInvWrapper;
import net.minecraftforge.items.wrapper.EntityArmorInvWrapper;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.ClimbOnTopOfPowderSnowGoal;
import net.minecraft.world.entity.ai.goal.BreathAirGoal;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;

import net.epicjourney.world.inventory.LandAgentTradeGuiMenu;
import net.epicjourney.procedures.OutHouseJudgmentProcedure;
import net.epicjourney.procedures.NpcHurtProcedure;
import net.epicjourney.procedures.LandAgentShiTiChuShiShengChengShiProcedure;
import net.epicjourney.procedures.InHouseJudgmentProcedure;
import net.epicjourney.procedures.HidingJudgmentProcedure;
import net.epicjourney.init.EpicJourneyModEntities;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import io.netty.buffer.Unpooled;

public class LandAgentEntity extends PathfinderMob {
	public static final EntityDataAccessor<Integer> DATA_texture = SynchedEntityData.defineId(LandAgentEntity.class, EntityDataSerializers.INT);

	public LandAgentEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EpicJourneyModEntities.LAND_AGENT.get(), world);
	}

	public LandAgentEntity(EntityType<LandAgentEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 5;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_texture, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new MoveBackToVillageGoal(this, 0.6, false) {
			@Override
			public boolean canUse() {
				double x = LandAgentEntity.this.getX();
				double y = LandAgentEntity.this.getY();
				double z = LandAgentEntity.this.getZ();
				Entity entity = LandAgentEntity.this;
				Level world = LandAgentEntity.this.level();
				return super.canUse() && HidingJudgmentProcedure.execute(world, x, y, z);
			}

			@Override
			public boolean canContinueToUse() {
				double x = LandAgentEntity.this.getX();
				double y = LandAgentEntity.this.getY();
				double z = LandAgentEntity.this.getZ();
				Entity entity = LandAgentEntity.this;
				Level world = LandAgentEntity.this.level();
				return super.canContinueToUse() && HidingJudgmentProcedure.execute(world, x, y, z);
			}
		});
		this.goalSelector.addGoal(2, new OpenDoorGoal(this, true) {
			@Override
			public boolean canUse() {
				double x = LandAgentEntity.this.getX();
				double y = LandAgentEntity.this.getY();
				double z = LandAgentEntity.this.getZ();
				Entity entity = LandAgentEntity.this;
				Level world = LandAgentEntity.this.level();
				return super.canUse() && OutHouseJudgmentProcedure.execute(world, x, y, z);
			}

			@Override
			public boolean canContinueToUse() {
				double x = LandAgentEntity.this.getX();
				double y = LandAgentEntity.this.getY();
				double z = LandAgentEntity.this.getZ();
				Entity entity = LandAgentEntity.this;
				Level world = LandAgentEntity.this.level();
				return super.canContinueToUse() && OutHouseJudgmentProcedure.execute(world, x, y, z);
			}
		});
		this.goalSelector.addGoal(3, new OpenDoorGoal(this, false) {
			@Override
			public boolean canUse() {
				double x = LandAgentEntity.this.getX();
				double y = LandAgentEntity.this.getY();
				double z = LandAgentEntity.this.getZ();
				Entity entity = LandAgentEntity.this;
				Level world = LandAgentEntity.this.level();
				return super.canUse() && InHouseJudgmentProcedure.execute(world, x, y, z);
			}

			@Override
			public boolean canContinueToUse() {
				double x = LandAgentEntity.this.getX();
				double y = LandAgentEntity.this.getY();
				double z = LandAgentEntity.this.getZ();
				Entity entity = LandAgentEntity.this;
				Level world = LandAgentEntity.this.level();
				return super.canContinueToUse() && InHouseJudgmentProcedure.execute(world, x, y, z);
			}
		});
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(5, new AvoidEntityGoal<>(this, Monster.class, (float) 8, 1, 1.2));
		this.goalSelector.addGoal(6, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(8, new FloatGoal(this));
		this.goalSelector.addGoal(9, new RandomSwimmingGoal(this, 1, 40));
		this.goalSelector.addGoal(10, new ClimbOnTopOfPowderSnowGoal(this, this.level()));
		this.goalSelector.addGoal(11, new BreathAirGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		Entity sourceentity = damagesource.getEntity();
		Entity immediatesourceentity = damagesource.getDirectEntity();

		NpcHurtProcedure.execute(world, x, y, z, entity);
		return super.hurt(damagesource, amount);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		LandAgentShiTiChuShiShengChengShiProcedure.execute(this);
		return retval;
	}

	private final ItemStackHandler inventory = new ItemStackHandler(6) {
		@Override
		public int getSlotLimit(int slot) {
			return 64;
		}
	};
	private final CombinedInvWrapper combined = new CombinedInvWrapper(inventory, new EntityHandsInvWrapper(this), new EntityArmorInvWrapper(this));

	@Override
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction side) {
		if (this.isAlive() && capability == ForgeCapabilities.ITEM_HANDLER && side == null)
			return LazyOptional.of(() -> combined).cast();
		return super.getCapability(capability, side);
	}

	@Override
	protected void dropEquipment() {
		super.dropEquipment();
		for (int i = 0; i < inventory.getSlots(); ++i) {
			ItemStack itemstack = inventory.getStackInSlot(i);
			if (!itemstack.isEmpty() && !EnchantmentHelper.hasVanishingCurse(itemstack)) {
				this.spawnAtLocation(itemstack);
			}
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Datatexture", this.entityData.get(DATA_texture));
		compound.put("InventoryCustom", inventory.serializeNBT());
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datatexture"))
			this.entityData.set(DATA_texture, compound.getInt("Datatexture"));
		if (compound.get("InventoryCustom") instanceof CompoundTag inventoryTag)
			inventory.deserializeNBT(inventoryTag);
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
		if (sourceentity instanceof ServerPlayer serverPlayer) {
			NetworkHooks.openScreen(serverPlayer, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Land Agent");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
					packetBuffer.writeBlockPos(sourceentity.blockPosition());
					packetBuffer.writeByte(0);
					packetBuffer.writeVarInt(LandAgentEntity.this.getId());
					return new LandAgentTradeGuiMenu(id, inventory, packetBuffer);
				}
			}, buf -> {
				buf.writeBlockPos(sourceentity.blockPosition());
				buf.writeByte(0);
				buf.writeVarInt(this.getId());
			});
		}
		super.mobInteract(sourceentity, hand);
		return retval;
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 30);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 2);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
