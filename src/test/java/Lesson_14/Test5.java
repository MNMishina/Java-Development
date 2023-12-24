package Lesson_14;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i<= 25; i++) {
            if (i == 5) {
                continue;
            }
            if (i % 20 ==0) {
                break;
            }
            System.out.println(i);
        }
    }
}
