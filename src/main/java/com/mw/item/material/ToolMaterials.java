package com.mw.item.material;

import com.mw.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ToolMaterials implements ToolMaterial {
    COPPER(2, 250, 6.0F, 1.5F, 14, () -> {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }),
    TIN(2, 230, 5.5F, 1.5F, 14, () -> {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }),
    BRONZE(3, 300, 6.5F, 2.5F, 14, () -> {
        return Ingredient.ofItems(Items.BRONZE_INGOT);
    }),
    STEEL(3, 400, 6.5F, 3F, 15, () -> {
        return Ingredient.ofItems(Items.STEEL_INGOT);
    }),
    TITANIUM(4, 600, 6.5F, 4F, 15, () -> {
        return Ingredient.ofItems(Items.TITANIUM_INGOT);
    }),
    SILVER(3, 300, 6.5F, 2.5F, 14, () -> {
        return Ingredient.ofItems(Items.SILVER_INGOT);
    }),
    INVAR(3, 300, 6.5F, 2.5F, 14, () -> {
        return Ingredient.ofItems(Items.INVAR_INGOT);
    }),
    PLATINUM(5, 500, 7.0F, 6.5F, 16, () -> {
        return Ingredient.ofItems(Items.PLATINUM_INGOT);
    }),
    ELECTRUM(4, 350, 6.0F, 4.0F, 14, () -> {
        return Ingredient.ofItems(Items.ELECTRUM_INGOT);
    }),
    NICKEL(2, 230, 5.5F, 1.5F, 14, () -> {
        return Ingredient.ofItems(Items.NICKEL_INGOT);
    });


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

}
