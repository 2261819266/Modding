package com.tutorial.boson.blockstate;

import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
// import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.BlockState;

public class ObsidianRubikCube extends Block {
    private static IntegerProperty STATE = IntegerProperty.create("face", 0, 1);

    public ObsidianRubikCube() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));   
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STATE);
        super.fillStateContainer(builder);
    }
}
