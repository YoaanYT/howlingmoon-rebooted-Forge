package net.yoaan.howlingmoon_rebooted.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.yoaan.howlingmoon_rebooted.entity.custom.WerewolfEntity;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class WerewolfModel extends AnimatedGeoModel<WerewolfEntity> {
    @Override
    public ResourceLocation getModelLocation(WerewolfEntity object) {
        return new ResourceLocation(howlingmoon_rebooted.MOD_ID, "geo/werewolf.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(WerewolfEntity object) {
        return WerewolfRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(WerewolfEntity animatable) {
        return new ResourceLocation(howlingmoon_rebooted.MOD_ID, "animations/werewolf.animation.json");
    }
}
