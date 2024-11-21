package SpringCorePractise.ConstructionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringcorePractise/constructionInjectionConfig.xml");
        Address address=(Address) context.getBean("address1");
        System.out.println(address);

        Student student=(Student) context.getBean("student");
        System.out.println(student);
    }
}

