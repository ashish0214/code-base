package code_snipet;

abstract class Car {
    int a;

    void work() {
        System.out.println("car class");
    }

    abstract void some();

}

class Bmw extends Car {


    @Override
    void some() {
        System.out.println("Bmw");
    }

    @Override
    void work() {
        System.out.println("Bmw class");
    }
}

class Tata extends Car {
    @Override
    void some() {
        System.out.println("Tata");
    }

    @Override
    void work() {
        System.out.println("Tata class");
    }
}

class Suv extends Tata {


    @Override
    void some() {
        System.out.println("suv");
    }

    @Override
    void work() {
        System.out.println("Suv class");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car car = new Tata();
        Car a1 = new Bmw();
        Car b1 = new Suv();

        car.work();
        car.some();
        a1.work();
        a1.some();
        b1.work();
        b1.some();

    }

}




