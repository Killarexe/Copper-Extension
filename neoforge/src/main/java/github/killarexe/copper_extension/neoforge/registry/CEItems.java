package github.killarexe.copper_extension.neoforge.registry;

import java.util.Optional;
import java.util.function.Supplier;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.neoforge.item.*;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CEItems {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, CEMod.MOD_ID);

  public static final Supplier<NeoForgeScrapableItem> WAXED_COPPER_INGOT = ITEMS.register(
		"waxed_copper_ingot",
		() -> new NeoForgeScrapableItem(new Item.Properties(), new ResourceLocation( "copper_ingot"))
	);
	
	public static final Supplier<NeoForgeScrapableItem> WAXED_EXPOSED_COPPER_INGOT = ITEMS.register(
		"waxed_exposed_copper_ingot",
		() -> new NeoForgeScrapableItem(new Item.Properties(), CEMod.id("exposed_copper_ingot"))
	);
	
	public static final Supplier<NeoForgeScrapableItem> WAXED_WEATHERED_COPPER_INGOT = ITEMS.register(
		"waxed_weathered_copper_ingot",
		() -> new NeoForgeScrapableItem(new Item.Properties(), CEMod.id("weathered_copper_ingot"))
	);

  public static final Supplier<NeoForgeScrapableItem> WAXED_OXIDIZED_COPPER_INGOT = ITEMS.register(
    "waxed_oxidized_copper_ingot",
    () -> new NeoForgeScrapableItem(new Item.Properties(), CEMod.id("oxidized_copper_ingot"))
  );
	
	public static final Supplier<NeoForgeRustableItem> EXPOSED_COPPER_INGOT = ITEMS.register(
		"exposed_copper_ingot",
		() -> new NeoForgeRustableItem(
			new Item.Properties(),
			new ResourceLocation("copper_ingot"),
			CEMod.id("waxed_exposed_copper_ingot"),
			CEMod.id("weathered_copper_ingot")
		)
	);
	
	public static final Supplier<NeoForgeRustableItem> WEATHERED_COPPER_INGOT = ITEMS.register(
		"weathered_copper_ingot",
		() -> new NeoForgeRustableItem(
			new Item.Properties(),
			CEMod.id("exposed_copper_ingot"),
			CEMod.id("waxed_weathered_copper_ingot"),
			CEMod.id("oxidized_copper_ingot")
		)
	);
	
	public static final Supplier<NeoForgeScrapableItem> OXIDIZED_COPPER_INGOT = ITEMS.register(
		"oxidized_copper_ingot",
		() -> new NeoForgeScrapableItem(new Item.Properties(), CEMod.id("weathered_copper_ingot"))
	);
	
	public static Item getItemFromId(ResourceLocation id) {
		Optional<Holder.Reference<Item>> holder = BuiltInRegistries.ITEM.getHolder(id);
        return holder.map(Holder.Reference::value).orElse(Items.AIR);
    }
}
