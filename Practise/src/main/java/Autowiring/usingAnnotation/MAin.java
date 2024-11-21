package Autowiring.usingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAin {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("autowire.xml");
        Employe employe=applicationContext.getBean("emp1", Employe.class);
        System.out.println(employe);
    }
}
