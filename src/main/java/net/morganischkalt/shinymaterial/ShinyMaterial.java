package net.morganischkalt.shinymaterial;

import java.util.Map.Entry;
import java.util.Optional;

import javax.annotation.Nonnull;

import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.morganischkalt.shinymaterial.init.Block;
import net.morganischkalt.shinymaterial.init.BlockEntity;
import net.morganischkalt.shinymaterial.init.Container;
import net.morganischkalt.shinymaterial.init.ModItem;

@Mod(net.morganischkalt.shinymaterial.ShinyMaterial.MODID)
public class ShinyMaterial {
    public static final String MODID = "shiny_material";
    
    public static final CreativeModeTab SHINY_MATERIAL_TAB = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return ModItem.SOLAR_DUST.get().getDefaultInstance();
        }
    };
    
    public ShinyMaterial() {
        final var bus = FMLJavaModLoadingContext.get().getModEventBus();

        Block.BLOCKS.register(bus);
        BlockEntity.BLOCK_ENTITIES.register(bus);
        Container.CONTAINERS.register(bus);
        ModItem.ITEMS.register(bus);
    }
    
    @Nonnull
    public net.minecraft.world.level.block.Block retreiveBlock(ResourceLocation name) {
        final Optional<net.minecraft.world.level.block.Block> block = ForgeRegistries.BLOCKS.getEntries().stream()
                .filter(entry -> entry.getKey().getRegistryName().equals(name)).map(Entry::getValue).findFirst();
        return block.orElse(Blocks.AIR);
    }
    
    public static VoxelShape calculateShapes(Direction to, VoxelShape shape) {
        final VoxelShape[] buffer = { shape, Shapes.empty() };
        
        final int times = (to.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;
        for (int i = 0; i < times; i++) {
            buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = Shapes.or(buffer[1],
                    Shapes.create(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
            buffer[0] = buffer[1];
            buffer[1] = Shapes.empty();
        }
        
        return buffer[0];
    }
}