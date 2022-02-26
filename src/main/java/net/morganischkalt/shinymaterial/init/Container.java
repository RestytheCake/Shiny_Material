package net.morganischkalt.shinymaterial.init;

import net.morganischkalt.shinymaterial.ShinyMaterial;
import net.morganischkalt.shinymaterial.function.container.ExampleChestContainer;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class Container {
    public static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS,
            ShinyMaterial.MODID);

    public static final RegistryObject<MenuType<ExampleChestContainer>> EXAMPLE_CHEST = CONTAINERS
            .register("example_chest", () -> new MenuType<>(ExampleChestContainer::new));
    
    private Container() {
    }
}
