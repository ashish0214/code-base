package stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class basics {
    public static void main(String[] args) {
        List<Integer>num=new ArrayList<>(Arrays.asList(25,34,23,12,45,65,76,99));
//        List<Integer> result=num.stream().filter(x->x%2==0).collect(Collectors.toList());
////        System.out.println(result);
////
////        List<Integer> r1=num.stream().map(i->i+5).collect(Collectors.toList());
////        System.out.println(r1);
////        num.stream().forEach(System.out::println);
//
////        Stream<Object> streamBuilder=Stream.builder().add(23).add(35).add(34).build();
////        streamBuilder.forEach(System.out::println);
//
//        Stream.iterate(1000,n->n+100).limit(5).forEach(System.out::println);

//        num.stream().map(n->n+5).forEach(System.out::println);

//List<List<String>> num1=Arrays.asList(Arrays.asList("ashish","rahul","bhanu"),Arrays.asList("manu","bhavya","mahesh"));
//num1.stream().map(n->n.stream()).forEach(System.out::println);
//num1.stream().flatMap(n->n.stream()).forEach(System.out::println);

//
//       Stream<Integer> stream= Stream.of(25,3,43,3,4,5,4,5,77,8).distinct().peek(n-> System.out.println(n)).sorted((num1,num2)->num2-num1);
//
//
//        System.out.println("the stream is not performing");
//        stream.forEach(System.out::println);
////       num.parallelStream();
////       num.stream().parallel();
//
//        //toArray Method
//        Integer[] arrayElement=num.stream().toArray(size->new Integer[size]);
//        for (int n:arrayElement){
//            System.out.print(n+" ");
//        }
//        Integer[]num3={};
//        Optional<Integer> optional =num.stream().reduce(( n, m)->n+m);
//        System.out.println(optional);

//
//        //Syncronised Stream
//        long start=System.currentTimeMillis();
//        num.stream().filter(x->x>30).forEach(System.out::println);
//        System.out.println("time to complete task synchronise: "+(System.currentTimeMillis()-start));
//
//
//        //ParallelStream
//        long startparallel=System.currentTimeMillis();
//        num.parallelStream().filter(x->x>30).forEach(System.out::println);
//        System.out.println("time to complete task parallel processing: "+(System.currentTimeMillis()-startparallel));
//
////max
//       Optional<Integer> maxValue= num.stream().max((a,b)->b-a);
//        System.out.println("MAx value: "+maxValue.get());
//
//
//        Optional<Integer>value=num.stream().max((a,b)->a-b);
//        System.out.println("max value:"+value.get());


//       num.stream().collect(Collectors.toList());

//        List<Double> listelement= Arrays.asList(2.3,7.9,99.0,77.7);
//        Double d=listelement.stream().collect(Collectors.averagingDouble(x->x));
//        System.out.println(d);

//        String result = Stream.of("apple", "banana", "orange")
//                .collect(Collectors.joining(", "));
//        System.out.println(result);


//        Map<Integer, String> map = Stream.of("apple", "banana", "oranges")
//                .collect(Collectors.toMap(String::length, x->x));
//        for(Map.Entry<Integer,String> mapelement:map.entrySet()){
//            System.out.println(mapelement.getKey()+"  "+mapelement.getValue());
//        }

//        Map<Integer, List<String>> groupedByLength = Stream.of("apple", "banana", "orange")
//                .collect(Collectors.groupingBy(String::length));

//        Map<Boolean, List<Integer>> partitioned = Stream.of(1, 2, 3, 4, 5)
//                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
//        for(Map.Entry<Boolean,List<Integer>> mapelement1:partitioned.entrySet()){
//            System.out.println(mapelement1.getKey()+"  "+mapelement1.getValue());
//        }

//

        Set<Integer>n=num.stream().collect(Collectors.toMap());
        System.out.println(n);


int a=25;
        Optional<Integer> opt=Optional.ofNullable(a);
        opt.ifPresentOrElse(value-> System.out.println(value),()-> System.out.println("value"));







    }
}
