package com.Terravolt.terratech.keymaps;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.common.util.Lazy;

public class blaster_keys {


    public static final KeyMapping BLASTER_READY = new KeyMapping(
            "key.your_mod_id.my_action", // Translation key for the Controls menu
            InputConstants.Type.KEYSYM,  // Type of input (Key / Mouse)
            GLFW.GLFW_KEY_P,             // Default key (e.g., 'P')
            "key.categories.your_mod_id" // Category in the controls menu
    );


}