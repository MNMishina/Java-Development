package Lesson_27;
import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("test7.txt");
        FileInputStream fis = new FileInputStream(file);
        fis.read();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(100);
    }
}
