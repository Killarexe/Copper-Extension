package github.killarexe.copper_extension.registry;

import java.util.Optional;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.common.item.RustableItem;
import github.killarexe.copper_extension.common.item.ScrapableItem;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CEItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CEMod.MOD_ID);
	
	public static final RegistryObject<Item> WAXED_COPPER_INGOT = ITEMS.register(
		"waxed_copper_ingot",
		() -> new ScrapableItem(new Item.Properties(), new ResourceLocation("minecraft", "copper_ingot"))
	);
	
	public static final RegistryObject<Item> WAXED_EXPOSED_COPPER_INGOT = ITEMS.register(
		"waxed_exposed_copper_ingot",
		() -> new ScrapableItem(new Item.Properties(), new ResourceLocation("minecraft", "exposed_copper_ingot"))
	);
	
	public static final RegistryObject<Item> WAXED_WEATHERED_COPPER_INGOT = ITEMS.register(
		"waxed_weathered_copper_ingot",
		() -> new ScrapableItem(new Item.Properties(), new ResourceLocation("minecraft", "weathered_copper_ingot"))
	);
	
	public static final RegistryObject<RustableItem> EXPOSED_COPPER_INGOT = ITEMS.register(
		"exposed_copper_ingot",
		() -> new RustableItem(
				new Item.Properties(),
				new ResourceLocation("minecraft", "copper_ingot"),
				CEMod.res("waxed_exposed_copper_ingot"),
				CEMod.res("weathered_copper_ingot")
		)
	);
	
	public static final RegistryObject<RustableItem> WEATHERED_COPPER_INGOT = ITEMS.register(
		"weathered_copper_ingot",
		() -> new RustableItem(
				new Item.Properties(),
				CEMod.res("exposed_copper_ingot"),
				CEMod.res("waxed_weathered_copper_ingot"),
				CEMod.res("oxidized_copper_ingot")
			)
	);
	
	public static final RegistryObject<Item> OXIDIZED_COPPER_INGOT = ITEMS.register(
		"oxidized_copper_ingot",
		() -> new ScrapableItem(new Item.Properties(), CEMod.res("weathered_copper_ingot"))
	);
	
	public static Item getItemFromId(ResourceLocation id) {
		Optional<Holder<Item>> holder = ForgeRegistries.ITEMS.getHolder(id);
		if(holder.isPresent()){
			return holder.get().get();
		}
		return Items.AIR;
	}
}
