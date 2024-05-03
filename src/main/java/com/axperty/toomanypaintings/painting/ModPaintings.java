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
    public static final PaintingVariant CHERRY_MOUNTAINS = registerPainting("cherry_mountains", new PaintingVariant(32, 32));
    public static final PaintingVariant CLOCKS = registerPainting("clocks", new PaintingVariant(32, 16));
    public static final PaintingVariant CORNFIELD = registerPainting("cornfield", new PaintingVariant(32, 32));
    public static final PaintingVariant COW = registerPainting("cow", new PaintingVariant(16, 16));
    public static final PaintingVariant CREATION = registerPainting("creation", new PaintingVariant(32, 16));
    public static final PaintingVariant DROWNED = registerPainting("drowned", new PaintingVariant(16, 16));
    public static final PaintingVariant EARTH = registerPainting("earth", new PaintingVariant(32, 32));
    public static final PaintingVariant ENDERMAN = registerPainting("enderman", new PaintingVariant(16, 16));
    public static final PaintingVariant FRENCH = registerPainting("french", new PaintingVariant(32, 16));
    public static final PaintingVariant FRIDA = registerPainting("frida", new PaintingVariant(16, 32));
    public static final PaintingVariant GALAXY = registerPainting("galaxy", new PaintingVariant(32, 32));
    public static final PaintingVariant GHAST = registerPainting("ghast", new PaintingVariant(16, 16));
    public static final PaintingVariant GIORGIO = registerPainting("giorgio", new PaintingVariant(32, 16));
    public static final PaintingVariant HOUSE = registerPainting("house", new PaintingVariant(32, 32));
    public static final PaintingVariant LADY = registerPainting("lady", new PaintingVariant(16, 32));
    public static final PaintingVariant LANDSCAPE = registerPainting("landscape", new PaintingVariant(32, 16));
    public static final PaintingVariant LISA = registerPainting("lisa", new PaintingVariant(16, 32));
    public static final PaintingVariant LOVERS = registerPainting("lovers", new PaintingVariant(32, 32));
    public static final PaintingVariant MOUNTAINS = registerPainting("mountains", new PaintingVariant(32, 16));
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
    // Version 1.0.1
    public static final PaintingVariant LONELY_TREE = registerPainting("lonely_tree", new PaintingVariant(32, 32));
    public static final PaintingVariant CHERRY_TREE = registerPainting("cherry_tree", new PaintingVariant(32, 32));
    public static final PaintingVariant WATERFALL = registerPainting("waterfall", new PaintingVariant(32, 32));
    public static final PaintingVariant CABIN = registerPainting("cabin", new PaintingVariant(32, 32));
    public static final PaintingVariant FOREST = registerPainting("forest", new PaintingVariant(32, 32));
    public static final PaintingVariant BLACK_CAT = registerPainting("black_cat", new PaintingVariant(16, 16));
    public static final PaintingVariant PENGUINS = registerPainting("penguins", new PaintingVariant(32, 32));
    public static final PaintingVariant RED_FLOWER = registerPainting("red_flower", new PaintingVariant(32, 32));
    public static final PaintingVariant RIVER = registerPainting("river", new PaintingVariant(32, 32));
    public static final PaintingVariant CASTLE = registerPainting("castle", new PaintingVariant(32, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(TooManyPaintings.MODID, name), paintingVariant);
    }
    public static void registerPaintings() {
        TooManyPaintings.LOGGER.debug("Registering paintings for " + TooManyPaintings.MODID);
    }
}
