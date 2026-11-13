package com.doritosandprime.init;

import com.doritosandprime.Doritosandprime;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

import java.util.Optional;

public class ItemGroupInit {
    public static final Component GROUP_TITLE = Component.translatable("itemGroup." + Doritosandprime.MOD_ID + ".mod-group");
    public static final CreativeModeTab MOD_GROUP = register("mod-group", FabricCreativeModeTab.builder()
            .title(GROUP_TITLE)
            .icon(ItemInit.dorito::getDefaultInstance)
            .displayItems((displayContext, entries) -> BuiltInRegistries.ITEM.keySet()
                    .stream()
                    .filter(key -> key.getNamespace().equals(Doritosandprime.MOD_ID))
                    .map(BuiltInRegistries.ITEM::getOptional)
                    .map(Optional::orElseThrow)
                    .forEach(entries::accept))
            .build());

    public static <T extends CreativeModeTab> T register(String name, T itemGroup) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Doritosandprime.id(name), itemGroup);
    }

    public static void load() {
    }
}
