package Lesson_20;

import java.util.ArrayList;
import java.util.Collections;

public class Test7 {
    public ArrayList<String> abc(String... s) {
        ArrayList<String> aL = new ArrayList<>();
        for (String s1 : s) {
            if (!aL.contains(s1)) {
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        Test7 t7 = new Test7();
        t7.abc("F", "A", "C", "B", "E", "D","A","B");
    }
}
