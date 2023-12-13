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
    public static final RegistryObject<Item> YEKRILLIAN = CreativeTabInit.addToTab(ITEMS.register("yekrillian",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> YEKRILLIAN_POWDER = CreativeTabInit.addToTab(ITEMS.register("yekrillian_powder",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> SPERIEITE_SHARD = CreativeTabInit.addToTab(ITEMS.register("sperieite_shard",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> ALARLTITE_SHARD = CreativeTabInit.addToTab(ITEMS.register("alarltite_shard",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> HERDRAMITE_SHARD = CreativeTabInit.addToTab(ITEMS.register("herdramite_shard",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> FREIGARITE_SHARD = CreativeTabInit.addToTab(ITEMS.register("freigarite_shard",
            () -> new Item(new Item.Properties())));

    //Plants
    //public static final RegistryObject<BlockItem> SPERIEITE_PLANT_ITEM = addToTab(ITEMS.register("sperieite_plant",
      //      () -> new BlockItem(BlockInit.SPERIEITE_PLANT.get(), new Item.Properties())));

    //Blocks

}
