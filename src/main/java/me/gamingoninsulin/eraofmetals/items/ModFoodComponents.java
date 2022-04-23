package me.gamingoninsulin.eraofmetals.items;


import net.minecraft.item.FoodComponent;


public class ModFoodComponents {

    // raw turnip
    public static FoodComponent R_TURNIP = new FoodComponent.Builder().hunger(2).saturationModifier(2).snack().build();

    // cooked turnip
    public static FoodComponent C_TURNIP = new FoodComponent.Builder().hunger(4).saturationModifier(4).snack().build();

    {

    }
}
