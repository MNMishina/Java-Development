package Lesson_23;

public class Test1 {
//    public Employee abc() {
//        return new Teacher;
//    }
    public static void main(String[] args) {
        Employee e = new Teacher();
        e.eat();
//        Employee e = new Employee();
//        Teacher t = new Teacher();
//        e.eat();
//        t.eat();
    }
}

class Food {}
class Fruits extends Food {}

class Employee {
    String name;
    int age;
    int experience;
    double salary = 1000;
    Food eat() {
        System.out.println("Ест работник");
        Food f = new Food();
        return f;
    }
    void sleep() {
        System.out.println("Спит");
    }
}
class  Teacher extends Employee {
    int pupilsCount;
    Fruits eat() {
        System.out.println("Ест учитель");
        Fruits f = new Fruits();
        return f;
    }
    void teach() {
        System.out.println("Учит");
    }
}

class A {
    Employee objectCreation() {
        return new Employee();
    }
}

class B extends A {
    Teacher objectCreation() {
        System.out.println("Let's go!");
        return new Teacher();
    }
}
