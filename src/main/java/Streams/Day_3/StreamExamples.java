package Streams.Day_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {

        // Terminal operation
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().forEach(name -> System.out.println(name));

        // Intermediate operation
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(num -> num %2 == 0)
                .forEach(System.out::println);

        List<String> namesString = Arrays.asList("java", "stream");
        namesString.stream()
                .map(str -> str.toUpperCase())
                .forEach(System.out::println);

        // Terminal operation to gathers results
        List<String> result = namesString.stream()
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum); // 10


    }
}
