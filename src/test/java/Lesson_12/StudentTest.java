package Lesson_12;

import Lesson_11.Stud;

public class StudentTest {
    public static void method1(Stud st1, Stud st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Students are equal");
        } else {
            System.out.println("Students are not equal");
        }
    }

    public static void method2(Stud st1, Stud st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Students' names, course, grade are equal");
                } else {
                    System.out.println("Students' names, course are equal, but grades are different");
                }
            } else {
                System.out.println("Students' names are equal, but course is different");
            }
        } else{
            System.out.println("Students' names are different");
        }
    }
    public static void main(String[] args) {
        Stud s1 = new Stud("Ivan", 2, 5.5);
        Stud s2 = new Stud("Ivan", 2, 85.5);
        method1(s1, s2);
        method2(s1, s2);
    }


}
