package github.killarexe.copper_extension.neoforge.mixin;

import github.killarexe.copper_extension.CEActions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
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
        addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60, 0, false, false));
        level.playSound(this, blockPosition(), SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.PLAYERS, 1.0f, 1.0f);
      }
    }
  }
}
