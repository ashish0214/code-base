package stream.PDP_Problems;

import java.util.List;
import java.util.stream.IntStream;

public class Practise1 {
    public static void main(String[] args) {

        char [] arr1={'a','b','c','d','e'};
        int [] arr2={1,2,3,4,5};
        List<String> combine=IntStream.range(0,arr1.length)
                .mapToObj(x->arr1[x]+String.valueOf(arr2[x])).toList();

        System.out.println(combine);
    }

}
