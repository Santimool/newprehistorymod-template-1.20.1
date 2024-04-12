package net.zenon.newprehistorymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.zenon.newprehistorymod.block.ModBlocks;
import net.zenon.newprehistorymod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.SAPPHIRE_GROUP)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL);
    }
}
