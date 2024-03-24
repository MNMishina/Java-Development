package Lesson_25;

public class Test_2 {
}
class Car {
    static int a = 5;

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.a);
        car = null;
        System.out.println(car.a);
    }
}
