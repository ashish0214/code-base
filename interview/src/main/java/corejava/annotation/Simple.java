package corejava.annotation;

public class Simple {
    @CustomAnnotation
    void trigger(){
        System.out.println("Simple Triggered");
    }
}
