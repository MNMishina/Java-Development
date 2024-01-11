package Lesson_19;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {5,10,20,40,100};
        int summ = 0;
        for (int a : array) {
            summ += a;
        }
        System.out.println(summ);
    }
}
