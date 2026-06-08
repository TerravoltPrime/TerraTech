package com.Terravolt.terratech.keymaps;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;


public class blaster_keys {

    public static final KeyMapping BLASTER_FIRE = new KeyMapping(
            "key.terratech.fire", // Translation key for the Controls menu
            InputConstants.Type.KEYSYM,  // Type of input (Key / Mouse)
            GLFW.GLFW_MOUSE_BUTTON_2,             // Default key (e.g., 'P')
            "key.categories.your_mod_id" // Category in the controls menu
    );
    public static final KeyMapping BLASTER_READY = new KeyMapping(
            "key.terratech.ready", // Translation key for the Controls menu
            InputConstants.Type.KEYSYM,  // Type of input (Key / Mouse)
            GLFW.GLFW_KEY_P,             // Default key (e.g., 'P')
            "key.categories.your_mod_id" // Category in the controls menu
    );
    public static final KeyMapping BLASTER_CONFIGURE = new KeyMapping(
            "key.terratech.configure", // Translation key for the Controls menu
            InputConstants.Type.KEYSYM,  // Type of input (Key / Mouse)
            GLFW.GLFW_KEY_P,             // Default key (e.g., 'P')
            "key.categories.your_mod_id" // Category in the controls menu
    );

}