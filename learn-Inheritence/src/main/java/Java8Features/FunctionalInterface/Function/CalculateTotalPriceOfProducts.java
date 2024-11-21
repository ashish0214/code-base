package Java8Features.FunctionalInterface.Function;
import Java8Features.FunctionalInterface.Consumer.*;

import java.util.List;
import java.util.function.Function;

//Write a function to calculate the cost of all products in a given list of products.

public class CalculateTotalPriceOfProducts {


    public static void main(String[] args) {
        Function<Product,Double> item=product->product.getPrice();
        List<Product> listOfItems=ProductList.productList();
        double totalCost=0;
        for (Product items:listOfItems){
            totalCost+=item.apply(items);
        }
        System.out.println("The Total product price is "+totalCost);

    }
}
