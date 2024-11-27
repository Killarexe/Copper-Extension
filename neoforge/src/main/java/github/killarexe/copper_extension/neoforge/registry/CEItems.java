package github.killarexe.copper_extension.neoforge.registry;

import java.util.function.Supplier;

import github.killarexe.copper_extension.CEMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CEItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, CEMod.MOD_ID);

	public static final Supplier<Item> WAXED_COPPER_INGOT = createItem(
		"waxed_copper_ingot", new Item.Properties()
	);
	
	public static final Supplier<Item> WAXED_EXPOSED_COPPER_INGOT = createItem(
		"waxed_exposed_copper_ingot", new Item.Properties()
	);
	
	public static final Supplier<Item> WAXED_WEATHERED_COPPER_INGOT = createItem(
		"waxed_weathered_copper_ingot", new Item.Properties()
	);

	public static final Supplier<Item> WAXED_OXIDIZED_COPPER_INGOT = createItem(
		"waxed_oxidized_copper_ingot", new Item.Properties()
	);
	
	public static final Supplier<Item> EXPOSED_COPPER_INGOT = createItem(
		"exposed_copper_ingot", new Item.Properties()
	);

	public static final Supplier<Item> WEATHERED_COPPER_INGOT = createItem(
		"weathered_copper_ingot", new Item.Properties()
	);

	public static final Supplier<Item> OXIDIZED_COPPER_INGOT = createItem(
		"oxidized_copper_ingot", new Item.Properties()
	);

	private static Supplier<Item> createItem(String id, Item.Properties properties) {
		ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, CEMod.id(id));
		properties.setId(key);
		return ITEMS.register(id, () -> new Item(properties));
	}
}
