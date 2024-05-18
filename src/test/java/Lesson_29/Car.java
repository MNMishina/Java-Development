package Lesson_29;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Car {
  String model;
  String color;
  double engine;

  public Car(String model, String color, double engine) {
    this.model = model;
    this.color = color;
    this.engine = engine;
  }

  public String toString() {
    return "The car is " + model + ", color is " + color + ", engine is " + engine;
  }
}

class Test10 {
  public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
    ArrayList<Car> al = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      al.add(carSupplier.get());
    }
    return al;
  }

  public static void changeCar(Car car, Consumer<Car> carConsumer) {
    carConsumer.accept(car);
  }

  public static void main(String[] args) {
    ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "Metallic", 1.6));
    System.out.println("Our Cars: " + ourCars);

    changeCar(ourCars.get(0), car -> {
      car.color = "Red";
      car.engine = 2.4;
      System.out.println("Updated Car -  " + car);
      System.out.println();
      System.out.println("Our Cars: " + ourCars);
    });

  }
}
