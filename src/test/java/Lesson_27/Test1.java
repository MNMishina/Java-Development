package Lesson_27;

public class Test1 {
    public static void main(String[] args) {
        Animal animal = new Tiger();
        System.out.println(animal.a);
        System.out.println(animal.b);
        animal.abc();
        animal.def();
    }

}
class Animal {
    int a = 5;
    static int b = 10;
    void abc() {
        System.out.println("Non-static method from class Animal");
    }
    static void def() {
        System.out.println("Static method from class Animal");
    }
}
class Tiger extends Animal {
    int a = 15;
    static int b = 20;
    void abc() {
        System.out.println("Non-static method from class Tiger");
    }
    static void def() {
        System.out.println("Static method from class Tiger");
    }
}
