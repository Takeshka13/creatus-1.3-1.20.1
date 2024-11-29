package net.takeshi13.creatus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takeshi13.creatus.Creatus;

public class ModItems {

    public static final Item TITAN_INGOT = registerItem("titan_ingot", new Item(new FabricItemSettings()));
    public static final Item TITAN_NUGGET = registerItem("titan_nugget", new Item(new FabricItemSettings()));

    private static void  addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TITAN_INGOT);
        entries.add(TITAN_NUGGET);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Creatus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Creatus.LOGGER.info("Registering Mod Items for " + Creatus.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
