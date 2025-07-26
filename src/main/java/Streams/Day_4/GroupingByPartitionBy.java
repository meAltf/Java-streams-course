package Streams.Day_4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    String city;

    Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getCity() { return city; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return name + " from " + city;
    }
}

public class GroupingByPartitionBy {

    public static void main(String[] args) {

        // groupingBy
        List<Person> people = Arrays.asList(
                new Person("robert", "Delhi"),
                new Person("John", "Delhi"),
                new Person("Sara", "Mumbai")
        );

        Map<String, List<Person>> groupedByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));
        System.out.println(groupedByCity);

        // partitioningBy
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(result);

    }
}
