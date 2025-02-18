package com.Terravolt.terratech.registry;

import com.Terravolt.terratech.TerraTech;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TerraTech.MODID);
    public static final DeferredItem<Item> BLASTER = ITEMS.registerItem(
            "blaster",
            Item::new, // The factory that the properties will be passed into.
            new Item.Properties());
}
