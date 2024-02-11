package Lesson_21;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1 = " + al1);

        List<String> sublist= al1.subList(1, 4);
        System.out.println("sublist = " + sublist);
        sublist.add("ten");
        System.out.println("al1 = " + al1);
        System.out.println("sublist = " + sublist);

        Object [] array = al1.toArray();
        String [] array2 = al1.toArray(new String[5]);
        for (String s: array2) {
            System.out.println(s);
        }
    }
}
