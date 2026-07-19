package violetshiver.toolremix.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {

            @Override
            public void buildRecipes() {
                List<ItemLike> COPPER_RECIPE_REMOVALS = List.of(
                        Items.COPPER_SWORD, Items.COPPER_PICKAXE, Items.COPPER_AXE, Items.COPPER_SHOVEL, Items.COPPER_HOE, Items.COPPER_SPEAR,
                        Items.COPPER_HELMET, Items.COPPER_CHESTPLATE, Items.COPPER_LEGGINGS, Items.COPPER_BOOTS,
                        Items.COPPER_HORSE_ARMOR, Items.COPPER_NAUTILUS_ARMOR
                );
                List<ItemLike> IRON_RECIPE_REMOVALS = List.of(
                        Items.IRON_SWORD, Items.IRON_PICKAXE, Items.IRON_AXE, Items.IRON_SHOVEL, Items.IRON_HOE, Items.IRON_SPEAR,
                        Items.IRON_HELMET, Items.IRON_CHESTPLATE, Items.IRON_LEGGINGS, Items.IRON_BOOTS,
                        Items.IRON_HORSE_ARMOR, Items.IRON_NAUTILUS_ARMOR
                );
                List<ItemLike> DIAMOND_RECIPE_REMOVALS = List.of(
                        Items.DIAMOND_SWORD, Items.DIAMOND_PICKAXE, Items.DIAMOND_AXE, Items.DIAMOND_SHOVEL, Items.DIAMOND_HOE, Items.DIAMOND_SPEAR,
                        Items.DIAMOND_HELMET, Items.DIAMOND_CHESTPLATE, Items.DIAMOND_LEGGINGS, Items.DIAMOND_BOOTS,
                        Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND_NAUTILUS_ARMOR
                );

                List<ItemLike> RECIPE_REMOVALS = new java.util.ArrayList<>(IRON_RECIPE_REMOVALS);
                RECIPE_REMOVALS.addAll(DIAMOND_RECIPE_REMOVALS);


            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
