package com.mw.core;

import com.mw.block.Blocks;
import com.mw.item.Items;
import com.mw.world.OreGenerator;
import net.fabricmc.api.ModInitializer;

public class MoreWeaponry implements ModInitializer {
	@Override
	public void onInitialize() {
		Blocks.initializeBlocks();
		Items.initializeItems();
		OreGenerator.registerFeatures();
	}
}
