package com.tutorial.boson;

import com.tutorial.boson.melee_weapons.ObsidianSword;

// import java.util.logging.Logger;

// import com.tutorial.boson.ItemRegistry;
// import com.tutorial.boson.food.ItemRegistry;

// import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class Boson {
    public Boson() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        // IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // com.tutorial.boson.first_item.ItemRegistry.ITEMS.register(eventBus);
        // com.tutorial.boson.food.ItemRegistry.ITEMS.register(eventBus);
        // com.tutorial.boson.melee_weapons.ItemRegistry.ITEMS.register(eventBus);
    }
}