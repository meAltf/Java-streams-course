package Streams.Day_4;

// Use only when performance benefit outweighs concurrency risks.

import java.util.Arrays;
import java.util.List;

public class DemoParallelStream {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.parallelStream()
                .forEach(num -> System.out.println(num + " " + Thread.currentThread().getName()));
    }
}
