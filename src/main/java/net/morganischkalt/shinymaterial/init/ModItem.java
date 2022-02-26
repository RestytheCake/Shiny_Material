package net.morganischkalt.shinymaterial.init;

import net.morganischkalt.shinymaterial.ShinyMaterial;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.morganischkalt.shinymaterial.ShinyMaterial.SHINY_MATERIAL_TAB;
import net.minecraft.world.item.Item;

public final class ModItem {
    public static final DeferredRegister<net.minecraft.world.item.Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, ShinyMaterial.MODID);


    public static final RegistryObject<Item> POOP = ITEMS.register("poop",
            () -> new net.minecraft.world.item.Item(new Item.Properties().tab(SHINY_MATERIAL_TAB)
                    .food(new FoodProperties.Builder().nutrition(50).saturationMod(5f)
                            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 5), 1f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 500, 64), 1f).build())));

    public static final RegistryObject<Item> SOLAR_DUST = ITEMS.register("solar_dust",
            () -> new Item(new Item.Properties().tab(SHINY_MATERIAL_TAB)));


    // Tools
    public static final RegistryObject<SwordItem> SOLAR_SWORD = ITEMS.register("solar_sword",
            () -> new SwordItem(ToolMaterial.SOLAR_MATERIAL, 20, 5f, new net.minecraft.world.item.Item.Properties().tab(SHINY_MATERIAL_TAB)));
    
    public static final RegistryObject<PickaxeItem> SOLAR_PICKAXE = ITEMS.register("solar_pickaxe",
            () -> new PickaxeItem(ToolMaterial.SOLAR_MATERIAL, 20, 5f, new net.minecraft.world.item.Item.Properties().tab(SHINY_MATERIAL_TAB)));
    
    public static final RegistryObject<ShovelItem> SOLAR_SHOVEL = ITEMS.register("solar_shovel",
            () -> new ShovelItem(ToolMaterial.SOLAR_MATERIAL, 20, 5f, new net.minecraft.world.item.Item.Properties().tab(SHINY_MATERIAL_TAB)));
    
    public static final RegistryObject<AxeItem> SOLAR_AXE = ITEMS.register("solar_axe",
            () -> new AxeItem(ToolMaterial.SOLAR_MATERIAL, 20, 5f, new net.minecraft.world.item.Item.Properties().tab(SHINY_MATERIAL_TAB)));
    
    public static final RegistryObject<HoeItem> SOLAR_HOE = ITEMS.register("solar_hoe",
            () -> new HoeItem(ToolMaterial.SOLAR_MATERIAL, 20, 5f, new net.minecraft.world.item.Item.Properties().tab(SHINY_MATERIAL_TAB)));


    // Armor
    public static final RegistryObject<ArmorItem> SOLAR_HELMET = ITEMS.register("solar_helmet",
            () -> new ArmorItem(ArmorMaterial.SOLAR_ARMOR, EquipmentSlot.HEAD,
                    new Item.Properties().tab(SHINY_MATERIAL_TAB)));
    
    public static final RegistryObject<ArmorItem> SOLAR_CHESTPLATE = ITEMS.register("solar_chestplate",
            () -> new ArmorItem(ArmorMaterial.SOLAR_ARMOR, EquipmentSlot.CHEST,
                    new Item.Properties().tab(SHINY_MATERIAL_TAB)));
    
    public static final RegistryObject<ArmorItem> SOLAR_LEGGINGS = ITEMS.register("solar_leggings",
            () -> new ArmorItem(ArmorMaterial.SOLAR_ARMOR, EquipmentSlot.LEGS,
                    new Item.Properties().tab(SHINY_MATERIAL_TAB)));
    
    public static final RegistryObject<ArmorItem> SOLAR_BOOTS = ITEMS.register("solar_boots",
            () -> new ArmorItem(ArmorMaterial.SOLAR_ARMOR, EquipmentSlot.FEET,
                    new Item.Properties().tab(SHINY_MATERIAL_TAB)));


    // Block Items
    public static final RegistryObject<BlockItem> EXAMPLE_CHEST_BLOCK_ITEM = ITEMS.register("example_chest",
            () -> new BlockItem(Block.EXAMPLE_CHEST.get(), new Item.Properties().tab(SHINY_MATERIAL_TAB)));

    public static final RegistryObject<BlockItem> SOLAR_ORE_BLOCK_ITEM = ITEMS.register("solar_ore",
            () -> new BlockItem(Block.SOLAR_ORE.get(), new Item.Properties().tab(SHINY_MATERIAL_TAB)));


    private ModItem() {
    }
}
