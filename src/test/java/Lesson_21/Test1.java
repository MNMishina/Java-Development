package Lesson_21;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1 = " + al1);

        ArrayList <String> al2 = new ArrayList<>();
        al2.add("one");
        al2.add("three");
        al2.add("four");
        al2.add("ten");

     //   al1.removeAll(al2);
      //  al1.retainAll(al2);     // Заменяет элементы коллекции al1 на элементы коллекции al2
     //   System.out.println("al1 = " + al1);
        boolean result = al1.containsAll(al2);  // Проверка, содержит ли коллекция al1 все элементы из коллекции al2
        System.out.println("result = " + result);
    }
}
