
package net.morganischkalt.shinymaterial.item;

import net.morganischkalt.shinymaterial.itemgroup.ShinyMaterialItemGroup;
import net.morganischkalt.shinymaterial.ShinyMaterialModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@ShinyMaterialModElements.ModElement.Tag
public class SolarIngotItem extends ShinyMaterialModElements.ModElement {
	@ObjectHolder("shiny_material:solar_ingot")
	public static final Item block = null;

	public SolarIngotItem(ShinyMaterialModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ShinyMaterialItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("solar_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
