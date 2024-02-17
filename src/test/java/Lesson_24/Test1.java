package Lesson_24;

public class Test1 {
}
class Aq {
    String s = "Today";
    void abc() {
        System.out.println("???");
    }
}
class Bq extends Aq {
    String s = "Yesterday";
    void abc() {
        System.out.println("!!!");
    }
}
class  Cq extends Bq {
    public static void main(String[] args) {
        Cq c = new Cq();
        c.abc();
        System.out.println(c.s);
    }
}
