package corejava.polymorphism;

public class Main {
    public static void main(String[] args) {

        Parent.process();

        //this indicates that static methods can be inherited
        Child.process();

        //if u have the same signature as parent class method it will hide the implementation
    }
}
