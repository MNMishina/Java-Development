package Lesson_27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
  void abc() throws FileNotFoundException {
    try {
      File file = new File("test8.txt");
      FileInputStream fis = new FileInputStream(file);
      } catch (FileNotFoundException e) {
      System.out.println("Exception is catched");
      throw e;
    } finally {
      System.out.println("Finally block");
    }
  }
  void method() {
    try {
      abc();
    } catch (FileNotFoundException e) {
      System.out.println("Exception is catched and handled");
    }
  }
}
