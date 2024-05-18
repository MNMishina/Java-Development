package Lesson_28;

import java.time.*;

public class Test5 {
  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.of(2024, Month.SEPTEMBER, 1, 14, 20);
    Period period = Period.ofMonths(3);
    //System.out.println(start.plus(period));
    LocalTime lt = LocalTime.of(10, 30);
    Duration duration = Duration.ofMinutes(5);
    System.out.println(ldt.plus(duration).plus(period));
  }
}
