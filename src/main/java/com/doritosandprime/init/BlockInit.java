package com.doritosandprime.init;

import com.doritosandprime.Doritosandprime;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockInit {
    public static final Block MANGO_BLOCK = register("mango_block",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MELON)
                    .setId(ResourceKey.create(Registries.BLOCK, Doritosandprime.id("mango_block")))));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(BuiltInRegistries.BLOCK, Doritosandprime.id(name), block);
    }

    public static void initialize() {
    }
}
