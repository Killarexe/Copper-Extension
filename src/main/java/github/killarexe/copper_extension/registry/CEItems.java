package github.killarexe.copper_extension.registry;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.common.item.ChangeOverTimeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CEItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CEMod.MOD_ID);
	
	public static final RegistryObject<Item> WAXED_COPPER_INGOT = ITEMS.register(
		"waxed_copper_ingot",
		() -> new Item(new Item.Properties())
	);
	public static final RegistryObject<Item> WAXED_WEATHERED_COPPER_INGOT = ITEMS.register(
		"weathered_copper_ingot",
		() -> new Item(new Item.Properties())
	);
	public static final RegistryObject<Item> WAXED_EXPOSED_COPPER_INGOT = ITEMS.register(
		"exposed_copper_ingot",
		() -> new Item(new Item.Properties())
	);
	
	public static final RegistryObject<Item> OXIDIZED_COPPER_INGOT = ITEMS.register(
		"oxidized_copper_ingot",
		() -> new Item(new Item.Properties())
	);
	public static final RegistryObject<ChangeOverTimeItem> WEATHERED_COPPER_INGOT = ITEMS.register(
		"weathered_copper_ingot",
		() -> new ChangeOverTimeItem(new Item.Properties(), OXIDIZED_COPPER_INGOT.get(), WAXED_WEATHERED_COPPER_INGOT.get())
	);
	public static final RegistryObject<ChangeOverTimeItem> EXPOSED_COPPER_INGOT = ITEMS.register(
		"exposed_copper_ingot",
		() -> new ChangeOverTimeItem(new Item.Properties(), WEATHERED_COPPER_INGOT.get(), WAXED_EXPOSED_COPPER_INGOT.get())
	);
}
