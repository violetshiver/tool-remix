package violetshiver.toolremix;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import violetshiver.toolremix.creativemodetab.ModCreativeModeTabs;
import violetshiver.toolremix.item.ModItems;
import violetshiver.toolremix.loottable.ModLootTableHandler;

public class ToolRemix implements ModInitializer {
	public static final String MOD_ID = "tool-remix";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModCreativeModeTabs.registerModCreativeModTabs();
		ModLootTableHandler.createLootTables(ModItems.COPPER_TO_IRON_UPGRADE, ModItems.IRON_TO_DIAMOND_UPGRADE);

	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
