package Java8Features.BiFunction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class CalculatevalueOfCart {

    public static double Calculate(Map<Product, Integer> cart) {
        double totalValue = 0;
        for (Map.Entry<Product, Integer> cartElement : cart.entrySet()) {
            Product product = cartElement.getKey();
            Integer quantity = cartElement.getValue();
            totalValue += getPriceCalculator(product, quantity);
        }
        return totalValue;
    }

    private static double getPriceCalculator(Product product1, Integer numberOfItems) {
        final BiFunction<Product, Integer, Double> priceCalculator = (product, quantity) -> {
            Double price = product.getPrice();
            return price * quantity;
        };
        return priceCalculator.apply(product1, numberOfItems);
    }

    public static void main(String[] args) {
        List<Product> list = CreationOfProduct.addProduct();
        Map<Product, Integer> map = new HashMap<Product, Integer>();
        int i = 0;
        for (Product cartItem : list) {
            map.put(cartItem, i++);
        }
        System.out.println("The Total Amount in Cart "+Calculate(map));
    }

}
