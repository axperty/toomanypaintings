package com.axperty.toomanypaintings.paintings;

import com.axperty.toomanypaintings.TooManyPaintings;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, TooManyPaintings.MOD_ID);

    public static final RegistryObject<PaintingVariant> AFTERNOON = PAINTING_VARIANTS.register("afternoon",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> ALLAY = PAINTING_VARIANTS.register("allay",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> AMERICAN = PAINTING_VARIANTS.register("american",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> ATENEAH = PAINTING_VARIANTS.register("ateneah",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> AXPERTY = PAINTING_VARIANTS.register("axperty",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> BEE = PAINTING_VARIANTS.register("bee",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> BENDA = PAINTING_VARIANTS.register("benda",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> CAFE = PAINTING_VARIANTS.register("cafe",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> CLOCKS = PAINTING_VARIANTS.register("clocks",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> COW = PAINTING_VARIANTS.register("cow",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> CREATION = PAINTING_VARIANTS.register("creation",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> DROWNED = PAINTING_VARIANTS.register("drowned",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> EARTH_FAR_AWAY = PAINTING_VARIANTS.register("earth_far_away",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> ENDERMAN = PAINTING_VARIANTS.register("enderman",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> FRENCH = PAINTING_VARIANTS.register("french",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> GHAST = PAINTING_VARIANTS.register("ghast",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> GIORGIO = PAINTING_VARIANTS.register("giorgio",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> LADY = PAINTING_VARIANTS.register("lady",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> LISA = PAINTING_VARIANTS.register("lisa",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> LOVERS = PAINTING_VARIANTS.register("lovers",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> NIGHT = PAINTING_VARIANTS.register("night",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> PIG = PAINTING_VARIANTS.register("pig",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> PILLARS = PAINTING_VARIANTS.register("pillars",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> RAIN = PAINTING_VARIANTS.register("rain",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> RING = PAINTING_VARIANTS.register("ring",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> SCHOOL = PAINTING_VARIANTS.register("school",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> SCREAM = PAINTING_VARIANTS.register("scream",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> SHEEP = PAINTING_VARIANTS.register("sheep",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> SKELETON = PAINTING_VARIANTS.register("skeleton",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> SLIME = PAINTING_VARIANTS.register("slime",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> SNOW_GOLEM = PAINTING_VARIANTS.register("snow_golem",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> SON = PAINTING_VARIANTS.register("son",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> SPIDER = PAINTING_VARIANTS.register("spider",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> SQUARES = PAINTING_VARIANTS.register("squares",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> STARRY_NIGHT = PAINTING_VARIANTS.register("starry_night",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> STEVE = PAINTING_VARIANTS.register("steve",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> STRAY = PAINTING_VARIANTS.register("stray",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> VILLAGER = PAINTING_VARIANTS.register("villager",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> WAVE = PAINTING_VARIANTS.register("wave",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> WHEAT_FIELD = PAINTING_VARIANTS.register("wheat_field",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> WITHER_SKELETON = PAINTING_VARIANTS.register("wither_skeleton",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> ZOMBIE = PAINTING_VARIANTS.register("zombie",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> ZOMBIE_PIGMAN = PAINTING_VARIANTS.register("zombie_pigman",
            () -> new PaintingVariant(16, 16));

    // New added paintings

    // New added paintings

    // New added paintings
    public static final RegistryObject<PaintingVariant> RENIBOND = PAINTING_VARIANTS.register("renibond",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> TAKEAMUKE = PAINTING_VARIANTS.register("takeamuke",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> KARMA = PAINTING_VARIANTS.register("karma",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> FEDERICO = PAINTING_VARIANTS.register("federico",
            () -> new PaintingVariant(32, 32));

    // New added paintings
    public static final RegistryObject<PaintingVariant> FRIDA = PAINTING_VARIANTS.register("frida",
            () -> new PaintingVariant(16, 32));


    // New added paintings
    public static final RegistryObject<PaintingVariant> ANCIENT_DAYS = PAINTING_VARIANTS.register("ancient_days",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> ARTHEMIS = PAINTING_VARIANTS.register("arthemis",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> AUTOMAT = PAINTING_VARIANTS.register("automat",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> BALCONY = PAINTING_VARIANTS.register("balcony",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> DESPERATE = PAINTING_VARIANTS.register("desperate",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> EARTH_RISE = PAINTING_VARIANTS.register("earth_rise",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> FALSE_MIRROR = PAINTING_VARIANTS.register("false_mirror",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> GARDEN = PAINTING_VARIANTS.register("garden",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> MENINAS = PAINTING_VARIANTS.register("meninas",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> MILKMAID = PAINTING_VARIANTS.register("milkmaid",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> MORNING = PAINTING_VARIANTS.register("morning",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> NARCISSUS = PAINTING_VARIANTS.register("narcissus",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> NOT_REPRODUCED = PAINTING_VARIANTS.register("not_reproduced",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> PIAZZA = PAINTING_VARIANTS.register("piazza",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> RIDER = PAINTING_VARIANTS.register("rider",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> SELF_PORTRAIT = PAINTING_VARIANTS.register("self_portrait",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> SWING = PAINTING_VARIANTS.register("swing",
            () -> new PaintingVariant(16, 32));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
