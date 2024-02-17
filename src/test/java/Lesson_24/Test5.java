package Lesson_24;

public class Test5 {

}
interface Some {
    void abc();
    default void ghi() {
        System.out.println("This is a method ghi");
    }
    static void def() {
        System.out.println("This is static method def 1");
    }
}
interface SomeSome {
    static void def() {
        System.out.println("This is static method def 2");
    }
}
abstract class O {}
abstract class R extends O implements Some {
    static SomeSome method1(SomeSome ss) {
        return new D2();
    }
    public static void main(String[] args) {
        SomeSome ss = new D2();
        method1(ss);
    }
}
class D2 implements SomeSome {}
//class Body implements Some {
//    public void abc() {
//        System.out.println("This is a method abc");
//    }

//    public static void main(String[] args) {
//        Body b = new Body();
//        b.abc();
//        Some.def();
//        b.ghi();
//    }

