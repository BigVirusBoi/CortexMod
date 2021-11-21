package me.bigvirusboi.cortexmod.item;

import me.bigvirusboi.cortexmod.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CortexCreativeModeTab extends CreativeModeTab {
    public static final CortexCreativeModeTab TAB_CORTEX = new CortexCreativeModeTab("cortex");

    public CortexCreativeModeTab(String label) {
        super(CreativeModeTab.TABS.length, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.BANANA.get());
    }
}
