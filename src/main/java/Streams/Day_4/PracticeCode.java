package Streams.Day_4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeCode {

    public static void main(String[] args) {

        // 1. Flatten a lists of list of integers using flatMap
        List<List<Integer>> listsList =Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8)
        );
        List<Integer> flattenList = listsList.stream()
                .flatMap(Collection::stream) // Collections::stream
                .collect(Collectors.toList());
        System.out.println(flattenList);
    }
}
