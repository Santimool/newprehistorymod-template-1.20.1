package net.zenon.newprehistorymod.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(4).saturationModifier(2.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 200), 0.25f).build();

}
