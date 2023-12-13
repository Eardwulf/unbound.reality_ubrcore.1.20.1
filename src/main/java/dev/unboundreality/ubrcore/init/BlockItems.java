package dev.unboundreality.ubrcore.init;

import dev.unboundreality.ubrcore.UbrCore;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UbrCore.MOD_ID);

    //Block Items
    public static final RegistryObject<BlockItem> ADAMANTIUME_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("adamantium_ore",
            () -> new BlockItem(OreInit.ADAMANTIUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> LECITE_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("lecite_ore",
            () -> new BlockItem(OreInit.LECITE_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> DEEPSLATE_LECITE_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("deepslate_lecite_ore",
            () -> new BlockItem(OreInit.DEEPSLATE_LECITE_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> CORSIUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("corsium_ore",
            () -> new BlockItem(OreInit.CORSIUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> DEEPSLATE_CORSIUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("deepslate_corsium_ore",
            () -> new BlockItem(OreInit.DEEPSLATE_CORSIUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> KRAORIUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("kraorium_ore",
            () -> new BlockItem(OreInit.KRAORIUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> DEEPSLATE_KRAORIUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("deepslate_kraorium_ore",
            () -> new BlockItem(OreInit.DEEPSLATE_KRAORIUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> DRIERIUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("drierium_ore",
            () -> new BlockItem(OreInit.DRIERIUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> DEEPSLATE_DRIERIUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("deepslate_drierium_ore",
            () -> new BlockItem(OreInit.DEEPSLATE_DRIERIUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> OSMEASIUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("osmeasium_ore",
            () -> new BlockItem(OreInit.OSMEASIUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> DEEPSLATE_OSMEASIUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("deepslate_osmeasium_ore",
            () -> new BlockItem(OreInit.DEEPSLATE_OSMEASIUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> YEKRIL_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("yekril_ore",
            () -> new BlockItem(OreInit.YEKRIL_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> DEEPSLATE_YEKRIL_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("deepslate_yekril_ore",
            () -> new BlockItem(OreInit.DEEPSLATE_YEKRIL_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> ELECTRUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("electrum_ore",
            () -> new BlockItem(OreInit.ELECTRUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> DEEPSLATE_ELECTRUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("deepslate_electrum_ore",
            () -> new BlockItem(OreInit.DEEPSLATE_ELECTRUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> ORICHALCUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("orichalcum_ore",
            () -> new BlockItem(OreInit.ORICHALCUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> DEEPSLATE_ORICHALCUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("deepslate_orichalcum_ore",
            () -> new BlockItem(OreInit.DEEPSLATE_ORICHALCUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> DEEPSLATE_ADAMANTIUM_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("deepslate_adamantium_ore",
            () -> new BlockItem(OreInit.DEEPSLATE_ADAMANTIUM_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> MITHRIL_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("mithril_ore",
            () -> new BlockItem(OreInit.MITHRIL_ORE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> DEEPSLATE_MITHRIL_ORE_ITEM = CreativeTabInit.addToTab(ITEMS.register("deepslate_mithril_ore",
            () -> new BlockItem(OreInit.DEEPSLATE_MITHRIL_ORE.get(), new Item.Properties())));
}
