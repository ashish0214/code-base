package Java8Features.FunctionalInterface.Supplier;

import java.util.function.Supplier;

public class GenerateOTP {
    public static void main(String[] args) {
        Supplier<Integer> randumOTP=()->{
            return (int) (Math.random()*1000000);
        };
        System.out.println(randumOTP.get());
    }
}
