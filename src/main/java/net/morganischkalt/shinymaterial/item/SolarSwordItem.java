
package net.morganischkalt.shinymaterial.item;

import net.morganischkalt.shinymaterial.itemgroup.ShinyMaterialItemGroup;
import net.morganischkalt.shinymaterial.ShinyMaterialModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@ShinyMaterialModElements.ModElement.Tag
public class SolarSwordItem extends ShinyMaterialModElements.ModElement {
	@ObjectHolder("shiny_material:solar_sword")
	public static final Item block = null;

	public SolarSwordItem(ShinyMaterialModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 35.5f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 3;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SolarIngotItem.block));
			}
		}, 3, -2.7000000000000002f, new Item.Properties().group(ShinyMaterialItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("solar_sword"));
	}
}
