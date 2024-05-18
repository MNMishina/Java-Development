package Lesson_28;
import java.time.*;

public class Test1 {
  public static void main(String[] args) {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());
    LocalDate ld1 = LocalDate.of(2024, 05, 11);
    System.out.println(ld1);
    LocalDate ld2 = LocalDate.of(2024, Month.FEBRUARY, 29);
    System.out.println(ld2);
    LocalTime lt1 = LocalTime.of(15, 35);
    System.out.println(lt1);
    LocalTime lt2 = LocalTime.of(15, 30, 45);
    System.out.println(lt2);
    LocalTime lt3 = LocalTime.of(15, 35, 20, 999999999);
    System.out.println(lt3);
    LocalDateTime ldt1 = LocalDateTime.of(2024, Month.MAY, 15, 20, 45, 10, 5896);
    System.out.println(ldt1);
    LocalDateTime ldt2 = LocalDateTime.of(ld1, lt1);
    System.out.println(ldt2);





  }

}
