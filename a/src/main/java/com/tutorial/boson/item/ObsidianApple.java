package com.tutorial.boson.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ObsidianApple extends Item {
    private static final Food food = new Food.Builder()
        .saturation(0.3f)
        .hunger(20)
        .effect(() -> new EffectInstance(Effects.POISON, 40, 1), 1)
        .build();

    public ObsidianApple() {
        super(new Properties().food(food).group(ModGroup.itemGroup));
    }
}
