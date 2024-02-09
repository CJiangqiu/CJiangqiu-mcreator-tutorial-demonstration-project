package net.epicjourney.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.epicjourney.world.inventory.NotesOfScoutGui2Menu;
import net.epicjourney.network.NotesOfScoutGui2ButtonMessage;
import net.epicjourney.EpicJourneyMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class NotesOfScoutGui2Screen extends AbstractContainerScreen<NotesOfScoutGui2Menu> {
	private final static HashMap<String, Object> guistate = NotesOfScoutGui2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_this_is_too_scary;
	Button button_thank_you_for_your_message_sol;

	public NotesOfScoutGui2Screen(NotesOfScoutGui2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

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

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/notes.png"), this.leftPos + -74, this.topPos + -199, 0, 0, 317, 403, 317, 403);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_when_we_entered_there_i_saw_som"), -63, -29, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_my_life_i_turned_my_head_and_ra"), -63, -20, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_imperial_scoutis_not_to_fight_w"), -68, -10, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_just_to_quickly_pass_this_inform"), -69, 0, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_be_resolvedwhen_i_ran_with_thi"), -64, 11, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_came_from_behind_and_then_my_ch"), -63, 22, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_shattered"), -68, 32, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_the_thing_that_parasitized_me_dr"), -64, 45, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_at_this_time"), -68, 53, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_may_i_be_blessed_no_matter_whic"), -63, 64, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_become_a_monster"), -67, 75, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui_2.label_the_handwriting_ends_here"), 14, 93, -10092544, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_this_is_too_scary = Button.builder(Component.translatable("gui.epic_journey.notes_of_scout_gui_2.button_this_is_too_scary"), e -> {
			if (true) {
				EpicJourneyMod.PACKET_HANDLER.sendToServer(new NotesOfScoutGui2ButtonMessage(0, x, y, z));
				NotesOfScoutGui2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 26, this.topPos + 127, 129, 20).build();
		guistate.put("button:button_this_is_too_scary", button_this_is_too_scary);
		this.addRenderableWidget(button_this_is_too_scary);
		button_thank_you_for_your_message_sol = Button.builder(Component.translatable("gui.epic_journey.notes_of_scout_gui_2.button_thank_you_for_your_message_sol"), e -> {
			if (true) {
				EpicJourneyMod.PACKET_HANDLER.sendToServer(new NotesOfScoutGui2ButtonMessage(1, x, y, z));
				NotesOfScoutGui2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -14, this.topPos + 152, 212, 20).build();
		guistate.put("button:button_thank_you_for_your_message_sol", button_thank_you_for_your_message_sol);
		this.addRenderableWidget(button_thank_you_for_your_message_sol);
	}
}
