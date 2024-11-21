package annotation;

import java.lang.reflect.Field;

public class FieldsExample {
    public static void main(String[] args) throws  Exception {
BasicClass base=new BasicClass();
for(Field f: base.getClass().getDeclaredFields()){
    if(f.isAnnotationPresent(Important.class)){
        System.out.println(f.get(base));
    }

}
    }
}
