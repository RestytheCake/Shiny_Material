package net.morganischkalt.shinymaterial.world.event;

import java.util.List;
import java.util.function.Supplier;

import net.morganischkalt.shinymaterial.ShinyMaterial;
import net.morganischkalt.shinymaterial.world.OreGeneration;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ShinyMaterial.MODID, bus = Bus.FORGE)
public class ForgeEvents {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void biomeLoading(BiomeLoadingEvent event) {
        final List<Supplier<PlacedFeature>> features = event.getGeneration()
                .getFeatures(Decoration.UNDERGROUND_ORES);

        switch (event.getCategory()) {
            case NETHER -> OreGeneration.NETHER_ORES.forEach(ore -> features.add(() -> ore));
            case THEEND -> OreGeneration.END_ORES.forEach(ore -> features.add(() -> ore));
            default -> OreGeneration.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
        }

    }

    @SubscribeEvent
    public static void burnTime(FurnaceFuelBurnTimeEvent event) {
        if (event.getItemStack().getItem() == Items.BREAD) {
            event.setBurnTime(500);
        }
    }
}
