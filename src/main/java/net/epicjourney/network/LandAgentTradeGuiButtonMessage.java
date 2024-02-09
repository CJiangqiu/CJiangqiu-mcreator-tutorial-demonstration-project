
package net.epicjourney.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.epicjourney.world.inventory.LandAgentTradeGuiMenu;
import net.epicjourney.procedures.LandAgentTrade3Procedure;
import net.epicjourney.procedures.LandAgentTrade2Procedure;
import net.epicjourney.procedures.LandAgentTrade1Procedure;
import net.epicjourney.EpicJourneyMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LandAgentTradeGuiButtonMessage {
	private final int buttonID, x, y, z;

	public LandAgentTradeGuiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public LandAgentTradeGuiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(LandAgentTradeGuiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(LandAgentTradeGuiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = LandAgentTradeGuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			LandAgentTrade1Procedure.execute(entity);
		}
		if (buttonID == 1) {

			LandAgentTrade2Procedure.execute(entity);
		}
		if (buttonID == 2) {

			LandAgentTrade3Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EpicJourneyMod.addNetworkMessage(LandAgentTradeGuiButtonMessage.class, LandAgentTradeGuiButtonMessage::buffer, LandAgentTradeGuiButtonMessage::new, LandAgentTradeGuiButtonMessage::handler);
	}
}
