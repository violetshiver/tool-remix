package violetshiver.toolremix;

import net.minecraft.ChatFormatting;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public class SmithingTemplateItems {
    public static final ResourceLocation EMPTY_ARMOR_SLOT_HELMET_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_armor_slot_helmet");
    public static final ResourceLocation EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_armor_slot_chestplate");
    public static final ResourceLocation EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_armor_slot_leggings");
    public static final ResourceLocation EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_armor_slot_boots");
    public static final ResourceLocation EMPTY_SLOT_HOE_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_hoe");
    public static final ResourceLocation EMPTY_SLOT_AXE_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_axe");
    public static final ResourceLocation EMPTY_SLOT_SWORD_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_sword");
    public static final ResourceLocation EMPTY_SLOT_SHOVEL_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_shovel");
    public static final ResourceLocation EMPTY_SLOT_PICKAXE_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_pickaxe");
    public static final ResourceLocation EMPTY_SLOT_INGOT_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_ingot");
    public static final ResourceLocation EMPTY_SLOT_REDSTONE_DUST_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_redstone_dust");
    public static final ResourceLocation EMPTY_SLOT_QUARTZ_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_quartz");
    public static final ResourceLocation EMPTY_SLOT_EMERALD_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_emerald");
    public static final ResourceLocation EMPTY_SLOT_DIAMOND_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_diamond");
    public static final ResourceLocation EMPTY_SLOT_LAPIS_LAZULI_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_lapis_lazuli");
    public static final ResourceLocation EMPTY_SLOT_AMETHYST_SHARD_TEXTURE = ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_amethyst_shard");

    public static final ChatFormatting SMITHING_TEMPLATE_TITLE_FORMATTING = ChatFormatting.GRAY;
    public static final ChatFormatting SMITHING_TEMPLATE_DESCRIPTION_FORMATTING = ChatFormatting.BLUE;

    public static List<ResourceLocation> getArmorTrimEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }

    public static List<ResourceLocation> getArmorTrimEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE, EMPTY_SLOT_REDSTONE_DUST_TEXTURE, EMPTY_SLOT_LAPIS_LAZULI_TEXTURE, EMPTY_SLOT_QUARTZ_TEXTURE, EMPTY_SLOT_DIAMOND_TEXTURE, EMPTY_SLOT_EMERALD_TEXTURE, EMPTY_SLOT_AMETHYST_SHARD_TEXTURE);
    }

    public static List<ResourceLocation> getDefaultUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    public static List<ResourceLocation> getDefaultUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }
}