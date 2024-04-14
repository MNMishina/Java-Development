package Lesson_27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException1 {
    public static void main(String[] args) {
        File file = new File("test8.txt");
        try { FileInputStream fis = new FileInputStream(file);
        //fis.read();
        System.out.println("Good day !");
        }
        catch (FileNotFoundException e) {
            System.out.println("An exception was caught:  " + e);
        }
        catch (IOException e) {
            System.out.println("An exception was caught:  " + e);
        }
        finally {
            System.out.println("Final block always runs");
        }
        System.out.println("Some code without exception");
    }
}
