package Exception;
//getMessage is a method that is present in Throwable

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    //normal exception
    void add(int a, int b) throws InvalidException {
        if (a + b > 10) {
            throw new InvalidException();
        }
    }

    public static void main(String[] args) {
        Main mainObject = new Main();
        try {
            mainObject.add(2, 9);
        } catch (InvalidException e) {
            System.out.println(e.getMessage());//getMessage is method of Throwable
        }




    }
}
