package annotation;

import java.lang.reflect.Method;

public class SubClass {
    public static void main(String[] args) throws Exception {

        //checking that annotation is a pplied to BasicClass if present we can do anyoperation or else do something else
        BasicClass b = new BasicClass();
        if (b.getClass().isAnnotationPresent(MyAnnotation.class)) {
            System.out.println("Myannotation present");
        } else {
            System.out.println("not annotated");
        }

        //to check the method is annotated
        Method[] m = b.getClass().getDeclaredMethods();//this get al the method present

        for (Method method : m) {//iteration through the method
            if (method.isAnnotationPresent(MyAnnotation.class)) {//checking if annotation is present
                method.invoke(b);//invoking the method by passing the class object
            }
        }
for(Method method:b.getClass().getDeclaredMethods()){
for(int i=0;i<method.getAnnotation(Repeat.class).time();i++){
method.invoke(b);}}
}

}
