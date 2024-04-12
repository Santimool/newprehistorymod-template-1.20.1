package net.zenon.newprehistorymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zenon.newprehistorymod.NewPrehistoryMod;

public class ModItems {
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire", new Item(new FabricItemSettings()));
    public static final Item CORN = registerItem("corn", new Item(new FabricItemSettings().food(ModFoodComponents.CORN)));
    public static final Item CANE = registerItem("cane",
            new Item(new FabricItemSettings()));
    public static final Item QUETZAL_FEATHER = registerItem("quetzal_feather", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SAPPHIRE);
        entries.add(RAW_SAPPHIRE);
        entries.add(QUETZAL_FEATHER);
        entries.add(CORN);
        entries.add(CANE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NewPrehistoryMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NewPrehistoryMod.LOGGER.info("Registering Mod Items for " + NewPrehistoryMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
