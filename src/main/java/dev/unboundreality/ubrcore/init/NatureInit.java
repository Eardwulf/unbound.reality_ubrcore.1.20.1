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

public class NatureInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UbrCore.MOD_ID);

    public static final RegistryObject<Block> CRYSTALLINE_THERA_PLANT = BLOCKS.register("sperieite_plant",
            () -> new BushBlock(BlockBehaviour.Properties.copy(Blocks.ALLIUM))
            //Earth Element
    );
    public static final RegistryObject<Block> CRYSTALLINE_CENDIS_PLANT = BLOCKS.register("alarltite_plant",
            () -> new BushBlock(BlockBehaviour.Properties.copy(Blocks.ALLIUM))
            //Fire Element
    );

    public static final RegistryObject<Block> CRYSTALLINE_SEPTOS_PLANT = BLOCKS.register("freigarite_plant",
            () -> new BushBlock(BlockBehaviour.Properties.copy(Blocks.ALLIUM))
            //Magic Element
    );
}
