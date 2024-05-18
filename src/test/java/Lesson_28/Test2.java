package Lesson_28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test2 {
  public static void main(String[] args) {
    LocalDate ld1 = LocalDate.of(2024, 05, 11);
    System.out.println(ld1);
    LocalDate ld2 = ld1.plusDays(21);
    System.out.println(ld2);
    LocalDate ld3 = ld1.minusDays(14);
    System.out.println(ld3);
    LocalDate ld4 = ld1.plusWeeks(2);
    System.out.println(ld4);
    LocalDate ld5 = ld1.minusWeeks(4);
    System.out.println(ld5);
    LocalDate ld6 = ld1.plusMonths(6);
    System.out.println(ld6);
    LocalDate ld7 = ld1.minusMonths(2);
    System.out.println(ld7);
    LocalDate ld8 = ld1.plusYears(8);
    System.out.println(ld8);
    LocalDate ld9 = ld1.minusYears(10);
    System.out.println(ld9);
    System.out.println();

    LocalTime lt1 = LocalTime.of(14, 10, 20, 5050);
    System.out.println(lt1);
    LocalTime lt2 = lt1.plusHours(2);
    System.out.println(lt2);
    LocalTime lt3 = lt1.minusHours(6);
    System.out.println(lt3);
    LocalTime lt4 = lt1.plusMinutes(20);
    System.out.println(lt4);
    LocalTime lt5 = lt1.minusMinutes(30);
    System.out.println(lt5);
    LocalTime lt6 = lt1.plusSeconds(40);
    System.out.println(lt6);
    LocalTime lt7 = lt1.minusSeconds(25);
    System.out.println(lt7);
    LocalTime lt8 = lt1.plusNanos(20000);
    System.out.println(lt8);
    LocalTime lt9 = lt1.minusNanos(50000);
    System.out.println(lt9);
    System.out.println();

    LocalTime lt10 = lt1.plusHours(1).minusMinutes(15).plusSeconds(30).minusNanos(5);
    System.out.println(lt10);
    System.out.println();

    LocalDateTime ldt1 = LocalDateTime.of(2025, Month.APRIL, 27, 13, 40);
    System.out.println(ldt1);
    LocalDateTime ldt2 = ldt1.plusYears(2).minusMonths(3).plusDays(4).minusMinutes(1500000).minusSeconds(30);
    System.out.println(ldt2);




  }
}
