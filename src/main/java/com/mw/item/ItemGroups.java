package com.mw.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup MW_MATERIALS_GROUP = FabricItemGroupBuilder.build(
            new Identifier("mw", "items"),
            () -> new ItemStack(Items.COPPER_INGOT));
    public static final ItemGroup MW_COMBAT_GROUP = FabricItemGroupBuilder.build(
            new Identifier("mw", "combat"),
            () -> new ItemStack(Items.COPPER_SWORD));
}
