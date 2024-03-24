package Lesson_24;

public class Wild {
    public static void main(String[] args) {
        Mechenosec mech = new Mechenosec("Patrik");
        System.out.println(mech.name);
        mech.eat();
        mech.swim();
        mech.sleep();

        Speakable pen = new Penguin("Lolo");
        pen.speak();

        Animals lion = new Lion("Simba");
        System.out.println(lion.name);
        lion.eat();
        lion.sleep();

        Mammal lion1 = new Lion("Nala");
        System.out.println(lion1.name);
        lion1.run();
        lion1.eat();
        lion1.sleep();
        lion1.speak();

    }
}
