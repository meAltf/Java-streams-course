package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture5 {

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();
    //create a predicate
    final Predicate<Car> carPredicate = car -> car.getPrice() < 10000;
    List<Car> carList = cars.stream()
            //.filter(car -> car.getPrice() < 10000)
            .filter(carPredicate)
            .collect(Collectors.toList());

    carList.forEach(System.out::println);
    System.out.println(carList.size());
  }

  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();
    List<PersonDTO> personDtos = people.stream()
            /** clean-up-1
             * map(person -> {
             *   PersonDTO personDto = new PersonDTO(person.getId(), person.getFirstName(), person.getAge());
             *   return personDto;
             */

            //clean-up-2
            //.map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getAge()))

            .map(PersonDTO::map)
            .collect(Collectors.toList());

    personDtos.forEach(System.out::println);
    assertThat(personDtos).hasSize(1000);
    System.out.println(personDtos.size());
  }

  @Test
  public void averageCarPrice() throws Exception {
    // calculate average of car prices

  }

  @Test
  public void test() throws Exception {

  }
}



