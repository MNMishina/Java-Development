package Lesson_27;

import java.io.*;

public class Test7 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test7.txt");
            try {
                fis2 = new FileInputStream("test10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File test10 not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File test7 not found");
        } finally {
            System.out.println("Outer final code block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Exception found in final code block");
            }
        }
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.abc();
    }
}
