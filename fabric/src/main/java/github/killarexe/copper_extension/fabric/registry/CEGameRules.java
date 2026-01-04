package github.killarexe.copper_extension.fabric.registry;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.level.GameRules;

public class CEGameRules {
    public static final GameRules.Key<GameRules.IntegerValue> COPPER_OXIDATION_CHANCE = GameRuleRegistry.register(
            "copperOxidationChance", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(1)
    );

    public static void register() {
        //Just to init constants...
    }
}
