package corejava.interfaceExmaple;

public class Main {
    public static void main(String[] args) {
        Payment p1=new PhonePay();
        p1.process(500);
        p1.superPayment();
        Payment.commanProcess();

    }
}
//In interface default methods can be overriden
//static methods can not be overriden because binding of method happens during the class loading itself
//because of static binding
//and static method creates only one copy
