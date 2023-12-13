package dev.unboundreality.ubrcore.init;

import dev.unboundreality.ubrcore.UbrCore;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UbrCore.MOD_ID);

    //Items
    public static final RegistryObject<Item> REDSTONE_ORB = CreativeTabInit.addToTab(ITEMS.register("redstone_orb",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC)
            )));
    public static final RegistryObject<Item> YEKRILLIAN_ORB = CreativeTabInit.addToTab(ITEMS.register("yekrillian_orb",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC)
            )));

    //Foods
    public static final RegistryObject<Item> CHAGAR = CreativeTabInit.addToTab(ITEMS.register("chagar",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .build())
            )));

    //Ingots
    public static final RegistryObject<Item> LECITE_INGOT = CreativeTabInit.addToTab(ITEMS.register("lecite_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> CORSIUM_INGOT = CreativeTabInit.addToTab(ITEMS.register("corsium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> ECRUM_INGOT = CreativeTabInit.addToTab(ITEMS.register("ecrum_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> BROYNIUM_INGOT = CreativeTabInit.addToTab(ITEMS.register("broynium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> OBRALT_INGOT = CreativeTabInit.addToTab(ITEMS.register("obralt_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> ELECTRUM_INGOT = CreativeTabInit.addToTab(ITEMS.register("electrum_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> ORICHALCUM_INGOT = CreativeTabInit.addToTab(ITEMS.register("orichalcum_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> ADAMANTIUM_INGOT = CreativeTabInit.addToTab(ITEMS.register("adamantium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> MITHRIL_INGOT = CreativeTabInit.addToTab(ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties())));

    //Crystal Byproducts
    public static final RegistryObject<Item> YEKILLIAN = CreativeTabInit.addToTab(ITEMS.register("yekillian",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> YEKILLIAN_POWDER = CreativeTabInit.addToTab(ITEMS.register("yekillian_powder",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> SPERIEITE_SHARD = CreativeTabInit.addToTab(ITEMS.register("sperieite_shard",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> ALARLTITE_SHARD = CreativeTabInit.addToTab(ITEMS.register("alarltite_shard",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> HERDRAMITE_SHARD = CreativeTabInit.addToTab(ITEMS.register("herdramite_shard",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> FREIGARITE_SHARD = CreativeTabInit.addToTab(ITEMS.register("freigarite_shard",
            () -> new Item(new Item.Properties())));

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

    //Plants
    //public static final RegistryObject<BlockItem> SPERIEITE_PLANT_ITEM = addToTab(ITEMS.register("sperieite_plant",
      //      () -> new BlockItem(BlockInit.SPERIEITE_PLANT.get(), new Item.Properties())));

    //Blocks

}
