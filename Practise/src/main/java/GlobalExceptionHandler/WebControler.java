package GlobalExceptionHandler;

public class WebControler {

    public static void main(String[] args) {
        int a=sumOfPrimes(10);
        System.out.println(a);
    }
    public static <T, U> T sumOfPrimes(U input) {
        if (!(input instanceof Integer)) {
            throw new IllegalArgumentException("Input must be an Integer.");
        }

        int n = (Integer) input;
        int sum = 0;

        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                sum += num;
            }
        }

        return (T) Integer.valueOf(sum);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
