package com.cporter.first_mod_again.registry;

import com.cporter.first_mod_again.FirstModAgain;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(FirstModAgain.MOD_ID, "ruby"), RUBY);
    }
}
