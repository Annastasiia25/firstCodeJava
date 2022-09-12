package model;

import static model.constants.Colour.REDCOLOUR;
import static model.constants.Discount.DICSOUNT;
import static model.constants.Discount.DICSOUNT60;

public class Apple extends Food {
    private String colour;
    public Apple (int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour == REDCOLOUR) {
            return DICSOUNT60;
        }
        return DICSOUNT;
    }
}
