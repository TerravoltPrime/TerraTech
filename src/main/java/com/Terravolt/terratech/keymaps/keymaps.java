package com.Terravolt.terratech.keymaps;

import com.Terravolt.terratech.TerraTech;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.settings.KeyConflictContext;
import net.neoforged.neoforge.client.settings.KeyModifier;
import org.lwjgl.glfw.GLFW;

import java.util.function.Consumer;

import static org.apache.logging.log4j.Level.CATEGORY;

public class keymaps {


    public static final KeyMapping BLASTER_READY = createUnboundKeyMapping(TerraTech.BLASTER, "activate");;


    public static KeyMapping createToggleKeyMapping(Holder<Item> item) {
        return createUnboundKeyMapping(item, "toggle");
    }


    public static KeyMapping createUnboundKeyMapping(Holder<Item> item, String action) {
        String id = "terratech.key.%s.%s".formatted(item.unwrapKey().orElseThrow().location().getPath(), action);
        return new KeyMapping(id, InputConstants.Type.KEYSYM, InputConstants.UNKNOWN.getValue(), "terratech.key_category");
    }




    public static void register(Consumer<KeyMapping> registration) {
        registration.accept(BLASTER_READY);

    }

    }
