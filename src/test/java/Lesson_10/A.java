package Lesson_10;

import Lesson_9.Car;

import static Lesson_9.Car.*;
public class A {

    static int count = 99;      // Сначала ищется статичная переменная в классе, потом в импорте
    public static void main(String[] args) {
        Car c2 = new Car("green", "V8");
        System.out.println(ab);
        System.out.println(count);

    }
}
