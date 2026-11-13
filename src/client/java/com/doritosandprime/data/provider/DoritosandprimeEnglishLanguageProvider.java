package com.doritosandprime.data.provider;

import com.doritosandprime.Doritosandprime;
import com.doritosandprime.init.BlockInit;
import com.doritosandprime.init.ItemGroupInit;
import com.doritosandprime.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class DoritosandprimeEnglishLanguageProvider extends FabricLanguageProvider {

    public DoritosandprimeEnglishLanguageProvider(FabricPackOutput dataOutput,
                                                  CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Component text, @NotNull String value) {
        if (text.getContents() instanceof TranslatableContents translatableContents) {
            builder.add(translatableContents.getKey(), value);
        } else {
            Doritosandprime.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(HolderLookup.Provider wrapperLookup,
                                     TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.dorito, "Dorito");
        translationBuilder.add(ItemInit.prime, "Prime Bottle");
        addText(translationBuilder, ItemGroupInit.GROUP_TITLE, "Meme Foods");
        translationBuilder.add(ItemInit.feastables, "Feastables Chocolate");
        translationBuilder.add(ItemInit.lunchly, "Lunchly");
        translationBuilder.add(ItemInit.mountain_dew, "Mountain Dew");
        translationBuilder.add(ItemInit.mango_smoothie, "Mango Smoothie");
        translationBuilder.add(ItemInit.flamin_cheetos, "Flamin' Hot Cheetos");
        translationBuilder.add(ItemInit.mango, "Mango");
        translationBuilder.add(BlockInit.MANGO_BLOCK, "Mango Block");
        translationBuilder.add(ItemInit.grimace_shake, "Grimace Shake");
        translationBuilder.add(ItemInit.monster_energy, "Monster Energy Drink");
        translationBuilder.add(ItemInit.ohio_burger, "Ohio Final Boss Burger");
    }
}
