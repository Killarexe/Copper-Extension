package github.killarexe.copper_extension.forge.registry;

import net.minecraft.world.level.GameRules;

public class CEGameRules {
  public static final GameRules.Key<GameRules.IntegerValue> COPPER_OXIDATION_CHANCE = GameRules.register(
		"copperOxidationChance", GameRules.Category.UPDATES, GameRules.IntegerValue.create(0)
	);
	
	public static void register() {
		//Load static final variables.
	}
}
