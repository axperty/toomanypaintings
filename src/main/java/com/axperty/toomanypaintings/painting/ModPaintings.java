package com.axperty.toomanypaintings.painting;

import com.axperty.toomanypaintings.TooManyPaintings;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintings {
    public static final PaintingVariant AFTERNOON = registerPainting("afternoon", new PaintingVariant(32, 32));
    public static final PaintingVariant ALLAY = registerPainting("allay", new PaintingVariant(16, 16));
    public static final PaintingVariant AMERICAN = registerPainting("american", new PaintingVariant(16, 32));
    public static final PaintingVariant ATENEAH = registerPainting("ateneah", new PaintingVariant(16, 16));
    public static final PaintingVariant AXPERTY = registerPainting("axperty", new PaintingVariant(16, 16));
    public static final PaintingVariant BEACH = registerPainting("beach", new PaintingVariant(32, 32));
    public static final PaintingVariant BEE = registerPainting("bee", new PaintingVariant(16, 16));
    public static final PaintingVariant BENDA = registerPainting("benda", new PaintingVariant(16, 16));
    public static final PaintingVariant CAFE = registerPainting("cafe", new PaintingVariant(16, 32));
    public static final PaintingVariant CLOCKS = registerPainting("clocks", new PaintingVariant(32, 16));
    public static final PaintingVariant COW = registerPainting("cow", new PaintingVariant(16, 16));
    public static final PaintingVariant CREATION = registerPainting("creation", new PaintingVariant(32, 16));
    public static final PaintingVariant DROWNED = registerPainting("drowned", new PaintingVariant(16, 16));
    public static final PaintingVariant EARTH = registerPainting("earth", new PaintingVariant(32, 32));
    public static final PaintingVariant ENDERMAN = registerPainting("enderman", new PaintingVariant(16, 16));
    public static final PaintingVariant FRENCH = registerPainting("french", new PaintingVariant(32, 16));
    public static final PaintingVariant GHAST = registerPainting("ghast", new PaintingVariant(16, 16));
    public static final PaintingVariant GIORGIO = registerPainting("giorgio", new PaintingVariant(32, 16));
    public static final PaintingVariant LADY = registerPainting("lady", new PaintingVariant(16, 32));
    public static final PaintingVariant LISA = registerPainting("lisa", new PaintingVariant(16, 32));
    public static final PaintingVariant LOVERS = registerPainting("lovers", new PaintingVariant(32, 32));
    public static final PaintingVariant NIGHT = registerPainting("night", new PaintingVariant(32, 16));
    public static final PaintingVariant PIG = registerPainting("pig", new PaintingVariant(16, 16));
    public static final PaintingVariant PILLARS = registerPainting("pillars", new PaintingVariant(32, 32));
    public static final PaintingVariant RAIN = registerPainting("rain", new PaintingVariant(16, 32));
    public static final PaintingVariant RING = registerPainting("ring", new PaintingVariant(32, 32));
    public static final PaintingVariant SCHOOL = registerPainting("school", new PaintingVariant(32, 16));
    public static final PaintingVariant SCREAM = registerPainting("scream", new PaintingVariant(32, 32));
    public static final PaintingVariant SHEEP = registerPainting("sheep", new PaintingVariant(16, 16));
    public static final PaintingVariant SKELETON = registerPainting("skeleton", new PaintingVariant(16, 16));
    public static final PaintingVariant SLIME = registerPainting("slime", new PaintingVariant(16, 16));
    public static final PaintingVariant SNOW_GOLEM = registerPainting("snow_golem", new PaintingVariant(16, 16));
    public static final PaintingVariant SON = registerPainting("son", new PaintingVariant(16, 32));
    public static final PaintingVariant SPIDER = registerPainting("spider", new PaintingVariant(16, 16));
    public static final PaintingVariant SQUARES = registerPainting("squares", new PaintingVariant(32, 32));
    public static final PaintingVariant STARRY_NIGHT = registerPainting("starry_night", new PaintingVariant(32, 16));
    public static final PaintingVariant STEVE = registerPainting("steve", new PaintingVariant(16, 16));
    public static final PaintingVariant STRAY = registerPainting("stray", new PaintingVariant(16, 16));
    public static final PaintingVariant VILLAGER = registerPainting("villager", new PaintingVariant(16, 16));
    public static final PaintingVariant WAVE = registerPainting("wave", new PaintingVariant(32, 16));
    public static final PaintingVariant WHEAT_FIELD = registerPainting("wheat_field", new PaintingVariant(32, 16));
    public static final PaintingVariant WITHER_SKELETON = registerPainting("wither_skeleton", new PaintingVariant(16, 16));
    public static final PaintingVariant ZOMBIE = registerPainting("zombie", new PaintingVariant(16, 16));
    public static final PaintingVariant ZOMBIE_PIGMAN = registerPainting("zombie_pigman", new PaintingVariant(16, 16));

    // New added paintings
    public static final PaintingVariant RENIBOND = registerPainting("renibond", new PaintingVariant(16, 16));
    public static final PaintingVariant TAKEAMUKE = registerPainting("takeamuke", new PaintingVariant(16, 16));
    public static final PaintingVariant KARMA = registerPainting("karma", new PaintingVariant(16, 16));
    public static final PaintingVariant FEDERICO = registerPainting("federico", new PaintingVariant(32, 32));

    // New added paintings
    public static final PaintingVariant FRIDA = registerPainting("frida", new PaintingVariant(16, 32));

    // New added paintings
    public static final PaintingVariant ANCIENT_DAYS = registerPainting("ancient_days", new PaintingVariant(16, 32));
    public static final PaintingVariant ARTHEMIS = registerPainting("arthemis", new PaintingVariant(32, 32));
    public static final PaintingVariant AUTOMAT = registerPainting("automat", new PaintingVariant(32, 16));
    public static final PaintingVariant BALCONY = registerPainting("balcony", new PaintingVariant(32, 32));
    public static final PaintingVariant DESPERATE = registerPainting("desperate", new PaintingVariant(16, 16));
    public static final PaintingVariant EARTH_RISE = registerPainting("earth_rise", new PaintingVariant(32, 32));
    public static final PaintingVariant FALSE_MIRROR = registerPainting("false_mirror", new PaintingVariant(32, 16));
    public static final PaintingVariant GARDEN = registerPainting("garden", new PaintingVariant(32, 32));
    public static final PaintingVariant MENINAS = registerPainting("meninas", new PaintingVariant(32, 32));
    public static final PaintingVariant MILKMAID = registerPainting("milkmaid", new PaintingVariant(32, 32));
    public static final PaintingVariant MORNING = registerPainting("morning", new PaintingVariant(16, 16));
    public static final PaintingVariant NARCISSUS = registerPainting("narcissus", new PaintingVariant(32, 32));
    public static final PaintingVariant NOT_REPRODUCED = registerPainting("not_reproduced", new PaintingVariant(16, 32));
    public static final PaintingVariant PIAZZA = registerPainting("piazza", new PaintingVariant(32, 32));
    public static final PaintingVariant RIDER = registerPainting("rider", new PaintingVariant(16, 16));
    public static final PaintingVariant SELF_PORTRAIT = registerPainting("self_portrait", new PaintingVariant(32, 32));
    public static final PaintingVariant SWING = registerPainting("swing", new PaintingVariant(16, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(TooManyPaintings.MODID, name), paintingVariant);
    }
    public static void registerPaintings() {}
}
