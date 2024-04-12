package net.zenon.newprehistorymod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.zenon.newprehistorymod.block.ModBlocks;
import net.zenon.newprehistorymod.item.ModItemGroups;
import net.zenon.newprehistorymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewPrehistoryMod implements ModInitializer {
    public static final String MOD_ID = "newprehistorymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.CANE, 600);
	}
}