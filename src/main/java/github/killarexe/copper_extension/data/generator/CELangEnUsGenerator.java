package github.killarexe.copper_extension.data.generator;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class CELangEnUsGenerator extends LanguageProvider {

	public CELangEnUsGenerator(PackOutput output) {
		super(output, CEMod.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		add(CEItems.EXPOSED_COPPER_INGOT.get(), "Exposed Copper Ingot");
		add(CEItems.WEATHERED_COPPER_INGOT.get(), "Weathered Copper Ingot");
		add(CEItems.OXIDIZED_COPPER_INGOT.get(), "Oxidized Copper Ingot");

		add(CEItems.WAXED_COPPER_INGOT.get(), "Waxed Copper Ingot");
		add(CEItems.WAXED_EXPOSED_COPPER_INGOT.get(), "Waxed Exposed Copper Ingot");
		add(CEItems.WAXED_WEATHERED_COPPER_INGOT.get(), "Waxed Weathered Copper Ingot");
		
		add("gamerule.copperOxidationChance", "Copper oxidation chance");
	}
}
