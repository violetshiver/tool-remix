package violetshiver.toolremix.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import violetshiver.toolremix.ToolRemix;

public class ModCreativeModeTabs {

    public static void registerCreativeModTabs() {}

    public static final CreativeModeTab UPGRADES = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath(ToolRemix.MOD_ID, "upgrade_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.IRON_SMITHING_UPGRADE))
                    .title(Component.translatable("creativemodetab.toolremix.upgrade_items"))
                    .displayItems(((parameters, output) -> {

                        output.accept(ModItems.RAW_COPPER_NUGGET);
                        output.accept(ModItems.RAW_IRON_NUGGET);
                        output.accept(ModItems.RAW_GOLD_NUGGET);

                        output.accept(ModItems.IRON_SMITHING_UPGRADE);
                        output.accept(ModItems.DIAMOND_SMITHING_UPGRADE);
                    }))
                    .build()
    );

}
