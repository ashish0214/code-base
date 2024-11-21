package stream.Problems;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProblems {
    public static void main(String[] args) {

        // 1. find the unique words in the list
        String sentance = "I am the strongest Strongest man man in the I world strongest";
        Arrays.stream(sentance.split(" ")).distinct().forEach(System.out::println);

        //2 .find the unique numbers in the primitive array
        // why without boxed() method they are working fine??
        int[] arr = {1, 3, 23, 3, 3, 44, 44, 1, 33, 6, 77, 88, 77, 0};
        Arrays.stream(arr).filter(x -> x > 30).sorted().distinct().forEach(System.out::println);


        // 3. find the count of vowels in the word and at last find the total vowels count
        Function<String, Integer> vowels = x -> {
            String word = x.toLowerCase();
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                char temp = word.charAt(i);
                char[] vowel = {'a', 'e', 'i', 'o', 'u'};
                for (int j = 0; j < vowel.length; j++) {
                    if (vowel[j] == temp) {
                        count++;
                        break;
                    }
                }
            }
            return count;
        };
        Map<String, Integer> mapOfVowels = Arrays.stream(sentance.split(" "))
                .collect(Collectors.toMap(Function.identity(), vowels, (x, y) -> x, LinkedHashMap::new));
        int totalVowel = 0;
        for (Map.Entry ele : mapOfVowels.entrySet()) {
            System.out.println(ele);
            totalVowel += (int) ele.getValue();
        }
        System.out.println("Total number of vcowels in the sentance : " + totalVowel);

        // 4. given a string find the count of the each character in the string

        String ele = "the most found bear in the world kingfisher ";
        Map<String, Long> occurences = Arrays.stream(ele.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("the occurences of the character");
        for (Map.Entry occurencesList : occurences.entrySet()) {
            System.out.println(occurencesList);
        }

        //5.
    }
}
