package Pattern.Factory;

public class Paypal implements PaymentGateway{
    @Override
    public void process(Double value){
        System.out.println("Payment using paypal "+ value);
    }
}
