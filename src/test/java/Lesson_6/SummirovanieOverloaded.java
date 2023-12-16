/*
    5 overloaded методов сложения чисел.
 */
package Lesson_6;

public class SummirovanieOverloaded {
    int summa() {
        int result = 0;
        System.out.println("Summa vseh chisel: " + result);
        return result;
    }

    int summa(int a) {
        int result1 = a;
        System.out.println("Summa vseh chisel: " + result1);
        return result1;
    }

    int summa(int b, int c) {
        int result2 = b + c;
        System.out.println("Summa vseh chisel: " + result2);
        return result2;
    }

    int summa(int d, int e, int f) {
        int result3 = d + e + f;
        System.out.println("Summa vseh chisel: " + result3);
        return result3;
    }

    int summa(int g, int h, int i, int j) {
        int result4 = g + h + i + j;
        System.out.println("Summa vseh chisel: " + result4);
        return result4;
    }
}

class SummirovanieOverloadedTest {

    public static void main(String[] args) {
        SummirovanieOverloaded sumOver = new SummirovanieOverloaded();
        sumOver.summa();
        sumOver.summa(3);
        sumOver.summa(3, 5);
        sumOver.summa(3, 5, 7);
        sumOver.summa(3, 5, 7, 11);
    }
}
