package stream.Problems;

import java.util.*;
import java.util.stream.Stream;

public class Task1{
    public static void main(String[] args) {
        //to generate number sequentialy we have iterate that generates avalue

        Stream.iterate(1, x->x+1).limit(20).forEach(x->System.out.println(x));
        String str= "dammk";
        String str1 = "damma";
        System.out.println(canBePalindrome(str));


//        1) shift the 1 to leftside for the given array

        int [] num={1,2,3,2,1,4,1,1,3,1};
        int slow=0;

        for(int fast=0;fast<num.length;fast++){
            if(num[fast]==1){
                int temp=num[slow];
                num[slow]=num[fast];
                num[fast]=temp;
                slow++;
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

//        2)counting the word "spring" in the string of sentances
        String []arr={"java ruby spring","spring java ","spring python"};
        long a=Arrays.stream(arr).flatMap(ele->Arrays.stream(ele.split(" "))).filter(ele->ele.equals("spring")).count();
        System.out.println("size ="+a);

        long value=Arrays.stream(arr).filter(ele->ele.contains("string")).count();

//        3  for the primitive datatype i have to find the 3rd largest value
        //when ever there we are dealing with primitive data the we have to use boxed() for
        int []numbers={1,23,45,89,56,90,7};
        System.out.println(Arrays.stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder()).skip(2).findFirst().get());


//        4) given a list of elements the count them and sort based on the value

//        int [] listofNumber={1,2,3,4,3,4,1,2,3,55,4,44,6,3,2};
//        Arrays.stream(listofNumber).boxed()
//                .collect(Collectors.toMap(Function.identity(),Collectors.counting())




    }
    public static boolean canBePalindrome(String str)
    {
        Map<Character,Integer> charaterCount= new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            charaterCount.put(str.charAt(i),
                    charaterCount.getOrDefault(str.charAt(i),0)+1);
        }
        int count=0;

        for(Integer v :charaterCount.values())
        {
            if(v%2!=0)
                count++;
        }
        return count<=1;
    }
}
