package net.epicjourney.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.epicjourney.world.inventory.BankTellerTradeGuiMenu;
import net.epicjourney.network.BankTellerTradeGuiButtonMessage;
import net.epicjourney.EpicJourneyMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BankTellerTradeGuiScreen extends AbstractContainerScreen<BankTellerTradeGuiMenu> {
	private final static HashMap<String, Object> guistate = BankTellerTradeGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_trade;
	Button button_trade1;
	Button button_trade2;
	Button button_trade3;

	public BankTellerTradeGuiScreen(BankTellerTradeGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 220;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("epic_journey:textures/screens/bank_teller_trade_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/arrow.png"), this.leftPos + 84, this.topPos + 11, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/copper_coin.png"), this.leftPos + 45, this.topPos + 11, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/silver_coin.png"), this.leftPos + 112, this.topPos + 11, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/arrow.png"), this.leftPos + 83, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/silver_coin.png"), this.leftPos + 45, this.topPos + 32, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/gold_coin.png"), this.leftPos + 112, this.topPos + 32, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/silver_coin.png"), this.leftPos + 45, this.topPos + 56, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/arrow.png"), this.leftPos + 84, this.topPos + 56, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/copper_coin.png"), this.leftPos + 112, this.topPos + 54, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/gold_coin.png"), this.leftPos + 45, this.topPos + 78, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/arrow.png"), this.leftPos + 83, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/silver_coin.png"), this.leftPos + 112, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.bank_teller_trade_gui.label_32"), 32, 15, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.bank_teller_trade_gui.label_1"), 103, 15, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.bank_teller_trade_gui.label_16"), 31, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.bank_teller_trade_gui.label_11"), 104, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.bank_teller_trade_gui.label_12"), 32, 59, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.bank_teller_trade_gui.label_161"), 99, 59, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.bank_teller_trade_gui.label_13"), 32, 82, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.bank_teller_trade_gui.label_162"), 99, 82, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_trade = Button.builder(Component.translatable("gui.epic_journey.bank_teller_trade_gui.button_trade"), e -> {
			if (true) {
				EpicJourneyMod.PACKET_HANDLER.sendToServer(new BankTellerTradeGuiButtonMessage(0, x, y, z));
				BankTellerTradeGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 156, this.topPos + 8, 51, 20).build();
		guistate.put("button:button_trade", button_trade);
		this.addRenderableWidget(button_trade);
		button_trade1 = Button.builder(Component.translatable("gui.epic_journey.bank_teller_trade_gui.button_trade1"), e -> {
			if (true) {
				EpicJourneyMod.PACKET_HANDLER.sendToServer(new BankTellerTradeGuiButtonMessage(1, x, y, z));
				BankTellerTradeGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 156, this.topPos + 31, 51, 20).build();
		guistate.put("button:button_trade1", button_trade1);
		this.addRenderableWidget(button_trade1);
		button_trade2 = Button.builder(Component.translatable("gui.epic_journey.bank_teller_trade_gui.button_trade2"), e -> {
			if (true) {
				EpicJourneyMod.PACKET_HANDLER.sendToServer(new BankTellerTradeGuiButtonMessage(2, x, y, z));
				BankTellerTradeGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 156, this.topPos + 53, 51, 20).build();
		guistate.put("button:button_trade2", button_trade2);
		this.addRenderableWidget(button_trade2);
		button_trade3 = Button.builder(Component.translatable("gui.epic_journey.bank_teller_trade_gui.button_trade3"), e -> {
			if (true) {
				EpicJourneyMod.PACKET_HANDLER.sendToServer(new BankTellerTradeGuiButtonMessage(3, x, y, z));
				BankTellerTradeGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 156, this.topPos + 77, 51, 20).build();
		guistate.put("button:button_trade3", button_trade3);
		this.addRenderableWidget(button_trade3);
	}
}
