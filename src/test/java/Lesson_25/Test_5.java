package Lesson_25;

public class Test_5 {
    public static void main(String[] args) {
        String[] array1 = {"hi", "bye"};
        Object[] array2 = array1;
        String[] array3 = (String[])array2;
       // array3[0] = new StringBuilder("ok");
        //array2[0] = new StringBuilder("ok");

        int i = 5;
        long l = 10;
        i =(int)(i*l);
        i*=l;
        System.out.println(i + 1);
        float f = 3.14f;
        int i2 = 10;
        System.out.println(f + i2);
        byte b = 3;
        short s = 4;
        char c = 5;
        System.out.println(b + s + c);
        System.out.println(b++);

        byte b2 = 10;
        float f2 = 7;
        double d2 = 2.0;
        double i5 = b2 + f2 - d2;
        System.out.println(b2 + f2 - d2);

        double d10 = 3.14;
        float f10 = 6.28f;
    }
}
