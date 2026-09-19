package violetshiver.toolremix.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import violetshiver.toolremix.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected net.minecraft.data.recipes.RecipeProvider createRecipeProvider(net.minecraft.core.HolderLookup.Provider registries, net.minecraft.data.worldgen.BootstrapContext<net.minecraft.world.item.crafting.Recipe<?>> recipes, net.minecraft.data.worldgen.BootstrapContext<net.minecraft.advancements.Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {

            @Override
            public void buildRecipes() {

                this.nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_COPPER_NUGGET, RecipeCategory.MISC, Items.RAW_COPPER, "raw_copper_nugget_to_raw_copper", "raw_ore", "raw_copper_to_raw_copper_nugget", "raw_ore");
                this.nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_IRON_NUGGET, RecipeCategory.MISC, Items.RAW_IRON, "raw_iron_nugget_to_raw_iron", "raw_ore", "raw_iron_to_raw_iron_nugget", "raw_ore");
                this.nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_GOLD_NUGGET, RecipeCategory.MISC, Items.RAW_GOLD, "raw_gold_nugget_to_raw_gikd", "raw_ore", "raw_gold_to_raw_gold_nugget", "raw_ore");
            }
        };
    }
}
