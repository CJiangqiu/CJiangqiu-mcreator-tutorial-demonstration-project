
package net.epicjourney.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.epicjourney.procedures.LeafOfDeceivingDeathWhileBaubleIsEquippedTickProcedure;
import net.epicjourney.procedures.LeafOfDeceivingDeathBaubleIsUnequippedProcedure;
import net.epicjourney.procedures.LeafOfDeceivingDeathBaubleIsEquippedProcedure;

import java.util.List;

public class LeafOfDeceivingDeathItem extends Item implements ICurioItem {
	public LeafOfDeceivingDeathItem() {
		super(new Item.Properties().durability(12).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		LeafOfDeceivingDeathWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		LeafOfDeceivingDeathBaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		LeafOfDeceivingDeathBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
