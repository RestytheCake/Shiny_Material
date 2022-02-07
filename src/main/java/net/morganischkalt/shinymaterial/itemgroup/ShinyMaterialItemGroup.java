
package net.morganischkalt.shinymaterial.itemgroup;

import net.morganischkalt.shinymaterial.item.SolarDustItem;
import net.morganischkalt.shinymaterial.ShinyMaterialModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ShinyMaterialModElements.ModElement.Tag
public class ShinyMaterialItemGroup extends ShinyMaterialModElements.ModElement {
	public ShinyMaterialItemGroup(ShinyMaterialModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabshiny_material") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SolarDustItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
