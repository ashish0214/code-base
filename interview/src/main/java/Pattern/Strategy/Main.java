package Pattern.Strategy;

public class Main {
    public static void main(String[] args) {
        String input = "Hello World!";
        lowerCasePrinting lowerCase = new lowerCasePrinting();
        upperCasePrinting  upperCase =new upperCasePrinting();

        Executor executor = new Executor(lowerCase);
        System.out.println(executor.execute(input));

        executor.strategy= upperCase;
        System.out.println(executor.execute(input));
    }
}
//here we have created interfaace that has print method and we have 2 different behaviour
// based on the input provided we can change the behaviour of the print method
// through the executor class we can change the behaviour of the print method