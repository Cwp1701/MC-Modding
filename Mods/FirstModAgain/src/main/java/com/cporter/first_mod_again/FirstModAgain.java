package com.cporter.first_mod_again;

import com.cporter.first_mod_again.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class FirstModAgain implements ModInitializer {

    public static final String MOD_ID = "fma";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
