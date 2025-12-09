// src/main/java/com/doritosandprime/list/FoodList.java
package com.doritosandprime.list;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class FoodList {
    // Prime
    public static final ConsumableComponent PRIME_CONSUMABLE = ConsumableComponents.drink()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 60, 1), 1.0F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 60, 9), 0.1F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 30, 2), 1.0F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 120, 1), 1.0F))
            .build();

    public static final FoodComponent prime_component = new FoodComponent.Builder()
            .nutrition(20)
            .saturationModifier(2.5F)
            .alwaysEdible()
            .build();

    // Dorito
    public static final ConsumableComponent DORITO_CONSUMABLE = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 120, 1), 1.0F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 60, 1), 1.0F))
            .build();

    public static final FoodComponent dorito_component = new FoodComponent.Builder()
            .nutrition(20)
            .saturationModifier(2.5F)
            .build();

    // Feastables
    public static final ConsumableComponent FEASTABLES_CONSUMABLE = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20 * 30, 1), 1.0F))
            .build();

    public static final FoodComponent feastables_component = new FoodComponent.Builder()
            .nutrition(25)
            .saturationModifier(2.5F)
            .build();

    // Lunchly
    public static final ConsumableComponent LUNCHLY_CONSUMABLE = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 15, 1), 0.8F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 20, 1), 0.8F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 20, 1), 0.8F))
            .build();

    public static final FoodComponent lunchly_component = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(1.5F)
            .build();

    // Mountain Dew
    public static final ConsumableComponent MOUNTAIN_DEW_CONSUMABLE = ConsumableComponents.drink()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 20, 1), 1.0F)) // Speed II for 20s
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20 * 10, 0), 1.0F)) // Jump Boost I for 10s
            .build();

    public static final FoodComponent mountain_dew_component = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.6F)
            .build();


    // Mango - Mango Mango Mango Mango'
    // 67 67 67 67
    public static final ConsumableComponent MANGO_CONSUMABLE = ConsumableComponents.food()
            // we can add effects if we want like this:
            // But for now we won't, cus it is just a mango.
//            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 5, 0), 0.3F)) // Regeneration I for 5s (30% chance)
            .build();

    public static final FoodComponent mango_component = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3F)
            .build();

    // Mango Smoothie - restorative drink with absorption
    public static final ConsumableComponent MANGO_SMOOTHIE_CONSUMABLE = ConsumableComponents.drink()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 30, 0), 1.0F)) // Absorption I for 30s
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 10, 0), 0.6F)) // Regeneration I for 10s (60% chance)
            .build();

    public static final FoodComponent mango_smoothie_component = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(1.2F)
            .build();

    // Flamin' Hot Cheetos
    public static final ConsumableComponent FLAMIN_CHEETOS_CONSUMABLE = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 15, 0), 1.0F)) // Speed I for 15s
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 5, 0), 0.8F)) // Nausea for 5s (80% chance)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 10, 0), 1.0F)) // Fire resistance for 10s
            .build();

    public static final FoodComponent flamin_cheetos_component = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.8F)
            .build();

    // Grimace Shake
    public static final ConsumableComponent GRIMACE_SHAKE_CONSUMABLE = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 10, 1), 1.0F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 5, 0), 1.0F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 4, 0), 1.0F))
            .build();

    public static final FoodComponent grimace_shake_component = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.6F)
            .build();

    // Monster Energy Drink
    public static final ConsumableComponent MONSTER_ENERGY_COMSUMABLE = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 25, 1), 1.0F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 20 * 20, 0), 1.0F))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 10, 0), 1.0F))
            .build();

    public static final FoodComponent monster_energy_component = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.4F)
            .build();

    // IDEAS TO ADD NEXT:
    // [x] Monster Energy Drink
    // [x] Grimace Shake
    // [] ...

}
