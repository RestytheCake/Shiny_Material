package net.morganischkalt.shinymaterial.init;

import net.morganischkalt.shinymaterial.ShinyMaterial;
import net.morganischkalt.shinymaterial.material.BaseArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public final class ArmorMaterial {

    public static final net.minecraft.world.item.ArmorMaterial SOLAR_ARMOR = new BaseArmorMaterial(100, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 20, 35, 50, 27 }, 3.2f, 1.85f, ShinyMaterial.MODID + ": Solar Armor",
            SoundEvents.BOAT_PADDLE_WATER, () -> Ingredient.of(ModItem.SOLAR_DUST.get()));

    private ArmorMaterial() {
    }
}
