package Lesson_24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.help();
        h.bringFireDown("водой");
        s.swim();
    }
}

class Employee {
    double salary = 1000;
    String name = "Amelia";
    int age;
    int experience;

    void eat() {
        System.out.println("Ест");
    }

    void sleep() {
        System.out.println("Спит");
    }
}

abstract class Teacher extends Employee implements Help_able {
    int pupilsCount;

    void teach() {
        System.out.println("Учит");
    }

    public void help() {
        System.out.println("Учитель оказывает помощь");
    }

    public void bringFireDown() {
        System.out.println("Учитель тушит пожар");
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String carModel;

    void drive() {
        System.out.println("Водит");
    }

    public void help() {
        System.out.println("Водитель оказывает помощь");
    }

    public void bringFireDown(String s) {
        System.out.println("Водитель тушит пожар " + s);
    }

    public void swim() {
        System.out.println("Водитель умеет плавать");
    }
}

interface Help_able {
    public abstract void help();

    void bringFireDown(String fire);
    public final static int a = 10;
}

interface Swim_able {
    void swim();
}

