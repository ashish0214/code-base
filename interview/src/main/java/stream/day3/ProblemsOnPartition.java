package stream.day3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ProblemsOnPartition {
    public static void main(String[] args) {
        int [] arr={1,0,1,0,1,0,1,0,1};
        Map<Boolean, List<Integer>> ele=Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x->x==1));
        for(Map.Entry ele1:ele.entrySet()){
            System.out.println(ele1);
        }


        //find the maximum number in a list
        List<Integer> numbers=Arrays.asList(1,3,4,34,23,34,334,33);
        Optional<Integer> largest=numbers.stream().max((x, y)->x-y);
        System.out.println(largest.get());


        String ele10="the largest  land animal in the world is elephant";
        Arrays.stream(ele10.split(" ")).sorted((x,y)->x.compareTo(y)).forEach(System.out::println);
//        Map<String,Long> sortedByLength=Arrays.stream(ele.split(" ")).sorted((x,y)->x.length()-y.length()).collect(Collectors.toMap(Function.identity(),x->x.length(),(x,y)->y,LinkedHashMap::new));

//        System.out.println("soutrdby length"+sortedByLength);
        //interview question
        String num="10101011100110001";
        Map<Boolean,List<String>> ell=Arrays.stream(num.split("")).collect(Collectors.partitioningBy(x->x.equals("0")));

        String result=ell.get(true).stream().collect(Collectors.joining(","))+ ell.get(false).stream().collect(Collectors.joining(","));
    for(Map.Entry ele1:ell.entrySet()){
        System.out.println(ele1);
    }
        System.out.println(result);

    //sort map based on value
        Map<String,Integer> smallMap=new HashMap<>();
        smallMap.put("snake",9);
        smallMap.put("gna",5);
        smallMap.put("gdhsd",4);
        smallMap.put("ywghed",0);
        smallMap.put("sdndj",2);

        Map<String,Integer> result1=smallMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(x->x.getKey(),x->x.getValue(),(x,y)->y,LinkedHashMap::new));
for (Map.Entry ele2:result1.entrySet()){
    System.out.println(ele2);
}
    }
}
