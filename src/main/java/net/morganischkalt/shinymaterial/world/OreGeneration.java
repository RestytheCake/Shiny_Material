package net.morganischkalt.shinymaterial.world;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class OreGeneration {
    public static final List<PlacedFeature> OVERWORLD_ORES = new ArrayList<>();
    public static final List<PlacedFeature> END_ORES = new ArrayList<>();
    public static final List<PlacedFeature> NETHER_ORES = new ArrayList<>();

    public static final RuleTest END_TEST = new BlockMatchTest(Blocks.END_STONE);

    public static void registerOres() {
        final ConfiguredFeature<?, ?> glowstoneOre = FeatureUtils.register("glowstone_ore",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Blocks.GLOWSTONE.defaultBlockState()),
                        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.ACACIA_WOOD.defaultBlockState())),
                        11)));

        final PlacedFeature placedGlowstoneOre = PlacementUtils.register("glowstone_ore",
                glowstoneOre.placed(HeightRangePlacement
                        .uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(20))));

        final ConfiguredFeature<?, ?> beansOre = FeatureUtils.register("solar_ore",
                Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(
                        OreFeatures.NETHER_ORE_REPLACEABLES, Blocks.BLUE_WOOL.defaultBlockState())), 3)));

        final PlacedFeature placedBeansOre = PlacementUtils.register("solar_ore",
                beansOre.placed(HeightRangePlacement.triangle(VerticalAnchor.absolute(50), VerticalAnchor.absolute(120))));

        final ConfiguredFeature<?, ?> eggOre = FeatureUtils.register("egg_ore",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(END_TEST, Blocks.GOLD_BLOCK.defaultBlockState())), 15)));

        final PlacedFeature placedEggOre = PlacementUtils.register("egg_ore",
                eggOre.placed(HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(60))));


        OVERWORLD_ORES.add(placedGlowstoneOre);
        NETHER_ORES.add(placedBeansOre);
        END_ORES.add(placedEggOre);
    }
}
