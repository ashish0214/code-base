package annotation;

import java.lang.annotation.*;

@Inherited

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})
public @interface MyAnnotation {
    int times() default 0;
}
