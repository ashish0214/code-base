package CompleteConceptsOfAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "CompleteConceptsOfAnnotation")
public class Test {
ApplicationContext context=new AnnotationConfigApplicationContext(Test.class);
}
