package corejava.annotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
Simple s =new Simple();
        Method []m =s.getClass().getDeclaredMethods();
        for(Method method:m){
            if(method.isAnnotationPresent(CustomAnnotation.class)){
                System.out.println("Annotation is present");
                s.trigger();
            }
        }
    }
}
