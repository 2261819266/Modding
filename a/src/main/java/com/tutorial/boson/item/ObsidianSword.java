package com.tutorial.boson.item;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class ObsidianSword extends SwordItem {
    public ObsidianSword() {
        super(ModItemTier.OBSIDIAN, 3, -2.4F, new Item.Properties().group(ModGroup.itemGroup));
    }
}
