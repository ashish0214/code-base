package annotation;

@MyAnnotation
public class BasicClass {


    @Important
    int height = 25;
    @Important
    int width = 30;
    int size=3;

    @MyAnnotation
    void demoMethod() {
        System.out.println("heloo");
    }

    @Repeat(time = 10)
    void method2() {
        System.out.println("method 2");
    }

    public static void main(String[] args) {

    }
}
