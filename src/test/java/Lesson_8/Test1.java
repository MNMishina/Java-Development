package Lesson_8;

public class Test1 {

    //public final int a = 10;
    public static final int a = 10;

//    Test1() {
//        a = 10;
//    }
//
//    Test1(boolean b) {
//        a = 15;
//    }

    public void abc(final short s) {
        final byte b;
        b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
      //  t.a = t.a * 2;
        System.out.println(t.a);
    }
}
