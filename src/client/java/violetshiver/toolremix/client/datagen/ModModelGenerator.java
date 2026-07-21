package violetshiver.toolremix.client.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import violetshiver.toolremix.item.ModItems;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.COPPER_TO_IRON_UPGRADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.IRON_TO_DIAMOND_UPGRADE, ModelTemplates.FLAT_ITEM);
        // itemModelGenerators.generateFlatItem(ModItems.GOLD_IMBUEMENT_UPGRADE, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.RAW_COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_IRON_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_GOLD_NUGGET, ModelTemplates.FLAT_ITEM);
    }
}
