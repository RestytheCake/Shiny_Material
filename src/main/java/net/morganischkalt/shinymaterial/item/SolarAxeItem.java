
package net.morganischkalt.shinymaterial.item;

import net.morganischkalt.shinymaterial.itemgroup.ShinyMaterialItemGroup;
import net.morganischkalt.shinymaterial.ShinyMaterialModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@ShinyMaterialModElements.ModElement.Tag
public class SolarAxeItem extends ShinyMaterialModElements.ModElement {
	@ObjectHolder("shiny_material:solar_axe")
	public static final Item block = null;

	public SolarAxeItem(ShinyMaterialModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 13.5f;
			}

			public float getAttackDamage() {
				return 20.2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SolarIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ShinyMaterialItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("solar_axe"));
	}
}
