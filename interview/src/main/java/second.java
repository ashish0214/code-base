import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class second {

    public static void main(String[] args) {
//            int[] array = {45, 51, 28, 75, 46, 47};
//
//            Optional<Integer> ans=Arrays.stream(array).boxed().sorted((a, b)->b-a).skip(1).findFirst();
//
//            System.out.println("Second highest number is: " + ans.get());


//            String sentence = "I am interested23455 to grow in ny organization";

//            String secondLongestWord = Arrays.stream(sentence.split(" "))
//                    .map(word -> word.replaceAll("[^a-zA-Z]", "")) // Remove non-alphabetic characters
//                    .filter(word -> !word.isEmpty()) // Filter out empty words
//                    .sorted(Comparator.comparingInt(String::length).reversed()) // Sort by word length in descending order
//                    .skip(1) // Skip the first word (the longest)
//                    .findFirst() // Find the first word of the remaining list
//                    .orElseThrow(() -> new RuntimeException("Sentence must have at least two words"));
//            System.out.println("Second longest word is: " + secondLongestWord);


        List<String> stringList = Arrays.asList("as", "123", "32", "2as");

        List<Integer> integerList = stringList.stream()
                .filter(str -> str.matches("\\d+"))
                .peek(s -> System.out.println(s))
                .flatMapToInt(str -> IntStream.of(Integer.parseInt(str)))
                .boxed()
                .collect(Collectors.toList());

        // Output the result
        integerList.forEach(System.out::println);

}
}
