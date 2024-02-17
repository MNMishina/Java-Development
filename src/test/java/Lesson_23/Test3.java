package Lesson_23;

public class Test3 {

}
class Animals {
    static String showName() {
        return "Fluffy";
    }
    void showInfoOfAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}
class Mouses extends Animals{
    static String showName() {
        return "Mouser";
    }

    void showInfoOfMouse() {
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
        Mouses as = new Mouses();
        as.showInfoOfAnimal();
        as.showInfoOfMouse();

    }
}
