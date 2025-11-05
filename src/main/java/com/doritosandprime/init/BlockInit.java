package com.doritosandprime.init;

import com.doritosandprime.Doritosandprime;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class BlockInit {
    public static final Block MANGO_BLOCK = register("mango_block",
            new Block(AbstractBlock.Settings.copy(Blocks.MELON)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Doritosandprime.id("mango_block")))));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, Doritosandprime.id(name), block);
    }

    public static void initialize() {}
}
