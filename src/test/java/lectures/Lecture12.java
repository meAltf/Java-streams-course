package lectures;

import beans.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.junit.Test;

public class Lecture12 {
    @Test
    public void understandingCollect() throws Exception {
        List<String> emails = MockData.getPeople()
                .stream()
                .map(Person::getEmail)
                .collect(
                        () -> new ArrayList<String>(), //1-st argument
                        (list, element) -> list.add(element), // 2nd argument
                        (list1, list2) -> list1.addAll(list2)); // 3rd argument
//        .collect(Collectors.toList());

        emails.forEach(System.out::println);
    }
}
