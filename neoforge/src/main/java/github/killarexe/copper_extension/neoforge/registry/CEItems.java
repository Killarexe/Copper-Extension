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

	public static final Supplier<Item> WAXED_COPPER_INGOT = createItem("waxed_copper_ingot", new Item.Properties());
	public static final Supplier<Item> WAXED_EXPOSED_COPPER_INGOT = createItem("waxed_exposed_copper_ingot", new Item.Properties());
	public static final Supplier<Item> WAXED_WEATHERED_COPPER_INGOT = createItem("waxed_weathered_copper_ingot", new Item.Properties());
	public static final Supplier<Item> WAXED_OXIDIZED_COPPER_INGOT = createItem("waxed_oxidized_copper_ingot", new Item.Properties());
	public static final Supplier<Item> EXPOSED_COPPER_INGOT = createItem("exposed_copper_ingot", new Item.Properties());
	public static final Supplier<Item> WEATHERED_COPPER_INGOT = createItem("weathered_copper_ingot", new Item.Properties());
	public static final Supplier<Item> OXIDIZED_COPPER_INGOT = createItem("oxidized_copper_ingot", new Item.Properties());

  public static final Supplier<Item> WAXED_COPPER_NUGGET = createItem("waxed_copper_nugget", new Item.Properties());
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_NUGGET = createItem("waxed_exposed_copper_nugget", new Item.Properties());
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_NUGGET = createItem("waxed_weathered_copper_nugget", new Item.Properties());
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_NUGGET = createItem("waxed_oxidized_copper_nugget", new Item.Properties());
  public static final Supplier<Item> EXPOSED_COPPER_NUGGET = createItem("exposed_copper_nugget", new Item.Properties());
  public static final Supplier<Item> WEATHERED_COPPER_NUGGET = createItem("weathered_copper_nugget", new Item.Properties());
  public static final Supplier<Item> OXIDIZED_COPPER_NUGGET = createItem("oxidized_copper_nugget", new Item.Properties());


  public static final Supplier<Item> WAXED_COPPER_HELMET = ITEMS.registerSimpleItem("waxed_copper_helmet", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Supplier<Item> WAXED_COPPER_CHESTPLATE = ITEMS.registerSimpleItem("waxed_copper_chestplate", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Supplier<Item> WAXED_COPPER_LEGGINGS = ITEMS.registerSimpleItem("waxed_copper_leggings", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Supplier<Item> WAXED_COPPER_BOOTS = ITEMS.registerSimpleItem("waxed_copper_boots", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Supplier<Item> WAXED_EXPOSED_COPPER_HELMET = ITEMS.registerSimpleItem("waxed_exposed_copper_helmet", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_CHESTPLATE = ITEMS.registerSimpleItem("waxed_exposed_copper_chestplate", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_LEGGINGS = ITEMS.registerSimpleItem("waxed_exposed_copper_leggings", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_BOOTS = ITEMS.registerSimpleItem("waxed_exposed_copper_boots", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Supplier<Item> WAXED_WEATHERED_COPPER_HELMET = ITEMS.registerSimpleItem("waxed_weathered_copper_helmet", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_CHESTPLATE = ITEMS.registerSimpleItem("waxed_weathered_copper_chestplate", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_LEGGINGS = ITEMS.registerSimpleItem("waxed_weathered_copper_leggings", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_BOOTS = ITEMS.registerSimpleItem("waxed_weathered_copper_boots", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_HELMET = ITEMS.registerSimpleItem("waxed_oxidized_copper_helmet", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_CHESTPLATE = ITEMS.registerSimpleItem("waxed_oxidized_copper_chestplate", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_LEGGINGS = ITEMS.registerSimpleItem("waxed_oxidized_copper_leggings", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_BOOTS = ITEMS.registerSimpleItem("waxed_oxidized_copper_boots", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Supplier<Item> EXPOSED_COPPER_HELMET = ITEMS.registerSimpleItem("exposed_copper_helmet", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Supplier<Item> EXPOSED_COPPER_CHESTPLATE = ITEMS.registerSimpleItem("exposed_copper_chestplate", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Supplier<Item> EXPOSED_COPPER_LEGGINGS = ITEMS.registerSimpleItem("exposed_copper_leggings", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Supplier<Item> EXPOSED_COPPER_BOOTS = ITEMS.registerSimpleItem("exposed_copper_boots", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Supplier<Item> WEATHERED_COPPER_HELMET = ITEMS.registerSimpleItem("weathered_copper_helmet", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Supplier<Item> WEATHERED_COPPER_CHESTPLATE = ITEMS.registerSimpleItem("weathered_copper_chestplate", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Supplier<Item> WEATHERED_COPPER_LEGGINGS = ITEMS.registerSimpleItem("weathered_copper_leggings", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Supplier<Item> WEATHERED_COPPER_BOOTS = ITEMS.registerSimpleItem("weathered_copper_boots", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Supplier<Item> OXIDIZED_COPPER_HELMET = ITEMS.registerSimpleItem("oxidized_copper_helmet", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Supplier<Item> OXIDIZED_COPPER_CHESTPLATE = ITEMS.registerSimpleItem("oxidized_copper_chestplate", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Supplier<Item> OXIDIZED_COPPER_LEGGINGS = ITEMS.registerSimpleItem("oxidized_copper_leggings", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Supplier<Item> OXIDIZED_COPPER_BOOTS = ITEMS.registerSimpleItem("oxidized_copper_boots", props ->  new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));


  public static final Supplier<Item> WAXED_COPPER_SWORD = ITEMS.registerSimpleItem("waxed_copper_sword", props ->  new Item.Properties().sword(CEToolMaterials.WAXED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Supplier<Item> WAXED_COPPER_AXE = ITEMS.registerSimpleItem("waxed_copper_axe", props ->  new Item.Properties().axe(CEToolMaterials.WAXED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Supplier<Item> WAXED_COPPER_PICKAXE = ITEMS.registerSimpleItem("waxed_copper_pickaxe", props ->  new Item.Properties().pickaxe(CEToolMaterials.WAXED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Supplier<Item> WAXED_COPPER_SHOVEL = ITEMS.registerSimpleItem("waxed_copper_shovel", props ->  new Item.Properties().shovel(CEToolMaterials.WAXED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Supplier<Item> WAXED_COPPER_HOE = ITEMS.registerSimpleItem("waxed_copper_hoe", props ->  new Item.Properties().hoe(CEToolMaterials.WAXED_COPPER_MATERIAL, -1f, -2f));

  public static final Supplier<Item> WAXED_EXPOSED_COPPER_SWORD = ITEMS.registerSimpleItem("waxed_exposed_copper_sword", props ->  new Item.Properties().sword(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_AXE = ITEMS.registerSimpleItem("waxed_exposed_copper_axe", props ->  new Item.Properties().axe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 7f, -3.35f));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_PICKAXE = ITEMS.registerSimpleItem("waxed_exposed_copper_pickaxe", props ->  new Item.Properties().pickaxe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_SHOVEL = ITEMS.registerSimpleItem("waxed_exposed_copper_shovel", props ->  new Item.Properties().shovel(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Supplier<Item> WAXED_EXPOSED_COPPER_HOE = ITEMS.registerSimpleItem("waxed_exposed_copper_hoe", props ->  new Item.Properties().hoe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, -1f, -2f));

  public static final Supplier<Item> WAXED_WEATHERED_COPPER_SWORD = ITEMS.registerSimpleItem("waxed_weathered_copper_sword", props ->  new Item.Properties().sword(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_AXE = ITEMS.registerSimpleItem("waxed_weathered_copper_axe", props ->  new Item.Properties().axe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_PICKAXE = ITEMS.registerSimpleItem("waxed_weathered_copper_pickaxe", props ->  new Item.Properties().pickaxe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_SHOVEL = ITEMS.registerSimpleItem("waxed_weathered_copper_shovel", props ->  new Item.Properties().shovel(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Supplier<Item> WAXED_WEATHERED_COPPER_HOE = ITEMS.registerSimpleItem("waxed_weathered_copper_hoe", props ->  new Item.Properties().hoe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, -1f, -2f));

  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_SWORD = ITEMS.registerSimpleItem("waxed_oxidized_copper_sword", props ->  new Item.Properties().sword(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_AXE = ITEMS.registerSimpleItem("waxed_oxidized_copper_axe", props ->  new Item.Properties().axe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_PICKAXE = ITEMS.registerSimpleItem("waxed_oxidized_copper_pickaxe", props ->  new Item.Properties().pickaxe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_SHOVEL = ITEMS.registerSimpleItem("waxed_oxidized_copper_shovel", props ->  new Item.Properties().shovel(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Supplier<Item> WAXED_OXIDIZED_COPPER_HOE = ITEMS.registerSimpleItem("waxed_oxidized_copper_hoe", props ->  new Item.Properties().hoe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, -1f, -2f));

  public static final Supplier<Item> EXPOSED_COPPER_SWORD = ITEMS.registerSimpleItem("exposed_copper_sword", props ->  new Item.Properties().sword(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Supplier<Item> EXPOSED_COPPER_AXE = ITEMS.registerSimpleItem("exposed_copper_axe", props ->  new Item.Properties().axe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 7f, -3.3f));
  public static final Supplier<Item> EXPOSED_COPPER_PICKAXE = ITEMS.registerSimpleItem("exposed_copper_pickaxe", props ->  new Item.Properties().pickaxe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Supplier<Item> EXPOSED_COPPER_SHOVEL = ITEMS.registerSimpleItem("exposed_copper_shovel", props ->  new Item.Properties().shovel(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Supplier<Item> EXPOSED_COPPER_HOE = ITEMS.registerSimpleItem("exposed_copper_hoe", props ->  new Item.Properties().hoe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, -1f, -2f));

  public static final Supplier<Item> WEATHERED_COPPER_SWORD = ITEMS.registerSimpleItem("weathered_copper_sword", props ->  new Item.Properties().sword(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Supplier<Item> WEATHERED_COPPER_AXE = ITEMS.registerSimpleItem("weathered_copper_axe", props ->  new Item.Properties().axe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Supplier<Item> WEATHERED_COPPER_PICKAXE = ITEMS.registerSimpleItem("weathered_copper_pickaxe", props ->  new Item.Properties().pickaxe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Supplier<Item> WEATHERED_COPPER_SHOVEL = ITEMS.registerSimpleItem("weathered_copper_shovel", props ->  new Item.Properties().shovel(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Supplier<Item> WEATHERED_COPPER_HOE = ITEMS.registerSimpleItem("weathered_copper_hoe", props ->  new Item.Properties().hoe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, -1f, -2f));

  public static final Supplier<Item> OXIDIZED_COPPER_SWORD = ITEMS.registerSimpleItem("oxidized_copper_sword", props ->  new Item.Properties().sword(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Supplier<Item> OXIDIZED_COPPER_AXE = ITEMS.registerSimpleItem("oxidized_copper_axe", props ->  new Item.Properties().axe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Supplier<Item> OXIDIZED_COPPER_PICKAXE = ITEMS.registerSimpleItem("oxidized_copper_pickaxe", props ->  new Item.Properties().pickaxe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Supplier<Item> OXIDIZED_COPPER_SHOVEL = ITEMS.registerSimpleItem("oxidized_copper_shovel", props ->  new Item.Properties().shovel(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Supplier<Item> OXIDIZED_COPPER_HOE = ITEMS.registerSimpleItem("oxidized_copper_hoe", props ->  new Item.Properties().hoe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, -1f, -2f));

	private static Supplier<Item> createItem(String id, Item.Properties properties) {
		return ITEMS.registerSimpleItem(id, properties1 -> properties);
	}
}
