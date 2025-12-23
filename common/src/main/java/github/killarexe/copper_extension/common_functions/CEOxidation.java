package github.killarexe.copper_extension.common_functions;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;

import java.util.Optional;

public class CEOxidation {
  // The base chance is based on the time that a Copper Golem takes to oxidize
  public static final float BASE_CHANCE = 1.0F / 504000.0F;

  public static <T extends Item> void rustEntityStack(
          T nextItem, ItemStack stack, ServerLevel level, float chanceMultiplier,
          ItemEntity entity, GameRules.Key<GameRules.IntegerValue> oxidationGameRule, RandomSource random)
  {
    int count = stack.getCount();
    if(random.nextFloat() < (level.getGameRules().getInt(oxidationGameRule) * BASE_CHANCE * chanceMultiplier) / count) {
      ItemStack result = new ItemStack(nextItem, count);
      result.applyComponents(stack.getComponentsPatch());
      entity.setItem(result);
    }
  }

  public static Optional<Integer> findSlotFromStack(Inventory inventory, ItemStack stack) {
    for (int i = 0; i < inventory.getContainerSize(); i++) {
      ItemStack slot = inventory.getItem(i);
      if (!slot.isEmpty() && slot.getCount() == stack.getCount() && ItemStack.isSameItemSameComponents(slot, stack)) {
        return Optional.of(i);
      }
    }
    return Optional.empty();
  }
}
