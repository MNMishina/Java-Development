package Lesson_20;
import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hi");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("good");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append(" demon !");
        }
        for (StringBuilder sb: list) {
            System.out.print(sb + " ");
        }
        System.out.println();
        list.remove(sb2);
        for (StringBuilder sb: list) {
            System.out.print(sb + " ");
        }
    }
}
