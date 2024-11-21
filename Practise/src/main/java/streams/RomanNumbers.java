package streams;

import java.util.HashMap;

public class RomanNumbers {

    //Using hashmap to store the roman numbers and their values
    //then if the current value is greater than the previous value then subtract the previous value from the current value
    public static void main(String[] args) {
        HashMap<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('Z', 100);
        RomanNumbers romanNumbers1 = new RomanNumbers();

        String roman = "VZIV";

        int value = 0;
        int previous = 0;
        for (int i = 0; i < roman.length(); i++) {
            int current=romanNumbers.get(roman.charAt(i));
            if (current > previous) {
                value += current - (2*previous);
            } else {
                value += current;
            }
            previous=current;
        }

        System.out.println(value);
    }

}
