package Lesson_26;
/*
    Autoboxing and Unboxing
 */
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0);
        System.out.println(a);
        Long l = 30l;
        Integer b = new Integer(10);
        int c = b;
        System.out.println(c);
        String s1 = "50";
        String s2 = "true";
        String s3 = "1.15";
        int i1 = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2);
        double d1 = Double.parseDouble(s3);
        System.out.println(i1);
        System.out.println(b1);
        System.out.println(d1);

        Integer i3 = Integer.valueOf(12);
        Double d2 = Double.valueOf(s3);
        Byte b2 = Byte.valueOf((byte)7);
        System.out.println(b2);

    }
}
