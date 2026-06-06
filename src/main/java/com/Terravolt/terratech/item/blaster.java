package com.Terravolt.terratech.item;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.entity.animation.json.AnimationTypeManager;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;

public class blaster  extends Item implements GeoItem {


    public blaster(Properties properties) {
        super(properties);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return null;
    }
}
