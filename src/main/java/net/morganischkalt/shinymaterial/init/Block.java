package net.morganischkalt.shinymaterial.init;

import net.minecraft.world.level.material.Material;
import net.morganischkalt.shinymaterial.ShinyMaterial;
import net.morganischkalt.shinymaterial.function.block.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class Block {

    public static final DeferredRegister<net.minecraft.world.level.block.Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            ShinyMaterial.MODID);

    public static final RegistryObject<ExampleChestBlock> EXAMPLE_CHEST = BLOCKS.register("example_chest",
            () -> new ExampleChestBlock(BlockBehaviour.Properties.copy(Blocks.CHEST)));

    public static final RegistryObject<net.minecraft.world.level.block.Block> SOLAR_ORE = BLOCKS.register("solar_ore",
            () -> new Solar_Ore(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()));

    private Block() {
    }
}
