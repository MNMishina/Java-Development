package Lesson_24;

public class Test2 {
    public static void main(String[] args) {
        Figure f1 = new Square();
        System.out.println(f1.sideQuantity);
        f1.area();
        f1.perimeter();
    }
}
class X {}
abstract class Figure extends X {

    int sideQuantity = 0;

    abstract void perimeter();

    abstract void area();

    void showInfo() {
        System.out.println("This is a Figure");
    }
}

class Square extends Figure {
    int sideQuantity = 4;
    int side1 = 10;

    public void perimeter() {
        System.out.println(4 * side1);
    }

    public void area() {
        System.out.println(side1 * side1);
    }
}

class Rectangle extends Figure {
    int sideQuantity = 4;
    int side1 = 8;
    int side2 = 5;

    public void perimeter() {
        System.out.println(2 * (side1 + side2));
    }

    public void area() {
        System.out.println(side1 * side2);
    }
}
class Circle extends Figure {
    int sideQuantity = 0;
    int radius = 3;

    public void perimeter() {
        System.out.println(2 * 3.14 * radius);
    }

    public void area() {
        System.out.println(3.14 * radius * radius);
    }
}

abstract class Quadrilateral extends Figure {
    void def() {
        System.out.println("This is chetyrehugolnic");
    }
}

