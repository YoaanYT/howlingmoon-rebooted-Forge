package net.yoaan.howlingmoon_rebooted.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;;
import net.yoaan.howlingmoon_rebooted.entity.ModEntityTypes;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, howlingmoon_rebooted.MOD_ID);

            public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
                    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

            public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
                    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

            public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
                    () -> new SwordItem(ModTiers.SILVER, 4, -2.4f,
            new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

            public static final RegistryObject<Item> LOREBOOK = ITEMS.register("lorebook",
                    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

            public static final RegistryObject<Item> WOLFFANGS = ITEMS.register("wolffangs",
                    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

            public static final RegistryObject<Item> LYCANTHROPEBOOK = ITEMS.register("lycanthropebook",
                    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

            public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
                    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

            public static final RegistryObject<Item> POTION_WOLFSBANE = ITEMS.register("potion_wolfsbane",
                    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModTiers.SILVER, 8, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModTiers.SILVER, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModTiers.SILVER, 1, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModTiers.SILVER, 2, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> WEREWOLF_SPAWN_EGG = ITEMS.register("werewolf_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.WEREWOLF,0xFFFFFF, 0x111111,
                    new Item.Properties().tab(ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
   }
}
