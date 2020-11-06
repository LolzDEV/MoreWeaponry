package com.mw.block;


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Blocks {

    public static final Block COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE));

    public static void initializeBlocks(){
        Registry.register(Registry.BLOCK, new Identifier("mw", "copper_ore"), COPPER_ORE);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_ore"), new BlockItem(COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }

}
