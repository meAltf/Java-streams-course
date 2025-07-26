package Streams.Day_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeProblems {

    public static void main(String[] args) {

        // 1.  Given a list of integers, print only even numbers
        List<Integer> integerList = Arrays.asList(1, 2, 4, 5, 6, 7, 899, 100);
        integerList.stream()
                .filter(a -> a % 2 == 0)
                .forEach(System.out::println);

        // 2. Convert a list of strings to uppercase
        List<String> stringList = Arrays.asList("Alataf", "John", "Amit");
        stringList.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        // 3. Find the sum of all numbers greater than 10
        List<Integer> integerList2 = Arrays.asList(1, 2, 40, 50, 6, 7, 90, 100);
        int sum = integerList2.stream()
                .filter(a -> a > 10)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        // 4. Get names longer than 3 characters
        List<String> namesList = Arrays.asList("robert", "joh", "kirrr", "vosdki", "tr", "broon");
        namesList.stream()
                .filter(str -> str.length() > 3)
                .forEach(System.out::println);

        // 5. Given a list of names, return how many start with 'S'
        List<String> namesList2 = Arrays.asList("robert", "Sjoh", "kirrr", "vosdki", "str", "Sbroon");
        namesList2.stream()
                .filter(str -> str.startsWith("S") || str.startsWith("s"))
                .forEach(System.out::println);

        // 6. Write a stream pipeline to find the square of even numbers from a list.
        List<Integer> integerList3 = Arrays.asList(1, 2, 4, 5, 6, 7, 9, 100);
        integerList3.stream()
                .filter(a -> a % 2 == 0)
                .map(a -> a * a)
                .forEach(System.out::println);

        // 7. Given a list of names, return a list sorted in reverse order.
        List<String> namesList3 = Arrays.asList("Alataf", "John", "Zack", "Bob");
        List<String> sorted = namesList3.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sorted);

        // 8. Filter out null or empty strings from a list
        List<String> namesList4 = Arrays.asList("Alataf", "", null, "Zack", "", "Bob");
        List<String> filtered = namesList4.stream()
                .filter(str -> str != null && !str.trim().isEmpty())
                .collect(Collectors.toList());
        System.out.println(filtered);

        //9.  Count numbers divisible by both 3 and 5
        List<Integer> nums = Arrays.asList(15, 30, 10, 9, 20, 45);
        long count = nums.stream()
                .filter(num -> (num % 3 == 0) && (num % 5 == 0))
                .count();
        System.out.println(count);


    }
}
