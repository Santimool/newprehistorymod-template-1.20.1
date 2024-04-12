package net.zenon.newprehistorymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.zenon.newprehistorymod.NewPrehistoryMod;

public class ModBlocks {
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f),
                    UniformIntProvider.create(3, 6)));

    public static final Block SAPPHIRE_STAIRS = registerBlock("sapphire_stairs",
            new StairsBlock(ModBlocks.SAPPHIRE_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SAPPHIRE_SLAB = registerBlock("sapphire_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


    public static final Block SAPPHIRE_BUTTON = registerBlock("sapphire_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block SAPPHIRE_PRESSURE_PLATE = registerBlock("sapphire_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON));

    public static final Block SAPPHIRE_FENCE = registerBlock("sapphire_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SAPPHIRE_FENCE_GATE = registerBlock("sapphire_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), WoodType.OAK));
    public static final Block SAPPHIRE_WALL = registerBlock("sapphire_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block SAPPHIRE_DOOR = registerBlock("sapphire_block",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON));
    public static final Block SAPPHIRE_TRAPDOOR = registerBlock("sapphire_block",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NewPrehistoryMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NewPrehistoryMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        NewPrehistoryMod.LOGGER.info("Registering ModBlocks for" + NewPrehistoryMod.MOD_ID);
    }
}
