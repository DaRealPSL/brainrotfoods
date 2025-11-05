// src/client/java/com/doritosandprime/data/provider/DoritosandprimeRecipeProvider.java
package com.doritosandprime.data.provider;

import com.doritosandprime.init.BlockInit;
import com.doritosandprime.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;


import java.util.concurrent.CompletableFuture;

public class DoritosandprimeRecipeProvider extends FabricRecipeProvider {
    public DoritosandprimeRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        return new RecipeGenerator(registries, exporter) {
            @Override
            public void generate() {
                RegistryEntryLookup<Item> itemLookup = this.registries.getOrThrow(RegistryKeys.ITEM);

                //
                // DORITOS
                //
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.FOOD, ItemInit.dorito, 4)
                        .input('W', Items.WHEAT)
                        .input('B', Items.BLAZE_POWDER)
                        .input('G', Items.GOLD_NUGGET)
                        .pattern("WBW")
                        .pattern(" G ")
                        .pattern("WBW")
                        .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                        .offerTo(exporter);

                //
                // PRIME
                //
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.FOOD, ItemInit.prime)
                        .input('B', Items.GLASS_BOTTLE)
                        .input('W', Items.WATER_BUCKET)
                        .input('S', Items.SUGAR)
                        .pattern(" S ")
                        .pattern(" W ")
                        .pattern(" B ")
                        .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                        .offerTo(exporter);

                //
                // FEASTABLES
                //
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.FOOD, ItemInit.feastables)
                        .input('C', Items.COCOA_BEANS)
                        .input('S', Items.SUGAR)
                        .input('W', Items.WHEAT)
                        .pattern("C C")
                        .pattern(" S ")
                        .pattern(" W ")
                        .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                        .offerTo(exporter);

                //
                // LUNCHLY
                //
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.FOOD, ItemInit.lunchly)
                        .input('D', ItemInit.prime)
                        .input('F', ItemInit.feastables)
                        .input('P', Items.PAPER)
                        .pattern("PPP")
                        .pattern("PDP")
                        .pattern("PFP")
                        .criterion(hasItem(ItemInit.feastables), conditionsFromItem(ItemInit.feastables))
                        .criterion(hasItem(ItemInit.prime), conditionsFromItem(ItemInit.prime))
                        .offerTo(exporter);

                //
                // MOUNTAIN DEW
                //
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.FOOD, ItemInit.mountain_dew)
                        .input('G', Items.GREEN_DYE)
                        .input('L', Items.GLOWSTONE_DUST)
                        .input('S', Items.SUGAR)
                        .input('B', Items.GLASS_BOTTLE)
                        .pattern("GLG")
                        .pattern("SBS")
                        .pattern("GLG")
                        .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                        .offerTo(exporter);


                //
                // MANGO
                //
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.FOOD, ItemInit.mango, 9)
                        .input('M', BlockInit.MANGO_BLOCK)
                        .pattern("M")
                        .criterion(hasItem(BlockInit.MANGO_BLOCK), conditionsFromItem(BlockInit.MANGO_BLOCK))
                        .offerTo(exporter, String.valueOf(Identifier.of("doritosandprime", "mango_from_block")));
//                        .offerTo(exporter);

                //
                // MANGO BLOCK (crafting from mangoes)
                //
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.BUILDING_BLOCKS, BlockInit.MANGO_BLOCK)
                        .input('M', ItemInit.mango)
                        .pattern("MMM")
                        .pattern("MMM")
                        .pattern("MMM")
                        .criterion(hasItem(ItemInit.mango), conditionsFromItem(ItemInit.mango))
                        .offerTo(exporter);

                //
                // MANGO
                //
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.FOOD, ItemInit.mango_smoothie)
                        .input('M', ItemInit.mango)
                        .input('S', Items.SUGAR)
                        .input('B', Items.MILK_BUCKET)
                        .pattern("MMM")
                        .pattern(" S ")
                        .pattern(" B ")
                        .criterion(hasItem(ItemInit.mango), conditionsFromItem(ItemInit.mango))
                        .offerTo(exporter);

                //
                // CHEETOS
                //
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.FOOD, ItemInit.flamin_cheetos, 2)
                        .input('W', Items.WHEAT)
                        .input('R', Items.RED_DYE)
                        .input('N', Items.NETHER_WART)
                        .pattern("WRW")
                        .pattern(" N ")
                        .pattern("WRW")
                        .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Doritos and Prime Recipes";
    }
}
