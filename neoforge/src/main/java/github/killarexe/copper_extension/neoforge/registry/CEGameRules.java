package github.killarexe.copper_extension.neoforge.registry;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.serialization.Codec;
import github.killarexe.copper_extension.CEMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.gamerules.GameRule;
import net.minecraft.world.level.gamerules.GameRuleCategory;
import net.minecraft.world.level.gamerules.GameRuleType;
import net.minecraft.world.level.gamerules.GameRuleTypeVisitor;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class CEGameRules {
  public static final DeferredRegister<@NotNull GameRule<?>> GAME_RULES = DeferredRegister.create(BuiltInRegistries.GAME_RULE, CEMod.MOD_ID);

  public static final Supplier<GameRule<@NotNull Integer>> COPPER_OXIDATION_CHANCE = GAME_RULES.register(
          "copper_oxidation_chance",
          () -> new GameRule<>(
                  GameRuleCategory.UPDATES,
                  GameRuleType.INT,
                  IntegerArgumentType.integer(0),
                  GameRuleTypeVisitor::visitInteger,
                  Codec.INT,
                  integer -> integer,
                  1,
                  FeatureFlagSet.of()
          )
  );
}
