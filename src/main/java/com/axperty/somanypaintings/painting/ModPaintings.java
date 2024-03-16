package com.axperty.somanypaintings.painting;

import com.axperty.somanypaintings.SoManyPaintings;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintings {
    public static final PaintingVariant LANDSCAPE = registerPainting("landscape", new PaintingVariant(32, 16));
    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(SoManyPaintings.MODID, name), paintingVariant);
    }
    public static void registerPaintings() {
        SoManyPaintings.LOGGER.debug("Registering paintings for " + SoManyPaintings.MODID);
    }
}
