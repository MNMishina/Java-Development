package Lesson_8;

public class Homework_8_2 {

    public static final double PI = 3.14;

    public double ploshad(double radius) {
        double pl = PI * radius * radius;
        return pl;
    }
    public static double dlina(double radius2) {
        double dl = 2 * PI * radius2;
        return dl;
    }
    public void info(double radius3) {
        System.out.println("Radius " + radius3);
        System.out.println("Ploshad kruga " + ploshad(radius3));
        System.out.println("Dlina okruzhnosti " + dlina(radius3));
    }
}
class Homework8_2Test {
    public static void main(String[] args) {
        Homework_8_2 rad1 = new Homework_8_2();
        rad1.ploshad(5);
        Homework_8_2.dlina(7.5);
        rad1.info(3);
    }
}
