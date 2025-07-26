package Streams.Day_4;

import java.util.Optional;

public class DemoOptional {

    public static void main(String[] args) {

        // Optional from string
        Optional<String> name = Optional.of("Robert");
        System.out.println(name.get());

        // Avoiding nulls
        Optional<String> name2 = Optional.ofNullable(null);
        System.out.println(name2.orElse("Default"));

        // Using ifPresent()
        Optional<String> name3 = Optional.of("java");
        name3.ifPresent(n -> System.out.println(n.toUpperCase()));
    }
}
