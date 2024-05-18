package Lesson_28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HW_Lesson28 {
  DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
  DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

  public void smena(LocalDateTime start, LocalDateTime end, Period prd, Duration dn) {
    LocalDateTime ldt = start;
    while (ldt.isBefore(end)) {
      System.out.println("Work From: " + ldt.format(formatter1));
      ldt = ldt.plus(prd);
      System.out.println(" To: " + ldt.format(formatter1));
      System.out.println("Holidays From: " + ldt.format(formatter2));
      ldt = ldt.plus(dn);
      System.out.println(" To: " + ldt.format(formatter2));
    }
  }

  public static void main(String[] args) {
    LocalDateTime ldt1 = LocalDateTime.of(2016, 01, 01, 9, 0, 0);
    LocalDateTime ldt2 = LocalDateTime.of(2016, 10, 31, 18, 0, 0);
    Period period = Period.of(0, 1, 2);
    Duration duration = Duration.ofMinutes(600);
    HW_Lesson28 les = new HW_Lesson28();
    les.smena(ldt1, ldt2, period, duration);

  }


}
