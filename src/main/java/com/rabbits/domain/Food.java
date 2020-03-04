package com.rabbits.domain;

import com.rabbits.support.FoodType;

public class Food {
    private FoodType foodType;
    private Number quantity;

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public Number getQuantity() {
        return quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public Food() {
    }
}
