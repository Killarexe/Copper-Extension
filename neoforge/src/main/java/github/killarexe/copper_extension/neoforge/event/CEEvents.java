package github.killarexe.copper_extension.neoforge.event;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.neoforge.registry.CEItems;
import github.killarexe.copper_extension.resource.CEResourceListeners;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.AddServerReloadListenersEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import java.util.function.Supplier;


public class CEEvents {
	public static void registerEvents(IEventBus bus) {
		CEMod.LOGGER.debug("Initializing Copper Extension Events...");
		bus.addListener(CEEvents::addItemsToCreativeTabsEvent);
    NeoForge.EVENT_BUS.addListener(CEEvents::addReloadListeners);
		CEMod.LOGGER.debug("Copper Extension Events Initialized!");
	}

  private static void addReloadListeners(AddServerReloadListenersEvent event) {
    CEMod.LOGGER.debug("Initializing Copper Extension Data Listeners...");
    event.addListener(CEMod.id("lightning_effects"), new CEResourceListeners.LightningEffectListener());
    event.addListener(CEMod.id("oxidation_transformation"), new CEResourceListeners.OxidationTransformationListener());
    event.addListener(CEMod.id("waxing_transformation"), new CEResourceListeners.WaxingTransformationListener());
  }

  @SafeVarargs
  private static void addAfter(BuildCreativeModeTabContentsEvent event, ItemLike existing, Supplier<Item>... items) {
    if (items.length == 0) {
      return;
    }
    event.insertAfter(existing.asItem().getDefaultInstance(), items[0].get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    if (items.length < 2) {
      return;
    }
    for (int i = 1; i < items.length; i++) {
      event.insertAfter(items[i - 1].get().getDefaultInstance(), items[i].get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
  }

	private static void addItemsToCreativeTabsEvent(BuildCreativeModeTabContentsEvent event) {
    if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
      addAfter(
        event,
        Items.COPPER_INGOT,
        CEItems.EXPOSED_COPPER_INGOT, CEItems.WEATHERED_COPPER_INGOT, CEItems.OXIDIZED_COPPER_INGOT,
        CEItems.WAXED_COPPER_INGOT, CEItems.WAXED_EXPOSED_COPPER_INGOT, CEItems.WAXED_WEATHERED_COPPER_INGOT, CEItems.WAXED_OXIDIZED_COPPER_INGOT
      );
      addAfter(
        event,
        Items.COPPER_NUGGET,
        CEItems.EXPOSED_COPPER_NUGGET, CEItems.WEATHERED_COPPER_NUGGET, CEItems.OXIDIZED_COPPER_NUGGET,
        CEItems.WAXED_COPPER_NUGGET, CEItems.WAXED_EXPOSED_COPPER_NUGGET, CEItems.WAXED_WEATHERED_COPPER_NUGGET, CEItems.WAXED_OXIDIZED_COPPER_NUGGET
      );
    } else if (event.getTabKey() == CreativeModeTabs.COMBAT) {
      addAfter(
        event,
        Items.COPPER_SWORD,
        CEItems.EXPOSED_COPPER_SWORD, CEItems.WEATHERED_COPPER_SWORD, CEItems.OXIDIZED_COPPER_SWORD,
        CEItems.WAXED_COPPER_SWORD, CEItems.WAXED_EXPOSED_COPPER_SWORD, CEItems.WAXED_WEATHERED_COPPER_SWORD, CEItems.WAXED_OXIDIZED_COPPER_SWORD
      );
      addAfter(
        event,
        Items.COPPER_AXE,
        CEItems.EXPOSED_COPPER_AXE, CEItems.WEATHERED_COPPER_AXE, CEItems.OXIDIZED_COPPER_AXE,
        CEItems.WAXED_COPPER_AXE, CEItems.WAXED_EXPOSED_COPPER_AXE, CEItems.WAXED_WEATHERED_COPPER_AXE, CEItems.WAXED_OXIDIZED_COPPER_AXE
      );
      addAfter(
        event,
        Items.COPPER_BOOTS,
        CEItems.EXPOSED_COPPER_HELMET, CEItems.EXPOSED_COPPER_CHESTPLATE, CEItems.EXPOSED_COPPER_LEGGINGS, CEItems.EXPOSED_COPPER_BOOTS,
        CEItems.WEATHERED_COPPER_HELMET, CEItems.WEATHERED_COPPER_CHESTPLATE, CEItems.WEATHERED_COPPER_LEGGINGS, CEItems.WEATHERED_COPPER_BOOTS,
        CEItems.OXIDIZED_COPPER_HELMET, CEItems.OXIDIZED_COPPER_CHESTPLATE, CEItems.OXIDIZED_COPPER_LEGGINGS, CEItems.OXIDIZED_COPPER_BOOTS,
        CEItems.WAXED_COPPER_HELMET, CEItems.WAXED_COPPER_CHESTPLATE, CEItems.WAXED_COPPER_LEGGINGS, CEItems.WAXED_COPPER_BOOTS,
        CEItems.WAXED_EXPOSED_COPPER_HELMET, CEItems.WAXED_EXPOSED_COPPER_CHESTPLATE, CEItems.WAXED_EXPOSED_COPPER_LEGGINGS, CEItems.WAXED_EXPOSED_COPPER_BOOTS,
        CEItems.WAXED_WEATHERED_COPPER_HELMET, CEItems.WAXED_WEATHERED_COPPER_CHESTPLATE, CEItems.WAXED_WEATHERED_COPPER_LEGGINGS, CEItems.WAXED_WEATHERED_COPPER_BOOTS,
        CEItems.WAXED_OXIDIZED_COPPER_HELMET, CEItems.WAXED_OXIDIZED_COPPER_CHESTPLATE, CEItems.WAXED_OXIDIZED_COPPER_LEGGINGS, CEItems.WAXED_OXIDIZED_COPPER_BOOTS
      );
    } else if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
      addAfter(
        event,
        Items.COPPER_HOE,
        CEItems.EXPOSED_COPPER_SHOVEL, CEItems.EXPOSED_COPPER_PICKAXE, CEItems.EXPOSED_COPPER_AXE, CEItems.EXPOSED_COPPER_HOE,
        CEItems.WEATHERED_COPPER_SHOVEL, CEItems.WEATHERED_COPPER_PICKAXE, CEItems.WEATHERED_COPPER_AXE, CEItems.WEATHERED_COPPER_HOE,
        CEItems.OXIDIZED_COPPER_SHOVEL, CEItems.OXIDIZED_COPPER_PICKAXE, CEItems.OXIDIZED_COPPER_AXE, CEItems.OXIDIZED_COPPER_HOE,
        CEItems.WAXED_COPPER_SHOVEL, CEItems.WAXED_COPPER_PICKAXE, CEItems.WAXED_COPPER_AXE, CEItems.WAXED_COPPER_HOE,
        CEItems.WAXED_EXPOSED_COPPER_SHOVEL, CEItems.WAXED_EXPOSED_COPPER_PICKAXE, CEItems.WAXED_EXPOSED_COPPER_AXE, CEItems.WAXED_EXPOSED_COPPER_HOE,
        CEItems.WAXED_WEATHERED_COPPER_SHOVEL, CEItems.WAXED_WEATHERED_COPPER_PICKAXE, CEItems.WAXED_WEATHERED_COPPER_AXE, CEItems.WAXED_WEATHERED_COPPER_HOE,
        CEItems.WAXED_OXIDIZED_COPPER_SHOVEL, CEItems.WAXED_OXIDIZED_COPPER_PICKAXE, CEItems.WAXED_OXIDIZED_COPPER_AXE, CEItems.WAXED_OXIDIZED_COPPER_HOE
      );
    }
	}
}
