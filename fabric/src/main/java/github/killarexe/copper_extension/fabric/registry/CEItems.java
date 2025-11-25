package github.killarexe.copper_extension.fabric.registry;

import java.util.HashMap;

import github.killarexe.copper_extension.CEArmorMaterials;
import github.killarexe.copper_extension.CEMaps;
import github.killarexe.copper_extension.CEMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.ArmorType;

public class CEItems {
	private static final HashMap<String, Item> ITEMS = new HashMap<String, Item>();

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

	public static void register() {
		ITEMS.forEach((id, item) -> {
			Registry.register(BuiltInRegistries.ITEM, CEMod.id(id), item);
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register((group) -> {
				group.accept(item);
			});
		});
		ITEMS.clear();

		CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_INGOT, EXPOSED_COPPER_INGOT);
		CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_INGOT, WEATHERED_COPPER_INGOT);
		CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_INGOT, OXIDIZED_COPPER_INGOT);
    CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_NUGGET, EXPOSED_COPPER_NUGGET);
    CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_NUGGET, WEATHERED_COPPER_NUGGET);
    CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_NUGGET, OXIDIZED_COPPER_NUGGET);
    CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_HELMET, EXPOSED_COPPER_HELMET);
    CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_CHESTPLATE, EXPOSED_COPPER_CHESTPLATE);
    CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_LEGGINGS, EXPOSED_COPPER_LEGGINGS);
    CEMaps.OXIDATION_MAP_ITEMS.put(Items.COPPER_BOOTS, EXPOSED_COPPER_BOOTS);
    CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_HELMET, WEATHERED_COPPER_HELMET);
    CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_CHESTPLATE, WEATHERED_COPPER_CHESTPLATE);
    CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_LEGGINGS, WEATHERED_COPPER_LEGGINGS);
    CEMaps.OXIDATION_MAP_ITEMS.put(EXPOSED_COPPER_BOOTS, WEATHERED_COPPER_BOOTS);
    CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_HELMET, OXIDIZED_COPPER_HELMET);
    CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_CHESTPLATE, OXIDIZED_COPPER_CHESTPLATE);
    CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_LEGGINGS, OXIDIZED_COPPER_LEGGINGS);
    CEMaps.OXIDATION_MAP_ITEMS.put(WEATHERED_COPPER_BOOTS, OXIDIZED_COPPER_BOOTS);

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
		ResourceKey<Item> itemId = ResourceKey.create(Registries.ITEM, CEMod.id(id));
		Item item = new Item(properties.setId(itemId));
		ITEMS.put(id, item);
		return item;
	}
}
