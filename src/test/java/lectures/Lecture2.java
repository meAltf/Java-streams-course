package lectures;

import beans.Person;
import java.util.List;
import java.util.stream.IntStream;
import mockdata.MockData;
import org.junit.Test;

public class Lecture2 {

  @Test
  public void range() throws Exception {
    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    }

    System.out.println("stream below- exclusive");

    IntStream.range(0, 10).forEach(index -> System.out.println(index)); // 0 inclusive 10 exclusive
    //2nd way
    IntStream.range(0, 10).forEach(System.out::println);

    System.out.println("stream below- inclusive");

    IntStream.rangeClosed(0, 10).forEach(System.out::println);
  }

  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();

    // use IntStream, if you want you iterate based on index..
    IntStream.range(0, people.size())
            .forEach(index -> {
              Person person = people.get(index);
              System.out.println(person);
            });
  }

  @Test
  public void intStreamIterate() throws Exception {
    IntStream.iterate(1, operand -> operand + 1)
            .filter(number -> number % 5 == 0)// you can use any name instead of using operand..
            .limit(20)
            .forEach(System.out::println);
  }
}
