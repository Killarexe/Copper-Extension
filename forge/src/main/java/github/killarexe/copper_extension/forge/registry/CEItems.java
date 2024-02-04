package github.killarexe.copper_extension.forge.registry;

import java.util.Optional;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.forge.item.*;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CEItems {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CEMod.MOD_ID);

  public static final RegistryObject<ForgeScrapableItem> WAXED_COPPER_INGOT = ITEMS.register(
		"waxed_copper_ingot",
		() -> new ForgeScrapableItem(new Item.Properties(), new ResourceLocation("minecraft", "copper_ingot"))
	);
	
	public static final RegistryObject<ForgeScrapableItem> WAXED_EXPOSED_COPPER_INGOT = ITEMS.register(
		"waxed_exposed_copper_ingot",
		() -> new ForgeScrapableItem(new Item.Properties(), CEMod.id("exposed_copper_ingot"))
	);
	
	public static final RegistryObject<ForgeScrapableItem> WAXED_WEATHERED_COPPER_INGOT = ITEMS.register(
		"waxed_weathered_copper_ingot",
		() -> new ForgeScrapableItem(new Item.Properties(), CEMod.id("weathered_copper_ingot"))
	);
	
	public static final RegistryObject<ForgeRustableItem> EXPOSED_COPPER_INGOT = ITEMS.register(
		"exposed_copper_ingot",
		() -> new ForgeRustableItem(
			new Item.Properties(),
			new ResourceLocation("minecraft", "copper_ingot"),
			CEMod.id("waxed_exposed_copper_ingot"),
			CEMod.id("weathered_copper_ingot")
		)
	);
	
	public static final RegistryObject<ForgeRustableItem> WEATHERED_COPPER_INGOT = ITEMS.register(
		"weathered_copper_ingot",
		() -> new ForgeRustableItem(
			new Item.Properties(),
			CEMod.id("exposed_copper_ingot"),
			CEMod.id("waxed_weathered_copper_ingot"),
			CEMod.id("oxidized_copper_ingot")
		)
	);
	
	public static final RegistryObject<ForgeScrapableItem> OXIDIZED_COPPER_INGOT = ITEMS.register(
		"oxidized_copper_ingot",
		() -> new ForgeScrapableItem(new Item.Properties(), CEMod.id("weathered_copper_ingot"))
	);
	
	public static Item getItemFromId(ResourceLocation id) {
		Optional<Holder<Item>> holder = ForgeRegistries.ITEMS.getHolder(id);
		if(holder.isPresent()){
			return holder.get().get();
		}
		return Items.AIR;
	}
}
