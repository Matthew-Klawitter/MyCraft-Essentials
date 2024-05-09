package cafe.seafarers;

import cafe.seafarers.block.ModBlocks;
import cafe.seafarers.item.ModItems;
import cafe.seafarers.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyCraftEssentials implements ModInitializer {
	public static final String MOD_ID = "mycraftessentials";
    public static final Logger LOGGER = LoggerFactory.getLogger("mycraftessentials");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}