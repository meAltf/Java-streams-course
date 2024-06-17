package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import com.google.common.collect.ImmutableList;
import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture7 {

  @Test
  public void count() throws Exception {
    long countFemale = MockData.getPeople()
            .stream()
            .filter(person -> person.getGender().equalsIgnoreCase("female"))
            .count();
    System.out.println(countFemale);

  }

  @Test
  public void min() throws Exception {
    double minPriceYellow = MockData.getCars()
            .stream()
            .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
            .mapToDouble(Car::getPrice)
            .min()
            .orElse(0);
    //.getAsDouble();
    System.out.println(minPriceYellow);

  }

  @Test
  public void max() throws Exception {
    double maxPriceYellow = MockData.getCars()
            .stream()
            .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
            .mapToDouble(Car::getPrice)
            .max()
            .getAsDouble();
    System.out.println(maxPriceYellow);
  }


  @Test
  public void average() throws Exception {
    List<Car> cars = MockData.getCars();
    double averagePrice = cars.stream()
            .mapToDouble(Car::getPrice)
            .average()
            .orElse(0);
    System.out.println(averagePrice);

  }

  @Test
  public void sum() throws Exception {
    List<Car> cars = MockData.getCars();
    double sumCars = cars.stream()
        .mapToDouble(Car::getPrice)
        .sum();
    BigDecimal bigDecimalSum = BigDecimal.valueOf(sumCars);
    System.out.println(sumCars);
    System.out.println(bigDecimalSum);

  }

  /**
   * use .summaryStatistics() to get all the value related to this
   * @throws Exception
   */
  @Test
  public void statistics() throws Exception {
    List<Car> cars = MockData.getCars();
    DoubleSummaryStatistics statistics = cars.stream()
        .mapToDouble(Car::getPrice)
        .summaryStatistics();
    System.out.println(statistics);
    System.out.println(statistics.getAverage());
    System.out.println(statistics.getCount());
    System.out.println(statistics.getMax());
    System.out.println(statistics.getMin());
    System.out.println(statistics.getSum());
  }

}