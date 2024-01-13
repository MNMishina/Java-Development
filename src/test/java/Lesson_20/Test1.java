package Lesson_20;

import Lesson_11.Car;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        Cars c = new Cars();
        list.add(c);
        Students st = new Students();
        list.add(st);
        list.add(new StringBuilder("yes"));

        ArrayList<String> list2 = new ArrayList<>(30);
        ArrayList<String> list5 = new ArrayList<>(list2);
        System.out.println(list2 == list5);
        list2.add("BYE");

        List<StringBuilder> list3 = new ArrayList<>();
        list3.add(new StringBuilder("no"));
    }
}

class Cars {
}

class Students {
}
