package Lesson_15;

public class Test1 {
    public static void main(String[] args) {
        boolean b = true;
        int a = 1;
        while (b) {
            System.out.println(a);
            if (a % 3==0 && a % 7==0) {
                b = false;
            }
            a++;
        }
    }
}
