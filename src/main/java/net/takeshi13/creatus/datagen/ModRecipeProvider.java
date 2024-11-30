package net.takeshi13.creatus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.takeshi13.creatus.block.ModBlocks;
import net.takeshi13.creatus.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> TITAN_SMELTABLES = List.of(ModItems.RAW_TITAN, ModItems.CRUSHED_RAW_TITAN,
            ModBlocks.TITAN_ORE, ModBlocks.DEEPSLATE_TITAN_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        offerSmelting(consumer, TITAN_SMELTABLES, RecipeCategory.MISC, ModItems.TITAN_INGOT,
                0.7f, 200, "titan");
        offerBlasting(consumer, TITAN_SMELTABLES, RecipeCategory.MISC, ModItems.TITAN_INGOT,
                0.7f, 100, "titan");

        offerReversibleCompactingRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.TITAN_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.TITAN_BLOCK);
        offerReversibleCompactingRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TITAN, RecipeCategory.DECORATIONS,
                ModBlocks.RAW_TITAN_BLOCK);
        //offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, ModItems.TITAN_NUGGET, RecipeCategory.BUILDING_BLOCKS,
        //        ModItems.TITAN_INGOT);
    }
}
