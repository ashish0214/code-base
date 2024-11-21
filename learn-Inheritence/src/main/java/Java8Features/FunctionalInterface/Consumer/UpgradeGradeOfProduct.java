package Java8Features.FunctionalInterface.Consumer;

/*Write a Consumer to update the grade of the product as 'Premium' if the price is > 1000/-.
Given the product list, update the grade for each product and print all of the products.*/


import java.util.List;
import java.util.function.Consumer;

public class UpgradeGradeOfProduct {

        static Consumer<Product> upgrade=(Product)->{
            if(Product.getPrice()>1000){
                Product.setGrade("Premium");
            }
        };



    public static void main(String[] args) {

        List<Product> listOfProduct=ProductList.productList();
        for(Product elements:listOfProduct){
           upgrade.accept(elements);
        }

        listOfProduct.forEach(System.out::println);
    }
}
