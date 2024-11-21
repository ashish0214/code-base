package Java8Features.FunctionalInterface.Consumer;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    public static  List<Product>productList(){
        List<Product> listOfProduct=new ArrayList<>();
        listOfProduct.add( new Product("Bat", 5000, "Toys", "Premium"));
        listOfProduct.add( new Product("Car", 20000.6, "Transportation", "Premium"));
        listOfProduct.add( new Product("pendrive", 50, "electronics", "Premium"));
        listOfProduct.add( new Product("choclate", 80, "food", "Normal"));
        listOfProduct.add( new Product("gun", 5600, "safety", "Safe"));
        listOfProduct.add( new Product("table", 500, "Study", "Normal"));
        listOfProduct.add( new Product( "phone", 50000, "electronics", "Premium"));
        listOfProduct.add(new Product("laptop", 100000, "electronics", "Premium"));
return listOfProduct;
    }
}

