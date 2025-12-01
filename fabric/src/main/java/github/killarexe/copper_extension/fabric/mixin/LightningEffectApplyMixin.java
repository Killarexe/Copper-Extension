package github.killarexe.copper_extension.fabric.mixin;

import github.killarexe.copper_extension.CEActions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;

@Mixin(LivingEntity.class)
public abstract class LightningEffectApplyMixin extends Entity {

  public LightningEffectApplyMixin(EntityType<?> entityType, Level level) {
    super(entityType, level);
  }

  @Shadow
  public abstract ItemStack getItemBySlot(EquipmentSlot equipmentSlot);

  @Shadow
  public abstract boolean addEffect(MobEffectInstance mobEffectInstance);

  @Inject(method = "tick()V", at = @At("HEAD"))
  public void tick(CallbackInfo ci) {
    //TODO: Add small chance to be hit by thunder when wearing copper
  }

  @Inject(method = "hurtServer", at = @At("RETURN"))
  public void hurtServer(ServerLevel level, DamageSource damageSource, float f, CallbackInfoReturnable<Boolean> cir) {
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
