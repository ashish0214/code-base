package interview;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice_Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 88, 2, 42, 2, 3, 3, 4, 33, 4, 323, 45, 67);


//        System.out.println(list.stream().anyMatch(x->x>99));


//        List<Integer> evendata = list.stream().filter(x -> x % 2 == 0).map(x ->  x).sorted((x, y) -> {
//            if (x > y) {
//                return -1;
//            } else if (y > x) {
//                return 1;
//
//            } else {
//                return 0;
//            }
//        }).limit(5).collect(Collectors.toList());
//        evendata.forEach(System.out::println);


//
//        List<Integer> list1=list.stream().filter(x->x%2==1).peek(x-> System.out.println("element"+x)).sorted((x,y)->y-x).toList();
//        list1.forEach(System.out::println);
//

//        Stream<String> stream=Stream.of("10","10","19");
//        System.out.println(stream.mapToLong(x->Integer.parseInt(x)).sum());
//
//        List<Integer> generate=Stream.iterate(100,x->x+10).limit(20).collect(Collectors.toList());
//        generate.forEach(System.out::println);


//        int [][]arr={{1,2,3},{1,3,5},{2,6,5}};
//        Arrays.stream(arr).flatMapToInt(x-> Arrays.stream(x)).forEach(System.out::println);

//        long x=list.stream().distinct().skip(3).count();
//        System.out.println(x);


        //generate
//        Stream.generate(()->new Random().nextInt(101)).limit(5).forEach(System.out::println);


//        Optional<Integer> ans=list.stream().max((a, b)->b-a);
//        System.out.println(ans);










    }
}
