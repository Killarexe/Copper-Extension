package github.killarexe.copper_extension.data.generator;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class CELangFrFrGenerator extends LanguageProvider {

	public CELangFrFrGenerator(PackOutput output) {
		super(output, CEMod.MOD_ID, "fr_fr");
	}

	@Override
	protected void addTranslations() {
		add(CEItems.EXPOSED_COPPER_INGOT.get(), "Lingot de cuivre exposé");
		add(CEItems.WEATHERED_COPPER_INGOT.get(), "Lingot de cuivre érodé");
		add(CEItems.OXIDIZED_COPPER_INGOT.get(), "Lingot de cuivre oxydé");

		add(CEItems.WAXED_COPPER_INGOT.get(), "Lingot de cuivre ciré");
		add(CEItems.WAXED_EXPOSED_COPPER_INGOT.get(), "Lingot de cuivre exposé et ciré");
		add(CEItems.WAXED_WEATHERED_COPPER_INGOT.get(), "Lingot de cuivre érodé et ciré");
		
		add("gamerule.copperOxidationChance", "Chance d'érosion du cuivre");
	}
}
