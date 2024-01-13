package Lesson_20;

import java.util.ArrayList;
import java.util.Iterator;

public class Test6 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list = new ArrayList<>();
        list.add(s3);
        list.add(s1);
        list.add(s4);
        list.add(s2);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//
//        ArrayList<String> list2 = list;
//        System.out.println(list.equals(list2));

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
