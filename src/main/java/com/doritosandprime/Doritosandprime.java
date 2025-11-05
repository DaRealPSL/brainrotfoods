package com.doritosandprime;

import com.doritosandprime.init.BlockInit;
import com.doritosandprime.init.ItemGroupInit;
import com.doritosandprime.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

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

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addAfter(Items.PUMPKIN_PIE, ItemInit.dorito);
			entries.addBefore(Items.MILK_BUCKET, ItemInit.prime);
			entries.addAfter(ItemInit.dorito, ItemInit.feastables);
			entries.addAfter(ItemInit.feastables, ItemInit.lunchly);
            entries.add(ItemInit.mango);
            entries.addAfter(ItemInit.lunchly, ItemInit.mountain_dew);
            entries.addAfter(ItemInit.mountain_dew, ItemInit.mango_smoothie);
            entries.addAfter(ItemInit.mango_smoothie, ItemInit.flamin_cheetos);
		});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ItemInit.mango_block);
        });

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(
                        BiomeKeys.JUNGLE,
                        BiomeKeys.SPARSE_JUNGLE,
                        BiomeKeys.BAMBOO_JUNGLE
                ),
                GenerationStep.Feature.VEGETAL_DECORATION,
                RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MOD_ID, "patch_mango"))
        );
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}