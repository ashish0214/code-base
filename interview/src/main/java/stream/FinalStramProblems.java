package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FinalStramProblems {
    public static void main(String[] args) {
        List<Integer> ele= Arrays.asList(1,2,33,4,3,33,55,22,44);

        //sum of all the number
        int total=ele.stream().mapToInt(Integer::intValue).sum();

        //find the largest number
        int largest=ele.stream().max(Comparator.naturalOrder()).get();

        //given list of string. count the number of string that starts with special character

        List<String> fruits=Arrays.asList("apple","mango","monkey","apple","mango","apple","mango","mango","monkey","monkey");
        long count=fruits.stream().filter(x->x.startsWith("m")).count();
        System.out.println(count);

        //convert this to upper case string

        fruits.stream().map(String::toUpperCase).forEach(System.out::println);


        //count the even number in the list
        long evenCount=ele.stream().filter(x->x%2==0).count();
        System.out.println(evenCount);

        //concatenate string

        System.out.println(fruits.stream().collect(Collectors.joining()));

        //distinct elemnt in a list

        ele.stream().distinct().forEach(System.out::println);

        //given a string find the frequency of the words

        String sentance="I am the tallest man in the world and world is small";
        Map<String,Long> wordFrequency=Arrays.stream(sentance.split(" ")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for (Map.Entry ele1:wordFrequency.entrySet()){
            System.out.println(ele1);
        }

        //find the numbers that are starting with one

        int[] arr={1,22,33,11,13,13,22,45};
        int [] neArr=Arrays.stream(arr).filter(x->String.valueOf(x).startsWith("1")).toArray();
        for(int i=0;i<neArr.length;i++){
            System.out.println(neArr[i]);
        }

        //given a list of integer .find the duplicate element

        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);


        //given a string find the words are palindrome or not
        List<String> listofPal=Arrays.asList("mom","lll","son","daughter","lobobol");

        List<String> palindromeWords=listofPal.stream().filter(x->x.equals(new StringBuilder(x).reverse().toString())).collect(Collectors.toList());
        System.out.println(palindromeWords);


        //sort the 2 given list

        List<Integer> arr1=Arrays.asList(1,2,23,34,55,34,3);
        List<Integer> arr2=Arrays.asList(1,2,23,34,55,33,3);

        Stream.concat(arr1.stream(),arr2.stream()).distinct().sorted().forEach(System.out::println);
//sort the words based on the length of the word
List<Map.Entry<String,Long>> wordCountOrdered=fruits.stream()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();
        System.out.println(wordCountOrdered);



        Map<Integer,Long> liatOf=arr1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
