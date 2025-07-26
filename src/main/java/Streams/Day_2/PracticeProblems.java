package Streams.Day_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class PracticeProblems {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alataf", "John", "Amit");
        names.stream()
                .filter(name -> name.startsWith("A")) // predicate
                .forEach(System.out::println); // consumer

        // 1. check even using predicate
        Predicate<Integer> checkEven = num -> num % 2 == 0;
        System.out.println(checkEven.test(90));
        System.out.println(checkEven.test(5));

        // 2. Convert a string to uppercase using Function
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.apply("alataf-wlcm"));

        // 3. Print a message using consumer
        Consumer<String> print = message -> System.out.println("Print consumer.." + message);
        print.accept("Learning java functional interfaces");

        // 4. Supply current time using supplier
        Supplier<Long> currentTimeStamp = () -> System.currentTimeMillis();
        System.out.println("Current timeshtamp is: " + currentTimeStamp.get());
    }
}
