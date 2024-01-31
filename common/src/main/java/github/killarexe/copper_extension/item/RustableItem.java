package github.killarexe.copper_extension.item;

import java.util.Random;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public abstract class RustableItem extends WaxableItem {

  public static final float BASE_CHANCE = 0.0013666F;

  private final ResourceLocation rustItemId;

  public RustableItem(Item.Properties properties, ResourceLocation scrappedItemId, ResourceLocation waxedItemId, ResourceLocation rustItemId) {
    super(properties, scrappedItemId, waxedItemId);
    this.rustItemId = rustItemId;
  }

  @Override
  public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int slot, boolean selected) {
    if(entity instanceof Player player && !level.isClientSide()) {
      rustStack(itemStack, level, player, slot);
    }
  }

  public static void rustEntityStack(Item nextItem, ItemStack stack, Level level, ItemEntity entity, Random random) {
    int count = stack.getCount();
    if(level.random.nextFloat() < level.getGameRules().getInt(null) * BASE_CHANCE / count) {
      Vec3 pos = entity.position();
      ItemEntity newItemEntity = new ItemEntity(level, pos.x, pos.y, pos.z, new ItemStack(nextItem, count));
      newItemEntity.copyPosition(entity);
      level.addFreshEntity(newItemEntity);
    }
  }

  private void rustStack(ItemStack stack, Level level, Player player, int slot) {
    int count = stack.getCount();
    if(level.random.nextFloat() < level.getGameRules().getInt(getOxidationChanceGameRule()) * BASE_CHANCE / count) {
      player.getInventory().setItem(slot, new ItemStack(getRustItem(), count));
    }
  }

  public abstract Item getRustItem();

  public abstract GameRules.Key<GameRules.IntegerValue> getOxidationChanceGameRule();

  public ResourceLocation getRustItemId() {
    return rustItemId;
  }
}
