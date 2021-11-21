package me.bigvirusboi.cortexmod.init;

import me.bigvirusboi.cortexmod.CortexMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CortexMod.MOD_ID);

    public static final RegistryObject<Block> KODY_BLOCK = BLOCKS.register("kody_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.CLAY).sound(SoundType.ANVIL)
                    .strength(1.0f)));
}
