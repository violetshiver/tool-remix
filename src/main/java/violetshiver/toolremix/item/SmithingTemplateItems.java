package violetshiver.toolremix.item;

import net.minecraft.ChatFormatting;
import net.minecraft.resources.Identifier;

import java.util.List;

public class SmithingTemplateItems {
    public static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/helmet");
    public static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/chestplate");
    public static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/leggings");
    public static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/boots");
    public static final Identifier EMPTY_SLOT_HOE_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/hoe");
    public static final Identifier EMPTY_SLOT_AXE_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/axe");
    public static final Identifier EMPTY_SLOT_SWORD_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/sword");
    public static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/shovel");
    public static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/pickaxe");
    public static final Identifier EMPTY_SLOT_INGOT_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/ingot");
    public static final Identifier EMPTY_SLOT_REDSTONE_DUST_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/redstone_dust");
    public static final Identifier EMPTY_SLOT_QUARTZ_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/quartz");
    public static final Identifier EMPTY_SLOT_EMERALD_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/emerald");
    public static final Identifier EMPTY_SLOT_DIAMOND_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/diamond");
    public static final Identifier EMPTY_SLOT_LAPIS_LAZULI_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/lapis_lazuli");
    public static final Identifier EMPTY_SLOT_AMETHYST_SHARD_TEXTURE = Identifier.fromNamespaceAndPath("minecraft", "gui/sprites/container/slot/amethyst_shard");

    public static final ChatFormatting SMITHING_TEMPLATE_TITLE_FORMATTING = ChatFormatting.GRAY;
    public static final ChatFormatting SMITHING_TEMPLATE_DESCRIPTION_FORMATTING = ChatFormatting.BLUE;

    public static List<Identifier> getArmorTrimEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }

    public static List<Identifier> getArmorTrimEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE, EMPTY_SLOT_REDSTONE_DUST_TEXTURE, EMPTY_SLOT_LAPIS_LAZULI_TEXTURE, EMPTY_SLOT_QUARTZ_TEXTURE, EMPTY_SLOT_DIAMOND_TEXTURE, EMPTY_SLOT_EMERALD_TEXTURE, EMPTY_SLOT_AMETHYST_SHARD_TEXTURE);
    }

    public static List<Identifier> getDefaultUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    public static List<Identifier> getDefaultUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }
}