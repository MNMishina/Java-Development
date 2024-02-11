package Lesson_22_OOP;

import javax.print.Doc;

public class Inheritance {
    void increaseSalary(Employee e) {
        e.salary = e.salary + 500;
    }
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Pavel";
        doc.age = 45;
        doc.experience = 20;
        doc.specialization = "stomatolog";
        doc.eat();
        doc.sleep();
        doc.heal();
    }
}

    class Employee {
    String name;
    int age;
    int experience;
    double salary = 1000;
    void eat() {
        System.out.println("Ест");
    }
    void sleep() {
        System.out.println("Спит");
    }
}
class Doctor extends Employee {
    String specialization;
    void heal() {
        System.out.println("Лечит");
    }
}

class Hirurg extends Doctor {
    String scalpel;
    void operation() {
        System.out.println("some ///");
    }
}
class Teacher extends Employee {
    int pupilsCount;
    void teach() {
        System.out.println("Учит");
    }
}
class Driver extends Employee {
    String carModel;
    void drive() {
        System.out.println("Водит");
    }
}
