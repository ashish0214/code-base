package stream.grouping;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class WordOccurences {
    public static void main(String[] args) {
        String statement="the largest animal in the world is dragon";
        Map<String,Long> occurences=Arrays.stream(statement.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for (Map.Entry element: occurences.entrySet()){
            System.out.println(element);
        }
        Map<String,Long> occurences1=Arrays.stream(statement.split("")).filter(x->x!=" ").collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(occurences1);

        Map<String,Long> occurences2=statement.chars().filter(x->x!=' ').mapToObj(x->String.valueOf((char) x)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(occurences2);


       Map<String,Long > frequencyCal= Arrays.stream(statement.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for (Map.Entry ele: frequencyCal.entrySet()){
            System.out.println(ele);
        }
    }
}
