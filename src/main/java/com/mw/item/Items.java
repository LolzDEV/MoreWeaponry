package com.mw.item;

import com.mw.item.material.ArmorMaterials;
import com.mw.item.material.CopperToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {


    //Copper stuff
    public static final ArmorMaterial COPPER_ARMOR_MATERIAL = ArmorMaterials.COPPER;
    public static final Item COPPER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item COPPER_HELMET = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item COPPER_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item COPPER_LEGGINS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item COPPER_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void initializeItems(){
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_ingot"), COPPER_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_sword"), COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_helmet"), COPPER_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_chestplate"), COPPER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_leggins"), COPPER_LEGGINS);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_boots"), COPPER_BOOTS);
    }

}
