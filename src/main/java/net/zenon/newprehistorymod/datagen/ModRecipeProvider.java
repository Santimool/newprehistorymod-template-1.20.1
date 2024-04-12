package net.zenon.newprehistorymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.zenon.newprehistorymod.block.ModBlocks;
import net.zenon.newprehistorymod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE,
            ModBlocks.SAPPHIRE_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE,
                0.7f, 200, "sapphire");
        offerBlasting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE,
                0.7f, 100, "sapphire");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS,
                ModBlocks.SAPPHIRE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_SAPPHIRE, 1)
                .pattern("SSS")
                .pattern("SCS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('C', ModItems.SAPPHIRE)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_SAPPHIRE)));

    }
}
