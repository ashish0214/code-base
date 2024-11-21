package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class functinalInterfaceDetails {

    /*
    1) predicate
                The Predicate interface represents a single argument boolean-valued function.
                 It’s commonly used for filtering or testing conditions.

                 abstract  -  test(value)

                 chaining of predicate
                 default   -   and(predicate) ,or(predicate), negate(predicate)
                 and -> it means boot the condition satisfies then it is true
                 or  -> if one of the condition satisfies then it is true
                 negate -> it will convert true to false and vice versa

     */

    /*
    2)Function

                The Function interface represents a function that takes an argument
                of type T and produces a result of type R.

                chaining of function
               -default - andThen(Function)
               after function one is operation is performed and then that result is passed to
               as input to andThen() method

     */

    /*
    3) BinaryOperator
                it extend biFunctional interface
                - it takes 2 operand of same type and return result is also of the same type.

                default - maxBy(comparator) ,minBy(comparator)

    4)BiFunctional
                it takes 2 operand and return one result operand
                default - andThen(BiFunction)

     */

    public static void main(String[] args) {

        //predicate
        Predicate<Integer> greaterThan10 = i -> i > 10;
        Predicate<Integer> lessThan20 = i -> i < 40;
        //1)
        boolean combinedResult = greaterThan10.and(lessThan20).test(9);
        System.out.println(combinedResult);
        //2)
        boolean combinedResult2 = greaterThan10.or(lessThan20).test(9);
        System.out.println(combinedResult2);

        List<Integer> listofnumbner = Arrays.asList(10, 20, 30, 40, 50);
        listofnumbner.stream().filter(greaterThan10.or(lessThan20)).forEach(System.out::println);

        //function

        Function<String, Integer> str = x -> x.length();
        Function<Integer, Integer> finalValue = x -> x * 2;
        //normal
        int value=str.apply("I am the don");
        System.out.println("size of string"+value);
        //chaining
        int lengthisDouble = str.andThen(finalValue).apply("I am the strongesat name in the world");
        System.out.println("the size is doubled of the string" + lengthisDouble);



    }
}
