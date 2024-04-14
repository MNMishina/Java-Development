package Lesson_27;
import java.io.*;
public class Test6 {
    static int abc() {
        try {
            File file = new File("test8.txt");
            FileInputStream fis = new FileInputStream(file);
            //return 5;
            } catch (FileNotFoundException e) {
            System.out.println("Exception cached " + e);
            return 6;
        } finally {
            System.out.println("Final code block");
            return 7;
        }
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
