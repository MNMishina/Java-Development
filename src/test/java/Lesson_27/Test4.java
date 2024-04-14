package Lesson_27;

import java.io.*;

public class Test4 {
    public static void main(String[] args) {
        try {
            File file = new File("test6.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1 cached");
        } catch (NullPointerException e) {
            System.out.println("Exception 2 cached");
        } catch (IOException e) {
            System.out.println("Exception 3 cached");
        } catch (RuntimeException e) {
            System.out.println("Exception 4 cached");
        } catch (Exception e) {
            System.out.println("Exception 5 cached");
        } catch (Throwable e) {
            System.out.println("Exception 6 cached");
        }

    }
}
