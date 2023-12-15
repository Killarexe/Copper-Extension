package github.killarexe.copper_extension.registry;

import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.GameRules.Category;

public class CEGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> COPPER_OXIDATION_CHANCE = GameRules.register(
		"copperOxidationChance", Category.UPDATES, GameRules.IntegerValue.create(0)
	);
	
	public static void register() {
		//Load static final variables.
	}
}
