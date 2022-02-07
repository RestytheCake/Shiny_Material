
package net.morganischkalt.shinymaterial.item;

import net.morganischkalt.shinymaterial.itemgroup.ShinyMaterialItemGroup;
import net.morganischkalt.shinymaterial.ShinyMaterialModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@ShinyMaterialModElements.ModElement.Tag
public class SolarPickaxeItem extends ShinyMaterialModElements.ModElement {
	@ObjectHolder("shiny_material:solar_pickaxe")
	public static final Item block = null;

	public SolarPickaxeItem(ShinyMaterialModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3500;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 5.5f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SolarIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ShinyMaterialItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("solar_pickaxe"));
	}
}
