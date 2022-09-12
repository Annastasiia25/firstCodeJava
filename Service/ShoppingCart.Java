package service;

import model.Food;

public class ShoppingCart{

    private static double totalSumWithoutDiscount;
    private static double totalSumWithDiscount;
    private static double totalSumWithDiscountVegeterian;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }
    public ShoppingCart() {
    }

        public double totalSumWithoutDiscount(){
            double totalSum = 0.0;
            for (int i = 0; i < food.length; i++) {
                totalSum += food[i].getPrice() * food[i].getAmount();
            }
            return totalSum;
        }
        public double totalSumWithDiscount(){
            double totalSumDicsount = 0.0;
            for (int i = 0; i < food.length; i++) {
                totalSumDicsount += (food[i].getPrice() - (food[i].getPrice() * food[i].getDiscount()/100)) * food[i].getAmount();
            }
            return totalSumDicsount;
        }
        public double totalSumWithDiscountVegeterian(){
            double totalSumDicsountVegeterian = 0.0;
            for (int i = 0; i < food.length; i++) {
                if (food[i].isVegetarian()) {
                    totalSumDicsountVegeterian += food[i].getPrice() * food[i].getAmount();
                }
            }
            return totalSumDicsountVegeterian;
        }
    Food[] food;
}
