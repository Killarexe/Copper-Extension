package github.killarexe.copper_extension.fabric.registry;

import java.util.HashMap;

import github.killarexe.copper_extension.materials.CEArmorMaterials;
import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.materials.CEToolMaterials;
import github.killarexe.copper_extension.resource.CEItemIds;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.ArmorType;

public class CEItems {
  private static final HashMap<ResourceKey<Item>, Item> ITEMS = new HashMap<>();

  public static final Item WAXED_COPPER_INGOT = createItem(CEItemIds.WAXED_COPPER_INGOT, new Item.Properties());
  public static final Item WAXED_EXPOSED_COPPER_INGOT = createItem(CEItemIds.WAXED_EXPOSED_COPPER_INGOT, new Item.Properties());
  public static final Item WAXED_WEATHERED_COPPER_INGOT = createItem(CEItemIds.WAXED_WEATHERED_COPPER_INGOT, new Item.Properties());
  public static final Item WAXED_OXIDIZED_COPPER_INGOT = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_INGOT, new Item.Properties());
  public static final Item EXPOSED_COPPER_INGOT = createItem(CEItemIds.EXPOSED_COPPER_INGOT, new Item.Properties());
  public static final Item WEATHERED_COPPER_INGOT = createItem(CEItemIds.WEATHERED_COPPER_INGOT, new Item.Properties());
  public static final Item OXIDIZED_COPPER_INGOT = createItem(CEItemIds.OXIDIZED_COPPER_INGOT, new Item.Properties());

  public static final Item WAXED_COPPER_NUGGET = createItem(CEItemIds.WAXED_COPPER_NUGGET, new Item.Properties());
  public static final Item WAXED_EXPOSED_COPPER_NUGGET = createItem(CEItemIds.WAXED_EXPOSED_COPPER_NUGGET, new Item.Properties());
  public static final Item WAXED_WEATHERED_COPPER_NUGGET = createItem(CEItemIds.WAXED_WEATHERED_COPPER_NUGGET, new Item.Properties());
  public static final Item WAXED_OXIDIZED_COPPER_NUGGET = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_NUGGET, new Item.Properties());
  public static final Item EXPOSED_COPPER_NUGGET = createItem(CEItemIds.EXPOSED_COPPER_NUGGET, new Item.Properties());
  public static final Item WEATHERED_COPPER_NUGGET = createItem(CEItemIds.WEATHERED_COPPER_NUGGET, new Item.Properties());
  public static final Item OXIDIZED_COPPER_NUGGET = createItem(CEItemIds.OXIDIZED_COPPER_NUGGET, new Item.Properties());


  public static final Item WAXED_COPPER_HELMET = createItem(CEItemIds.WAXED_COPPER_HELMET, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item WAXED_COPPER_CHESTPLATE = createItem(CEItemIds.WAXED_COPPER_CHESTPLATE, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item WAXED_COPPER_LEGGINGS = createItem(CEItemIds.WAXED_COPPER_LEGGINGS, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item WAXED_COPPER_BOOTS = createItem(CEItemIds.WAXED_COPPER_BOOTS, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));
  public static final Item WAXED_COPPER_HORSE_ARMOR = createItem(CEItemIds.WAXED_COPPER_HORSE_ARMOR, new Item.Properties().horseArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL));
  public static final Item WAXED_COPPER_NAUTILUS_ARMOR = createItem(CEItemIds.WAXED_COPPER_NAUTILUS_ARMOR, new Item.Properties().nautilusArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL));

  public static final Item WAXED_EXPOSED_COPPER_HELMET = createItem(CEItemIds.WAXED_EXPOSED_COPPER_HELMET, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item WAXED_EXPOSED_COPPER_CHESTPLATE = createItem(CEItemIds.WAXED_EXPOSED_COPPER_CHESTPLATE, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item WAXED_EXPOSED_COPPER_LEGGINGS = createItem(CEItemIds.WAXED_EXPOSED_COPPER_LEGGINGS, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item WAXED_EXPOSED_COPPER_BOOTS = createItem(CEItemIds.WAXED_EXPOSED_COPPER_BOOTS, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));
  public static final Item WAXED_EXPOSED_COPPER_HORSE_ARMOR = createItem(CEItemIds.WAXED_EXPOSED_COPPER_HORSE_ARMOR, new Item.Properties().horseArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL));
  public static final Item WAXED_EXPOSED_COPPER_NAUTILUS_ARMOR = createItem(CEItemIds.WAXED_EXPOSED_COPPER_NAUTILUS_ARMOR, new Item.Properties().nautilusArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL));

  public static final Item WAXED_WEATHERED_COPPER_HELMET = createItem(CEItemIds.WAXED_WEATHERED_COPPER_HELMET, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item WAXED_WEATHERED_COPPER_CHESTPLATE = createItem(CEItemIds.WAXED_WEATHERED_COPPER_CHESTPLATE, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item WAXED_WEATHERED_COPPER_LEGGINGS = createItem(CEItemIds.WAXED_WEATHERED_COPPER_LEGGINGS, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item WAXED_WEATHERED_COPPER_BOOTS = createItem(CEItemIds.WAXED_WEATHERED_COPPER_BOOTS, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));
  public static final Item WAXED_WEATHERED_COPPER_HORSE_ARMOR = createItem(CEItemIds.WAXED_WEATHERED_COPPER_HORSE_ARMOR, new Item.Properties().horseArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL));
  public static final Item WAXED_WEATHERED_COPPER_NAUTILUS_ARMOR = createItem(CEItemIds.WAXED_WEATHERED_COPPER_NAUTILUS_ARMOR, new Item.Properties().nautilusArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL));

  public static final Item WAXED_OXIDIZED_COPPER_HELMET = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_HELMET, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item WAXED_OXIDIZED_COPPER_CHESTPLATE = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_CHESTPLATE, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item WAXED_OXIDIZED_COPPER_LEGGINGS = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_LEGGINGS, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item WAXED_OXIDIZED_COPPER_BOOTS = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_BOOTS, new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));
  public static final Item WAXED_OXIDIZED_COPPER_HORSE_ARMOR = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_HORSE_ARMOR, new Item.Properties().horseArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL));
  public static final Item WAXED_OXIDIZED_COPPER_NAUTILUS_ARMOR = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_NAUTILUS_ARMOR, new Item.Properties().nautilusArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL));

  public static final Item EXPOSED_COPPER_HELMET = createItem(CEItemIds.EXPOSED_COPPER_HELMET, new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item EXPOSED_COPPER_CHESTPLATE = createItem(CEItemIds.EXPOSED_COPPER_CHESTPLATE, new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item EXPOSED_COPPER_LEGGINGS = createItem(CEItemIds.EXPOSED_COPPER_LEGGINGS, new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item EXPOSED_COPPER_BOOTS = createItem(CEItemIds.EXPOSED_COPPER_BOOTS, new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));
  public static final Item EXPOSED_COPPER_HORSE_ARMOR = createItem(CEItemIds.EXPOSED_COPPER_HORSE_ARMOR, new Item.Properties().horseArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL));
  public static final Item EXPOSED_COPPER_NAUTILUS_ARMOR = createItem(CEItemIds.EXPOSED_COPPER_NAUTILUS_ARMOR, new Item.Properties().nautilusArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL));

  public static final Item WEATHERED_COPPER_HELMET = createItem(CEItemIds.WEATHERED_COPPER_HELMET, new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item WEATHERED_COPPER_CHESTPLATE = createItem(CEItemIds.WEATHERED_COPPER_CHESTPLATE, new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item WEATHERED_COPPER_LEGGINGS = createItem(CEItemIds.WEATHERED_COPPER_LEGGINGS, new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item WEATHERED_COPPER_BOOTS = createItem(CEItemIds.WEATHERED_COPPER_BOOTS, new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));
  public static final Item WEATHERED_COPPER_HORSE_ARMOR = createItem(CEItemIds.WEATHERED_COPPER_HORSE_ARMOR, new Item.Properties().horseArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL));
  public static final Item WEATHERED_COPPER_NAUTILUS_ARMOR = createItem(CEItemIds.WEATHERED_COPPER_NAUTILUS_ARMOR, new Item.Properties().nautilusArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL));

  public static final Item OXIDIZED_COPPER_HELMET = createItem(CEItemIds.OXIDIZED_COPPER_HELMET, new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item OXIDIZED_COPPER_CHESTPLATE = createItem(CEItemIds.OXIDIZED_COPPER_CHESTPLATE, new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item OXIDIZED_COPPER_LEGGINGS = createItem(CEItemIds.OXIDIZED_COPPER_LEGGINGS, new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item OXIDIZED_COPPER_BOOTS = createItem(CEItemIds.OXIDIZED_COPPER_BOOTS, new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));
  public static final Item OXIDIZED_COPPER_HORSE_ARMOR = createItem(CEItemIds.OXIDIZED_COPPER_HORSE_ARMOR, new Item.Properties().horseArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL));
  public static final Item OXIDIZED_COPPER_NAUTILUS_ARMOR = createItem(CEItemIds.OXIDIZED_COPPER_NAUTILUS_ARMOR, new Item.Properties().nautilusArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL));


  public static final Item WAXED_COPPER_SWORD = createItem(CEItemIds.WAXED_COPPER_SWORD, new Item.Properties().sword(CEToolMaterials.WAXED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item WAXED_COPPER_AXE = createItem(CEItemIds.WAXED_COPPER_AXE, new Item.Properties().axe(CEToolMaterials.WAXED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Item WAXED_COPPER_PICKAXE = createItem(CEItemIds.WAXED_COPPER_PICKAXE, new Item.Properties().pickaxe(CEToolMaterials.WAXED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item WAXED_COPPER_SHOVEL = createItem(CEItemIds.WAXED_COPPER_SHOVEL, new Item.Properties().shovel(CEToolMaterials.WAXED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item WAXED_COPPER_HOE = createItem(CEItemIds.WAXED_COPPER_HOE, new Item.Properties().hoe(CEToolMaterials.WAXED_COPPER_MATERIAL, -1f, -2f));
  public static final Item WAXED_COPPER_SPEAR = createItem(CEItemIds.WAXED_COPPER_SPEAR, new Item.Properties().spear(CEToolMaterials.WAXED_COPPER_MATERIAL, 0.85F, 0.82F, 0.65F, 4.0F, 9.0F, 8.25F, 5.1F, 12.5F, 4.6F));

  public static final Item WAXED_EXPOSED_COPPER_SWORD = createItem(CEItemIds.WAXED_EXPOSED_COPPER_SWORD, new Item.Properties().sword(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item WAXED_EXPOSED_COPPER_AXE = createItem(CEItemIds.WAXED_EXPOSED_COPPER_AXE, new Item.Properties().axe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 7f, -3.35f));
  public static final Item WAXED_EXPOSED_COPPER_PICKAXE = createItem(CEItemIds.WAXED_EXPOSED_COPPER_PICKAXE, new Item.Properties().pickaxe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item WAXED_EXPOSED_COPPER_SHOVEL = createItem(CEItemIds.WAXED_EXPOSED_COPPER_SHOVEL, new Item.Properties().shovel(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item WAXED_EXPOSED_COPPER_HOE = createItem(CEItemIds.WAXED_EXPOSED_COPPER_HOE, new Item.Properties().hoe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, -1f, -2f));
  public static final Item WAXED_EXPOSED_COPPER_SPEAR = createItem(CEItemIds.WAXED_EXPOSED_COPPER_SPEAR, new Item.Properties().spear(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 0.85F, 0.82F, 0.65F, 4.0F, 9.0F, 8.25F, 5.1F, 12.5F, 4.6F));

  public static final Item WAXED_WEATHERED_COPPER_SWORD = createItem(CEItemIds.WAXED_WEATHERED_COPPER_SWORD, new Item.Properties().sword(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item WAXED_WEATHERED_COPPER_AXE = createItem(CEItemIds.WAXED_WEATHERED_COPPER_AXE, new Item.Properties().axe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Item WAXED_WEATHERED_COPPER_PICKAXE = createItem(CEItemIds.WAXED_WEATHERED_COPPER_PICKAXE, new Item.Properties().pickaxe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item WAXED_WEATHERED_COPPER_SHOVEL = createItem(CEItemIds.WAXED_WEATHERED_COPPER_SHOVEL, new Item.Properties().shovel(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item WAXED_WEATHERED_COPPER_HOE = createItem(CEItemIds.WAXED_WEATHERED_COPPER_HOE, new Item.Properties().hoe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, -1f, -2f));
  public static final Item WAXED_WEATHERED_COPPER_SPEAR = createItem(CEItemIds.WAXED_WEATHERED_COPPER_SPEAR, new Item.Properties().spear(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 0.85F, 0.82F, 0.65F, 4.0F, 9.0F, 8.25F, 5.1F, 12.5F, 4.6F));

  public static final Item WAXED_OXIDIZED_COPPER_SWORD = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_SWORD, new Item.Properties().sword(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item WAXED_OXIDIZED_COPPER_AXE = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_AXE, new Item.Properties().axe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Item WAXED_OXIDIZED_COPPER_PICKAXE = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_PICKAXE, new Item.Properties().pickaxe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item WAXED_OXIDIZED_COPPER_SHOVEL = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_SHOVEL, new Item.Properties().shovel(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item WAXED_OXIDIZED_COPPER_HOE = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_HOE, new Item.Properties().hoe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, -1f, -2f));
  public static final Item WAXED_OXIDIZED_COPPER_SPEAR = createItem(CEItemIds.WAXED_OXIDIZED_COPPER_SPEAR, new Item.Properties().spear(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 0.85F, 0.82F, 0.65F, 4.0F, 9.0F, 8.25F, 5.1F, 12.5F, 4.6F));

  public static final Item EXPOSED_COPPER_SWORD = createItem(CEItemIds.EXPOSED_COPPER_SWORD, new Item.Properties().sword(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item EXPOSED_COPPER_AXE = createItem(CEItemIds.EXPOSED_COPPER_AXE, new Item.Properties().axe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 7f, -3.3f));
  public static final Item EXPOSED_COPPER_PICKAXE = createItem(CEItemIds.EXPOSED_COPPER_PICKAXE, new Item.Properties().pickaxe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item EXPOSED_COPPER_SHOVEL = createItem(CEItemIds.EXPOSED_COPPER_SHOVEL, new Item.Properties().shovel(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item EXPOSED_COPPER_HOE = createItem(CEItemIds.EXPOSED_COPPER_HOE, new Item.Properties().hoe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, -1f, -2f));
  public static final Item EXPOSED_COPPER_SPEAR = createItem(CEItemIds.EXPOSED_COPPER_SPEAR, new Item.Properties().spear(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 0.85F, 0.82F, 0.65F, 4.0F, 9.0F, 8.25F, 5.1F, 12.5F, 4.6F));

  public static final Item WEATHERED_COPPER_SWORD = createItem(CEItemIds.WEATHERED_COPPER_SWORD, new Item.Properties().sword(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item WEATHERED_COPPER_AXE = createItem(CEItemIds.WEATHERED_COPPER_AXE, new Item.Properties().axe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Item WEATHERED_COPPER_PICKAXE = createItem(CEItemIds.WEATHERED_COPPER_PICKAXE, new Item.Properties().pickaxe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item WEATHERED_COPPER_SHOVEL = createItem(CEItemIds.WEATHERED_COPPER_SHOVEL, new Item.Properties().shovel(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item WEATHERED_COPPER_HOE = createItem(CEItemIds.WEATHERED_COPPER_HOE, new Item.Properties().hoe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, -1f, -2f));
  public static final Item WEATHERED_COPPER_SPEAR = createItem(CEItemIds.WEATHERED_COPPER_SPEAR, new Item.Properties().spear(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 0.85F, 0.82F, 0.65F, 4.0F, 9.0F, 8.25F, 5.1F, 12.5F, 4.6F));

  public static final Item OXIDIZED_COPPER_SWORD = createItem(CEItemIds.OXIDIZED_COPPER_SWORD, new Item.Properties().sword(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item OXIDIZED_COPPER_AXE = createItem(CEItemIds.OXIDIZED_COPPER_AXE, new Item.Properties().axe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Item OXIDIZED_COPPER_PICKAXE = createItem(CEItemIds.OXIDIZED_COPPER_PICKAXE, new Item.Properties().pickaxe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item OXIDIZED_COPPER_SHOVEL = createItem(CEItemIds.OXIDIZED_COPPER_SHOVEL, new Item.Properties().shovel(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item OXIDIZED_COPPER_HOE = createItem(CEItemIds.OXIDIZED_COPPER_HOE, new Item.Properties().hoe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, -1f, -2f));
  public static final Item OXIDIZED_COPPER_SPEAR = createItem(CEItemIds.OXIDIZED_COPPER_SPEAR, new Item.Properties().spear(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 0.85F, 0.82F, 0.65F, 4.0F, 9.0F, 8.25F, 5.1F, 12.5F, 4.6F));

  public static void register() {
      ITEMS.forEach((id, item) -> {
          Registry.register(BuiltInRegistries.ITEM, id, item);
      });
    ITEMS.clear();

    CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register((group) -> {
      group.insertAfter(
        Items.COPPER_INGOT,
        EXPOSED_COPPER_INGOT, WEATHERED_COPPER_INGOT, OXIDIZED_COPPER_INGOT,
        WAXED_COPPER_INGOT, WAXED_EXPOSED_COPPER_INGOT, WAXED_WEATHERED_COPPER_INGOT, WAXED_OXIDIZED_COPPER_INGOT
      );
      group.insertAfter(
        Items.COPPER_NUGGET,
        EXPOSED_COPPER_NUGGET, WEATHERED_COPPER_NUGGET, OXIDIZED_COPPER_NUGGET,
        WAXED_COPPER_NUGGET, WAXED_EXPOSED_COPPER_NUGGET, WAXED_WEATHERED_COPPER_NUGGET, WAXED_OXIDIZED_COPPER_NUGGET
      );
    });
    CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register((group) -> {
      group.insertAfter(
        Items.COPPER_SWORD,
        EXPOSED_COPPER_SWORD, WEATHERED_COPPER_SWORD, OXIDIZED_COPPER_SWORD,
        WAXED_COPPER_SWORD, WAXED_EXPOSED_COPPER_SWORD, WAXED_WEATHERED_COPPER_SWORD, WAXED_OXIDIZED_COPPER_SWORD
      );
      group.insertAfter(
        Items.COPPER_AXE,
        EXPOSED_COPPER_AXE, WEATHERED_COPPER_AXE, OXIDIZED_COPPER_AXE,
        WAXED_COPPER_AXE, WAXED_EXPOSED_COPPER_AXE, WAXED_WEATHERED_COPPER_AXE, WAXED_OXIDIZED_COPPER_AXE
      );
      group.insertAfter(
        Items.COPPER_BOOTS,
        EXPOSED_COPPER_HELMET, EXPOSED_COPPER_CHESTPLATE, EXPOSED_COPPER_LEGGINGS, EXPOSED_COPPER_BOOTS,
        WEATHERED_COPPER_HELMET, WEATHERED_COPPER_CHESTPLATE, WEATHERED_COPPER_LEGGINGS, WEATHERED_COPPER_BOOTS,
        OXIDIZED_COPPER_HELMET, OXIDIZED_COPPER_CHESTPLATE, OXIDIZED_COPPER_LEGGINGS, OXIDIZED_COPPER_BOOTS,
        WAXED_COPPER_HELMET, WAXED_COPPER_CHESTPLATE, WAXED_COPPER_LEGGINGS, WAXED_COPPER_BOOTS,
        WAXED_EXPOSED_COPPER_HELMET, WAXED_EXPOSED_COPPER_CHESTPLATE, WAXED_EXPOSED_COPPER_LEGGINGS, WAXED_EXPOSED_COPPER_BOOTS,
        WAXED_WEATHERED_COPPER_HELMET, WAXED_WEATHERED_COPPER_CHESTPLATE, WAXED_WEATHERED_COPPER_LEGGINGS, WAXED_WEATHERED_COPPER_BOOTS,
        WAXED_OXIDIZED_COPPER_HELMET, WAXED_OXIDIZED_COPPER_CHESTPLATE, WAXED_OXIDIZED_COPPER_LEGGINGS, WAXED_OXIDIZED_COPPER_BOOTS
      );
      group.insertAfter(
        Items.COPPER_HORSE_ARMOR,
        EXPOSED_COPPER_HORSE_ARMOR, WEATHERED_COPPER_HORSE_ARMOR, OXIDIZED_COPPER_HORSE_ARMOR,
        WAXED_COPPER_HORSE_ARMOR, WAXED_EXPOSED_COPPER_HORSE_ARMOR, WAXED_WEATHERED_COPPER_HORSE_ARMOR, WAXED_OXIDIZED_COPPER_HORSE_ARMOR
      );
      group.insertAfter(
        Items.COPPER_NAUTILUS_ARMOR,
        EXPOSED_COPPER_NAUTILUS_ARMOR, WEATHERED_COPPER_NAUTILUS_ARMOR, OXIDIZED_COPPER_NAUTILUS_ARMOR,
        WAXED_COPPER_NAUTILUS_ARMOR, WAXED_EXPOSED_COPPER_NAUTILUS_ARMOR, WAXED_WEATHERED_COPPER_NAUTILUS_ARMOR, WAXED_OXIDIZED_COPPER_NAUTILUS_ARMOR
      );
      group.insertAfter(
        Items.COPPER_SPEAR,
        EXPOSED_COPPER_SPEAR, WEATHERED_COPPER_SPEAR, OXIDIZED_COPPER_SPEAR,
        WAXED_COPPER_SPEAR, WAXED_EXPOSED_COPPER_SPEAR, WAXED_WEATHERED_COPPER_SPEAR, WAXED_OXIDIZED_COPPER_SPEAR
      );
    });
    CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register((group) -> {
      group.insertAfter(
        Items.COPPER_HOE,
        EXPOSED_COPPER_SHOVEL, EXPOSED_COPPER_PICKAXE, EXPOSED_COPPER_AXE, EXPOSED_COPPER_HOE,
        WEATHERED_COPPER_SHOVEL, WEATHERED_COPPER_PICKAXE, WEATHERED_COPPER_AXE, WEATHERED_COPPER_HOE,
        OXIDIZED_COPPER_SHOVEL, OXIDIZED_COPPER_PICKAXE, OXIDIZED_COPPER_AXE, OXIDIZED_COPPER_HOE,
        WAXED_COPPER_SHOVEL, WAXED_COPPER_PICKAXE, WAXED_COPPER_AXE, WAXED_COPPER_HOE,
        WAXED_EXPOSED_COPPER_SHOVEL, WAXED_EXPOSED_COPPER_PICKAXE, WAXED_EXPOSED_COPPER_AXE, WAXED_EXPOSED_COPPER_HOE,
        WAXED_WEATHERED_COPPER_SHOVEL, WAXED_WEATHERED_COPPER_PICKAXE, WAXED_WEATHERED_COPPER_AXE, WAXED_WEATHERED_COPPER_HOE,
        WAXED_OXIDIZED_COPPER_SHOVEL, WAXED_OXIDIZED_COPPER_PICKAXE, WAXED_OXIDIZED_COPPER_AXE, WAXED_OXIDIZED_COPPER_HOE
      );
    });
	}
	
  private static Item createItem(String id, Item.Properties properties) {
    ResourceKey<Item> itemId = ResourceKey.create(Registries.ITEM, CEMod.id(id));
    return createItem(itemId, properties);
  }

  private static Item createItem(ResourceKey<Item> id, Item.Properties properties) {
    Item item = new Item(properties.setId(id));
    ITEMS.put(id, item);
    return item;
  }
}
