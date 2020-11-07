package com.mw.block;


import com.mw.item.ItemGroups;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Blocks {

    public static final Block COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE));
    public static final Block TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE));
    public static final Block TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE));
    public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE));
    public static final Block PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE));
    public static final Block NICKEL_ORE = new Block(FabricBlockSettings.of(Material.STONE));

    public static void initializeBlocks(){
        Registry.register(Registry.BLOCK, new Identifier("mw", "copper_ore"), COPPER_ORE);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_ore"), new BlockItem(COPPER_ORE, new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("mw", "tin_ore"), TIN_ORE);
        Registry.register(Registry.ITEM, new Identifier("mw", "tin_ore"), new BlockItem(TIN_ORE, new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("mw", "titanium_ore"), TITANIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("mw", "titanium_ore"), new BlockItem(TITANIUM_ORE, new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("mw", "silver_ore"), SILVER_ORE);
        Registry.register(Registry.ITEM, new Identifier("mw", "silver_ore"), new BlockItem(SILVER_ORE, new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("mw", "platinum_ore"), PLATINUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("mw", "platinum_ore"), new BlockItem(PLATINUM_ORE, new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("mw", "nickel_ore"), NICKEL_ORE);
        Registry.register(Registry.ITEM, new Identifier("mw", "nickel_ore"), new BlockItem(NICKEL_ORE, new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP)));
    }

}
