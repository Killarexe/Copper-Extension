package github.killarexe.copper_extension.resource;

import github.killarexe.copper_extension.CEMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class CETags {
  public static final TagKey<Item> REPAIRS_WAXED_COPPER_ARMOR = TagKey.create(Registries.ITEM, CEMod.id("repairs_waxed_copper_armor"));
  public static final TagKey<Item> REPAIRS_WAXED_EXPOSED_COPPER_ARMOR = TagKey.create(Registries.ITEM, CEMod.id("repairs_waxed_exposed_copper_armor"));
  public static final TagKey<Item> REPAIRS_WAXED_WEATHERED_COPPER_ARMOR = TagKey.create(Registries.ITEM, CEMod.id("repairs_waxed_weathered_copper_armor"));
  public static final TagKey<Item> REPAIRS_WAXED_OXIDIZED_COPPER_ARMOR = TagKey.create(Registries.ITEM, CEMod.id("repairs_waxed_oxidized_copper_armor"));
  public static final TagKey<Item> REPAIRS_EXPOSED_COPPER_ARMOR = TagKey.create(Registries.ITEM, CEMod.id("repairs_exposed_copper_armor"));
  public static final TagKey<Item> REPAIRS_WEATHERED_COPPER_ARMOR = TagKey.create(Registries.ITEM, CEMod.id("repairs_weathered_copper_armor"));
  public static final TagKey<Item> REPAIRS_OXIDIZED_COPPER_ARMOR = TagKey.create(Registries.ITEM, CEMod.id("repairs_oxidized_copper_armor"));
}
