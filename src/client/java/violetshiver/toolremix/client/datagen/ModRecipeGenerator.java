package violetshiver.toolremix.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import violetshiver.toolremix.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {

    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {

        RecipeProvider.nineBlockStorageRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_COPPER_NUGGET, RecipeCategory.MISC, Items.RAW_COPPER);
        RecipeProvider.nineBlockStorageRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_IRON_NUGGET, RecipeCategory.MISC, Items.RAW_IRON);
        RecipeProvider.nineBlockStorageRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_GOLD_NUGGET, RecipeCategory.MISC, Items.RAW_GOLD);

    }
}
