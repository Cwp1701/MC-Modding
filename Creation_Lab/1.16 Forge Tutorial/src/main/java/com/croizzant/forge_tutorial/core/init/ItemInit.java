package com.croizzant.forge_tutorial.core.init;

import com.croizzant.forge_tutorial.ForgeTutorial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            ForgeTutorial.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().group(ItemGroup.COMBAT)));

    // block items
    public static final RegistryObject<BlockItem> BUTTER_BLOCK = ITEMS.register("butter_block", () ->
            new BlockItem(BlockInit.BUTTER_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
