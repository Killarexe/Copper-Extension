package github.killarexe.copper_extension.data.generator;

import github.killarexe.copper_extension.CEMod;
import github.killarexe.copper_extension.registry.CEItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CEItemModelGenerator extends ItemModelProvider{

	public CEItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, CEMod.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		simpleItem(CEItems.EXPOSED_COPPER_INGOT);
		simpleItem(CEItems.WEATHERED_COPPER_INGOT);
		simpleItem(CEItems.OXIDIZED_COPPER_INGOT);
		
		simpleItem(CEItems.WAXED_EXPOSED_COPPER_INGOT, CEItems.EXPOSED_COPPER_INGOT.getId());
		simpleItem(CEItems.WAXED_WEATHERED_COPPER_INGOT, CEItems.WEATHERED_COPPER_INGOT.getId());
		simpleItem(CEItems.WAXED_COPPER_INGOT, mcLoc("copper_ingot"));
	}
	
	private void simpleItem(RegistryObject<? extends Item> itemObject, ResourceLocation itemId) {
		ResourceLocation itemTexture = new ResourceLocation(itemId.getNamespace(), "item/" + itemId.getPath());
		if(existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
			getBuilder(itemObject.getId().getPath()).parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", itemTexture);
		}
	}
	
	private void simpleItem(RegistryObject<? extends Item> itemObject) {
		simpleItem(itemObject, itemObject.getId());
	}
}
