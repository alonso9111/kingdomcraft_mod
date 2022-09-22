
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.alonso91cl.kingdomcraftmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class KingdomcraftModModTabs {
	public static CreativeModeTab TAB_KINGDOMCRAFT_TAB;

	public static void load() {
		TAB_KINGDOMCRAFT_TAB = new CreativeModeTab("tabkingdomcraft_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.SHIELD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
