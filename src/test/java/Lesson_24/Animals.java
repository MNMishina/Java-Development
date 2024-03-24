package Lesson_24;

abstract class Animals {
    String name;

    Animals(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animals {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Interesting, how fish sleep");
    }

    abstract void swim();
}

abstract class Bird extends Animals implements Speakable {
    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animals implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    public void swim() {
        System.out.println("Mechenosec is a beautiful fish, that swims fast");
    }

    public void eat() {
        System.out.println("Mechenosec isn't a predator, eats fish food");
    }
}

class Penguin extends Bird {
    Penguin(String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Penguin likes eat fish");
    }
    public void sleep() {
        System.out.println("Penguins sleep standing close to each other");
    }
    public void fly() {
        System.out.println("Penguins can't fly");
    }
    public void speak() {
        System.out.println("Penguins can't sing beautiful");
    }
}
class Lion extends Mammal {
    Lion(String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Lion is a predator, eats meat");
    }
    public void sleep() {
        System.out.println("Lion sleeps most time of the day");
    }
    public void run() {
        System.out.println("Lion isn't the fastest cat");
    }

}

