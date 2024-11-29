package net.takeshi13.creatus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.takeshi13.creatus.Creatus;

public class ModItemGroups {

    public static final ItemGroup CREATUS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Creatus.MOD_ID, "creatus"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.creatus"))
                    .icon(() -> new ItemStack(ModItems.TITAN_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TITAN_INGOT);
                        entries.add(ModItems.TITAN_NUGGET);

                    }).build());

    public static void registerItemGroups() {
        Creatus.LOGGER.info("Registering Item Groups for " +Creatus.MOD_ID);
    }
}
