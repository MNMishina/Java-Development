package Lesson_21_2;

public class Test1 {
    public static void main(String[] args) {
//        int a = 3;
//        System.out.println(a < 4?7:"hello");
//        int b = (a<4)? 7:"hello";
        int a = 5;
        int b = 5;
        int c = (a > 6)?a++:b++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
