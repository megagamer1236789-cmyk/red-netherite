package com.xterme.item;

import com.xterme.RedNetherite;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;

public class RedNetheriteItems {

    // 🔥 YOUR FIRST ITEM
    public static final Item RED_NETHERITE_INGOT = register("red_netherite_ingot",
            new Item(new Item.Properties())
    );

    // 🔧 REGISTER FUNCTION (DO NOT TOUCH)
    private static Item register(String name, Item item) {
        return Registry.register(
                BuiltInRegistries.ITEM,
                RedNetherite.id(name),
                item
        );
    }

    // 🎮 CALLED FROM MAIN MOD CLASS
    public static void registerModItems() {

        RedNetherite.LOGGER.info("Registering Red Netherite Items...");

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
            entries.accept(RED_NETHERITE_INGOT);
        });

    }
}