package violetshiver.toolremix.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import violetshiver.toolremix.SmithingTemplateItems;

import java.util.List;

import static violetshiver.toolremix.ToolRemix.MOD_ID;

public class ModItems {

    static final String TRANSLATION_ID_DIAMOND = "diamond";
    static final String TRANSLATION_ID_IRON = "iron";
    static final String TRANSLATION_ID_ROSE_GOLD = "rose_gold";

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), item);
    }

    public static void registerModItems() {}

    public static final Item IRON_SMITHING_UPGRADE = Registry.register(BuiltInRegistries.ITEM, (ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(MOD_ID, "iron_upgrade_smithing_template"))), new SmithingTemplateItem(
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_IRON + ".applies_to").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_IRON + ".ingredients").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
            Component.translatable(MOD_ID + ":" + TRANSLATION_ID_IRON).withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_TITLE_FORMATTING),
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_IRON + ".base_slot_description"),
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_IRON + ".additions_slot_description"),
            SmithingTemplateItems.getArmorTrimEmptyBaseSlotTextures(),
            List.of(SmithingTemplateItems.EMPTY_SLOT_INGOT_TEXTURE)
    ));

    public static final Item DIAMOND_SMITHING_UPGRADE = Registry.register(BuiltInRegistries.ITEM, (ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(MOD_ID, "diamond_upgrade_smithing_template"))), new SmithingTemplateItem(
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_DIAMOND + ".applies_to").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_DIAMOND + ".ingredients").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
            Component.translatable(MOD_ID + ":" + TRANSLATION_ID_DIAMOND).withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_TITLE_FORMATTING),
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_DIAMOND + ".base_slot_description"),
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_DIAMOND + ".additions_slot_description"),
            SmithingTemplateItems.getArmorTrimEmptyBaseSlotTextures(),
            List.of(SmithingTemplateItems.EMPTY_SLOT_DIAMOND_TEXTURE)
    ));

    public static final Item ROSE_GOLD_SMITHING_UPGRADE = Registry.register(BuiltInRegistries.ITEM, (ResourceKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(MOD_ID, "rose_gold_upgrade_smithing_template"))), new SmithingTemplateItem(
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_ROSE_GOLD + ".applies_to").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_ROSE_GOLD + ".ingredients").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
            Component.translatable(MOD_ID + ":" + TRANSLATION_ID_ROSE_GOLD).withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_TITLE_FORMATTING),
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_ROSE_GOLD + ".base_slot_description"),
            Component.translatable(MOD_ID + ":smithing_template." + TRANSLATION_ID_ROSE_GOLD + ".additions_slot_description"),
            SmithingTemplateItems.getArmorTrimEmptyBaseSlotTextures(),
            List.of(SmithingTemplateItems.EMPTY_SLOT_INGOT_TEXTURE)
    ));

    public static final Item RAW_COPPER_NUGGET = registerItem("raw_copper_nugget", new Item(new Item.Properties()));
    public static final Item RAW_IRON_NUGGET = registerItem("raw_iron_nugget", new Item(new Item.Properties()));
    public static final Item RAW_GOLD_NUGGET = registerItem("raw_gold_nugget", new Item(new Item.Properties()));

}
