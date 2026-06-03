package com.Terravolt.terratech;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import io.wispforest.accessories.api.slot.SlotReference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ArmedModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import static net.minecraft.world.entity.player.Player.DEFAULT_MAIN_HAND;

public class BlasterRenderLeft {

    public <M extends LivingEntity> void render(
            ItemStack stack,
            SlotReference reference,
            PoseStack poseStack,
            EntityModel<M> model,
            MultiBufferSource multiBufferSource,
            int light,
            float limbSwing,
            float limbSwingAmount,
            float partialTicks,
            float ageInTicks,
            float netHeadYaw,
            float headPitch
    ) {
        LivingEntity entity = reference.entity();

        ItemStack handStack = entity.getItemInHand(entity.getUsedItemHand());


        poseStack.pushPose();

        // Determine which arm is the offhand
        HumanoidArm mainHandArm = (entity.getMainArm() == HumanoidArm.RIGHT) ? HumanoidArm.RIGHT : HumanoidArm.LEFT;

        if (model instanceof ArmedModel armedModel) {
            armedModel.translateToHand(mainHandArm, poseStack);

            poseStack.mulPose(Axis.XP.rotationDegrees(-90.0F));

            if (mainHandArm == HumanoidArm.RIGHT) {
                poseStack.translate(-1.0F / 16.0F, 1.0F / 8.0F, 3.0F / 16.0F);
            } else {
                poseStack.translate(1.0F / 16.0F, 1.0F / 8.0F, 3.0F / 16.0F);
            }
        }

        ItemDisplayContext context = (mainHandArm == HumanoidArm.RIGHT)
                ? ItemDisplayContext.THIRD_PERSON_RIGHT_HAND
                : ItemDisplayContext.THIRD_PERSON_LEFT_HAND;

        Minecraft.getInstance().getItemRenderer().renderStatic(
                entity,
                stack,
                context,
                mainHandArm == HumanoidArm.RIGHT,
                poseStack,
                multiBufferSource,
                entity.level(),
                light,
                OverlayTexture.NO_OVERLAY,
                0
        );

        poseStack.popPose();
    }
}