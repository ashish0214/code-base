package collection.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee []arr={new Employee(1, "ashish", 34),
                new Employee(2, "rohith", 30),
                new Employee(3, "bhanu", 78)};

        Arrays.sort(arr);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
