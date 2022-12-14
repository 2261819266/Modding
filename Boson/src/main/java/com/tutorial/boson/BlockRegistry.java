package com.tutorial.boson;

import com.tutorial.boson.blockstate.ObsidianRubikCube;
import com.tutorial.boson.first_block.ObsidianBlock;
// import com.tutorial.boson.Utils;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> obsidianBlock = BLOCKS.register("obsidian_block", ObsidianBlock::new);
    public static final RegistryObject<Block> obsidianRubikCube = BLOCKS.register("obsidian_rubik_cube", ObsidianRubikCube::new);

}
