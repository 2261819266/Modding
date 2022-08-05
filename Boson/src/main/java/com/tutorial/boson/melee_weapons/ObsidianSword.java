package com.tutorial.boson.melee_weapons;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class ObsidianSword extends SwordItem {
    public ObsidianSword() {
        super(ModItemTier.OBSIDIAN, 10, -2F, new Item.Properties().group(ItemGroup.COMBAT));
    }
}
