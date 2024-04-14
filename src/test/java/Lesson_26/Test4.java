package Lesson_26;

public class Test4 {
    {
        System.out.println("This is Init Block 3");
    }

    Test4() {
        System.out.println("This is Constructor 1");
    }

    Test4(int a) {
        this();
        System.out.println("This is Constructor 2");
    }

    {
        System.out.println("This is Init Block 1");
    }

    static {
        System.out.println("This is STATIC Init Block 1");
    }

    {
        System.out.println("This is Init Block 2");
    }

    static {
        System.out.println("This is STATIC Init Block 2");
    }

    public static void main(String[] args) {
        Test4 t1 = new Test4();
        Test4 t2 = new Test4(3);

    }
}
