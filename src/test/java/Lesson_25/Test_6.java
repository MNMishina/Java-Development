package Lesson_25;

public class Test_6 {

}
class Test1 implements interface1, interface2 {
    public void abc() {
        System.out.println("OK");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(((interface2)t).a);
        t.abc();
    }

}
interface interface1 {
    int a = 5;
    void abc();
}
interface interface2 {
    int a = 10;
    void abc();
}
