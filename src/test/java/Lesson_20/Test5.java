package Lesson_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        //  ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>)list.clone();
        //System.out.println(list.get(1) == list2.get(1));
       // list.get(0).append("!!!");
       // list.set(0, new StringBuilder("F"));
        //    System.out.println(list2.get(0));
//        Object[] array = list.toArray();
//        for (Object o : list) {
//            System.out.println(o);
//        }
        StringBuilder[] array2 = list.toArray(new StringBuilder[10]);
        for (StringBuilder sb : array2) {
            System.out.println(sb);
        }
        StringBuilder[] array1 = {sb1, sb2, sb3, sb3};
        List<StringBuilder> list3 = Arrays.asList(array1);
        System.out.println(list3);
        array1[1].append("@@@");
        System.out.println(list3);
        array1[2] = new StringBuilder("&&&");
        System.out.println(list3);
    }
}
