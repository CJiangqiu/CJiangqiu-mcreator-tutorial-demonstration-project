
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.epicjourney.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.epicjourney.world.inventory.ScrollGuiMenu;
import net.epicjourney.world.inventory.PurseGuiMenu;
import net.epicjourney.world.inventory.NotesOfScoutGuiMenu;
import net.epicjourney.world.inventory.NotesOfScoutGui2Menu;
import net.epicjourney.world.inventory.LandAgentTradeGuiMenu;
import net.epicjourney.world.inventory.BankTellerTradeGuiMenu;
import net.epicjourney.EpicJourneyMod;

public class EpicJourneyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EpicJourneyMod.MODID);
	public static final RegistryObject<MenuType<ScrollGuiMenu>> SCROLL_GUI = REGISTRY.register("scroll_gui", () -> IForgeMenuType.create(ScrollGuiMenu::new));
	public static final RegistryObject<MenuType<PurseGuiMenu>> PURSE_GUI = REGISTRY.register("purse_gui", () -> IForgeMenuType.create(PurseGuiMenu::new));
	public static final RegistryObject<MenuType<BankTellerTradeGuiMenu>> BANK_TELLER_TRADE_GUI = REGISTRY.register("bank_teller_trade_gui", () -> IForgeMenuType.create(BankTellerTradeGuiMenu::new));
	public static final RegistryObject<MenuType<LandAgentTradeGuiMenu>> LAND_AGENT_TRADE_GUI = REGISTRY.register("land_agent_trade_gui", () -> IForgeMenuType.create(LandAgentTradeGuiMenu::new));
	public static final RegistryObject<MenuType<NotesOfScoutGuiMenu>> NOTES_OF_SCOUT_GUI = REGISTRY.register("notes_of_scout_gui", () -> IForgeMenuType.create(NotesOfScoutGuiMenu::new));
	public static final RegistryObject<MenuType<NotesOfScoutGui2Menu>> NOTES_OF_SCOUT_GUI_2 = REGISTRY.register("notes_of_scout_gui_2", () -> IForgeMenuType.create(NotesOfScoutGui2Menu::new));
}
