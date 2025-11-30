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
  public static final ResourceKey<EquipmentAsset> WAXED_EXPOSED_COPPER_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID, CEMod.id("waxed_exposed_copper"));
  public static final ResourceKey<EquipmentAsset> WAXED_WEATHERED_COPPER_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID, CEMod.id("waxed_weathered_copper"));
  public static final ResourceKey<EquipmentAsset> WAXED_OXIDIZED_COPPER_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID, CEMod.id("waxed_oxidized_copper"));

  public static final ResourceKey<EquipmentAsset> EXPOSED_COPPER_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID, CEMod.id("exposed_copper"));
  public static final ResourceKey<EquipmentAsset> WEATHERED_COPPER_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID, CEMod.id("weathered_copper"));
  public static final ResourceKey<EquipmentAsset> OXIDIZED_COPPER_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID, CEMod.id("oxidized_copper"));

  public static final ArmorMaterial WAXED_COPPER_ARMOR_MATERIAL = new ArmorMaterial(
          12,
          Util.make(new EnumMap<>(ArmorType.class), map -> {
            map.put(ArmorType.BOOTS, 2);
            map.put(ArmorType.LEGGINGS, 4);
            map.put(ArmorType.CHESTPLATE, 6);
            map.put(ArmorType.HELMET, 2);
            map.put(ArmorType.BODY, 4);
          }),
          16,
          SoundEvents.ARMOR_EQUIP_COPPER,
          0.5f,
          0.0f,
          ItemTags.REPAIRS_COPPER_ARMOR,
          WAXED_COPPER_ASSET
  );

  public static final ArmorMaterial WAXED_EXPOSED_COPPER_ARMOR_MATERIAL = new ArmorMaterial(
          13,
          Util.make(new EnumMap<>(ArmorType.class), map -> {
            map.put(ArmorType.BOOTS, 2);
            map.put(ArmorType.LEGGINGS, 4);
            map.put(ArmorType.CHESTPLATE, 6);
            map.put(ArmorType.HELMET, 2);
            map.put(ArmorType.BODY, 4);
          }),
          14,
          SoundEvents.ARMOR_EQUIP_COPPER,
          0.4f,
          0.0f,
          ItemTags.REPAIRS_COPPER_ARMOR,
          WAXED_EXPOSED_COPPER_ASSET
  );

  public static final ArmorMaterial WAXED_WEATHERED_COPPER_ARMOR_MATERIAL = new ArmorMaterial(
          15,
          Util.make(new EnumMap<>(ArmorType.class), map -> {
            map.put(ArmorType.BOOTS, 2);
            map.put(ArmorType.LEGGINGS, 4);
            map.put(ArmorType.CHESTPLATE, 6);
            map.put(ArmorType.HELMET, 2);
            map.put(ArmorType.BODY, 4);
          }),
          12,
          SoundEvents.ARMOR_EQUIP_COPPER,
          0.03f,
          0.04f,
          ItemTags.REPAIRS_COPPER_ARMOR,
          WAXED_WEATHERED_COPPER_ASSET
  );

  public static final ArmorMaterial WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL = new ArmorMaterial(
          16,
          Util.make(new EnumMap<>(ArmorType.class), map -> {
            map.put(ArmorType.BOOTS, 2);
            map.put(ArmorType.LEGGINGS, 4);
            map.put(ArmorType.CHESTPLATE, 6);
            map.put(ArmorType.HELMET, 2);
            map.put(ArmorType.BODY, 4);
          }),
          10,
          SoundEvents.ARMOR_EQUIP_COPPER,
          0.02f,
          0.08f,
          ItemTags.REPAIRS_COPPER_ARMOR,
          WAXED_OXIDIZED_COPPER_ASSET
  );

  public static final ArmorMaterial EXPOSED_COPPER_ARMOR_MATERIAL = new ArmorMaterial(
          12,
          Util.make(new EnumMap<>(ArmorType.class), map -> {
            map.put(ArmorType.BOOTS, 1);
            map.put(ArmorType.LEGGINGS, 3);
            map.put(ArmorType.CHESTPLATE, 4);
            map.put(ArmorType.HELMET, 2);
            map.put(ArmorType.BODY, 4);
          }),
          7,
          SoundEvents.ARMOR_EQUIP_COPPER,
          0.0f,
          0.0f,
          ItemTags.REPAIRS_COPPER_ARMOR,
          EXPOSED_COPPER_ASSET
  );

  public static final ArmorMaterial WEATHERED_COPPER_ARMOR_MATERIAL = new ArmorMaterial(
          14,
          Util.make(new EnumMap<>(ArmorType.class), map -> {
            map.put(ArmorType.BOOTS, 1);
            map.put(ArmorType.LEGGINGS, 3);
            map.put(ArmorType.CHESTPLATE, 4);
            map.put(ArmorType.HELMET, 2);
            map.put(ArmorType.BODY, 4);
          }),
          6,
          SoundEvents.ARMOR_EQUIP_COPPER,
          0.0f,
          0.02f,
          ItemTags.REPAIRS_COPPER_ARMOR,
          WEATHERED_COPPER_ASSET
  );

  public static final ArmorMaterial OXIDIZED_COPPER_ARMOR_MATERIAL = new ArmorMaterial(
          15,
          Util.make(new EnumMap<>(ArmorType.class), map -> {
            map.put(ArmorType.BOOTS, 1);
            map.put(ArmorType.LEGGINGS, 3);
            map.put(ArmorType.CHESTPLATE, 4);
            map.put(ArmorType.HELMET, 2);
            map.put(ArmorType.BODY, 4);
          }),
          5,
          SoundEvents.ARMOR_EQUIP_COPPER,
          0.0f,
          0.04f,
          ItemTags.REPAIRS_COPPER_ARMOR,
          OXIDIZED_COPPER_ASSET
  );
}
