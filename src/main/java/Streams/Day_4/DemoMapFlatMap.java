package Streams.Day_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DemoMapFlatMap {

    public static void main(String[] args) {

        // Map
        List<String> words = Arrays.asList("java", "stream");
        List<String> upper = words.stream()
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upper);

        // flatMap
        List<List<String>> data = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D")
        );
        List<String> flatMapped = data.stream()
                .flatMap(Collections -> Collections.stream()) // Collections::stream
                .collect(Collectors.toList());
        System.out.println(flatMapped);
    }
}
