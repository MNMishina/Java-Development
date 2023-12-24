package Lesson_11;

public class Car {
    String color;
    String engine;
    int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}
class CarTest {
    void changeDoors(Car cr1, int doors) {
        cr1.doors = doors;
    }
    void swapColor(Car cr1, Car cr2) {
        String color = cr1.color;
        cr1.color = cr2.color;
        cr2.color = color;
    }
    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car cr1 = new Car("red", "V4", 4);
        Car cr2 = new Car("yellow", "V6", 5);
        ct.changeDoors(cr1, 6);

        ct.swapColor(cr1, cr2);

        System.out.println("First car info: " + "color: " + cr1.color + " engine: " + cr1.engine + " doors count: " + cr1.doors);
        System.out.println("Second car info: " + "color: " + cr2.color + "  engine: " + cr2.engine + " doors count: " + cr2.doors);

    }

}
