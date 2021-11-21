package me.bigvirusboi.cortexmod.init;

import me.bigvirusboi.cortexmod.CortexMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CortexMod.MOD_ID);

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                            .nutrition(2).saturationMod(0.2f).build())
                    .tab(CreativeModeTab.TAB_FOOD)));
}
