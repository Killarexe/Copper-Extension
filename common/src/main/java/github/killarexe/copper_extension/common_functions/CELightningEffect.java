package github.killarexe.copper_extension.common_functions;

import github.killarexe.copper_extension.CEMaps;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;

public class CELightningEffect {
  private static void appendEffect(ArrayList<MobEffectInstance> list, MobEffectInstance effect) {
    for (int i = 0; i < list.size(); i++) {
      MobEffectInstance instance = list.get(i);
      if (instance.is(effect.getEffect())) {
        if (instance.getAmplifier() < effect.getAmplifier()) {
          list.set(i, new MobEffectInstance(effect));
          return;
        }
        if (instance.getAmplifier() > effect.getAmplifier()) {
          return;
        }
        list.set(i, new MobEffectInstance(instance.getEffect(), instance.getDuration() + effect.getDuration(), instance.getAmplifier()));
        return;
      }
    }
    list.add(new MobEffectInstance(effect));
  }

  private static ArrayList<MobEffectInstance> appendEffects(ArrayList<MobEffectInstance> instances, ArrayList<MobEffectInstance> effects) {
    for (MobEffectInstance instance: effects) {
      appendEffect(instances, instance);
    }
    return effects;
  }

  public static ArrayList<MobEffectInstance> getEffectsFromArmor(ItemStack head, ItemStack chestplate, ItemStack leggings, ItemStack boots) {
    ArrayList<MobEffectInstance> instances = new ArrayList<>();

    CEMaps.ARMOR_EFFECTS.computeIfPresent(head.getItem(), (_a, effects) -> appendEffects(instances, effects));
    CEMaps.ARMOR_EFFECTS.computeIfPresent(chestplate.getItem(), (_a, effects) -> appendEffects(instances, effects));
    CEMaps.ARMOR_EFFECTS.computeIfPresent(leggings.getItem(), (_a, effects) -> appendEffects(instances, effects));
    CEMaps.ARMOR_EFFECTS.computeIfPresent(boots.getItem(), (_a, effects) -> appendEffects(instances, effects));

    return instances;
  }
}
