package Lesson_21;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(125, "Ivanov Kirill");
        map.put(126, "Smirnov Dima");
        map.put(127, "Ermolov Nikita");
        map.put(128, "Zubina Diana");
        map.put(127, "John Dow");
        map.put(129, "Smirnov Dima");
        map.remove(127);
        System.out.println(map);

    }
}
