package com.xterme;

import com.xterme.item.RedNetheriteItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedNetherite implements ModInitializer {

    public static final String MOD_ID = "xterme";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        LOGGER.info("==================================");
        LOGGER.info(" Red Netherite Mod Loaded!");
        LOGGER.info(" Welcome XTERME!");
        LOGGER.info("==================================");

        // Register items
        RedNetheriteItems.registerModItems();
    }

    // Helper for IDs
    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}