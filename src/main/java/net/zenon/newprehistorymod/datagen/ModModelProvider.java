package net.zenon.newprehistorymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.zenon.newprehistorymod.block.ModBlocks;
import net.zenon.newprehistorymod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool sapphirePool = blockStateModelGenerator.registerCubeAllModelTexturePool (ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SAPPHIRE_BLOCK);

        sapphirePool.stairs(ModBlocks.SAPPHIRE_STAIRS);
        sapphirePool.slab(ModBlocks.SAPPHIRE_SLAB);
        sapphirePool.button(ModBlocks.SAPPHIRE_BUTTON);
        sapphirePool.pressurePlate(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        sapphirePool.fence(ModBlocks.SAPPHIRE_FENCE);
        sapphirePool.fenceGate(ModBlocks.SAPPHIRE_FENCE_GATE);
        sapphirePool.wall(ModBlocks.SAPPHIRE_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.SAPPHIRE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SAPPHIRE_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUETZAL_FEATHER, Models.GENERATED);

        itemModelGenerator.register(ModItems.CANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
    }
}
