package net.yoaan.howlingmoon_rebooted.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.yoaan.howlingmoon_rebooted.entity.custom.WerewolfEntity;
import net.yoaan.howlingmoon_rebooted.entity.variant.WerewolfVariant;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class WerewolfRenderer extends GeoEntityRenderer<WerewolfEntity> {
    public static final Map<WerewolfVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(WerewolfVariant.class), (map) -> {
                map.put(WerewolfVariant.WHITE,
                        new ResourceLocation(howlingmoon_rebooted.MOD_ID, "textures/entity/werewolf/werewolf_white.png"));
                map.put(WerewolfVariant.BLACK,
                        new ResourceLocation(howlingmoon_rebooted.MOD_ID, "textures/entity/werewolf/werewolf_black.png"));
                map.put(WerewolfVariant.KILLER,
                        new ResourceLocation(howlingmoon_rebooted.MOD_ID, "textures/entity/werewolf/werewolf_killerwolf.png"));
                map.put(WerewolfVariant.TIMBER,
                        new ResourceLocation(howlingmoon_rebooted.MOD_ID, "textures/entity/werewolf/werewolf_timber.png"));
            });

    public WerewolfRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WerewolfModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(WerewolfEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(WerewolfEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.01F, 1.0F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
