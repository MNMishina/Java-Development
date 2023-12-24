package Lesson_9;

public class Car {

    String color;
    String engine;
    public static int count;
    public static int ab = 10;

    public Car(String color2, String engine2) {
        count++;
        color = color2;
        engine = engine2;
    }

    public void showColor() {
        System.out.println("Car color " + color);
    }

    public void changeColor(String color3) {
        System.out.println("Car color changed");
        int price = 5000;
        color = color3;
        price += 1000;
    }

}
