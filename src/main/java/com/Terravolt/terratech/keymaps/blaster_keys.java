package com.Terravolt.terratech.keymaps;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.common.util.Lazy;

public class blaster_keys {


    public static final Lazy<KeyMapping> BLASTER_READY = Lazy.of(() ->
            new KeyMapping(
            "key.examplemod.example1", // Will be localized using this translation key
            InputConstants.Type.KEYSYM, // Default mapping is on the keyboard
            GLFW.GLFW_KEY_P, // Default key is P
            "key.categories.misc" // Mapping will be in the misc category
    )
    );

}