package violetshiver.toolremix.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import violetshiver.toolremix.ToolRemix;
import violetshiver.toolremix.item.ModItems;

public class ModCreativeModeTabs {

    public static final CreativeModeTab UPGRADES = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, "upgrade_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_TO_IRON_UPGRADE))
                    .title(Component.translatable("creativemodetab.toolremix.upgrade_items"))
                    .displayItems(((parameters, output) -> {
                        output.accept(ModItems.COPPER_TO_IRON_UPGRADE);
                        output.accept(ModItems.IRON_TO_DIAMOND_UPGRADE);
                    }))
                    .build()
            );

    public static void registerModCreativeModTabs() {
        ToolRemix.LOGGER.info("Setting up creative mode tabs!");


    }
}
