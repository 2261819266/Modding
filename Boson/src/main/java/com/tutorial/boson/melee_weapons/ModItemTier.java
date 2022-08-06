package com.tutorial.boson.melee_weapons;

import com.google.common.base.Supplier;
import com.tutorial.boson.ItemRegistry;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModItemTier implements IItemTier {
    OBSIDIAN(3, 2000, 10.0F, 4.0F, 30, () -> {
        return Ingredient.fromItems(ItemRegistry.obsidianIngot.get());
    });

    private final int harvestLevel, maxUses;
    private final float efficiency, attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ModItemTier(int harvestLevelIn, int maxUsesin, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        harvestLevel = harvestLevelIn;
        maxUses = maxUsesin;
        efficiency = efficiencyIn;
        attackDamage = attackDamageIn;
        enchantability = enchantabilityIn;
        repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }
    
    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
