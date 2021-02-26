package com.croizzant.forge_tutorial.core.init;

import com.croizzant.forge_tutorial.ForgeTutorial;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ForgeTutorial.MOD_ID);

    public static final RegistryObject<Block> BUTTER_BLOCK = BLOCKS.register("butter_block",
            () -> new Block(AbstractBlock.Properties.create(Material.SAND, MaterialColor.GOLD)
                    .hardnessAndResistance(12f, 25f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .sound(SoundType.METAL)));

}
