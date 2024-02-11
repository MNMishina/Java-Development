package Lesson_21_2;

public class Test2 {
    int abc() {
        return 5;
    }
    int abc2(int i) {
        if (i > 10) {
            return 5;
        } else {
            return 10;
        }
    }
    void abc3(int i2) {
        if (i2 > 3) {
            return;
        }
        System.out.println("Hi");
        return;
    }

    public static void main(String[] args) {
        int a = new Test2().abc();
        new Test2().abc();
    }
}
