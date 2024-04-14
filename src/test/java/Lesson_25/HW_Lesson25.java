package Lesson_25;

public class HW_Lesson25 {
    public static void main(String[] args) {
        Animals1 a1 = new Mechenosec("Zoydberg");
        Animals1 a2 = new Penguin("Keanu");
        Animals1 a3 = new Lion("Simba");
        Fish f1 = new Mechenosec("Zoydberg2");
        Bird b1 = new Penguin("Keanu2");
        Mammal m1 = new Lion("Simba2");
        Mechenosec mech1 = new Mechenosec("Zoydberg3");
        Penguin p1 = new Penguin("Keanu3");
        Lion l1 = new Lion("Simba3");
        Speakable s1 = new Penguin("Keanu4");
        Speakable s2 = new Lion("Simba4");
        Animals1[] array1 = {a1, a2, a3, f1, b1, m1, mech1, p1, l1};
        Speakable[] array2 = {s1, s2, b1, m1, p1, l1};
        for (Animals1 a:array1) {
            if (a instanceof Mechenosec) {
                Mechenosec mech = (Mechenosec) a;
                System.out.println(mech.name);
                mech.eat();
                mech.swim();
                mech.sleep();
            } else if (a instanceof Penguin) {
                Penguin p = (Penguin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (a instanceof Lion) {
                Lion l = (Lion) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("*******************");
        }
        for (Speakable s:array2) {
            if (s instanceof Penguin) {
                Penguin p = (Penguin) s;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (s instanceof Lion) {
                Lion l = (Lion) s;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("**********************");
        }

    }
}
abstract class Animals1 {
    String name;
    Animals1(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animals1 {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Interesting, how fish sleep");
    }

    abstract void swim();
}
interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

abstract class Bird extends Animals1 implements Speakable {
    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animals1 implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
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


