package com.tutorial.boson;

// import com.electronwill.nightconfig.core.io.Utils;
import com.tutorial.boson.first_item.ObsidianIngot;
import com.tutorial.boson.food.ObsidianApple;
import com.tutorial.boson.group.ModGroup;
import com.tutorial.boson.melee_weapons.ObsidianSword;
import com.tutorial.boson.tool.ObsidianPickaxe;
import com.tutorial.boson.armor.ModArmorMaterial;

// import ModArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.inventory.EquipmentSlotType;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot", ObsidianIngot::new);
    public static final RegistryObject<Item> obsidianApple = ITEMS.register("obsidian_apple", ObsidianApple::new);
    public static final RegistryObject<Item> obsidianSword = ITEMS.register("obsidian_sword", ObsidianSword::new);
    public static final RegistryObject<Item> obsidianPickaxe = ITEMS.register("obsidian_pickaxe", ObsidianPickaxe::new);
    public static final RegistryObject<Item> obsidianHelmet = ITEMS.register("obsidian_helmet", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianChestplate = ITEMS.register("obsidian_chestplate", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianLeggings = ITEMS.register("obsidian_leggings", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianBoots = ITEMS.register("obsidian_boots", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET, (new Item.Properties()).group(ModGroup.itemGroup)));

    public static final RegistryObject<Item> obsidianBlock = ITEMS.register("obsidian_block", () -> new BlockItem(BlockRegistry.obsidianBlock.get(), new Item.Properties().group(ModGroup.itemGroup)));

}

