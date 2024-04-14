package Lesson_27;

import javax.sound.midi.Soundbank;

public class TestException {
    public static void main(String[] args) {
        int[] array = {4, 8, 6};
        System.out.println("We have an array");

        try {
            System.out.println(array[5]);
            System.out.println("Good day !");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception was caught:  " + e);
        }
        finally {
            System.out.println("Final block always runs");
        }
        System.out.println("Some code without exception");
    }
}
