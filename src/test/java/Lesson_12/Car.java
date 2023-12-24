package Lesson_12;

public class Car {
    int engine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);

        if (c1.engine > c2.engine) {
        if (c1.doorCount > c2.doorCount) {
                System.out.println("Engine and door quantity for the first car is greater");
            }
            else{
                    System.out.println("Engine for the first car is greater but door quantity is lower");}
                }
            else{
                    System.out.println("Engine for the first car is lower");
                }
            }
        }

