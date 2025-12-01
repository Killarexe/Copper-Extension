package github.killarexe.copper_extension.fabric.registry;

import java.util.HashMap;

import github.killarexe.copper_extension.CEArmorMaterials;
import github.killarexe.copper_extension.CEMaps;
import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.CEToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.ArmorType;
import oshi.util.tuples.Pair;

public class CEItems {
	private static final HashMap<String, Pair<Item, ResourceKey<CreativeModeTab>>> ITEMS = new HashMap<>();

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


  public static final Item WAXED_COPPER_HELMET = createItemWithTab("waxed_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET), CreativeModeTabs.COMBAT);
  public static final Item WAXED_COPPER_CHESTPLATE = createItemWithTab("waxed_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE), CreativeModeTabs.COMBAT);
  public static final Item WAXED_COPPER_LEGGINGS = createItemWithTab("waxed_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS), CreativeModeTabs.COMBAT);
  public static final Item WAXED_COPPER_BOOTS = createItemWithTab("waxed_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS), CreativeModeTabs.COMBAT);

  public static final Item WAXED_EXPOSED_COPPER_HELMET = createItemWithTab("waxed_exposed_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET), CreativeModeTabs.COMBAT);
  public static final Item WAXED_EXPOSED_COPPER_CHESTPLATE = createItemWithTab("waxed_exposed_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE), CreativeModeTabs.COMBAT);
  public static final Item WAXED_EXPOSED_COPPER_LEGGINGS = createItemWithTab("waxed_exposed_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS), CreativeModeTabs.COMBAT);
  public static final Item WAXED_EXPOSED_COPPER_BOOTS = createItemWithTab("waxed_exposed_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS), CreativeModeTabs.COMBAT);

  public static final Item WAXED_WEATHERED_COPPER_HELMET = createItemWithTab("waxed_weathered_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET), CreativeModeTabs.COMBAT);
  public static final Item WAXED_WEATHERED_COPPER_CHESTPLATE = createItemWithTab("waxed_weathered_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE), CreativeModeTabs.COMBAT);
  public static final Item WAXED_WEATHERED_COPPER_LEGGINGS = createItemWithTab("waxed_weathered_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS), CreativeModeTabs.COMBAT);
  public static final Item WAXED_WEATHERED_COPPER_BOOTS = createItemWithTab("waxed_weathered_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS), CreativeModeTabs.COMBAT);

  public static final Item WAXED_OXIDIZED_COPPER_HELMET = createItemWithTab("waxed_oxidized_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET), CreativeModeTabs.COMBAT);
  public static final Item WAXED_OXIDIZED_COPPER_CHESTPLATE = createItemWithTab("waxed_oxidized_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE), CreativeModeTabs.COMBAT);
  public static final Item WAXED_OXIDIZED_COPPER_LEGGINGS = createItemWithTab("waxed_oxidized_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS), CreativeModeTabs.COMBAT);
  public static final Item WAXED_OXIDIZED_COPPER_BOOTS = createItemWithTab("waxed_oxidized_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.WAXED_OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS), CreativeModeTabs.COMBAT);

  public static final Item EXPOSED_COPPER_HELMET = createItemWithTab("exposed_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET), CreativeModeTabs.COMBAT);
  public static final Item EXPOSED_COPPER_CHESTPLATE = createItemWithTab("exposed_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE), CreativeModeTabs.COMBAT);
  public static final Item EXPOSED_COPPER_LEGGINGS = createItemWithTab("exposed_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS), CreativeModeTabs.COMBAT);
  public static final Item EXPOSED_COPPER_BOOTS = createItemWithTab("exposed_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.EXPOSED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS), CreativeModeTabs.COMBAT);

  public static final Item WEATHERED_COPPER_HELMET = createItemWithTab("weathered_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET), CreativeModeTabs.COMBAT);
  public static final Item WEATHERED_COPPER_CHESTPLATE = createItemWithTab("weathered_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE), CreativeModeTabs.COMBAT);
  public static final Item WEATHERED_COPPER_LEGGINGS = createItemWithTab("weathered_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS), CreativeModeTabs.COMBAT);
  public static final Item WEATHERED_COPPER_BOOTS = createItemWithTab("weathered_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.WEATHERED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS), CreativeModeTabs.COMBAT);

  public static final Item OXIDIZED_COPPER_HELMET = createItemWithTab("oxidized_copper_helmet", new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.HELMET), CreativeModeTabs.COMBAT);
  public static final Item OXIDIZED_COPPER_CHESTPLATE = createItemWithTab("oxidized_copper_chestplate", new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE), CreativeModeTabs.COMBAT);
  public static final Item OXIDIZED_COPPER_LEGGINGS = createItemWithTab("oxidized_copper_leggings", new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS), CreativeModeTabs.COMBAT);
  public static final Item OXIDIZED_COPPER_BOOTS = createItemWithTab("oxidized_copper_boots", new Item.Properties().humanoidArmor(CEArmorMaterials.OXIDIZED_COPPER_ARMOR_MATERIAL, ArmorType.BOOTS), CreativeModeTabs.COMBAT);


  public static final Item WAXED_COPPER_SWORD = createItemWithTab("waxed_copper_sword", new Item.Properties().sword(CEToolMaterials.WAXED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item WAXED_COPPER_AXE = createItemWithTab("waxed_copper_axe", new Item.Properties().axe(CEToolMaterials.WAXED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item WAXED_COPPER_PICKAXE = createItemWithTab("waxed_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.WAXED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item WAXED_COPPER_SHOVEL = createItemWithTab("waxed_copper_shovel", new Item.Properties().shovel(CEToolMaterials.WAXED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item WAXED_COPPER_HOE = createItemWithTab("waxed_copper_hoe", new Item.Properties().hoe(CEToolMaterials.WAXED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);

  public static final Item WAXED_EXPOSED_COPPER_SWORD = createItemWithTab("waxed_exposed_copper_sword", new Item.Properties().sword(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item WAXED_EXPOSED_COPPER_AXE = createItemWithTab("waxed_exposed_copper_axe", new Item.Properties().axe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item WAXED_EXPOSED_COPPER_PICKAXE = createItemWithTab("waxed_exposed_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item WAXED_EXPOSED_COPPER_SHOVEL = createItemWithTab("waxed_exposed_copper_shovel", new Item.Properties().shovel(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item WAXED_EXPOSED_COPPER_HOE = createItemWithTab("waxed_exposed_copper_hoe", new Item.Properties().hoe(CEToolMaterials.WAXED_EXPOSED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);

  public static final Item WAXED_WEATHERED_COPPER_SWORD = createItemWithTab("waxed_weathered_copper_sword", new Item.Properties().sword(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item WAXED_WEATHERED_COPPER_AXE = createItemWithTab("waxed_weathered_copper_axe", new Item.Properties().axe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item WAXED_WEATHERED_COPPER_PICKAXE = createItemWithTab("waxed_weathered_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item WAXED_WEATHERED_COPPER_SHOVEL = createItemWithTab("waxed_weathered_copper_shovel", new Item.Properties().shovel(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item WAXED_WEATHERED_COPPER_HOE = createItemWithTab("waxed_weathered_copper_hoe", new Item.Properties().hoe(CEToolMaterials.WAXED_WEATHERED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);

  public static final Item WAXED_OXIDIZED_COPPER_SWORD = createItemWithTab("waxed_oxidized_copper_sword", new Item.Properties().sword(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item WAXED_OXIDIZED_COPPER_AXE = createItemWithTab("waxed_oxidized_copper_axe", new Item.Properties().axe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item WAXED_OXIDIZED_COPPER_PICKAXE = createItemWithTab("waxed_oxidized_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item WAXED_OXIDIZED_COPPER_SHOVEL = createItemWithTab("waxed_oxidized_copper_shovel", new Item.Properties().shovel(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item WAXED_OXIDIZED_COPPER_HOE = createItemWithTab("waxed_oxidized_copper_hoe", new Item.Properties().hoe(CEToolMaterials.WAXED_OXIDIZED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);

  public static final Item EXPOSED_COPPER_SWORD = createItemWithTab("exposed_copper_sword", new Item.Properties().sword(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item EXPOSED_COPPER_AXE = createItemWithTab("exposed_copper_axe", new Item.Properties().axe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item EXPOSED_COPPER_PICKAXE = createItemWithTab("exposed_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item EXPOSED_COPPER_SHOVEL = createItemWithTab("exposed_copper_shovel", new Item.Properties().shovel(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item EXPOSED_COPPER_HOE = createItemWithTab("exposed_copper_hoe", new Item.Properties().hoe(CEToolMaterials.EXPOSED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);

  public static final Item WEATHERED_COPPER_SWORD = createItemWithTab("weathered_copper_sword", new Item.Properties().sword(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item WEATHERED_COPPER_AXE = createItemWithTab("weathered_copper_axe", new Item.Properties().axe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item WEATHERED_COPPER_PICKAXE = createItemWithTab("weathered_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item WEATHERED_COPPER_SHOVEL = createItemWithTab("weathered_copper_shovel", new Item.Properties().shovel(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item WEATHERED_COPPER_HOE = createItemWithTab("weathered_copper_hoe", new Item.Properties().hoe(CEToolMaterials.WEATHERED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);

  public static final Item OXIDIZED_COPPER_SWORD = createItemWithTab("oxidized_copper_sword", new Item.Properties().sword(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item OXIDIZED_COPPER_AXE = createItemWithTab("oxidized_copper_axe", new Item.Properties().axe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.COMBAT);
  public static final Item OXIDIZED_COPPER_PICKAXE = createItemWithTab("oxidized_copper_pickaxe", new Item.Properties().pickaxe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item OXIDIZED_COPPER_SHOVEL = createItemWithTab("oxidized_copper_shovel", new Item.Properties().shovel(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);
  public static final Item OXIDIZED_COPPER_HOE = createItemWithTab("oxidized_copper_hoe", new Item.Properties().hoe(CEToolMaterials.OXIDIZED_COPPER_MATERIAL, 1f, 1f), CreativeModeTabs.TOOLS_AND_UTILITIES);

	public static void register() {
		ITEMS.forEach((id, pair) -> {
			Registry.register(BuiltInRegistries.ITEM, CEMod.id(id), pair.getA());
			ItemGroupEvents.modifyEntriesEvent(pair.getB()).register((group) -> {
				group.accept(pair.getA());
			});
		});
		ITEMS.clear();

		CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_INGOT, new Pair<>(EXPOSED_COPPER_INGOT, 1.0f));
		CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_INGOT, new Pair<>(WEATHERED_COPPER_INGOT, 1.0f));
		CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_INGOT, new Pair<>(OXIDIZED_COPPER_INGOT, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_NUGGET, new Pair<>(EXPOSED_COPPER_NUGGET, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_NUGGET, new Pair<>(WEATHERED_COPPER_NUGGET, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_NUGGET, new Pair<>(OXIDIZED_COPPER_NUGGET, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_HELMET, new Pair<>(EXPOSED_COPPER_HELMET, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_CHESTPLATE, new Pair<>(EXPOSED_COPPER_CHESTPLATE, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_LEGGINGS, new Pair<>(EXPOSED_COPPER_LEGGINGS, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_BOOTS, new Pair<>(EXPOSED_COPPER_BOOTS, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_HELMET, new Pair<>(WEATHERED_COPPER_HELMET, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_CHESTPLATE, new Pair<>(WEATHERED_COPPER_CHESTPLATE, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_LEGGINGS, new Pair<>(WEATHERED_COPPER_LEGGINGS, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_BOOTS, new Pair<>(WEATHERED_COPPER_BOOTS, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_HELMET, new Pair<>(OXIDIZED_COPPER_HELMET, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_CHESTPLATE, new Pair<>(OXIDIZED_COPPER_CHESTPLATE, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_LEGGINGS, new Pair<>(OXIDIZED_COPPER_LEGGINGS, 1.0f));
    CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_BOOTS, new Pair<>(OXIDIZED_COPPER_BOOTS, 1.0f));

		CEMaps.WAXING_MAP_ITEMS.put(Items.COPPER_INGOT, WAXED_COPPER_INGOT);
		CEMaps.WAXING_MAP_ITEMS.put(EXPOSED_COPPER_INGOT, WAXED_EXPOSED_COPPER_INGOT);
		CEMaps.WAXING_MAP_ITEMS.put(WEATHERED_COPPER_INGOT, WAXED_WEATHERED_COPPER_INGOT);
		CEMaps.WAXING_MAP_ITEMS.put(OXIDIZED_COPPER_INGOT, WAXED_OXIDIZED_COPPER_INGOT);
    CEMaps.WAXING_MAP_ITEMS.put(Items.COPPER_NUGGET, WAXED_COPPER_NUGGET);
    CEMaps.WAXING_MAP_ITEMS.put(EXPOSED_COPPER_NUGGET, WAXED_EXPOSED_COPPER_NUGGET);
    CEMaps.WAXING_MAP_ITEMS.put(WEATHERED_COPPER_NUGGET, WAXED_WEATHERED_COPPER_NUGGET);
    CEMaps.WAXING_MAP_ITEMS.put(OXIDIZED_COPPER_NUGGET, WAXED_OXIDIZED_COPPER_NUGGET);
    CEMaps.WAXING_MAP_ITEMS.put(Items.COPPER_HELMET, WAXED_COPPER_HELMET);
    CEMaps.WAXING_MAP_ITEMS.put(Items.COPPER_CHESTPLATE, WAXED_COPPER_CHESTPLATE);
    CEMaps.WAXING_MAP_ITEMS.put(Items.COPPER_LEGGINGS, WAXED_COPPER_LEGGINGS);
    CEMaps.WAXING_MAP_ITEMS.put(Items.COPPER_BOOTS, WAXED_COPPER_BOOTS);
    CEMaps.WAXING_MAP_ITEMS.put(EXPOSED_COPPER_HELMET, WAXED_EXPOSED_COPPER_HELMET);
    CEMaps.WAXING_MAP_ITEMS.put(EXPOSED_COPPER_CHESTPLATE, WAXED_EXPOSED_COPPER_CHESTPLATE);
    CEMaps.WAXING_MAP_ITEMS.put(EXPOSED_COPPER_LEGGINGS, WAXED_EXPOSED_COPPER_LEGGINGS);
    CEMaps.WAXING_MAP_ITEMS.put(EXPOSED_COPPER_BOOTS, WAXED_EXPOSED_COPPER_BOOTS);
    CEMaps.WAXING_MAP_ITEMS.put(WEATHERED_COPPER_HELMET, WAXED_WEATHERED_COPPER_HELMET);
    CEMaps.WAXING_MAP_ITEMS.put(WEATHERED_COPPER_CHESTPLATE, WAXED_WEATHERED_COPPER_CHESTPLATE);
    CEMaps.WAXING_MAP_ITEMS.put(WEATHERED_COPPER_LEGGINGS, WAXED_WEATHERED_COPPER_LEGGINGS);
    CEMaps.WAXING_MAP_ITEMS.put(WEATHERED_COPPER_BOOTS, WAXED_WEATHERED_COPPER_BOOTS);
    CEMaps.WAXING_MAP_ITEMS.put(OXIDIZED_COPPER_HELMET, WAXED_OXIDIZED_COPPER_HELMET);
    CEMaps.WAXING_MAP_ITEMS.put(OXIDIZED_COPPER_CHESTPLATE, WAXED_OXIDIZED_COPPER_CHESTPLATE);
    CEMaps.WAXING_MAP_ITEMS.put(OXIDIZED_COPPER_LEGGINGS, WAXED_OXIDIZED_COPPER_LEGGINGS);
    CEMaps.WAXING_MAP_ITEMS.put(OXIDIZED_COPPER_BOOTS, WAXED_OXIDIZED_COPPER_BOOTS);

    CEMaps.ARMOR_EFFECTS.put(EXPOSED_COPPER_HELMET, new MobEffectInstance(MobEffects.SPEED, 600, 0));
    CEMaps.ARMOR_EFFECTS.put(EXPOSED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.SPEED, 600, 0));
    CEMaps.ARMOR_EFFECTS.put(EXPOSED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.SPEED, 600, 0));
    CEMaps.ARMOR_EFFECTS.put(EXPOSED_COPPER_BOOTS, new MobEffectInstance(MobEffects.SPEED, 600, 0));

    CEMaps.ARMOR_EFFECTS.put(WEATHERED_COPPER_HELMET, new MobEffectInstance(MobEffects.RESISTANCE, 600, 0));
    CEMaps.ARMOR_EFFECTS.put(WEATHERED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.RESISTANCE, 600, 0));
    CEMaps.ARMOR_EFFECTS.put(WEATHERED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.RESISTANCE, 600, 0));
    CEMaps.ARMOR_EFFECTS.put(WEATHERED_COPPER_BOOTS, new MobEffectInstance(MobEffects.RESISTANCE, 600, 0));

    CEMaps.ARMOR_EFFECTS.put(WAXED_COPPER_HELMET, new MobEffectInstance(MobEffects.HASTE, 600, 1));
    CEMaps.ARMOR_EFFECTS.put(WAXED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.HASTE, 600, 1));
    CEMaps.ARMOR_EFFECTS.put(WAXED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.HASTE, 600, 1));
    CEMaps.ARMOR_EFFECTS.put(WAXED_COPPER_BOOTS, new MobEffectInstance(MobEffects.HASTE, 600, 1));

    CEMaps.ARMOR_EFFECTS.put(WAXED_EXPOSED_COPPER_HELMET, new MobEffectInstance(MobEffects.SPEED, 600, 1));
    CEMaps.ARMOR_EFFECTS.put(WAXED_EXPOSED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.SPEED, 600, 1));
    CEMaps.ARMOR_EFFECTS.put(WAXED_EXPOSED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.SPEED, 600, 1));
    CEMaps.ARMOR_EFFECTS.put(WAXED_EXPOSED_COPPER_BOOTS, new MobEffectInstance(MobEffects.SPEED, 600, 1));

    CEMaps.ARMOR_EFFECTS.put(WAXED_WEATHERED_COPPER_HELMET, new MobEffectInstance(MobEffects.RESISTANCE, 600, 1));
    CEMaps.ARMOR_EFFECTS.put(WAXED_WEATHERED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.RESISTANCE, 600, 1));
    CEMaps.ARMOR_EFFECTS.put(WAXED_WEATHERED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.RESISTANCE, 600, 1));
    CEMaps.ARMOR_EFFECTS.put(WAXED_WEATHERED_COPPER_BOOTS, new MobEffectInstance(MobEffects.RESISTANCE, 600, 1));

    CEMaps.ARMOR_EFFECTS.put(WAXED_OXIDIZED_COPPER_HELMET, new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0));
    CEMaps.ARMOR_EFFECTS.put(WAXED_OXIDIZED_COPPER_CHESTPLATE, new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0));
    CEMaps.ARMOR_EFFECTS.put(WAXED_OXIDIZED_COPPER_LEGGINGS, new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0));
    CEMaps.ARMOR_EFFECTS.put(WAXED_OXIDIZED_COPPER_BOOTS, new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0));
	}
	
	private static Item createItem(String id, Item.Properties properties) {
    return createItemWithTab(id, properties, CreativeModeTabs.INGREDIENTS);
	}

  private static Item createItemWithTab(String id, Item.Properties properties, ResourceKey<CreativeModeTab> tab) {
    ResourceKey<Item> itemId = ResourceKey.create(Registries.ITEM, CEMod.id(id));
    Item item = new Item(properties.setId(itemId));
    ITEMS.put(id, new Pair<>(item, tab));
    return item;
  }
}
