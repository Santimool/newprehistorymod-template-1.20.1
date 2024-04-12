package net.zenon.newprehistorymod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.zenon.newprehistorymod.NewPrehistoryMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SAPPHIRE_GROUP=
                createTag("sapphire_group");


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(NewPrehistoryMod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(NewPrehistoryMod.MOD_ID, name));
        }
    }
}
