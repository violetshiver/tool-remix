package violetshiver.toolremix;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import violetshiver.toolremix.item.ModCreativeModeTabs;
import violetshiver.toolremix.item.ModItems;
import violetshiver.toolremix.loottable.ModLootTableHandler;

import java.util.Optional;

public class ToolRemix implements ModInitializer {
	public static final String MOD_ID = "tool-remix";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric 1.21.1!");

		ModItems.registerModItems();
		ModCreativeModeTabs.registerCreativeModTabs();
		ModLootTableHandler.createLootTables(ModItems.IRON_SMITHING_UPGRADE, ModItems.DIAMOND_SMITHING_UPGRADE, ModItems.ROSE_GOLD_SMITHING_UPGRADE);
	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}
