package violetshiver.toolremix.loottable;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.Set;

public class ModLootTableHandler {

    private static final ResourceKey<LootTable> DUNGEON = ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("minecraft", "chests/simple_dungeon"));
    private static final ResourceKey<LootTable> MINESHAFT = ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("minecraft", "chests/abandoned_mineshaft"));
    private static final ResourceKey<LootTable> CORRIDOR = ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("minecraft", "chests/trial_chambers/corridor"));
    private static final ResourceKey<LootTable> VAULT = ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("minecraft", "chests/trial_chambers/reward_rare"));
    private static final ResourceKey<LootTable> OMINOUS_VAULT = ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("minecraft", "chests/trial_chambers/reward_ominous_rare"));

    private static final Set<ResourceKey<LootTable>> HOTV_TABLES = Set.of(
            ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("minecraft", "gameplay/hero_of_the_village/toolsmith")),
            ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("minecraft", "gameplay/hero_of_the_village/weaponsmith")),
            ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("minecraft", "gameplay/hero_of_the_village/armorer"))
    );

    public static void createLootTables(Item copperToIron, Item ironToDiamond) {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (!source.isBuiltin()) return;

            if (key.equals(DUNGEON) || key.equals(VAULT)) {
                tableBuilder.pool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(copperToIron).setWeight(1))
                        .add(EmptyLootItem.emptyItem().setWeight(9)).build()
                );
            }

            else if (key.equals(CORRIDOR)) {
                tableBuilder.pool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(copperToIron).setWeight(1))
                        .add(EmptyLootItem.emptyItem().setWeight(5)).build()
                );
            }

            else if (key.equals(MINESHAFT)) {
                tableBuilder.pool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(copperToIron).setWeight(3))
                        .add(LootItem.lootTableItem(ironToDiamond).setWeight(1))
                        .add(EmptyLootItem.emptyItem().setWeight(8)).build()
                );
            }

            else if (HOTV_TABLES.contains(key)) {
                tableBuilder.pool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(copperToIron).setWeight(2))
                        .add(LootItem.lootTableItem(ironToDiamond).setWeight(3))
                        .add(EmptyLootItem.emptyItem().setWeight(35)).build()
                );
            }

            else if (key.equals(OMINOUS_VAULT)) {
                tableBuilder.pool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(ironToDiamond).setWeight(1))
                        .add(EmptyLootItem.emptyItem().setWeight(9)).build()
                );
            }
        });
    }
}
