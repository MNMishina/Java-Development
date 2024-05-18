package Lesson_28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test3 {
  public static void main(String[] args) {
    LocalDate ld1 = LocalDate.of(2024, 8, 12);
    LocalDate ld2 = LocalDate.of(2024, Month.DECEMBER, 18);
    System.out.println(ld1.isAfter(ld2));

    LocalTime lt1 = LocalTime.of(15, 40);
    LocalTime lt2 = LocalTime.of(03, 5, 20, 11547);
    System.out.println(lt2.isBefore(lt1));

    LocalDateTime ldt1 = LocalDateTime.of(2024, 05, 12, 10, 40);
    LocalDateTime ldt2 = LocalDateTime.of(2024, Month.JULY, 12, 10, 40, 9);
    System.out.println(ldt2.isAfter(ldt1));
  }
}
