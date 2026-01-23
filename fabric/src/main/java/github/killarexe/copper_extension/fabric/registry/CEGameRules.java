package github.killarexe.copper_extension.fabric.registry;

import github.killarexe.copper_extension.CEMod;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder;
import net.minecraft.world.level.gamerules.GameRule;
import net.minecraft.world.level.gamerules.GameRuleCategory;
import org.jspecify.annotations.NonNull;

public class CEGameRules {
    public static final GameRule<@NonNull Integer> COPPER_OXIDATION_CHANCE = GameRuleBuilder.forInteger(1)
            .minValue(0)
            .category(GameRuleCategory.UPDATES)
            .buildAndRegister(CEMod.id("copper_oxidation_chance"));

    public static void register() {
        //Just to init constants...
    }
}
