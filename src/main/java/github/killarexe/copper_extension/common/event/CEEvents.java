package github.killarexe.copper_extension.common.event;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.common.item.RustableItem;
import github.killarexe.copper_extension.common.item.WaxableItem;
import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.IEventBus;

public class CEEvents {
	public static void registerEvents(IEventBus modBus, IEventBus forgeBus) {
		CEMod.LOGGER.debug("Initiliazing Copper Extension Events...");
		forgeBus.addListener(CEEvents::onRightClickEvent);
		forgeBus.addListener(CEEvents::onTickPlayerInventoryEvent);
		modBus.addListener(CEEvents::addItemsToCreativeTabsEvent);
		CEMod.LOGGER.debug("Copper Extension Events Initiliazed!");
	}
	
	private static void onRightClickEvent(RightClickBlock event) {
		Level level = event.getLevel();
		ItemStack stack = event.getItemStack();
		BlockState state = level.getBlockState(event.getPos());
		if(event.getItemStack().is(Items.COPPER_INGOT) && state.hasProperty(BeehiveBlock.HONEY_LEVEL)) {
			int currentValue = state.getValue(BeehiveBlock.HONEY_LEVEL);
			if(currentValue >= 1) {
				int amount = event.getEntity().isShiftKeyDown() ? currentValue : 1;
				Vec3 playerPos = event.getEntity().blockPosition().getCenter();
				WaxableItem.waxStack(CEItems.WAXED_COPPER_INGOT.get(), level, stack, state, playerPos, amount);
				level.setBlock(event.getPos(), state.setValue(BeehiveBlock.HONEY_LEVEL, currentValue - amount) ,Block.UPDATE_ALL_IMMEDIATE);
			}
		}
	}
	
	private static void onTickPlayerInventoryEvent(PlayerTickEvent event) {
		Player player = event.player;
		Inventory inventory = player.getInventory();
		for(int slot = 0; slot < inventory.getContainerSize(); slot++) {
			ItemStack stack = inventory.getItem(slot);
			int count = stack.getCount();
			if(stack.getItem() == Items.COPPER_INGOT && player.getRandom().nextFloat() < RustableItem.CHANCE / count && !player.level().isClientSide) {
				inventory.setItem(slot, new ItemStack(CEItems.EXPOSED_COPPER_INGOT.get(), count));
			}
		}
	}
	
	private static void addItemsToCreativeTabsEvent(BuildCreativeModeTabContentsEvent event) {
		if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			event.acceptAll(CEItems.ITEMS.getEntries().stream().map(item -> new ItemStack(item.get())).toList());
		}
	}
}
