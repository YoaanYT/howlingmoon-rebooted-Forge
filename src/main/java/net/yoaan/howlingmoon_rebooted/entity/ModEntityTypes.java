package net.yoaan.howlingmoon_rebooted.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yoaan.howlingmoon_rebooted.entity.custom.WerewolfEntity;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, howlingmoon_rebooted.MOD_ID);

    public static final RegistryObject<EntityType<WerewolfEntity>> WEREWOLF = ENTITY_TYPES.register("werewolf",
            () -> EntityType.Builder.of(WerewolfEntity::new, MobCategory.MONSTER)
                    .sized(1.01f, 1.01f)
                    .build(new ResourceLocation(howlingmoon_rebooted.MOD_ID, "werewolf").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}