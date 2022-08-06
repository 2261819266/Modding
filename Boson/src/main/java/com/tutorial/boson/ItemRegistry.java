package com.tutorial.boson;

// import com.electronwill.nightconfig.core.io.Utils;
import com.tutorial.boson.first_item.ObsidianIngot;
import com.tutorial.boson.food.ObsidianApple;
import com.tutorial.boson.melee_weapons.ObsidianSword;
import com.tutorial.boson.tool.ObsidianPickaxe;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot", ObsidianIngot::new);
    public static final RegistryObject<Item> obsidianApple = ITEMS.register("obsidian_apple", ObsidianApple::new);
    public static final RegistryObject<Item> obsidianSword = ITEMS.register("obsidian_sword", ObsidianSword::new);
    public static final RegistryObject<Item> obsidianPickaxe = ITEMS.register("obsidian_pickaxe", ObsidianPickaxe::new);
}

