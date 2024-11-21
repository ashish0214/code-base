package java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        String str = "AshishRanaAshish";

        Map<String,Long> ele=Arrays.stream(str.split(""))
                .map(x->x.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(Map.Entry ele1: ele.entrySet()){
            System.out.println(ele1);
        }
    }
}
