package Lesson_8;

public class Homework_8 {
    static double multiplication(double a, double b, double c) {
        return a * b * c;
    }
    static void division(double d, double e) {
        System.out.println("Celoye chastnoe: " + d/e + " Ostatok: " + d%e);
    }
}
class Homework8Test {
    public static void main(String[] args) {
        System.out.println(Homework_8.multiplication(2,3,10));
        System.out.println(Homework_8.multiplication(2.5, 3.5, 4));
        Homework_8.division(9, 2);
        Homework_8.division(15, 4);

    }
}
