package net.morganischkalt.shinymaterial.function.block.entity;

import net.morganischkalt.shinymaterial.ShinyMaterial;
import net.morganischkalt.shinymaterial.init.BlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class ExampleChestBlockEntity extends InventoryBlockEntity {
    public static final Component TITLE = new TranslatableComponent(
            "container." + ShinyMaterial.MODID + ".example_chest");
    
    public ExampleChestBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntity.EXAMPLE_CHEST.get(), pos, state, 27);
    }
}
