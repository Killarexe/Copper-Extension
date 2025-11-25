package github.killarexe.copper_extension.fabric.mixin;

import github.killarexe.copper_extension.CEActions;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;

@Mixin(Player.class)
public abstract class PlayerMixin extends Avatar {

  protected PlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
    super(entityType, level);
  }

  @Inject(method = "tick()V", at = @At("HEAD"))
  public void tick(CallbackInfo ci) {
    //TODO: Add small chance to be hit by thunder when wearing copper
  }

  @Inject(method = "hurtArmor(Lnet/minecraft/world/damagesource/DamageSource;F)V", at = @At("RETURN"))
  public void hurtArmor(DamageSource damageSource, float f, CallbackInfo callback) {
    if (damageSource.is(DamageTypeTags.IS_LIGHTNING)) {
      ItemStack head = getItemBySlot(EquipmentSlot.HEAD);
      ItemStack chestplate = getItemBySlot(EquipmentSlot.CHEST);
      ItemStack leggings = getItemBySlot(EquipmentSlot.LEGS);
      ItemStack boots = getItemBySlot(EquipmentSlot.FEET);

      ArrayList<MobEffectInstance> instances = CEActions.getEffectsFromArmor(head, chestplate, leggings, boots);
      for (MobEffectInstance instance : instances) {
        addEffect(instance);
      }

      if (!instances.isEmpty()) {
        extinguishFire();
        //TODO: Add electricity sound effects
      }
    }
  }
}
