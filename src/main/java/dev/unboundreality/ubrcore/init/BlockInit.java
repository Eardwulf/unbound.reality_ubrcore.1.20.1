package dev.unboundreality.ubrcore.init;

import dev.unboundreality.ubrcore.UbrCore;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.*;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UbrCore.MOD_ID);

    public static final RegistryObject<Block> YEKRILLIAN_BLOCK = BLOCKS.register("yekrillian_block",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .strength(5.0f,15f)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .lightLevel(state -> 10)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> YEKRILLIAN_STAIRS = BLOCKS.register("yekrillian_stairs",
            () -> new StairBlock(() -> BlockInit.YEKRILLIAN_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_STAIRS)
                    .sound(SoundType.METAL)
                    .lightLevel(state -> 5)
            ));
    public static final RegistryObject<Block> YEKRILLIAN_SLAB = BLOCKS.register("yekrillian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_SLAB)
                    .sound(SoundType.METAL)
                    .lightLevel(state -> 5)
            ));

    public static final RegistryObject<Block> YEKRILLIAN_PRESSURE_PLATE = BLOCKS.register("yekrillian_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE)
                    .lightLevel(state -> 5)
                    .sound(SoundType.METAL),
                    BlockSetType.POLISHED_BLACKSTONE

            ));
    public static final RegistryObject<Block> YEKRILLIAN_BUTTON = BLOCKS.register("yekrillian_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BUTTON)
                    .lightLevel(state -> 5)
                    .sound(SoundType.METAL),
                    BlockSetType.POLISHED_BLACKSTONE, 10, true
            ));
    public static final RegistryObject<Block> YEKRILLIAN_FENCE = BLOCKS.register("yekrillian_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .lightLevel(state -> 5)
            ));
    public static final RegistryObject<Block> YEKRILLIAN_FENCE_GATE = BLOCKS.register("yekrillian_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .lightLevel(state -> 5),
                    SoundEvents.FENCE_GATE_OPEN,
                    SoundEvents.FENCE_GATE_CLOSE
            ));
    public static final RegistryObject<Block> YEKRILLIAN_WALL = BLOCKS.register("yekrillian_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .lightLevel(state -> 5)
            ));
    public static final RegistryObject<Block> YEKRILLIAN_DOOR = BLOCKS.register("yekrillian_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .lightLevel(state -> 5),
                    BlockSetType.POLISHED_BLACKSTONE
            ));
    public static final RegistryObject<Block> YEKRILLIAN_TRAPDOOR = BLOCKS.register("yekrillian_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .lightLevel(state -> 5),
                    BlockSetType.POLISHED_BLACKSTONE
            ));

}
