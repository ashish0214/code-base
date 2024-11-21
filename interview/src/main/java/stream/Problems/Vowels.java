package stream.Problems;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Vowels {
    public static void main(String[] args) {

        List<String> words = List.of("Apple", "Banana", "Cucumber", "Grapes");

        Map<String, Long> wordWithVowels = words.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        key -> getVowelsCount(key)
                )).entrySet().stream()
                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue(),
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        System.out.println(wordWithVowels);
    }

    private static Long getVowelsCount(String word) {
        List<Character> vowels = List.of('a', 'A', 'e', 'o', 'O', 'i', 'I', 'u', 'U');
        return word.chars()
                .mapToObj(c -> (char) c)
                .filter(character -> vowels.contains(character))
                .count();
    }
}
