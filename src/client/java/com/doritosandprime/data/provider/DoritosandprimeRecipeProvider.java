package com.doritosandprime.data.provider;

import com.doritosandprime.init.BlockInit;
import com.doritosandprime.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class DoritosandprimeRecipeProvider extends FabricRecipeProvider {
    public DoritosandprimeRecipeProvider(FabricPackOutput output,
                                         CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries,
                                                  RecipeOutput exporter) {
        return new RecipeProvider(registries, exporter) {
            @Override
            public void buildRecipes() {
                HolderGetter<Item> itemLookup = this.registries.lookupOrThrow(Registries.ITEM);

                //
                // DORITOS
                //
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.FOOD, ItemInit.dorito, 4)
                        .define('W', Items.WHEAT)
                        .define('B', Items.BLAZE_POWDER)
                        .define('G', Items.GOLD_NUGGET)
                        .pattern("WBW")
                        .pattern(" G ")
                        .pattern("WBW")
                        .unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT))
                        .save(exporter);

                //
                // PRIME
                //
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.FOOD, ItemInit.prime)
                        .define('B', Items.GLASS_BOTTLE)
                        .define('W', Items.WATER_BUCKET)
                        .define('S', Items.SUGAR)
                        .pattern(" S ")
                        .pattern(" W ")
                        .pattern(" B ")
                        .unlockedBy(getHasName(Items.GLASS_BOTTLE),
                                has(Items.GLASS_BOTTLE))
                        .save(exporter);

                //
                // FEASTABLES
                //
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.FOOD, ItemInit.feastables)
                        .define('C', Items.COCOA_BEANS)
                        .define('S', Items.SUGAR)
                        .define('W', Items.WHEAT)
                        .pattern("C C")
                        .pattern(" S ")
                        .pattern(" W ")
                        .unlockedBy(getHasName(Items.COCOA_BEANS),
                                has(Items.COCOA_BEANS))
                        .save(exporter);

                //
                // LUNCHLY
                //
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.FOOD, ItemInit.lunchly)
                        .define('D', ItemInit.prime)
                        .define('F', ItemInit.feastables)
                        .define('P', Items.PAPER)
                        .pattern("PPP")
                        .pattern("PDP")
                        .pattern("PFP")
                        .unlockedBy(getHasName(ItemInit.feastables),
                                has(ItemInit.feastables))
                        .unlockedBy(getHasName(ItemInit.prime), has(ItemInit.prime))
                        .save(exporter);

                //
                // MOUNTAIN DEW
                //
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.FOOD, ItemInit.mountain_dew)
                        .define('G', Items.DYE.green())
                        .define('L', Items.GLOWSTONE_DUST)
                        .define('S', Items.SUGAR)
                        .define('B', Items.GLASS_BOTTLE)
                        .pattern("GLG")
                        .pattern("SBS")
                        .pattern("GLG")
                        .unlockedBy(getHasName(Items.GLASS_BOTTLE),
                                has(Items.GLASS_BOTTLE))
                        .save(exporter);

                //
                // MANGO
                //
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.FOOD, ItemInit.mango, 9)
                        .define('M', BlockInit.MANGO_BLOCK)
                        .pattern("M")
                        .unlockedBy(getHasName(BlockInit.MANGO_BLOCK),
                                has(BlockInit.MANGO_BLOCK))
                        .save(exporter, String.valueOf(
                                Identifier.fromNamespaceAndPath("doritosandprime", "mango_from_block")));
                // .save(exporter);

                //
                // MANGO BLOCK (crafting from mangoes)
                //
                ShapedRecipeBuilder
                        .shaped(itemLookup, RecipeCategory.BUILDING_BLOCKS,
                                BlockInit.MANGO_BLOCK)
                        .define('M', ItemInit.mango)
                        .pattern("MMM")
                        .pattern("MMM")
                        .pattern("MMM")
                        .unlockedBy(getHasName(ItemInit.mango), has(ItemInit.mango))
                        .save(exporter);

                //
                // MANGO
                //
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.FOOD, ItemInit.mango_smoothie)
                        .define('M', ItemInit.mango)
                        .define('S', Items.SUGAR)
                        .define('B', Items.MILK_BUCKET)
                        .pattern("MMM")
                        .pattern(" S ")
                        .pattern(" B ")
                        .unlockedBy(getHasName(ItemInit.mango), has(ItemInit.mango))
                        .save(exporter);

                //
                // CHEETOS
                //
                ShapedRecipeBuilder
                        .shaped(itemLookup, RecipeCategory.FOOD, ItemInit.flamin_cheetos, 2)
                        .define('W', Items.WHEAT)
                        .define('R', Items.DYE.red())
                        .define('N', Items.NETHER_WART)
                        .pattern("WRW")
                        .pattern(" N ")
                        .pattern("WRW")
                        .unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT))
                        .save(exporter);

                //
                // GRIMACE SHAKE
                //
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.FOOD, ItemInit.grimace_shake)
                        .define('A', Items.SWEET_BERRIES)
                        .define('S', Items.SUGAR)
                        .define('P', Items.DYE.purple())
                        .define('M', Items.MILK_BUCKET)
                        .define('G', Items.GLASS_BOTTLE)
                        .define('L', Items.SLIME_BALL)
                        .pattern("ASP")
                        .pattern("MGS")
                        .pattern(" L ")
                        .unlockedBy(getHasName(Items.MILK_BUCKET),
                                has(Items.MILK_BUCKET))
                        .unlockedBy(getHasName(Items.SWEET_BERRIES),
                                has(Items.SWEET_BERRIES))
                        .save(exporter);

                //
                // MONSTER ENERGY DRINK
                //
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.FOOD, ItemInit.monster_energy)
                        .define('S', Items.SUGAR)
                        .define('G', Items.GLOW_INK_SAC)
                        .define('B', Items.GLASS_BOTTLE)
                        .define('C', Items.SUGAR_CANE)
                        .define('I', Items.IRON_NUGGET)
                        .pattern("SGS")
                        .pattern("BCB")
                        .pattern(" I ")
                        .unlockedBy(getHasName(Items.GLOW_INK_SAC),
                                has(Items.GLOW_INK_SAC))
                        .unlockedBy(getHasName(Items.SUGAR_CANE),
                                has(Items.SUGAR_CANE))
                        .save(exporter);

                //
                // OHIO FINAL BOSS BURGER
                //
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.FOOD, ItemInit.ohio_burger)
                        .define('B', Items.BREAD)
                        .define('C', Items.COOKED_BEEF)
                        .define('A', Items.GOLDEN_APPLE)
                        .define('W', Items.NETHER_WART)
                        .define('R', Items.ROTTEN_FLESH)
                        .define('L', Items.LAVA_BUCKET)
                        .pattern("BCB")
                        .pattern("AWA")
                        .pattern("RLR")
                        .unlockedBy(getHasName(Items.GOLDEN_APPLE),
                                has(Items.GOLDEN_APPLE))
                        .unlockedBy(getHasName(Items.BREAD),
                                has(Items.BREAD))
                        .save(exporter);
            }

        };
    }

    @Override
    public String getName() {
        return "Doritos and Prime Recipes";
    }
}
