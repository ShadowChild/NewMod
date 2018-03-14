package io.github.shadowchild.fma.init;


import io.github.shadowchild.fma.content.block.rune.RuneBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class InitBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Item> ITEM_BLOCKS = new ArrayList<>();

    // Alchemic Blocks

    // Runes
    public static RuneBlock rune_air = new RuneBlock("rune_air", RuneBlock.RuneType.AIR);
}