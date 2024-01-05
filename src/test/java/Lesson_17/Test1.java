package Lesson_17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb3 = sb1;
        StringBuilder sb2 = new StringBuilder("123");

        System.out.println(sb1.equals(sb3));
    }
}
