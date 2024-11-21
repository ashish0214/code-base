package org.example;

public class RuntimPolymorphism {
    public static void main(String[] args) {
        bmw b=new bmw();
        audii a=new audii();
        simulatuion s=new simulatuion();
        s.function(b);
        s.function(a);
    }
}
class Car{
   void work(){
       System.out.println("Car class");
   }
}
class bmw extends Car{
    void work(){
        System.out.println("bmw");
    }
}
class audii extends Car
{
    void work(){
        System.out.println("audii");
    }
}

class simulatuion{
    void function(Car c){
        c.work();
    }
}
