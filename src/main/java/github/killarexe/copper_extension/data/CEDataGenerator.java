package github.killarexe.copper_extension.data;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.data.generator.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = CEMod.MOD_ID, bus = Bus.MOD)
public class CEDataGenerator {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		PackOutput output = generator.getPackOutput();
		ExistingFileHelper helper = event.getExistingFileHelper();
		
		CEMod.LOGGER.debug("Generating Copper Extension 'en_us' Lang File...");
		generator.addProvider(event.includeClient(), new CELangEnUsGenerator(output));
		CEMod.LOGGER.debug("Generating Copper Extension Items Models...");
		generator.addProvider(event.includeClient(), new CEItemModelGenerator(output, helper));
		CEMod.LOGGER.debug("Generating Copper Extension Recipes...");
		generator.addProvider(event.includeServer(), new CERecipeGenerator(output));
	}
}
