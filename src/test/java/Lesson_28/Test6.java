package Lesson_28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test6 {
  public static void main(String[] args) {
    LocalDate ld = LocalDate.of(2024, Month.SEPTEMBER, 1);
    LocalDateTime ldt = LocalDateTime.of(2024, Month.SEPTEMBER, 1, 16, 15);
    LocalTime lt = LocalTime.of(17, 30);

    System.out.println(ld.getDayOfWeek());
    System.out.println(ldt.getDayOfYear());
    System.out.println(ldt.getMinute());
    System.out.println(ldt.getMonth());
    System.out.println(ldt.getMonthValue());
    System.out.println(lt.getHour());
    System.out.println();
    System.out.println(lt);

    DateTimeFormatter dt1 = DateTimeFormatter.ISO_LOCAL_TIME;
    DateTimeFormatter dt2 = DateTimeFormatter.ISO_LOCAL_DATE;
    DateTimeFormatter dt3 = DateTimeFormatter.ISO_WEEK_DATE;
    System.out.println(lt.format(dt1));
    System.out.println();
    System.out.println(ldt);
    System.out.println(ldt.format(dt2));
    System.out.println(ld.format(dt3));
    System.out.println();

    DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter shortDateTimeFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    System.out.println(ld);
    System.out.println(ld.format(shortFormat));
    System.out.println(ldt);
    System.out.println(ldt.format(shortDateTimeFormat));
    System.out.println();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy, hh:mm");
    System.out.println(ldt);
    System.out.println(ldt.format(formatter));

  }
}
