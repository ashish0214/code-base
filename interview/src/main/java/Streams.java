import java.util.Arrays;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {
        String sentance= "The quick brown fox jumps right over the little lazy dog";
        Optional<String> ans=Arrays.stream(sentance.split(" "))
                .sorted((word1,word2)->word2.length()-word1.length())
                .findFirst();
        System.out.println(ans.get());
    }

}
