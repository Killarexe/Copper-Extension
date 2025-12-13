package github.killarexe.copper_extension.fabric.registry;

import java.util.HashMap;

import github.killarexe.copper_extension.CEArmorMaterials;
import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.CEToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.ArmorType;

public class CEItems {
	private static final HashMap<String, Item> ITEMS = new HashMap<>();

	public static final Item WAXED_COPPER_INGOT = createItem("waxed_copper_ingot", new Item.Properties());
	public static final Item WAXED_EXPOSED_COPPER_INGOT = createItem("waxed_exposed_copper_ingot", new Item.Properties());
	public static final Item WAXED_WEATHERED_COPPER_INGOT = createItem("waxed_weathered_copper_ingot", new Item.Properties());
	public static final Item WAXED_OXIDIZED_COPPER_INGOT = createItem("waxed_oxidized_copper_ingot", new Item.Properties());
	public static final Item EXPOSED_COPPER_INGOT = createItem("exposed_copper_ingot", new Item.Properties());
	public static final Item WEATHERED_COPPER_INGOT = createItem("weathered_copper_ingot", new Item.Properties());
	public static final Item OXIDIZED_COPPER_INGOT = createItem("oxidized_copper_ingot", new Item.Properties());

  public static final Item WAXED_COPPER_NUGGET = createItem("waxed_copper_nugget", new Item.Properties());
  public static final Item WAXED_EXPOSED_COPPER_NUGGET = createItem("waxed_exposed_copper_nugget", new Item.Properties());
  public static final Item WAXED_WEATHERED_COPPER_NUGGET = createItem("waxed_weathered_copper_nugget", new Item.Properties());
  public static final Item WAXED_OXIDIZED_COPPER_NUGGET = createItem("waxed_oxidized_copper_nugget", new Item.Properties());
  public static final Item EXPOSED_COPPER_NUGGET = createItem("exposed_copper_nugget", new Item.Properties());
  public static final Item WEATHERED_COPPER_NUGGET = createItem("weathered_copper_nugget", new Item.Properties());
  public static final Item OXIDIZED_COPPER_NUGGET = createItem("oxidized_copper_nugget", new Item.Properties());


  public static final Item WAXED_COPPER_HELMET = createItem("waxed_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item WAXED_COPPER_CHESTPLATE = createItem("waxed_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item WAXED_COPPER_LEGGINGS = createItem("waxed_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item WAXED_COPPER_BOOTS = createItem("waxed_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Item WAXED_EXPOSED_COPPER_HELMET = createItem("waxed_exposed_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item WAXED_EXPOSED_COPPER_CHESTPLATE = createItem("waxed_exposed_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item WAXED_EXPOSED_COPPER_LEGGINGS = createItem("waxed_exposed_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item WAXED_EXPOSED_COPPER_BOOTS = createItem("waxed_exposed_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Item WAXED_WEATHERED_COPPER_HELMET = createItem("waxed_weathered_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item WAXED_WEATHERED_COPPER_CHESTPLATE = createItem("waxed_weathered_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item WAXED_WEATHERED_COPPER_LEGGINGS = createItem("waxed_weathered_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item WAXED_WEATHERED_COPPER_BOOTS = createItem("waxed_weathered_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Item WAXED_OXIDIZED_COPPER_HELMET = createItem("waxed_oxidized_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item WAXED_OXIDIZED_COPPER_CHESTPLATE = createItem("waxed_oxidized_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item WAXED_OXIDIZED_COPPER_LEGGINGS = createItem("waxed_oxidized_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item WAXED_OXIDIZED_COPPER_BOOTS = createItem("waxed_oxidized_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Item EXPOSED_COPPER_HELMET = createItem("exposed_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item EXPOSED_COPPER_CHESTPLATE = createItem("exposed_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item EXPOSED_COPPER_LEGGINGS = createItem("exposed_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item EXPOSED_COPPER_BOOTS = createItem("exposed_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Item WEATHERED_COPPER_HELMET = createItem("weathered_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item WEATHERED_COPPER_CHESTPLATE = createItem("weathered_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item WEATHERED_COPPER_LEGGINGS = createItem("weathered_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item WEATHERED_COPPER_BOOTS = createItem("weathered_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));

  public static final Item OXIDIZED_COPPER_HELMET = createItem("oxidized_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET));
  public static final Item OXIDIZED_COPPER_CHESTPLATE = createItem("oxidized_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE));
  public static final Item OXIDIZED_COPPER_LEGGINGS = createItem("oxidized_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS));
  public static final Item OXIDIZED_COPPER_BOOTS = createItem("oxidized_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS));


  public static final Item WAXED_COPPER_SWORD = createItem("waxed_copper_sword", new Item.Properties().sword(CEToolMaterials.WAXED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item WAXED_COPPER_AXE = createItem("waxed_copper_axe", new Item.Properties().axe(CEToolMaterials.WAXED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Item WAXED_COPPER_PICKAXE = createItem("waxed_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.WAXED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item WAXED_COPPER_SHOVEL = createItem("waxed_copper_shovel", new Item.Properties().shovel(CEToolMaterials.WAXED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item WAXED_COPPER_HOE = createItem("waxed_copper_hoe", new Item.Properties().hoe(CEToolMaterials.WAXED_COPPER_MATERIAL, -1f, -2f));

  public static final Item WAXED_EXPOSED_COPPER_SWORD = createItem("waxed_exposed_copper_sword", new Item.Properties().sword(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item WAXED_EXPOSED_COPPER_AXE = createItem("waxed_exposed_copper_axe", new Item.Properties().axe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 7f, -3.35f));
  public static final Item WAXED_EXPOSED_COPPER_PICKAXE = createItem("waxed_exposed_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item WAXED_EXPOSED_COPPER_SHOVEL = createItem("waxed_exposed_copper_shovel", new Item.Properties().shovel(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item WAXED_EXPOSED_COPPER_HOE = createItem("waxed_exposed_copper_hoe", new Item.Properties().hoe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, -1f, -2f));

  public static final Item WAXED_WEATHERED_COPPER_SWORD = createItem("waxed_weathered_copper_sword", new Item.Properties().sword(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item WAXED_WEATHERED_COPPER_AXE = createItem("waxed_weathered_copper_axe", new Item.Properties().axe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Item WAXED_WEATHERED_COPPER_PICKAXE = createItem("waxed_weathered_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item WAXED_WEATHERED_COPPER_SHOVEL = createItem("waxed_weathered_copper_shovel", new Item.Properties().shovel(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item WAXED_WEATHERED_COPPER_HOE = createItem("waxed_weathered_copper_hoe", new Item.Properties().hoe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, -1f, -2f));

  public static final Item WAXED_OXIDIZED_COPPER_SWORD = createItem("waxed_oxidized_copper_sword", new Item.Properties().sword(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item WAXED_OXIDIZED_COPPER_AXE = createItem("waxed_oxidized_copper_axe", new Item.Properties().axe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Item WAXED_OXIDIZED_COPPER_PICKAXE = createItem("waxed_oxidized_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item WAXED_OXIDIZED_COPPER_SHOVEL = createItem("waxed_oxidized_copper_shovel", new Item.Properties().shovel(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item WAXED_OXIDIZED_COPPER_HOE = createItem("waxed_oxidized_copper_hoe", new Item.Properties().hoe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, -1f, -2f));

  public static final Item EXPOSED_COPPER_SWORD = createItem("exposed_copper_sword", new Item.Properties().sword(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item EXPOSED_COPPER_AXE = createItem("exposed_copper_axe", new Item.Properties().axe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 7f, -3.3f));
  public static final Item EXPOSED_COPPER_PICKAXE = createItem("exposed_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item EXPOSED_COPPER_SHOVEL = createItem("exposed_copper_shovel", new Item.Properties().shovel(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item EXPOSED_COPPER_HOE = createItem("exposed_copper_hoe", new Item.Properties().hoe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, -1f, -2f));

  public static final Item WEATHERED_COPPER_SWORD = createItem("weathered_copper_sword", new Item.Properties().sword(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item WEATHERED_COPPER_AXE = createItem("weathered_copper_axe", new Item.Properties().axe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Item WEATHERED_COPPER_PICKAXE = createItem("weathered_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item WEATHERED_COPPER_SHOVEL = createItem("weathered_copper_shovel", new Item.Properties().shovel(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item WEATHERED_COPPER_HOE = createItem("weathered_copper_hoe", new Item.Properties().hoe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, -1f, -2f));

  public static final Item OXIDIZED_COPPER_SWORD = createItem("oxidized_copper_sword", new Item.Properties().sword(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 3f, -2.4f));
  public static final Item OXIDIZED_COPPER_AXE = createItem("oxidized_copper_axe", new Item.Properties().axe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 7f, -3.2f));
  public static final Item OXIDIZED_COPPER_PICKAXE = createItem("oxidized_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1f, -2.8f));
  public static final Item OXIDIZED_COPPER_SHOVEL = createItem("oxidized_copper_shovel", new Item.Properties().shovel(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1.5f, -3f));
  public static final Item OXIDIZED_COPPER_HOE = createItem("oxidized_copper_hoe", new Item.Properties().hoe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, -1f, -2f));

	public static void register() {
		ITEMS.forEach((id, item) -> {
			Registry.register(BuiltInRegistries.ITEM, CEMod.id(id), item);
		});
    ITEMS.clear();

    ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register((group) -> {
      group.addAfter(
              Items.COPPER_INGOT,
              EXPOSED_COPPER_INGOT, WEATHERED_COPPER_INGOT, OXIDIZED_COPPER_INGOT,
              WAXED_COPPER_INGOT, WAXED_EXPOSED_COPPER_INGOT, WAXED_WEATHERED_COPPER_INGOT, WAXED_OXIDIZED_COPPER_INGOT
      );
      group.addAfter(
              Items.COPPER_NUGGET,
              EXPOSED_COPPER_NUGGET, WEATHERED_COPPER_NUGGET, OXIDIZED_COPPER_NUGGET,
              WAXED_COPPER_NUGGET, WAXED_EXPOSED_COPPER_NUGGET, WAXED_WEATHERED_COPPER_NUGGET, WAXED_OXIDIZED_COPPER_NUGGET
      );
    });
    ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register((group) -> {
      group.addAfter(
              Items.COPPER_SWORD,
              EXPOSED_COPPER_SWORD, WEATHERED_COPPER_SWORD, OXIDIZED_COPPER_SWORD,
              WAXED_COPPER_SWORD, WAXED_EXPOSED_COPPER_SWORD, WAXED_WEATHERED_COPPER_SWORD, WAXED_OXIDIZED_COPPER_SWORD
      );
      group.addAfter(
              Items.COPPER_AXE,
              EXPOSED_COPPER_AXE, WEATHERED_COPPER_AXE, OXIDIZED_COPPER_AXE,
              WAXED_COPPER_AXE, WAXED_EXPOSED_COPPER_AXE, WAXED_WEATHERED_COPPER_AXE, WAXED_OXIDIZED_COPPER_AXE
      );
      group.addAfter(
              Items.COPPER_BOOTS,
              EXPOSED_COPPER_HELMET, EXPOSED_COPPER_CHESTPLATE, EXPOSED_COPPER_LEGGINGS, EXPOSED_COPPER_BOOTS,
              WEATHERED_COPPER_HELMET, WEATHERED_COPPER_CHESTPLATE, WEATHERED_COPPER_LEGGINGS, WEATHERED_COPPER_BOOTS,
              OXIDIZED_COPPER_HELMET, OXIDIZED_COPPER_CHESTPLATE, OXIDIZED_COPPER_LEGGINGS, OXIDIZED_COPPER_BOOTS,
              WAXED_COPPER_HELMET, WAXED_COPPER_CHESTPLATE, WAXED_COPPER_LEGGINGS, WAXED_COPPER_BOOTS,
              WAXED_EXPOSED_COPPER_HELMET, WAXED_EXPOSED_COPPER_CHESTPLATE, WAXED_EXPOSED_COPPER_LEGGINGS, WAXED_EXPOSED_COPPER_BOOTS,
              WAXED_WEATHERED_COPPER_HELMET, WAXED_WEATHERED_COPPER_CHESTPLATE, WAXED_WEATHERED_COPPER_LEGGINGS, WAXED_WEATHERED_COPPER_BOOTS,
              WAXED_OXIDIZED_COPPER_HELMET, WAXED_OXIDIZED_COPPER_CHESTPLATE, WAXED_OXIDIZED_COPPER_LEGGINGS, WAXED_OXIDIZED_COPPER_BOOTS
      );
    });
    ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register((group) -> {
      group.addAfter(
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
    Item item = new Item(properties.setId(itemId));
    ITEMS.put(id, item);
    return item;
  }
}
