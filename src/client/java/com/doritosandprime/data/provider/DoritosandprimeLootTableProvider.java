package com.doritosandprime.data.provider;

import com.doritosandprime.init.BlockInit;
import com.doritosandprime.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

public class DoritosandprimeLootTableProvider extends FabricBlockLootSubProvider {
    public DoritosandprimeLootTableProvider(FabricPackOutput dataOutput,
            CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // Make the mango block drop its block item.
        dropSelf(BlockInit.MANGO_BLOCK);

        // When it's mined with Silk Touch, we want to drop the actual block
        dropWhenSilkTouch(BlockInit.MANGO_BLOCK);

        // Make mango blocks drop between 3 and 8 mangoes
        add(BlockInit.MANGO_BLOCK,
                LootTable.lootTable().withPool(applyExplosionCondition(ItemInit.mango, LootPool.lootPool()
                        .setRolls(new UniformGenerator(ConstantValue.exactly(3),
                                ConstantValue.exactly(8)))
                        .add(LootItem.lootTableItem(ItemInit.mango)))));
    }
}
