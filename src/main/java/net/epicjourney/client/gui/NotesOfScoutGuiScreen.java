package net.epicjourney.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.epicjourney.world.inventory.NotesOfScoutGuiMenu;
import net.epicjourney.network.NotesOfScoutGuiButtonMessage;
import net.epicjourney.EpicJourneyMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class NotesOfScoutGuiScreen extends AbstractContainerScreen<NotesOfScoutGuiMenu> {
	private final static HashMap<String, Object> guistate = NotesOfScoutGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_next_page;

	public NotesOfScoutGuiScreen(NotesOfScoutGuiMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("epic_journey:textures/screens/notes.png"), this.leftPos + -75, this.topPos + -38, 0, 0, 317, 403, 317, 403);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_this_is_the_last_message_from_a"), -57, -29, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_the_rain_has_extinguished_the_bo"), -66, -20, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_i_put_the_lantern_beside_me_del"), -66, -11, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_bring_me_a_few_strands_of_warmth"), -66, -2, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_just_as_i_delude_myself_that_th"), 105, -2, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_that_this_note"), -66, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_this_is_the_last_thing_i_can_do"), -66, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_no_matter_who_picks_up_this_no"), -66, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_intellectual_creature_what_i_w"), -66, 34, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_fire_burn_this_forest_with_fire"), -66, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_noits_not_a_forest_anymore"), 6, 52, -52429, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_just_like_the_empires_most_impo"), -66, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_it_is_completely_different_from"), -66, 70, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_according_to_the_preliminary_obs"), -66, 79, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_accompanying_priest"), -66, 88, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_parasitized"), -66, 97, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_vague_statethey_will_only_aimle"), -66, 106, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_wander_but_when_attacked_they"), -66, 115, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_counterattack_i_privately_call"), -66, 124, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_we_want_to_reach_uh_my_heart_i"), -66, 133, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_god_there_is_something_green_wr"), -39, 142, -3407872, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_well_we_found_that_the_source_o"), -66, 151, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_from_that_palace_the_closer_we"), -72, 160, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_a_whisper_fick_fowos"), -62, 169, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.epic_journey.notes_of_scout_gui.label_fick_forvoss"), 33, 178, -16751053, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_next_page = Button.builder(Component.translatable("gui.epic_journey.notes_of_scout_gui.button_next_page"), e -> {
			if (true) {
				EpicJourneyMod.PACKET_HANDLER.sendToServer(new NotesOfScoutGuiButtonMessage(0, x, y, z));
				NotesOfScoutGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 159, this.topPos + 178, 72, 20).build();
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
	}
}
