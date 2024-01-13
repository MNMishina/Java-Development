package Lesson_20;

import java.util.ArrayList;
public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Good morning !");
        list.add("Good afternoon !");
        list.add("Good night !");
        list.add("Good-Bye !");
        list.add("Good morning !");
        list.add("Hello !");
        System.out.println(list.toString());

//        for (String s : list) {
//            System.out.print(s + " ");
//        }
        System.out.println();
        System.out.println("Размер листа " + list.size());
        System.out.print("Индекс элемента Hello ! ");
        System.out.print(list.lastIndexOf("Good morning !"));
        System.out.println();
        list.clear();
        System.out.println(list.isEmpty());
    }
}
