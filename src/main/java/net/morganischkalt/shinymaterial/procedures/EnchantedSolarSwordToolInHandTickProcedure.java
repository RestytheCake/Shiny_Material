package net.morganischkalt.shinymaterial.procedures;

import net.morganischkalt.shinymaterial.ShinyMaterialMod;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

public class EnchantedSolarSwordToolInHandTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ShinyMaterialMod.LOGGER.warn("Failed to load dependency entity for procedure EnchantedSolarSwordToolInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		for (int index0 = 0; index0 < (int) (3); index0++) {
			entity.attackEntityFrom(DamageSource.ON_FIRE, (float) 1);
		}
	}
}
