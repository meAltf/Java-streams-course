package Streams.Day_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Sum of 2 numbers using lambda
interface Sum {
    int add(int a, int b);
}


public class DemoLambda2 {

    public static void main(String[] args) {
        Sum sum = (a, b) -> a + b;
        int result = sum.add(4, 9);
        System.out.println(result);
        System.out.println();

        // sort a list using lambda
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        System.out.println(names);

        // without lambda
        Collections.sort(names, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println(names);

        // Using lambda
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);

    }

}
