package dev.unboundreality.ubrcore.init;

import dev.unboundreality.ubrcore.UbrCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UbrCore.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> UBR_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> UBR_TAB = TABS.register("ubr_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.ubr_tab"))
                    .icon((ItemInit.REDSTONE_ORB.get()::getDefaultInstance))
                    //.icon(() -> new ItemStack(ItemInit.REDSTONE_ORB.get()))
                    .displayItems((displayParams, output) -> {
                        UBR_TAB_ITEMS.forEach(ItemLike -> output.accept(ItemLike.get()));
                        //output.accept(ItemInit.REDSTONE_ORB.get());
                    })
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> ItemLike) {
        UBR_TAB_ITEMS.add(ItemLike);
        return ItemLike;
    }
}
