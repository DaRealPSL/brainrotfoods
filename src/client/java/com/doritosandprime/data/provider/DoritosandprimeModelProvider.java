package com.doritosandprime.data.provider;

import com.doritosandprime.init.BlockInit;
import com.doritosandprime.init.ItemInit;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class DoritosandprimeModelProvider extends FabricModelProvider {
    public DoritosandprimeModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MANGO_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.dorito, Models.GENERATED);
        itemModelGenerator.register(ItemInit.feastables, Models.GENERATED);
        itemModelGenerator.register(ItemInit.prime, Models.GENERATED);
        itemModelGenerator.register(ItemInit.lunchly, Models.GENERATED);
        itemModelGenerator.register(ItemInit.mountain_dew, Models.GENERATED);
        itemModelGenerator.register(ItemInit.mango_smoothie, Models.GENERATED);
        itemModelGenerator.register(ItemInit.flamin_cheetos, Models.GENERATED);
        itemModelGenerator.register(ItemInit.mango, Models.GENERATED);
        itemModelGenerator.register(ItemInit.grimace_shake, Models.GENERATED);
        itemModelGenerator.register(ItemInit.monster_energy, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ohio_burger, Models.GENERATED);

    }
}
