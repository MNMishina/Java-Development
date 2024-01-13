package Lesson_20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("WoW !");
        list.add(sb1);
        list.add(new StringBuilder("Good morning !"));
        list.add(new StringBuilder("Good afternoon !"));
        list.add(new StringBuilder("Good night !"));
        list.add(1, new StringBuilder("Hello !"));

        System.out.println(list.toString());

//        for (StringBuilder sb : list) {
//            System.out.print(sb + " ");
//        }
        System.out.println();
//        list.set(1, "- - -");

        System.out.println(list.contains(sb1));

        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Kevin !"));
        list2.add(new StringBuilder("Oliver !"));

        list.addAll(list2);
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        list2.get(1).append("?");
        System.out.println();
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        list.clear();
        System.out.println();
        System.out.println("---------");
    }
}
