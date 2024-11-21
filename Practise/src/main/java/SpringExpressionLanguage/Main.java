package SpringExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Expression.xml");
        Demo d = context.getBean("demo", Demo.class);
        System.out.println(d);
    }
}
