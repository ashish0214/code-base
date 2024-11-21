package stream.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Day2 {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(1,2,2,24,45,76);
        Optional ans=number.stream().reduce((a, b)->a+b);
        System.out.println(ans.get());


    }
}
