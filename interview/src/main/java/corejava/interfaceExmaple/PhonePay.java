package corejava.interfaceExmaple;

public class PhonePay implements Payment {

    @Override
    public void process(int amount) {
        System.out.println("the ammount for process" + amount);
    }

    @Override
    public void superPayment() {
        System.out.println("I am implenetation method");
    }

}
