package violetshiver.toolremix.client;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import violetshiver.toolremix.client.datagen.ModModelGenerator;
import violetshiver.toolremix.client.datagen.ModRecipeGenerator;

public class ToolRemixClientDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);

	}
}
