package BeanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
   AbstractApplicationContext applicationContext=new  ClassPathXmlApplicationContext("BeanLifeCycle/config.xml");
   Student student=(Student) applicationContext.getBean("beanStudent");
        System.out.println(student);
        applicationContext.registerShutdownHook();


        //2 bean cycle using interface
        Teacher teacher=(Teacher) applicationContext.getBean("teacher");
        System.out.println(teacher);

    }
}

