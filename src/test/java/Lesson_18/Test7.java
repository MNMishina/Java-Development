package Lesson_18;

import java.util.Arrays;
public class Test7 {
    public static void sortirovka(int[] array) {
        Arrays.sort(array);
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array1 = {0, 52, 13, 7, -24, 106, -80};
        sortirovka(array1);
    }
}
