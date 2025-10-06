package com.doritosandprime.init;

import com.doritosandprime.Doritosandprime;
import com.doritosandprime.list.FoodList;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Rarity;

public class ItemInit {
    public static final Item prime = register("prime",
            new Item(new Item.Settings()
                    .food(FoodList.prime_component)
                    .component(DataComponentTypes.CONSUMABLE, FoodList.PRIME_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Doritosandprime.id("prime")))));


    public static final Item dorito = register("dorito",
            new Item(new Item.Settings()
                    .food(FoodList.dorito_component)
                    .component(DataComponentTypes.CONSUMABLE, FoodList.DORITO_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Doritosandprime.id("dorito")))));


    public static final Item feastables = register("feastables",
            new Item(new Item.Settings()
                    .food(FoodList.feastables_component)
                    .component(DataComponentTypes.CONSUMABLE, FoodList.FEASTABLES_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Doritosandprime.id("feastables")))));


    public static final Item lunchly = register("lunchly",
            new Item(new Item.Settings()
                    .food(FoodList.lunchly_component)
                    .component(DataComponentTypes.CONSUMABLE, FoodList.LUNCHLY_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Doritosandprime.id("lunchly")))));


    public static final Item mountain_dew = register("mountain_dew",
            new Item(new Item.Settings()
                    .food(FoodList.mountain_dew_component)
                    .component(DataComponentTypes.CONSUMABLE, FoodList.MOUNTAIN_DEW_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Doritosandprime.id("mountain_dew")))));


    public static final Item mango_smoothie = register("mango_smoothie",
            new Item(new Item.Settings()
                    .food(FoodList.mango_smoothie_component)
                    .component(DataComponentTypes.CONSUMABLE, FoodList.MANGO_SMOOTHIE_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Doritosandprime.id("mango_smoothie")))));


    public static final Item flamin_cheetos = register("flamin_cheetos",
            new Item(new Item.Settings()
                    .food(FoodList.flamin_cheetos_component)
                    .component(DataComponentTypes.CONSUMABLE, FoodList.FLAMIN_CHEETOS_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Doritosandprime.id("flamin_cheetos")))));


    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, Doritosandprime.id(name), item);
    }

    public static void load() {}
}
