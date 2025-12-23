package github.killarexe.copper_extension.common_functions;

import github.killarexe.copper_extension.CEMaps;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

public class CEWaxing {
  private static void waxItem(UseOnContext context, int currentValue, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
    Level level = context.getLevel();
    BlockPos pos = context.getClickedPos();
    BlockState state = level.getBlockState(pos);
    Item item = context.getItemInHand().getItem();
    if(currentValue >= 1 && level instanceof ServerLevel serverLevel) {
      Player player = context.getPlayer();
      Vec3 playerPos = player.position();
      int amount = player.isShiftKeyDown() ? Math.min(currentValue, context.getItemInHand().getCount()) : 1;
      ItemStack result = new ItemStack(CEMaps.WAXING_MAP_ITEMS.get(item), amount);

      result.applyComponents(context.getItemInHand().getComponentsPatch());
      context.getItemInHand().shrink(amount);

      ItemEntity entity = new ItemEntity(
              serverLevel,
              playerPos.x, playerPos.y, playerPos.z,
              result
      );

      level.playSound(context.getPlayer(), pos, SoundEvents.HONEYCOMB_WAX_ON, SoundSource.PLAYERS, 1.0f, 1.0f);

      serverLevel.addFreshEntity(entity);
      serverLevel.setBlock(pos, state.setValue(BeehiveBlock.HONEY_LEVEL, currentValue - amount), Block.UPDATE_ALL_IMMEDIATE);
      callbackInfoReturnable.setReturnValue(InteractionResult.SUCCESS);
    }
    callbackInfoReturnable.setReturnValue(InteractionResult.PASS);
  }

  public static void waxUseOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
    ItemStack stack = context.getItemInHand();
    Item item = stack.getItem();
    if(CEMaps.WAXING_MAP_ITEMS.containsKey(item)) {
      Optional<Integer> value = context.getLevel().getBlockState(context.getClickedPos()).getOptionalValue(BeehiveBlock.HONEY_LEVEL);
      value.ifPresent(integer -> waxItem(context, integer, callbackInfoReturnable));
    }
  }
}
