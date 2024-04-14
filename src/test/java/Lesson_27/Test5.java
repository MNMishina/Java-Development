package Lesson_27;
import java.io.*;
public class Test5 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File file = new File("test7.txt");
            System.out.println("Object File is created");
            FileInputStream fis = new FileInputStream(file);
            System.out.println("Stream is created");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Information is reading");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1 cached");
        } catch (IOException e) {
            System.out.println("Exception 2 cached");
        } finally {
            System.out.println("Final code block");
        }
    }
}
