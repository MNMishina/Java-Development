package Lesson_28;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test4 {
  static void dutyChange(LocalDate start, LocalDate end, Period period) {
    LocalDate date = start;
    while (date.isBefore(end)) {
      System.out.println("The date is " + date + ". It's time to change duty");
      date = date.plus(period);
    }
  }

  public static void main(String[] args) {
    LocalDate start = LocalDate.of(2016, Month.SEPTEMBER, 1);
    LocalDate end = LocalDate.of(2020, Month.MAY, 31);
    //Period period = Period.ofWeeks(2);
    //Period period = Period.ofDays(100);
    Period period = Period.of(1, 3, 15);
    dutyChange(start, end, period);
  }
}
