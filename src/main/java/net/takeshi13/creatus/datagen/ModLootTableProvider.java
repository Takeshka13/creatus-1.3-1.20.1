package net.takeshi13.creatus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.takeshi13.creatus.block.ModBlocks;
import net.takeshi13.creatus.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {

        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RAW_TITAN_BLOCK);
        addDrop(ModBlocks.TITAN_BLOCK);

        addDrop(ModBlocks.TITAN_ORE, modOreDrops(ModBlocks.TITAN_ORE, ModItems.RAW_TITAN));
        addDrop(ModBlocks.DEEPSLATE_TITAN_ORE, modOreDrops(ModBlocks.DEEPSLATE_TITAN_ORE, ModItems.RAW_TITAN));
    }

    public LootTable.Builder modOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0F, 5.0F))))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
