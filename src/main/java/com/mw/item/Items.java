package com.mw.item;

import com.mw.item.material.ArmorMaterials;
import com.mw.item.material.ToolMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {


    //Copper
    public static final ArmorMaterial COPPER_ARMOR_MATERIAL = ArmorMaterials.COPPER;
    public static final Item COPPER_INGOT = new Item(new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP));
    public static final Item COPPER_SWORD = new SwordItem(ToolMaterials.COPPER, 2, -2.4f, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item COPPER_HELMET = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item COPPER_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item COPPER_LEGGINS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item COPPER_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));

    //Tin
    public static final ArmorMaterial TIN_ARMOR_MATERIAL = ArmorMaterials.TIN;
    public static final Item TIN_INGOT = new Item(new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP));
    public static final Item TIN_SWORD = new SwordItem(ToolMaterials.TIN, 2, -1.4f, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item TIN_HELMET = new ArmorItem(TIN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item TIN_CHESTPLATE = new ArmorItem(TIN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item TIN_LEGGINS = new ArmorItem(TIN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item TIN_BOOTS = new ArmorItem(TIN_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));

    //Bronze
    public static final ArmorMaterial BRONZE_ARMOR_MATERIAL = ArmorMaterials.BRONZE;
    public static final Item BRONZE_INGOT = new Item(new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP));
    public static final Item BRONZE_SWORD = new SwordItem(ToolMaterials.BRONZE, 4, -2.5f, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item BRONZE_HELMET = new ArmorItem(BRONZE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item BRONZE_CHESTPLATE = new ArmorItem(BRONZE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item BRONZE_LEGGINS = new ArmorItem(BRONZE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item BRONZE_BOOTS = new ArmorItem(BRONZE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));

    //Steel
    public static final ArmorMaterial STEEL_ARMOR_MATERIAL = ArmorMaterials.STEEL;
    public static final Item STEEL_INGOT = new Item(new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP));
    public static final Item STEEL_SWORD = new SwordItem(ToolMaterials.STEEL, 5, -2.5f, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item STEEL_HELMET = new ArmorItem(STEEL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item STEEL_CHESTPLATE = new ArmorItem(STEEL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item STEEL_LEGGINS = new ArmorItem(STEEL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item STEEL_BOOTS = new ArmorItem(STEEL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));

    //Titanium
    public static final ArmorMaterial TITANIUM_ARMOR_MATERIAL = ArmorMaterials.TITANIUM;
    public static final Item TITANIUM_INGOT = new Item(new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP));
    public static final Item TITANIUM_SWORD = new SwordItem(ToolMaterials.TITANIUM, 6, -2.5f, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item TITANIUM_HELMET = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item TITANIUM_CHESTPLATE = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item TITANIUM_LEGGINS = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item TITANIUM_BOOTS = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));

    //Silver
    public static final ArmorMaterial SILVER_ARMOR_MATERIAL = ArmorMaterials.SILVER;
    public static final Item SILVER_INGOT = new Item(new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP));
    public static final Item SILVER_SWORD = new SwordItem(ToolMaterials.SILVER, 4, -2.5f, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item SILVER_HELMET = new ArmorItem(SILVER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item SILVER_CHESTPLATE = new ArmorItem(SILVER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item SILVER_LEGGINS = new ArmorItem(SILVER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item SILVER_BOOTS = new ArmorItem(SILVER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));

    //Invar
    public static final ArmorMaterial INVAR_ARMOR_MATERIAL = ArmorMaterials.INVAR;
    public static final Item INVAR_INGOT = new Item(new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP));
    public static final Item INVAR_SWORD = new SwordItem(ToolMaterials.INVAR, 4, -2.5f, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item INVAR_HELMET = new ArmorItem(INVAR_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item INVAR_CHESTPLATE = new ArmorItem(INVAR_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item INVAR_LEGGINS = new ArmorItem(INVAR_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item INVAR_BOOTS = new ArmorItem(INVAR_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));

    //Platinum
    public static final ArmorMaterial PLATINUM_ARMOR_MATERIAL = ArmorMaterials.PLATINUM;
    public static final Item PLATINUM_INGOT = new Item(new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP));
    public static final Item PLATINUM_SWORD = new SwordItem(ToolMaterials.PLATINUM, 4, -2.5f, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item PLATINUM_HELMET = new ArmorItem(PLATINUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item PLATINUM_CHESTPLATE = new ArmorItem(PLATINUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item PLATINUM_LEGGINS = new ArmorItem(PLATINUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item PLATINUM_BOOTS = new ArmorItem(PLATINUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));

    //Electrum
    public static final ArmorMaterial ELECTRUM_ARMOR_MATERIAL = ArmorMaterials.ELECTRUM;
    public static final Item ELECTRUM_INGOT = new Item(new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP));
    public static final Item ELECTRUM_SWORD = new SwordItem(ToolMaterials.ELECTRUM, 4, -2.5f, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item ELECTRUM_HELMET = new ArmorItem(ELECTRUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item ELECTRUM_CHESTPLATE = new ArmorItem(ELECTRUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item ELECTRUM_LEGGINS = new ArmorItem(ELECTRUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item ELECTRUM_BOOTS = new ArmorItem(ELECTRUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));

    //Nickel
    public static final ArmorMaterial NICKEL_ARMOR_MATERIAL = ArmorMaterials.NICKEL;
    public static final Item NICKEL_INGOT = new Item(new Item.Settings().group(ItemGroups.MW_MATERIALS_GROUP));
    public static final Item NICKEL_SWORD = new SwordItem(ToolMaterials.NICKEL, 4, -2.5f, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item NICKEL_HELMET = new ArmorItem(NICKEL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item NICKEL_CHESTPLATE = new ArmorItem(NICKEL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item NICKEL_LEGGINS = new ArmorItem(NICKEL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));
    public static final Item NICKEL_BOOTS = new ArmorItem(NICKEL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.MW_COMBAT_GROUP));

    public static void initializeItems(){
        //Copper
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_ingot"), COPPER_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_sword"), COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_helmet"), COPPER_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_chestplate"), COPPER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_leggings"), COPPER_LEGGINS);
        Registry.register(Registry.ITEM, new Identifier("mw", "copper_boots"), COPPER_BOOTS);

        //Tin
        Registry.register(Registry.ITEM, new Identifier("mw", "tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mw", "tin_sword"), TIN_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mw", "tin_helmet"), TIN_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mw", "tin_chestplate"), TIN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mw", "tin_leggings"), TIN_LEGGINS);
        Registry.register(Registry.ITEM, new Identifier("mw", "tin_boots"), TIN_BOOTS);

        //Bronze
        Registry.register(Registry.ITEM, new Identifier("mw", "bronze_ingot"), BRONZE_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mw", "bronze_sword"), BRONZE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mw", "bronze_helmet"), BRONZE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mw", "bronze_chestplate"), BRONZE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mw", "bronze_leggings"), BRONZE_LEGGINS);
        Registry.register(Registry.ITEM, new Identifier("mw", "bronze_boots"), BRONZE_BOOTS);

        //Steel
        Registry.register(Registry.ITEM, new Identifier("mw", "steel_ingot"), STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mw", "steel_sword"), STEEL_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mw", "steel_helmet"), STEEL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mw", "steel_chestplate"), STEEL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mw", "steel_leggings"), STEEL_LEGGINS);
        Registry.register(Registry.ITEM, new Identifier("mw", "steel_boots"), STEEL_BOOTS);

        //Titanium
        Registry.register(Registry.ITEM, new Identifier("mw", "titanium_ingot"), TITANIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mw", "titanium_sword"), TITANIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mw", "titanium_helmet"), TITANIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mw", "titanium_chestplate"), TITANIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mw", "titanium_leggings"), TITANIUM_LEGGINS);
        Registry.register(Registry.ITEM, new Identifier("mw", "titanium_boots"), TITANIUM_BOOTS);

        //Silver
        Registry.register(Registry.ITEM, new Identifier("mw", "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mw", "silver_sword"), SILVER_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mw", "silver_helmet"), SILVER_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mw", "silver_chestplate"), SILVER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mw", "silver_leggings"), SILVER_LEGGINS);
        Registry.register(Registry.ITEM, new Identifier("mw", "silver_boots"), SILVER_BOOTS);

        //Invar
        Registry.register(Registry.ITEM, new Identifier("mw", "invar_ingot"), INVAR_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mw", "invar_sword"), INVAR_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mw", "invar_helmet"), INVAR_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mw", "invar_chestplate"), INVAR_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mw", "invar_leggings"), INVAR_LEGGINS);
        Registry.register(Registry.ITEM, new Identifier("mw", "invar_boots"), INVAR_BOOTS);

        //Platinum
        Registry.register(Registry.ITEM, new Identifier("mw", "platinum_ingot"), PLATINUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mw", "platinum_sword"), PLATINUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mw", "platinum_helmet"), PLATINUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mw", "platinum_chestplate"), PLATINUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mw", "platinum_leggings"), PLATINUM_LEGGINS);
        Registry.register(Registry.ITEM, new Identifier("mw", "platinum_boots"), PLATINUM_BOOTS);

        //Electrum
        Registry.register(Registry.ITEM, new Identifier("mw", "electrum_ingot"), ELECTRUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mw", "electrum_sword"), ELECTRUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mw", "electrum_helmet"), ELECTRUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mw", "electrum_chestplate"), ELECTRUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mw", "electrum_leggings"), ELECTRUM_LEGGINS);
        Registry.register(Registry.ITEM, new Identifier("mw", "electrum_boots"), ELECTRUM_BOOTS);

        //Nickel
        Registry.register(Registry.ITEM, new Identifier("mw", "nickel_ingot"), NICKEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mw", "nickel_sword"), NICKEL_SWORD);
        Registry.register(Registry.ITEM, new Identifier("mw", "nickel_helmet"), NICKEL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mw", "nickel_chestplate"), NICKEL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mw", "nickel_leggings"), NICKEL_LEGGINS);
        Registry.register(Registry.ITEM, new Identifier("mw", "nickel_boots"), NICKEL_BOOTS);
    }

}
