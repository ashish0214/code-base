package Java8Features.FunctionalInterface.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class AddSuffixAtEndOfProductBasedOnPrice {
    static  Consumer<Product> modifyNamebasedOnprice=product->{
        if(product.getPrice()>3000){
            product.setName(product.getName()+"*");
        }
    };
    public static void main(String[] args) {
        List<Product> listOfProduct=ProductList.productList();
        for (Product element:listOfProduct){
           modifyNamebasedOnprice.accept(element);
        }
        listOfProduct.forEach(System.out::println);

    }
}
