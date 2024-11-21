package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

interface Main {
    int hello(int a, int b);

}

public class example {
    void add(){
        Main m = new Main() {
            @Override
            public int hello(int a, int b) {
                return a + b;
            }
        };

    }

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(23,34,2,23,4,3);
        Stream.of(list).reduce((a)->a>10;);
    }
}
