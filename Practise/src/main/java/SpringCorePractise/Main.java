package SpringCorePractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new  ClassPathXmlApplicationContext("SpringCorePractise/config.xml");
        Address address=(Address) applicationContext.getBean("address");
        System.out.println(address);
    }
}
