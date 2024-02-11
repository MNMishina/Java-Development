package Lesson_22_OOP;

public class Human_1 {
    protected String name = "Dan";
    protected static int salary = 5000;

    protected void work() {
        System.out.println("Работает");
    }

    protected static void rest() {
        System.out.println("Отдыхает");
    }
}

class Student1 extends Human_1 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        System.out.println(s.name);
        System.out.println(s.salary);
        s.work();
        Student1.rest();
    }
}
