package com.axperty.toomanypaintings;


import com.axperty.toomanypaintings.painting.ModPaintings;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TooManyPaintings implements ModInitializer {
    public static final String MODID = "toomanypaintings";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID, "group"));

    @Override
    public void onInitialize() {
        ModPaintings.registerPaintings();
    }
}
