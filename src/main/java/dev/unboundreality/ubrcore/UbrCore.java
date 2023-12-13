package dev.unboundreality.ubrcore;

import dev.unboundreality.ubrcore.init.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(UbrCore.MOD_ID)
public class UbrCore {
    public static final String MOD_ID = "ubrcore";

    public UbrCore() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockItemInit.ITEMS.register(bus);
        OreInit.BLOCKS.register(bus);
        NatureInit.BLOCKS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);

    }
}
