package Lesson_12;

public class Test10 {
    public static void main(String[] args) {
        int salary = 1500;
        boolean b = false;

        if (salary < 200) {
            System.out.println("Z/P nizkaya");
        }
        else if (salary < 400) {
            System.out.println("Z/P srednyaya");
        } else if (b == true) {
            System.out.println("Z/P visokaya");
        }
        else {
            System.out.println("Plevat' na Z/P !");
        }

        //      Ternary operator
        int a = 10;
        int c = 20;
        int maximum = (a>c)?a:c;
        System.out.println(maximum);
    }


}
