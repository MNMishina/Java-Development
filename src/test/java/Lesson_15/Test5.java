package Lesson_15;

public class Test5 {
    public static void main(String[] args) {
        OUTER:
        for (int hour = 0; hour < 24; hour++) {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
        }
    }
}
