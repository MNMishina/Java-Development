package Lesson_22_OOP;

public class Person {

    Person(String s) {
        this(s, null);
    }
    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    String name;
    String surname;
}
class Student5 extends Person {
    int course;
    Student5(String name, String surname, int course) {
        super(name, surname);
        this.course = course;
    }
    public static void main(String[] args) {
        Student5 s = new Student5("Nina", "Smirnova", 3);
        System.out.println(s.name + " " + s.surname + " " + s.course + " курс");
    }
}
