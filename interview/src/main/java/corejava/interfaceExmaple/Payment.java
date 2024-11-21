package corejava.interfaceExmaple;

public interface Payment {
    void process(int amount);

    //default method provides backwork comapability
    //which means any classes that have implemented the Payment interface
    //will not break if we add default methods
    default void superPayment(){
        System.out.println("I am default method");
    }

    //static methods ar
    static void commanProcess(){
        System.out.println("i am static method");
    }

}
