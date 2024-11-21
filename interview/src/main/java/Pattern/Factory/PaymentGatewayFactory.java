package Pattern.Factory;

public class PaymentGatewayFactory {

    public static PaymentGateway createtion(String payment){
        return switch (payment){
            case "paypal"->new Paypal();
            case "phonepay"-> new PhonePay();
            default -> throw new IllegalArgumentException();
        };

    }

}
