package corejava.methodReference;

import java.util.function.Consumer;

public class Car {
    void drive(String speed){
        System.out.println("Car is driving at speed ");
    }

    public static void main(String[] args) {
       Car car=new Car();
//            Consumer consumer=car::drive;
//            consumer.accept(20);

    }
}
