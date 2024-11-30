package net.takeshi13.creatus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.takeshi13.creatus.block.ModBlocks;
import net.takeshi13.creatus.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TITAN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITAN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TITAN_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TITAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITAN_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUSHED_RAW_TITAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TITAN, Models.GENERATED);
    }
}
