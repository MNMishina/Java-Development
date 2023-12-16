package Lesson_5;

public class Human {

    String name;
    Car3 car;
    Account bA;
    void info() {
        System.out.println("Imya: " + name + "\n" + "Cvet mashiny: " + car.color + "\n" + "Balans bankovskogo scheta: " + bA.balance);
    }
}

class HumanTest {

    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Solomon";
        h.car = new Car3("red", "V6");
        h.bA = new Account(132557, 587.25);
        h.info();
    }
}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class Account {
    Account(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}
