package com.axperty.toomanypaintings;

import com.axperty.toomanypaintings.paintings.ModPaintings;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TooManyPaintings.MOD_ID)
public class TooManyPaintings {
    public static final String MOD_ID = "toomanypaintings";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TooManyPaintings() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModPaintings.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        System.out.println("Too Many Paintings! loaded");
    }
}
