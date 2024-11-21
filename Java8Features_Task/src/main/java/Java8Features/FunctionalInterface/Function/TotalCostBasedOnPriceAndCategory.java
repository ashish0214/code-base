package Java8Features.FunctionalInterface.Function;

import Java8Features.FunctionalInterface.Consumer.Product;
import Java8Features.FunctionalInterface.Consumer.ProductList;

import java.util.List;
import java.util.function.Function;

public class TotalCostBasedOnPriceAndCategory {
    public static void main(String[] args) {
        List<Product> allProducts = ProductList.productList();

        Function<Product, Boolean> isGreater = product -> product.getPrice() > 1000 && product.getCategory().equalsIgnoreCase("electronics");
        double totalValueOfProducts = Double.MIN_VALUE;
        for (Product product : allProducts) {
            if (isGreater.apply(product)) {
                totalValueOfProducts += product.getPrice();
            }
        }

        System.out.println("The Sum of Products values greater than 10000 and belong to electronics:" + totalValueOfProducts);

    }
}
