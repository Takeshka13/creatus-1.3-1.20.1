package net.takeshi13.creatus;

import net.fabricmc.api.ModInitializer;

import net.takeshi13.creatus.block.ModBlocks;
import net.takeshi13.creatus.item.ModItemGroups;
import net.takeshi13.creatus.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Creatus implements ModInitializer {
	public static final String MOD_ID = "creatus";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();


		LOGGER.info("Welcome to Creatus<3");
	}
}