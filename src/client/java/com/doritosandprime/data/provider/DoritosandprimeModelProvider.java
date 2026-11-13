package com.doritosandprime.data.provider;

import com.doritosandprime.init.BlockInit;
import com.doritosandprime.init.ItemInit;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class DoritosandprimeModelProvider extends FabricModelProvider {
    public DoritosandprimeModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createTrivialCube(BlockInit.MANGO_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ItemInit.dorito, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ItemInit.feastables, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ItemInit.prime, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ItemInit.lunchly, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ItemInit.mountain_dew, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ItemInit.mango_smoothie, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ItemInit.flamin_cheetos, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ItemInit.mango, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ItemInit.grimace_shake, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ItemInit.monster_energy, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ItemInit.ohio_burger, ModelTemplates.FLAT_ITEM);

    }
}
