package Lesson_23;

public class A1 {
    String s1 = "Today";
    static double d1 = 5.85;
    int summa(int... i) {
    int result = 0;
        for (int a:i) {
            result +=a;
        }
        return result;
    }
    static void abc() {
        System.out.println("Static method");
    }
}

class B1 extends A1 {
    double d1 = super.d1;
    String s1 = super.s1 + ", tomorrow";
    int sum(int... i) {
        int result = super.summa(i);
        System.out.println("Sum: " + result);
        super.abc();
        return result;
    }

    public static void main(String[] args) {
        B1 b = new B1();
        System.out.println(b.s1);
    }
}
