package Lesson_20;

import java.util.Arrays;

public class ArraysAdditionalMethods {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,5};
        int[] array5 = {1,2,3,5};

        char[] array3 = {'p','r','i','v','e','t'};
        char[] array4 = {'p','r','i','v','i','v','k','a'};

        System.out.println(Arrays.compare(array1, array2)); // returns -1 when 2nd element(array1) is larger than 1st(array2);
        // in dictionary array2 appears earlier than array1
        System.out.println(Arrays.compare(array2, array1)); // returns 1 when 1rst element is smaller than 2nd,
        System.out.println(Arrays.compare(array2, array5)); // returns 0 when elements are equal
        System.out.println(Arrays.compare(array3, array4)); // returns -4 when elements are differ by 4 chars

        System.out.println(Arrays.mismatch(array2, array5)); // returns -1 when elements are equals
        System.out.println(Arrays.mismatch(array2, array1)); // returns index of element that is different (3)
        System.out.println(Arrays.mismatch(array3, array4)); // returns index of element that is different (4)
    }
}
