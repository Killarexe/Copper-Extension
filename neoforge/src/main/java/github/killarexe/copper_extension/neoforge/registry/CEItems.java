package github.killarexe.copper_extension.neoforge.registry;

import java.util.function.Supplier;

import github.killarexe.copper_extension.materials.CEArmorMaterials;
import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.materials.CEToolMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CEItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CEMod.MOD_ID);

  
	public static final Supplier<Item> WAXED_COPPER_INGOT = ITEMS.registerSimpleItem("waxed_copper_ingot", new Item.Properties());
	public static final Supplier<Item> WAXED_EXPOSED_COPPER_INGOT = ITEMS.registerSimpleItem("waxed_exposed_copper_ingot", new Item.Properties());
	public static final Supplier<Item> WAXED_WEATHERED_COPPER_INGOT = ITEMS.registerSimpleItem("waxed_weathered_copper_ingot", new Item.Properties());
	public static final Supplier<Item> WAXED_OXIDIZED_COPPER_INGOT = ITEMS.registerSimpleItem("waxed_oxidized_copper_ingot", new Item.Properties());
	public static final Supplier<Item> EXPOSED_COPPER_INGOT = ITEMS.registerSimpleItem("exposed_copper_ingot", new Item.Properties());
	public static final Supplier<Item> WEATHERED_COPPER_INGOT = ITEMS.registerSimpleItem("weathered_copper_ingot", new Item.Properties());
	public static final Supplier<Item> OXIDIZED_COPPER_INGOT = ITEMS.registerSimpleItem("oxidized_copper_ingot", new Item.Properties());

  public static final Supplier<Item> WAXED_COPPER_NUGGET = ITEMS.registerSimpleItem("waxed_copper_nugget", new Item.Properties());
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_NUGGET = ITEMS.registerSimpleItem("waxed_exposed_copper_nugget", new Item.Properties());
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_NUGGET = ITEMS.registerSimpleItem("waxed_weathered_copper_nugget", new Item.Properties());
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_NUGGET = ITEMS.registerSimpleItem("waxed_oxidized_copper_nugget", new Item.Properties());
  public static final Supplier<Item> EXPOSED_COPPER_NUGGET = ITEMS.registerSimpleItem("exposed_copper_nugget", new Item.Properties());
  public static final Supplier<Item> WEATHERED_COPPER_NUGGET = ITEMS.registerSimpleItem("weathered_copper_nugget", new Item.Properties());
  public static final Supplier<Item> OXIDIZED_COPPER_NUGGET = ITEMS.registerSimpleItem("oxidized_copper_nugget", new Item.Properties());


  public static final Supplier<Item> WAXED_COPPER_HELMET = ITEMS.registerItem("waxed_copper_helmet", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET)));
  public static final Supplier<Item> WAXED_COPPER_CHESTPLATE = ITEMS.registerItem("waxed_copper_chestplate", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
  public static final Supplier<Item> WAXED_COPPER_LEGGINGS = ITEMS.registerItem("waxed_copper_leggings", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
  public static final Supplier<Item> WAXED_COPPER_BOOTS = ITEMS.registerItem("waxed_copper_boots", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS)));

  public static final Supplier<Item> WAXED_EXPOSED_COPPER_HELMET = ITEMS.registerItem("waxed_exposed_copper_helmet", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET)));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_CHESTPLATE = ITEMS.registerItem("waxed_exposed_copper_chestplate", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_LEGGINGS = ITEMS.registerItem("waxed_exposed_copper_leggings", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_BOOTS = ITEMS.registerItem("waxed_exposed_copper_boots", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS)));

  public static final Supplier<Item> WAXED_WEATHERED_COPPER_HELMET = ITEMS.registerItem("waxed_weathered_copper_helmet", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET)));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_CHESTPLATE = ITEMS.registerItem("waxed_weathered_copper_chestplate", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_LEGGINGS = ITEMS.registerItem("waxed_weathered_copper_leggings", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_BOOTS = ITEMS.registerItem("waxed_weathered_copper_boots", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS)));

  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_HELMET = ITEMS.registerItem("waxed_oxidized_copper_helmet", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET)));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_CHESTPLATE = ITEMS.registerItem("waxed_oxidized_copper_chestplate", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_LEGGINGS = ITEMS.registerItem("waxed_oxidized_copper_leggings", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_BOOTS = ITEMS.registerItem("waxed_oxidized_copper_boots", props -> new Item(props.humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS)));

  public static final Supplier<Item> EXPOSED_COPPER_HELMET = ITEMS.registerItem("exposed_copper_helmet", props -> new Item(props.humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET)));
  public static final Supplier<Item> EXPOSED_COPPER_CHESTPLATE = ITEMS.registerItem("exposed_copper_chestplate", props -> new Item(props.humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
  public static final Supplier<Item> EXPOSED_COPPER_LEGGINGS = ITEMS.registerItem("exposed_copper_leggings", props -> new Item(props.humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
  public static final Supplier<Item> EXPOSED_COPPER_BOOTS = ITEMS.registerItem("exposed_copper_boots", props -> new Item(props.humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS)));

  public static final Supplier<Item> WEATHERED_COPPER_HELMET = ITEMS.registerItem("weathered_copper_helmet", props -> new Item(props.humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET)));
  public static final Supplier<Item> WEATHERED_COPPER_CHESTPLATE = ITEMS.registerItem("weathered_copper_chestplate", props -> new Item(props.humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
  public static final Supplier<Item> WEATHERED_COPPER_LEGGINGS = ITEMS.registerItem("weathered_copper_leggings", props -> new Item(props.humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
  public static final Supplier<Item> WEATHERED_COPPER_BOOTS = ITEMS.registerItem("weathered_copper_boots", props -> new Item(props.humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS)));

  public static final Supplier<Item> OXIDIZED_COPPER_HELMET = ITEMS.registerItem("oxidized_copper_helmet", props -> new Item(props.humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET)));
  public static final Supplier<Item> OXIDIZED_COPPER_CHESTPLATE = ITEMS.registerItem("oxidized_copper_chestplate", props -> new Item(props.humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
  public static final Supplier<Item> OXIDIZED_COPPER_LEGGINGS = ITEMS.registerItem("oxidized_copper_leggings", props -> new Item(props.humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
  public static final Supplier<Item> OXIDIZED_COPPER_BOOTS = ITEMS.registerItem("oxidized_copper_boots", props -> new Item(props.humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS)));


  public static final Supplier<Item> WAXED_COPPER_SWORD = ITEMS.registerItem("waxed_copper_sword", props -> new Item(props.sword(CEToolMaterials.WAXED_COPPER_MATERIAL, 3f, -2.4f)));
  public static final Supplier<Item> WAXED_COPPER_AXE = ITEMS.registerItem("waxed_copper_axe", props -> new Item(props.axe(CEToolMaterials.WAXED_COPPER_MATERIAL, 7f, -3.2f)));
  public static final Supplier<Item> WAXED_COPPER_PICKAXE = ITEMS.registerItem("waxed_copper_pickaxe", props -> new Item(props.pickaxe(CEToolMaterials.WAXED_COPPER_MATERIAL, 1f, -2.8f)));
  public static final Supplier<Item> WAXED_COPPER_SHOVEL = ITEMS.registerItem("waxed_copper_shovel", props -> new Item(props.shovel(CEToolMaterials.WAXED_COPPER_MATERIAL, 1.5f, -3f)));
  public static final Supplier<Item> WAXED_COPPER_HOE = ITEMS.registerItem("waxed_copper_hoe", props -> new Item(props.hoe(CEToolMaterials.WAXED_COPPER_MATERIAL, -1f, -2f)));

  public static final Supplier<Item> WAXED_EXPOSED_COPPER_SWORD = ITEMS.registerItem("waxed_exposed_copper_sword", props -> new Item(props.sword(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 3f, -2.4f)));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_AXE = ITEMS.registerItem("waxed_exposed_copper_axe", props -> new Item(props.axe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 7f, -3.35f)));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_PICKAXE = ITEMS.registerItem("waxed_exposed_copper_pickaxe", props -> new Item(props.pickaxe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1f, -2.8f)));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_SHOVEL = ITEMS.registerItem("waxed_exposed_copper_shovel", props -> new Item(props.shovel(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1.5f, -3f)));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_HOE = ITEMS.registerItem("waxed_exposed_copper_hoe", props -> new Item(props.hoe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, -1f, -2f)));

  public static final Supplier<Item> WAXED_WEATHERED_COPPER_SWORD = ITEMS.registerItem("waxed_weathered_copper_sword", props -> new Item(props.sword(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 3f, -2.4f)));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_AXE = ITEMS.registerItem("waxed_weathered_copper_axe", props -> new Item(props.axe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 7f, -3.2f)));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_PICKAXE = ITEMS.registerItem("waxed_weathered_copper_pickaxe", props -> new Item(props.pickaxe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1f, -2.8f)));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_SHOVEL = ITEMS.registerItem("waxed_weathered_copper_shovel", props -> new Item(props.shovel(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1.5f, -3f)));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_HOE = ITEMS.registerItem("waxed_weathered_copper_hoe", props -> new Item(props.hoe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, -1f, -2f)));

  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_SWORD = ITEMS.registerItem("waxed_oxidized_copper_sword", props -> new Item(props.sword(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 3f, -2.4f)));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_AXE = ITEMS.registerItem("waxed_oxidized_copper_axe", props -> new Item(props.axe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 7f, -3.2f)));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_PICKAXE = ITEMS.registerItem("waxed_oxidized_copper_pickaxe", props -> new Item(props.pickaxe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1f, -2.8f)));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_SHOVEL = ITEMS.registerItem("waxed_oxidized_copper_shovel", props -> new Item(props.shovel(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1.5f, -3f)));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_HOE = ITEMS.registerItem("waxed_oxidized_copper_hoe", props -> new Item(props.hoe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, -1f, -2f)));

  public static final Supplier<Item> EXPOSED_COPPER_SWORD = ITEMS.registerItem("exposed_copper_sword", props -> new Item(props.sword(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 3f, -2.4f)));
  public static final Supplier<Item> EXPOSED_COPPER_AXE = ITEMS.registerItem("exposed_copper_axe", props -> new Item(props.axe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 7f, -3.3f)));
  public static final Supplier<Item> EXPOSED_COPPER_PICKAXE = ITEMS.registerItem("exposed_copper_pickaxe", props -> new Item(props.pickaxe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1f, -2.8f)));
  public static final Supplier<Item> EXPOSED_COPPER_SHOVEL = ITEMS.registerItem("exposed_copper_shovel", props -> new Item(props.shovel(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1.5f, -3f)));
  public static final Supplier<Item> EXPOSED_COPPER_HOE = ITEMS.registerItem("exposed_copper_hoe", props -> new Item(props.hoe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, -1f, -2f)));

  public static final Supplier<Item> WEATHERED_COPPER_SWORD = ITEMS.registerItem("weathered_copper_sword", props -> new Item(props.sword(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 3f, -2.4f)));
  public static final Supplier<Item> WEATHERED_COPPER_AXE = ITEMS.registerItem("weathered_copper_axe", props -> new Item(props.axe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 7f, -3.2f)));
  public static final Supplier<Item> WEATHERED_COPPER_PICKAXE = ITEMS.registerItem("weathered_copper_pickaxe", props -> new Item(props.pickaxe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1f, -2.8f)));
  public static final Supplier<Item> WEATHERED_COPPER_SHOVEL = ITEMS.registerItem("weathered_copper_shovel", props -> new Item(props.shovel(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1.5f, -3f)));
  public static final Supplier<Item> WEATHERED_COPPER_HOE = ITEMS.registerItem("weathered_copper_hoe", props -> new Item(props.hoe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, -1f, -2f)));

  public static final Supplier<Item> OXIDIZED_COPPER_SWORD = ITEMS.registerItem("oxidized_copper_sword", props -> new Item(props.sword(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 3f, -2.4f)));
  public static final Supplier<Item> OXIDIZED_COPPER_AXE = ITEMS.registerItem("oxidized_copper_axe", props -> new Item(props.axe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 7f, -3.2f)));
  public static final Supplier<Item> OXIDIZED_COPPER_PICKAXE = ITEMS.registerItem("oxidized_copper_pickaxe", props -> new Item(props.pickaxe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1f, -2.8f)));
  public static final Supplier<Item> OXIDIZED_COPPER_SHOVEL = ITEMS.registerItem("oxidized_copper_shovel", props -> new Item(props.shovel(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1.5f, -3f)));
  public static final Supplier<Item> OXIDIZED_COPPER_HOE = ITEMS.registerItem("oxidized_copper_hoe", props -> new Item(props.hoe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, -1f, -2f)));
}
