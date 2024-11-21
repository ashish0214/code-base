package Pattern.Factory;

public class PhonePay implements PaymentGateway{

    @Override
    public void process(Double value){
        System.out.println("Payment by bhone pay "+value);
    }
}
