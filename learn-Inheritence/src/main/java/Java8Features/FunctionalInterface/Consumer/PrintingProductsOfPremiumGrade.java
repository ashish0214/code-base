package Java8Features.FunctionalInterface.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class PrintingProductsOfPremiumGrade {

    public static void main(String[] args) {
        List<Product> listOfProducts = ProductList.productList();
        Consumer<Product> premiumProducts = product -> {
            if (product.getGrade().equalsIgnoreCase("Premium")) {
                product.setName(product.getName() + "*");
                System.out.println(product);
            }
        };
        listOfProducts.forEach(product->premiumProducts.accept(product));

    }
}
