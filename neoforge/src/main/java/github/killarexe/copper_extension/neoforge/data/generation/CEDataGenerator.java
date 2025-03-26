package github.killarexe.copper_extension.neoforge.data.generation;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.neoforge.CENeoForge;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = CEMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class CEDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client e) {
        CENeoForge.LOGGER.info("Generating Copper Extension Recipes...");
        e.createProvider(CERecipeProvider.Runner::new);
    }
}
