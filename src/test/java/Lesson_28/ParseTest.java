package Lesson_28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParseTest {
  public static void main(String[] args) {
    LocalDate ld = LocalDate.of(2014, Month.MARCH, 10);
    LocalDateTime ldt = LocalDateTime.of(2014, Month.MARCH, 10, 12, 30, 9);
    LocalTime lt = LocalTime.of(16, 40);

    DateTimeFormatter dt = DateTimeFormatter.ofPattern("MM dd yyyy");
    LocalDate date1 = LocalDate.parse("01 02 2015", dt);
    System.out.println(date1);
    LocalDate date2 = LocalDate.parse("2015-01-02");
    System.out.println(date2);
  }
}
