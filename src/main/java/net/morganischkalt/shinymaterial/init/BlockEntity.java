package net.morganischkalt.shinymaterial.init;

import net.morganischkalt.shinymaterial.ShinyMaterial;
import net.morganischkalt.shinymaterial.function.block.entity.ExampleChestBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class BlockEntity {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister
            .create(ForgeRegistries.BLOCK_ENTITIES, ShinyMaterial.MODID);

    public static final RegistryObject<BlockEntityType<ExampleChestBlockEntity>> EXAMPLE_CHEST = BLOCK_ENTITIES
            .register("example_chest", () -> BlockEntityType.Builder
                    .of(ExampleChestBlockEntity::new, Block.EXAMPLE_CHEST.get()).build(null));


    private BlockEntity() {
    }
}
