//package com.doritosandprime.data.provider;
//
//import com.doritosandprime.Doritosandprime;
//import com.doritosandprime.init.BlockInit;
//import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
//import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
//import net.minecraft.block.Blocks;
//import net.minecraft.registry.RegistryKey;
//import net.minecraft.registry.RegistryKeys;
//import net.minecraft.registry.RegistryWrapper;
//import net.minecraft.registry.entry.RegistryEntry;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.math.intprovider.ConstantIntProvider;
//import net.minecraft.world.gen.blockpredicate.BlockPredicate;
//import net.minecraft.world.gen.feature.*;
//import net.minecraft.world.gen.placementmodifier.*;
//import net.minecraft.world.gen.stateprovider.BlockStateProvider;
//
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//
//public class DoritosandprimeWorldGenProvider extends FabricDynamicRegistryProvider {
//    public DoritosandprimeWorldGenProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
//        super(output, registriesFuture);
//    }
//
//    @Override
//    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
//        // Configured Feature: mango patch
//        entries.add(RegistryKeys.CONFIGURED_FEATURE,
//                Identifier.of(Doritosandprime.MOD_ID, "patch_mango"),
//                new ConfiguredFeature<>(
//                        Feature.RANDOM_PATCH,
//                        new RandomPatchFeatureConfig(
//                                64, // tries
//                                7,  // xz_spread
//                                3,  // y_spread
//                                PlacedFeatures.createEntry(
//                                        Feature.SIMPLE_BLOCK,
//                                        new SimpleBlockFeatureConfig(BlockStateProvider.of(BlockInit.MANGO_BLOCK)),
//                                        List.of(
//                                                BlockPredicateFilter.of(
//                                                        BlockPredicate.allOf(
//                                                                BlockPredicate.IS_AIR,
//                                                                BlockPredicate.wouldSurvive(BlockInit.MANGO_BLOCK.getDefaultState(), BlockPos.ORIGIN),
//                                                                BlockPredicate.matchingBlocks(List.of(Blocks.GRASS_BLOCK), new BlockPos(0, -1, 0))
//                                                        )
//                                                )
//                                        )
//                                )
//                        )
//                )
//        );
//
//        // Placed Feature: mango patch with placement modifiers
//        entries.add(RegistryKeys.PLACED_FEATURE,
//                Identifier.of(Doritosandprime.MOD_ID, "patch_mango"),
//                new PlacedFeature(
//                        RegistryEntry.of(entries.ref(RegistryKeys.CONFIGURED_FEATURE,
//                                Identifier.of(Doritosandprime.MOD_ID, "patch_mango"))),
//                        List.of(
//                                RarityFilterPlacementModifier.of(32), // Spawn rarity (lower = more common)
//                                SquarePlacementModifier.of(),
//                                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
//                                BiomePlacementModifier.of()
//                        )
//                )
//        );
//    }
//
//    @Override
//    public String getName() {
//        return "World Generation";
//    }
//}