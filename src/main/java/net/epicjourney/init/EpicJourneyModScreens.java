
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.epicjourney.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.epicjourney.client.gui.ScrollGuiScreen;
import net.epicjourney.client.gui.PurseGuiScreen;
import net.epicjourney.client.gui.NotesOfScoutGuiScreen;
import net.epicjourney.client.gui.NotesOfScoutGui2Screen;
import net.epicjourney.client.gui.LandAgentTradeGuiScreen;
import net.epicjourney.client.gui.BankTellerTradeGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EpicJourneyModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EpicJourneyModMenus.SCROLL_GUI.get(), ScrollGuiScreen::new);
			MenuScreens.register(EpicJourneyModMenus.PURSE_GUI.get(), PurseGuiScreen::new);
			MenuScreens.register(EpicJourneyModMenus.BANK_TELLER_TRADE_GUI.get(), BankTellerTradeGuiScreen::new);
			MenuScreens.register(EpicJourneyModMenus.LAND_AGENT_TRADE_GUI.get(), LandAgentTradeGuiScreen::new);
			MenuScreens.register(EpicJourneyModMenus.NOTES_OF_SCOUT_GUI.get(), NotesOfScoutGuiScreen::new);
			MenuScreens.register(EpicJourneyModMenus.NOTES_OF_SCOUT_GUI_2.get(), NotesOfScoutGui2Screen::new);
		});
	}
}
