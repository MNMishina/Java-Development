package Lesson_21;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");

        List<String> list = List.of("eins", "zwei", "drei");    // Нельзя модифицировать, не могут содержать null
        System.out.println("list = " + list);
       // list.add("qwer");
        List<String> list2 = List.copyOf(al1);          // Нельзя модифицировать
        System.out.println("list2 = " + list2);



    }
}
