
package net.epicjourney.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.epicjourney.world.inventory.BankTellerTradeGuiMenu;
import net.epicjourney.procedures.BankTellerTrade4Procedure;
import net.epicjourney.procedures.BankTellerTrade3Procedure;
import net.epicjourney.procedures.BankTellerTrade2Procedure;
import net.epicjourney.procedures.BankTellerTrade1Procedure;
import net.epicjourney.EpicJourneyMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BankTellerTradeGuiButtonMessage {
	private final int buttonID, x, y, z;

	public BankTellerTradeGuiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BankTellerTradeGuiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BankTellerTradeGuiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BankTellerTradeGuiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BankTellerTradeGuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BankTellerTrade1Procedure.execute(entity);
		}
		if (buttonID == 1) {

			BankTellerTrade2Procedure.execute(entity);
		}
		if (buttonID == 2) {

			BankTellerTrade3Procedure.execute(entity);
		}
		if (buttonID == 3) {

			BankTellerTrade4Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EpicJourneyMod.addNetworkMessage(BankTellerTradeGuiButtonMessage.class, BankTellerTradeGuiButtonMessage::buffer, BankTellerTradeGuiButtonMessage::new, BankTellerTradeGuiButtonMessage::handler);
	}
}
