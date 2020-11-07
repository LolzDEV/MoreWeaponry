package com.mw.item.material;

import com.mw.item.Items;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ArmorMaterials implements ArmorMaterial {
    COPPER("copper", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }),
    TIN("tin", 13, new int[]{2, 4, 5, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.TIN_INGOT);
    }),
    BRONZE("bronze", 16, new int[]{4, 5, 4, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.BRONZE_INGOT);
    }),
    STEEL("steel", 18, new int[]{4, 6, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 1.0F, () -> {
        return Ingredient.ofItems(Items.STEEL_INGOT);
    }),
    TITANIUM("titanium", 22, new int[]{4, 7, 7, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 2.0F, () -> {
        return Ingredient.ofItems(Items.TITANIUM_INGOT);
    }),
    SILVER("silver", 16, new int[]{4, 5, 4, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.SILVER_INGOT);
    }),
    INVAR("invar", 16, new int[]{4, 5, 4, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.INVAR_INGOT);
    }),
    PLATINUM("platinum", 25, new int[]{5, 8, 7, 5}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 6.0F, () -> {
        return Ingredient.ofItems(Items.PLATINUM_INGOT);
    }),
    ELECTRUM("electrum", 16, new int[]{4, 5, 4, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.ELECTRUM_INGOT);
    }),
    NICKEL("nickel", 13, new int[]{2, 4, 5, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.TIN_INGOT);
    }),;



    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    ArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    @Environment(EnvType.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }


}
