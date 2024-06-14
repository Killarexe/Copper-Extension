package github.killarexe.copper_extension.neoforge.registry;

import net.minecraft.world.level.GameRules;

public class CEGameRules {
    public static final GameRules.Key<GameRules.IntegerValue> COPPER_OXIDATION_CHANCE = GameRules.register(
            "copperOxidationChance", GameRules.Category.UPDATES, GameRules.IntegerValue.create(1)
    );

    public static void register() {
        //Just to init constants...
    }
}
