package net.zenon.newprehistorymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zenon.newprehistorymod.NewPrehistoryMod;
import net.zenon.newprehistorymod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SAPPHIRE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NewPrehistoryMod.MOD_ID, "sapphire"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sapphire"))
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.RAW_SAPPHIRE);
                        entries.add(ModItems.QUETZAL_FEATHER);
                        entries.add(ModItems.CORN);
                        entries.add(ModItems.CANE);

                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.RAW_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_ORE);

                    }).build());


    public static void registerItemGroups () {
        NewPrehistoryMod.LOGGER.info("Registering Item Groups for" + NewPrehistoryMod.MOD_ID);
    }
}
