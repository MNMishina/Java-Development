package Lesson_23;

public class Test4 {
    public static void main(String[] args) {
        As c1 = new Cs();
        c1.abc(new Bs());
    }
}
class As {
    void abc(As a) {
        System.out.println("A");
    }
}
class Bs extends As {
    void abc(Bs b1) {
        System.out.println("B");
    }
}
class Cs extends Bs {
    void abc(Bs b2) {
        System.out.println("C");
    }
}
