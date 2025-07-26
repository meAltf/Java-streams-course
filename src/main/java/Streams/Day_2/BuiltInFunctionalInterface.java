package Streams.Day_2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterface {

    public static void main(String[] args) {

        // 1. predicate | Test a condition
        Predicate<String> isLong = str -> str.length() > 5;
        System.out.println(isLong.test("Hello"));
        System.out.println(isLong.test("Robert"));

        // 2. Function | Transform data
        Function<String, Integer> lengthFunc = str -> str.length();
        System.out.println(lengthFunc.apply("robert"));

        // 3. Consumer | Perform action
        Consumer<String> printUpper = str -> System.out.println(str.toUpperCase());
        printUpper.accept("systemme");

        // 4. Supplier | No input, returns value
        Supplier<Double> randomeNum = () -> Math.random();
        System.out.println(randomeNum.get());
    }
}
