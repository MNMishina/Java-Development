package Lesson_27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException2 {
    void abc() throws FileNotFoundException {
        File file = new File("test8.txt");
        FileInputStream fis = new FileInputStream(file);
        //fis.read();
        System.out.println("Good day !");
    }

    void def() throws FileNotFoundException {
        System.out.println("Hello");
        abc();
    }

    public static void main(String[] args) throws IOException {
        TestException2 te2 = new TestException2();
        try {
            te2.def();
        } catch (FileNotFoundException e) {
            System.out.println("An exception was caught:  " + e);
            e.printStackTrace();
        }
    }
}
