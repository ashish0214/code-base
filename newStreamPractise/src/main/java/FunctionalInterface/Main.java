package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    static Integer sum(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).sum();
    }


    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,3,2,2,22,33);
        Function<List<Integer>,Integer> sumValue=Main::sum;
        System.out.println(sumValue.apply(list));
    }
}
