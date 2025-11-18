package github.killarexe.copper_extension;

import net.minecraft.Util;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.EnumMap;

public class CEArmorMaterials {
  public static final ResourceKey<EquipmentAsset> WAXED_COPPER_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID, CEMod.id("waxed_copper"));

  public static final ArmorMaterial WAXED_COPPER_ARMOR_MATERIAL = new ArmorMaterial(
          15,
          Util.make(new EnumMap<>(ArmorType.class), map -> {
            map.put(ArmorType.BOOTS, 2);
            map.put(ArmorType.LEGGINGS, 4);
            map.put(ArmorType.CHESTPLATE, 6);
            map.put(ArmorType.HELMET, 2);
            map.put(ArmorType.BODY, 4);
          }),
          20,
          SoundEvents.ARMOR_EQUIP_COPPER,
          0,
          0,
          ItemTags.REPAIRS_COPPER_ARMOR,
          WAXED_COPPER_ASSET
  );
}
