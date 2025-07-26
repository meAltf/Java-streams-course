package Streams.Day_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStream {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        Stream<String> stringStream = list.stream();
        System.out.println(stringStream);                    // stream.ReferencePipeline$Head@5674cd4d

        int[] arr = {1, 2, 3};
        IntStream intStream = Arrays.stream(arr);
        System.out.println(intStream);                       // stream.IntPipeline$Head@5b2133b1
    }
}
