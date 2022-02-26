package net.morganischkalt.shinymaterial.init;

import net.morganischkalt.shinymaterial.material.BaseToolMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class ToolMaterial {
    protected static final Tier SOLAR_MATERIAL = new BaseToolMaterial(15.5f, 500, 5, 25f, 2500,
            () -> Ingredient.of(ModItem.SOLAR_DUST.get()));

    private ToolMaterial() {
    }
}
