package Java8Features.FunctionalInterface.Supplier;
import Java8Features.FunctionalInterface.Consumer.Product;

import java.util.Random;
import java.util.function.Supplier;

public class GenerateProduct {
    private static final String[] PRODUCT_NAME={"Bat","Car","Clothes","Bike","Laptop","Ball"};
    private  static final String[] PRODUCT_CATEGORY={"Electronics","Toys","Sports"};
    private static final Double[] PRODUCT_PRICE={24537.9,4664.0,3773.9,36637.5,3435.7};
    private static final String[] PRODUCT_GRADE={"Normal","Premium","Average"};

    private static Random randumGeneration=new Random();


    public static void main(String[] args) {
        Supplier<Product> items=()->{
            String name=PRODUCT_NAME[randumGeneration.nextInt(PRODUCT_NAME.length)];
            String category=PRODUCT_CATEGORY[randumGeneration.nextInt(PRODUCT_CATEGORY.length)];
            String grade=PRODUCT_GRADE[randumGeneration.nextInt(PRODUCT_GRADE.length)];
            double price=PRODUCT_PRICE[randumGeneration.nextInt(PRODUCT_PRICE.length)];
            return new Product(name,price,category,grade);

        };
        System.out.println(items.get());

    }
}
