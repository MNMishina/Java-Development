package Lesson_11;

public class Stud {
    public String name;
    public int course;
    public double grade;
    public Stud(String name, int course, double grade) {
        this. name = name;
        this. course = course;
        this. grade = grade;
    }

    public static void swap(Stud s1, Stud s2) {
        Stud s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }

    public static void changeName(Stud s1) {
        s1.name = "Vika";
    }

    public static void main(String[] args) {
        Stud st1 = new Stud("Olga", 3, 9.5);
        Stud st2 = new Stud("Petr", 1, 5.3);
        swap(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st2);
        System.out.println(st2.name);

    }
}
