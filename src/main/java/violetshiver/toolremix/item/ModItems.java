package violetshiver.toolremix.item;


import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import violetshiver.toolremix.ToolRemix;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class ModItems {

    public static final Item COPPER_TO_IRON_UPGRADE = Registry.register(BuiltInRegistries.ITEM, (
            ResourceKey.create(BuiltInRegistries.ITEM.key(),
                Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, "iron_upgrade_smithing_template")
            )),
            new SmithingTemplateItem(
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.iron.upgrade.applies_to").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.iron.upgrade.ingredients").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.iron.upgrade.base_slot_description"),
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.iron.upgrade.additions_slot_description"),
                    SmithingTemplateItems.getArmorTrimEmptyBaseSlotTextures(),
                    Collections.singletonList(SmithingTemplateItems.EMPTY_SLOT_INGOT_TEXTURE),
                    new Item.Properties()
            )
    );

    public static final Item IRON_TO_DIAMOND_UPGRADE = Registry.register(BuiltInRegistries.ITEM, (
            ResourceKey.create(BuiltInRegistries.ITEM.key(),
                Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, "diamond_upgrade_smithing_template")
            )),
            new SmithingTemplateItem(
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.diamond.upgrade.applies_to").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.diamond.upgrade.ingredients").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.diamond.upgrade.base_slot_description"),
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.diamond.upgrade.additions_slot_description"),
                    SmithingTemplateItems.getArmorTrimEmptyBaseSlotTextures(),
                    Collections.singletonList(SmithingTemplateItems.EMPTY_SLOT_DIAMOND_TEXTURE),
                    new Item.Properties()
            )
    );

    public static void registerModItems() {

        ToolRemix.LOGGER.info("Now adding mod items...");

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(output -> {
            output.accept(COPPER_TO_IRON_UPGRADE);
            output.accept(IRON_TO_DIAMOND_UPGRADE);
        });

    }

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, name))))
        );
    } // This used to be so simple, and now it's this... why did they take my MojMaps from me. :[

}
