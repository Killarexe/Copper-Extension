package github.killarexe.copper_extension.neoforge.event;

import github.killarexe.copper_extension.neoforge.CENeoForge;
import github.killarexe.copper_extension.neoforge.registry.CEItems;
import github.killarexe.copper_extension.item.WaxableItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

public class CEEvents {
	public static void registerEvents(IEventBus bus) {
		CENeoForge.LOGGER.debug("Initiliazing Copper Extension Events...");
    	bus.addListener(CEEvents::addItemsToCreativeTabsEvent);
		CENeoForge.LOGGER.debug("Copper Extension Events Initiliazed!");
	}

  private static void addItemsToCreativeTabsEvent(BuildCreativeModeTabContentsEvent event) {
		if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			event.acceptAll(CEItems.ITEMS.getEntries().stream().map(item -> new ItemStack(item.get())).toList());
		}
	}
}
