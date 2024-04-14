package Lesson_27;

public class Test3 {
    static void abc() {
        System.out.println("Method abc is running");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (StackOverflowError error) {
            System.out.println("Error cached !");
        }
    }
}
