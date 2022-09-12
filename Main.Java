import model.Apple;
import model.Discountable;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {

    public static void main(String args[]) {

        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.REDCOLOUR);
        Apple greenApple = new Apple(8, 60, Colour.GREENCOLOUR);

        Food[] food = {meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(food);
        System.out.println(shoppingCart.totalSumWithoutDiscount());
        System.out.println(shoppingCart.totalSumWithDiscount());
        System.out.println(shoppingCart.totalSumWithDiscountVegeterian());
    }
}
