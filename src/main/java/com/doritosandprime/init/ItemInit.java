package com.doritosandprime.init;

import com.doritosandprime.Doritosandprime;
import com.doritosandprime.list.FoodList;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Rarity;
//import com.doritosandprime.init.BlockInit;

public class ItemInit {
    public static final Item prime = register("prime",
            new Item(new Item.Properties()
                    .food(FoodList.prime_component)
                    .component(DataComponents.CONSUMABLE, FoodList.PRIME_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .setId(ResourceKey.create(Registries.ITEM, Doritosandprime.id("prime")))));

    public static final Item dorito = register("dorito",
            new Item(new Item.Properties()
                    .food(FoodList.dorito_component)
                    .component(DataComponents.CONSUMABLE, FoodList.DORITO_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .setId(ResourceKey.create(Registries.ITEM, Doritosandprime.id("dorito")))));

    public static final Item feastables = register("feastables",
            new Item(new Item.Properties()
                    .food(FoodList.feastables_component)
                    .component(DataComponents.CONSUMABLE, FoodList.FEASTABLES_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .setId(ResourceKey.create(Registries.ITEM,
                            Doritosandprime.id("feastables")))));

    public static final Item lunchly = register("lunchly",
            new Item(new Item.Properties()
                    .food(FoodList.lunchly_component)
                    .component(DataComponents.CONSUMABLE, FoodList.LUNCHLY_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .setId(ResourceKey.create(Registries.ITEM,
                            Doritosandprime.id("lunchly")))));

    public static final Item mountain_dew = register("mountain_dew",
            new Item(new Item.Properties()
                    .food(FoodList.mountain_dew_component)
                    .component(DataComponents.CONSUMABLE, FoodList.MOUNTAIN_DEW_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .setId(ResourceKey.create(Registries.ITEM,
                            Doritosandprime.id("mountain_dew")))));

    public static final Item mango = register("mango",
            new Item(new Item.Properties()
                    .food(FoodList.mango_component)
                    .component(DataComponents.CONSUMABLE, FoodList.MANGO_CONSUMABLE)
                    .setId(ResourceKey.create(Registries.ITEM, Doritosandprime.id("mango")))));

    public static final Item mango_block = register("mango_block",
            new BlockItem(BlockInit.MANGO_BLOCK, new Item.Properties()
                    .useBlockDescriptionPrefix()
                    .setId(ResourceKey.create(Registries.ITEM,
                            Doritosandprime.id("mango_block")))));

    public static final Item mango_smoothie = register("mango_smoothie",
            new Item(new Item.Properties()
                    .food(FoodList.mango_smoothie_component)
                    .component(DataComponents.CONSUMABLE, FoodList.MANGO_SMOOTHIE_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .setId(ResourceKey.create(Registries.ITEM,
                            Doritosandprime.id("mango_smoothie")))));

    public static final Item flamin_cheetos = register("flamin_cheetos",
            new Item(new Item.Properties()
                    .food(FoodList.flamin_cheetos_component)
                    .component(DataComponents.CONSUMABLE, FoodList.FLAMIN_CHEETOS_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .setId(ResourceKey.create(Registries.ITEM,
                            Doritosandprime.id("flamin_cheetos")))));

    // Grimace Shake
    public static final Item grimace_shake = register("grimace_shake",
            new Item(new Item.Properties()
                    .food(FoodList.grimace_shake_component)
                    .component(DataComponents.CONSUMABLE, FoodList.GRIMACE_SHAKE_CONSUMABLE)
                    .rarity(Rarity.RARE)
                    .setId(ResourceKey.create(Registries.ITEM,
                            Doritosandprime.id("grimace_shake")))));

    // Monster Energy Drink
    public static final Item monster_energy = register("monster_energy",
            new Item(new Item.Properties()
                    .food(FoodList.monster_energy_component)
                    .component(DataComponents.CONSUMABLE, FoodList.MONSTER_ENERGY_COMSUMABLE)
                    .rarity(Rarity.RARE)
                    .setId(ResourceKey.create(Registries.ITEM,
                            Doritosandprime.id("monster_energy")))));

    // Ohio Final Boss Burger
    public static final Item ohio_burger = register("ohio_burger",
            new Item(new Item.Properties()
                    .food(FoodList.ohio_burger_component)
                    .component(DataComponents.CONSUMABLE, FoodList.OHIO_BURGER_CONSUMABLE)
                    .rarity(Rarity.EPIC)
                    .setId(ResourceKey.create(Registries.ITEM,
                            Doritosandprime.id("ohio_burger")))));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(BuiltInRegistries.ITEM, Doritosandprime.id(name), item);
    }

    public static void load() {
    }
}
