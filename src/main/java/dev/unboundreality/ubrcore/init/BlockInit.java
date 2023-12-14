package dev.unboundreality.ubrcore.init;

import dev.unboundreality.ubrcore.UbrCore;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.*;

import net.minecraft.world.level.block.grower.DarkOakTreeGrower;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UbrCore.MOD_ID);

    public static final RegistryObject<Block> YEKRILLIAN_BLOCK = BLOCKS.register("yekrillian_block",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .strength(5.0f,15f)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .lightLevel(state -> 10)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YEKRILLIAN_STAIRS = BLOCKS.register("yekrillian_stairs",
            () -> new StairBlock(() -> BlockInit.YEKRILLIAN_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_STAIRS)
                    .sound(SoundType.METAL)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> YEKRILLIAN_SLAB = BLOCKS.register("yekrillian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_SLAB)
                    .sound(SoundType.METAL)
                    .lightLevel(state -> 5)));

    public static final RegistryObject<Block> YEKRILLIAN_PRESSURE_PLATE = BLOCKS.register("yekrillian_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE)
                    .lightLevel(state -> 5)
                    .sound(SoundType.METAL),
                    BlockSetType.POLISHED_BLACKSTONE));
    public static final RegistryObject<Block> YEKRILLIAN_BUTTON = BLOCKS.register("yekrillian_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BUTTON)
                    .lightLevel(state -> 5)
                    .sound(SoundType.METAL),
                    BlockSetType.POLISHED_BLACKSTONE, 10, true));
    public static final RegistryObject<Block> YEKRILLIAN_WALL = BLOCKS.register("yekrillian_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> YEKRILLIAN_DOOR = BLOCKS.register("yekrillian_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .lightLevel(state -> 5),
                    BlockSetType.POLISHED_BLACKSTONE));
    public static final RegistryObject<Block> YEKRILLIAN_TRAPDOOR = BLOCKS.register("yekrillian_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .lightLevel(state -> 5),
                    BlockSetType.POLISHED_BLACKSTONE));
    public static final RegistryObject<Block> YEKRILLIAN_WIRE = BLOCKS.register("yekrillian_wire",
            () -> new RedStoneWireBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> YEKRILLIAN_lAMP = BLOCKS.register("yekrillian_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel(state -> 15)));
    public static final RegistryObject<Block> YEKRILLIAN_TORCH = BLOCKS.register("yekrillian_torch",
            () -> new RedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH)));
    public static final RegistryObject<Block> YEKRILLIAN_WALL_TORCH = BLOCKS.register("yekrillian_wall_torch",
            () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_WALL_TORCH)));

//TREES

    public static final RegistryObject<Block> AETHER_WARPED_OAK_LOG = BLOCKS.register("aether_warped_oak_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_STRIPPED_OAK_LOG = BLOCKS.register("aether_warped_stripped_oak_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_STRIPPED_OAK_WOOD = BLOCKS.register("aether_warped_stripped_oak_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_OAK_PLANKS = BLOCKS.register("aether_warped_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_OAK_LEAVES = BLOCKS.register("aether_warped_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_OAK_SAPLING = BLOCKS.register("aether_warped_oak_sapling",
            () -> new SaplingBlock(new OakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                    .lightLevel(state -> 2)));
    public static final RegistryObject<Block> AETHER_WARPED_OAK_STAIRS = BLOCKS.register("aether_warped_oak_stairs",
            () -> new StairBlock(() -> BlockInit.AETHER_WARPED_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_OAK_SLAB = BLOCKS.register("aether_warped_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_OAK_PRESSURE_PLATE = BLOCKS.register("aether_warped_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).lightLevel(state ->5).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> AETHER_WARPED_OAK_BUTTON = BLOCKS.register("aether_warped_oak_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> AETHER_WARPED_OAK_FENCE = BLOCKS.register("aether_warped_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> AETHER_WARPED_OAK_FENCE_GATE = BLOCKS.register("aether_warped_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> AETHER_WARPED_OAK_DOOR = BLOCKS.register("aether_warped_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.IRON));
    public static final RegistryObject<Block> AETHER_WARPED_OAK_TRAPDOOR = BLOCKS.register("aether_warped_oak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.IRON));
    public static final RegistryObject<Block> AETHER_WARPED_DARK_OAK_LOG = BLOCKS.register("aether_warped_dark_oak_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_STRIPPED_DARK_OAK_LOG = BLOCKS.register("aether_warped_stripped_dark_oak_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_STRIPPED_DARK_OAK_WOOD = BLOCKS.register("aether_warped_stripped_dark_oak_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_DARK_OAK_PLANKS = BLOCKS.register("aether_warped_dark_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_DARK_OAK_LEAVES = BLOCKS.register("aether_warped_dark_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LEAVES)
                    .lightLevel(state -> 5)));
    public static final RegistryObject<Block> AETHER_WARPED_DARK_OAK_SAPLING = BLOCKS.register("aether_warped_dark_oak_sapling",
            () -> new SaplingBlock(new DarkOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SAPLING)
                    .lightLevel(state -> 2)));

}
