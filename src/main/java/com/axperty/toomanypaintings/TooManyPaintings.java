package com.axperty.toomanypaintings;

import com.axperty.toomanypaintings.painting.ModPaintings;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TooManyPaintings implements ModInitializer {
    public static final String MODID = "toomanypaintings";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        ModPaintings.registerPaintings();
        System.out.println("Too Many Paintings! loaded");
    }
}
