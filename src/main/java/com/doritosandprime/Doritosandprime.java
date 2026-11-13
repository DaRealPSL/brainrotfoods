package com.doritosandprime;

import com.doritosandprime.init.BlockInit;
import com.doritosandprime.init.ItemGroupInit;
import com.doritosandprime.init.ItemInit;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doritosandprime implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("doritosandprime");
    public static final String MOD_ID = "doritosandprime";

    @Override
    public void onInitialize() {
        LOGGER.info("Loading...");
        ItemInit.load();
        ItemGroupInit.load();
        BlockInit.initialize();

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(entries -> {
            entries.insertAfter(Items.PUMPKIN_PIE, ItemInit.dorito);
            entries.insertBefore(Items.MILK_BUCKET, ItemInit.prime);
            entries.insertAfter(ItemInit.dorito, ItemInit.feastables);
            entries.insertAfter(ItemInit.feastables, ItemInit.lunchly);
            entries.accept(ItemInit.mango);
            entries.insertAfter(ItemInit.lunchly, ItemInit.mountain_dew);
            entries.insertAfter(ItemInit.mountain_dew, ItemInit.mango_smoothie);
            entries.insertAfter(ItemInit.mango_smoothie, ItemInit.flamin_cheetos);
            entries.insertAfter(ItemInit.flamin_cheetos, ItemInit.grimace_shake);
            entries.insertAfter(ItemInit.grimace_shake, ItemInit.monster_energy);
            entries.insertAfter(ItemInit.monster_energy, ItemInit.ohio_burger);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS)
                .register(entries -> entries.accept(ItemInit.mango_block));

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(
                        Biomes.JUNGLE,
                        Biomes.SPARSE_JUNGLE,
                        Biomes.BAMBOO_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ResourceKey.create(Registries.PLACED_FEATURE, id("patch_mango")));
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
