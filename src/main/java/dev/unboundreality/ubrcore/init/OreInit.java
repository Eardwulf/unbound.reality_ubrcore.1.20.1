package dev.unboundreality.ubrcore.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import dev.unboundreality.ubrcore.UbrCore;

public class OreInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UbrCore.MOD_ID);

    public static final RegistryObject<Block> ADAMANTIUM_ORE = BLOCKS.register("adamantium_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    //.strength(5.0f,15f)
                    //.instrument(NoteBlockInstrument.BASEDRUM)
                    //.lightLevel(state -> 10)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> LECITE_ORE = BLOCKS.register("lecite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_LECITE_ORE = BLOCKS.register("deepslate_lecite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> CORSIUM_ORE = BLOCKS.register("corsium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_CORSIUM_ORE = BLOCKS.register("deepslate_corsium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> KRAORIUM_ORE = BLOCKS.register("kraorium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_KRAORIUM_ORE = BLOCKS.register("deepslate_kraorium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DRIERIUM_ORE = BLOCKS.register("drierium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_DRIERIUM_ORE = BLOCKS.register("deepslate_drierium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> OSMEASIUM_ORE = BLOCKS.register("osmeasium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_OSMEASIUM_ORE = BLOCKS.register("deepslate_osmeasium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> YEKRIL_ORE = BLOCKS.register("yekril_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_YEKRIL_ORE = BLOCKS.register("deepslate_yekril_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> ELECTRUM_ORE = BLOCKS.register("electrum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_ELECTRUM_ORE = BLOCKS.register("deepslate_electrum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> ORICHALCUM_ORE = BLOCKS.register("orichalcum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_ORICHALCUM_ORE = BLOCKS.register("deepslate_orichalcum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_ADAMANTIUM_ORE = BLOCKS.register("deepslate_adamantium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> MITHRIL_ORE = BLOCKS.register("mithril_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_MITHRIL_ORE = BLOCKS.register("deepslate_mithril_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .requiresCorrectToolForDrops()
            ));
}
