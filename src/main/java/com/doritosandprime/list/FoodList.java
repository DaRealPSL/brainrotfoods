package com.doritosandprime.list;

import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class FoodList {
    // Prime
    public static final Consumable PRIME_CONSUMABLE = Consumables.defaultDrink()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.ABSORPTION, 20 * 60, 1), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.ABSORPTION, 20 * 60, 9), 0.1F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.REGENERATION, 20 * 30, 2), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 120, 1), 1.0F))
            .build();

    public static final FoodProperties prime_component = new FoodProperties.Builder()
            .nutrition(20)
            .saturationModifier(2.5F)
            .alwaysEdible()
            .build();

    // Dorito
    public static final Consumable DORITO_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 120, 1), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.RESISTANCE, 20 * 60, 1), 1.0F))
            .build();

    public static final FoodProperties dorito_component = new FoodProperties.Builder()
            .nutrition(20)
            .saturationModifier(2.5F)
            .build();

    // Feastables
    public static final Consumable FEASTABLES_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.GLOWING, 20 * 30, 1), 1.0F))
            .build();

    public static final FoodProperties feastables_component = new FoodProperties.Builder()
            .nutrition(25)
            .saturationModifier(2.5F)
            .build();

    // Lunchly
    public static final Consumable LUNCHLY_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.NAUSEA, 20 * 15, 1), 0.8F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.POISON, 20 * 20, 1), 0.8F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.BLINDNESS, 20 * 20, 1), 0.8F))
            .build();

    public static final FoodProperties lunchly_component = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.5F)
            .build();

    // Mountain Dew
    public static final Consumable MOUNTAIN_DEW_CONSUMABLE = Consumables.defaultDrink()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.SPEED, 20 * 20, 1), 1.0F)) // Speed II
            // for 20s
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.JUMP_BOOST, 20 * 10, 0), 1.0F)) // Jump
            // Boost
            // I for
            // 10s
            .build();

    public static final FoodProperties mountain_dew_component = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.6F)
            .build();

    // Mango - Mango Mango Mango Mango'
    // 67 67 67 67
    public static final Consumable MANGO_CONSUMABLE = Consumables.defaultFood()
            // we can add effects if we want like this:
            // But for now we won't, cus it is just a mango.
            // .onConsume(new ApplyStatusEffectsConsumeEffect(new
            // MobEffectInstance(MobEffects.REGENERATION, 20 * 5, 0), 0.3F)) //
            // Regeneration I for 5s (30% chance)
            .build();

    public static final FoodProperties mango_component = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.3F)
            .build();

    // Mango Smoothie
    public static final Consumable MANGO_SMOOTHIE_CONSUMABLE = Consumables.defaultDrink()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.ABSORPTION, 20 * 30, 0), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.REGENERATION, 20 * 10, 0), 0.6F))
            .build();

    public static final FoodProperties mango_smoothie_component = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.2F)
            .build();

    // Flamin' Hot Cheetos
    public static final Consumable FLAMIN_CHEETOS_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.SPEED, 20 * 15, 0), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.NAUSEA, 20 * 5, 0), 0.8F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 10, 0), 1.0F))
            .build();

    public static final FoodProperties flamin_cheetos_component = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.8F)
            .build();

    // Grimace Shake
    public static final Consumable GRIMACE_SHAKE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.REGENERATION, 20 * 10, 1), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.NAUSEA, 20 * 5, 0), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.SLOWNESS, 20 * 4, 0), 1.0F))
            .build();

    public static final FoodProperties grimace_shake_component = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.6F)
            .build();

    // Monster Energy Drink
    public static final Consumable MONSTER_ENERGY_COMSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.SPEED, 20 * 25, 1), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.HASTE, 20 * 20, 0), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.STRENGTH, 20 * 10, 0), 1.0F))
            .build();

    public static final FoodProperties monster_energy_component = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.4F)
            .build();

    // Ohio Final Boss Burger
    public static final Consumable OHIO_BURGER_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.STRENGTH, 20 * 15, 1), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.REGENERATION, 20 * 15, 1), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.DARKNESS, 20 * 5, 0), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.NAUSEA, 20 * 3, 0), 1.0F))
            .build();

    public static final FoodProperties ohio_burger_component = new FoodProperties.Builder()
            .nutrition(14)
            .saturationModifier(1.6F)
            .build();
}
