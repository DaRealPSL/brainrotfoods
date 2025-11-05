package com.doritosandprime.data.provider;

import com.doritosandprime.init.BlockInit;
import com.doritosandprime.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class DoritosandprimeLootTableProvider extends FabricBlockLootTableProvider {
    public DoritosandprimeLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // Make the mango block drop its block item.
        addDrop(BlockInit.MANGO_BLOCK);

        // When it's mined with Silk Touch, we want to drop the actual block
        addDropWithSilkTouch(BlockInit.MANGO_BLOCK);

        // Make mango blocks drop between 3 and 8 mangoes
        addDrop(BlockInit.MANGO_BLOCK, LootTable.builder().pool(addSurvivesExplosionCondition(ItemInit.mango, LootPool.builder()
                .rolls(new UniformLootNumberProvider(new ConstantLootNumberProvider(3), new ConstantLootNumberProvider(8)))
                .with(ItemEntry.builder(ItemInit.mango)))));
    }
}