package github.killarexe.copper_extension.neoforge.registry;

import java.util.function.Supplier;

import github.killarexe.copper_extension.CEMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CEItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, CEMod.MOD_ID);

	public static final Supplier<Item> WAXED_COPPER_INGOT = ITEMS.register(
		"waxed_copper_ingot", () -> new Item(new Item.Properties())
	);
	
	public static final Supplier<Item> WAXED_EXPOSED_COPPER_INGOT = ITEMS.register(
		"waxed_exposed_copper_ingot", () -> new Item(new Item.Properties())
	);
	
	public static final Supplier<Item> WAXED_WEATHERED_COPPER_INGOT = ITEMS.register(
		"waxed_weathered_copper_ingot", () -> new Item(new Item.Properties())
	);

	public static final Supplier<Item> WAXED_OXIDIZED_COPPER_INGOT = ITEMS.register(
		"waxed_oxidized_copper_ingot", () -> new Item(new Item.Properties())
	);
	
	public static final Supplier<Item> EXPOSED_COPPER_INGOT = ITEMS.register(
		"exposed_copper_ingot", () -> new Item(new Item.Properties())
	);

	public static final Supplier<Item> WEATHERED_COPPER_INGOT = ITEMS.register(
		"weathered_copper_ingot", () -> new Item(new Item.Properties())
	);

	public static final Supplier<Item> OXIDIZED_COPPER_INGOT = ITEMS.register(
		"oxidized_copper_ingot", () -> new Item(new Item.Properties())
	);
}
