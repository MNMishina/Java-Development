package Lesson_14;

public class Test6 {
    public void time() {
        OUTER:
        for (int hour = 0; hour <= 23; hour++) {
            System.out.println("+++ Outer Loop Starts +++");
            INNER:
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + ":" + minute);
                if (minute == 30) {
                    break OUTER;
                }
            }
            System.out.println("+++ Outer Loop Ends +++");
        }
    }

    public static void main(String[] args) {
        Test6 t6 = new Test6();
        t6.time();
    }
}
