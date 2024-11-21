package org.example;

public class exc {
    static void display()throws Exception{
        throw new Exception();
    }
    static void dis()throws Exception{
        display();
    }

    public static void main(String[] args) {
//        dis();
    }
}
