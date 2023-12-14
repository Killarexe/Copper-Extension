package github.killarexe.copper_extension.registry;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class CEGameRules {
	public static final GameRules.Key<GameRules.IntRule> COPPER_OXIDATION_CHANCE = GameRuleRegistry.register(
		"copperOxidationChance", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(1)
	);
	
	public static void register() {
		//Just to load the class...
	}
}
