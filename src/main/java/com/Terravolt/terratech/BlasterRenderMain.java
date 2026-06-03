package com.Terravolt.terratech;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ArmedModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.client.ICurioRenderer;

import static net.minecraft.world.entity.player.Player.DEFAULT_MAIN_HAND;

public class BlasterRenderMain implements ICurioRenderer {

    @Override
    public <T extends LivingEntity, M extends EntityModel<T>> void render(ItemStack stack, SlotContext slotContext, PoseStack
                                                                                  matrixStack, RenderLayerParent<T, M> renderLayerParent, MultiBufferSource renderTypeBuffer, int light
            , float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch)  {
        if (DEFAULT_MAIN_HAND == HumanoidArm.LEFT) {
            HumanoidArm arm = HumanoidArm.LEFT;
            if(slotContext.entity().getMainArm() != HumanoidArm.LEFT){
                arm = HumanoidArm.RIGHT;
            }

            boolean bl = slotContext.entity().getMainArm() != arm; //false if only right hand


            if (!stack.isEmpty()) {
                matrixStack.pushPose();
//                if (renderLayerParent.getModel().young) {
//                }

                if(renderLayerParent.getModel() instanceof ArmedModel model){
                    model.translateToHand(HumanoidArm.RIGHT, matrixStack);
                }

                matrixStack.mulPose(Axis.XP.rotationDegrees(-90.0F));
                matrixStack.mulPose(Axis.YP.rotationDegrees(180.0F));
//
                matrixStack.translate(0.055, 0.125F, -0.625F);



                Minecraft.getInstance().getItemRenderer().renderStatic(slotContext.entity(), stack, ItemDisplayContext.THIRD_PERSON_RIGHT_HAND
                        , bl, matrixStack, renderTypeBuffer, slotContext.entity().level(), light, OverlayTexture.NO_OVERLAY, slotContext.entity().getId() + ItemDisplayContext.THIRD_PERSON_RIGHT_HAND.ordinal());
                matrixStack.popPose();
            }            // do stuff if it's in the first slot
        } else {

            if (DEFAULT_MAIN_HAND == HumanoidArm.RIGHT) {
                HumanoidArm arm = HumanoidArm.RIGHT;
                if(slotContext.entity().getMainArm() != HumanoidArm.RIGHT){
                    arm = HumanoidArm.LEFT;
                }

                boolean bl = slotContext.entity().getMainArm() != HumanoidArm.LEFT; //false if only right hand


                if (!stack.isEmpty()) {
                    matrixStack.pushPose();
//                if (renderLayerParent.getModel().young) {
//                }

                    if(renderLayerParent.getModel() instanceof ArmedModel model){
                        model.translateToHand(HumanoidArm.LEFT, matrixStack);
                    }

                    matrixStack.translate(-0.055, 0.125F, -0.625F);



                    matrixStack.translate((float)(bl ? -1 : 1) / 16.0F, 0.125F, -0.625F);
                    matrixStack.scale(1.2F, 1.2F, 1.2F);




                    Minecraft.getInstance().getItemRenderer().renderStatic(slotContext.entity(), stack, ItemDisplayContext.THIRD_PERSON_RIGHT_HAND
                            , bl, matrixStack, renderTypeBuffer, slotContext.entity().level(), light, OverlayTexture.NO_OVERLAY, slotContext.entity().getId() + ItemDisplayContext.THIRD_PERSON_RIGHT_HAND.ordinal());
                    matrixStack.popPose();
                }

    }}}}