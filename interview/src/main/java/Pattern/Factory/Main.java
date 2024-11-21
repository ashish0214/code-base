package Pattern.Factory;

public class Main {
    public static void main(String[] args) {
        PaymentGateway pay =PaymentGatewayFactory.createtion("phonepay");
        pay.process(500.9);

        PaymentGateway pay1= PaymentGatewayFactory.createtion("paypal");
        pay1.process(334.9);

        //based on the input provided it will provide the object for that
    }
}
