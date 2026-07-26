package violetshiver.toolremix.item;


import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import violetshiver.toolremix.ToolRemix;

import java.util.List;
import java.util.function.Function;

public class ModItems {

    private static final Identifier EMPTY_SLOT_HELMET = Identifier.withDefaultNamespace("container/slot/helmet");
    private static final Identifier EMPTY_SLOT_CHESTPLATE = Identifier.withDefaultNamespace("container/slot/chestplate");
    private static final Identifier EMPTY_SLOT_LEGGINGS = Identifier.withDefaultNamespace("container/slot/leggings");
    private static final Identifier EMPTY_SLOT_BOOTS = Identifier.withDefaultNamespace("container/slot/boots");
    private static final Identifier EMPTY_SLOT_NAUTILUS_ARMOR = Identifier.withDefaultNamespace("container/slot/nautilus_armor");
    private static final Identifier EMPTY_SLOT_HOE = Identifier.withDefaultNamespace("container/slot/hoe");
    private static final Identifier EMPTY_SLOT_AXE = Identifier.withDefaultNamespace("container/slot/axe");
    private static final Identifier EMPTY_SLOT_SWORD = Identifier.withDefaultNamespace("container/slot/sword");
    private static final Identifier EMPTY_SLOT_SHOVEL = Identifier.withDefaultNamespace("container/slot/shovel");
    private static final Identifier EMPTY_SLOT_SPEAR = Identifier.withDefaultNamespace("container/slot/spear");
    private static final Identifier EMPTY_SLOT_PICKAXE = Identifier.withDefaultNamespace("container/slot/pickaxe");
    private static final Identifier EMPTY_SLOT_INGOT = Identifier.withDefaultNamespace("container/slot/ingot");
    private static final Identifier EMPTY_SLOT_DIAMOND = Identifier.withDefaultNamespace("container/slot/diamond");
//    private static final Identifier EMPTY_SLOT_AMETHYST = Identifier.withDefaultNamespace("container/slot/amethyst");
//    private static final Identifier EMPTY_SLOT_LAPIS = Identifier.withDefaultNamespace("container/slot/lapis");
//    private static final Identifier EMPTY_SLOT_CHORUS = Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, "gui/container/slot/chorus");
//    private static final Identifier EMPTY_SLOT_ECHO = Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, "gui/container/slot/echo");

    private static final Identifier EMPTY_SLOT_KNIFE = Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, "gui/container/slot/knife");

    private static List<Identifier> createUpgradeIconList() {
        List<Identifier> ICON_LIST = new java.util.ArrayList<>(List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL, EMPTY_SLOT_NAUTILUS_ARMOR, EMPTY_SLOT_SPEAR));

        if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
            ICON_LIST.add(EMPTY_SLOT_KNIFE);
        }

        return ICON_LIST;
    }

    public static final Item COPPER_TO_IRON_UPGRADE = Registry.register(BuiltInRegistries.ITEM, (
            ResourceKey.create(BuiltInRegistries.ITEM.key(),
                Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, "iron_upgrade_smithing_template")
            )),
            new SmithingTemplateItem(
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.iron.upgrade.applies_to").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.iron.upgrade.ingredients").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.iron.upgrade.base_slot_description"),
                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.iron.upgrade.additions_slot_description"),
                    createUpgradeIconList(),
                    List.of(EMPTY_SLOT_INGOT),
                    new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(
                        ToolRemix.MOD_ID,
                        "iron_upgrade_smithing_template"
                    )))
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
                    createUpgradeIconList(),
                    List.of(EMPTY_SLOT_DIAMOND),
                    new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(
                        ToolRemix.MOD_ID,
                        "diamond_upgrade_smithing_template"
                    )))
            )
    );

//    public static final Item GOLD_IMBUEMENT_UPGRADE = Registry.register(BuiltInRegistries.ITEM, (
//                    ResourceKey.create(BuiltInRegistries.ITEM.key(),
//                            Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, "gold_imbuement_smithing_template")
//                    )),
//            new SmithingTemplateItem(
//                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.gold.upgrade.applies_to").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
//                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.gold.upgrade.ingredients").withStyle(SmithingTemplateItems.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
//                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.gold.upgrade.base_slot_description"),
//                    Component.translatable(ToolRemix.MOD_ID + ":smithing_template.gold.upgrade.additions_slot_description"),
//                    createUpgradeIconList(),
//                    List.of(EMPTY_SLOT_AMETHYST, EMPTY_SLOT_LAPIS, EMPTY_SLOT_ECHO, EMPTY_SLOT_CHORUS),
//                    new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(
//                            ToolRemix.MOD_ID,
//                            "gold_imbuement_smithing_template"
//                    )))
//            )
//    );

    public static final Item RAW_COPPER_NUGGET = registerItem("raw_copper_nugget", Item::new);
    public static final Item RAW_IRON_NUGGET = registerItem("raw_iron_nugget", Item::new);
    public static final Item RAW_GOLD_NUGGET = registerItem("raw_gold_nugget", Item::new);

    public static void registerModItems() {

        ToolRemix.LOGGER.info("Now adding mod items...");


    }

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ToolRemix.MOD_ID, name))))
        );
    } // This used to be so simple, and now it's this... why did they take my MojMaps from me. :[

}
