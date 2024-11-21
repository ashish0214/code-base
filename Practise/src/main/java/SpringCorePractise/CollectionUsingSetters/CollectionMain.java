package SpringCorePractise.CollectionUsingSetters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringcorePractise/collectionConfig.xml");
        Cart item=(Cart) context.getBean("cartList");
        System.out.println(item);

    }
}
