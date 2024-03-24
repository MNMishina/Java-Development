package Lesson_25;

import javax.print.Doc;

public class Test_4 {
    public static void main(String[] args) {
        Help_able h = new Doctor();
        Employee2 emp1 = new Doctor2();
        Employee2 emp2 = new Teacher2();
        Employee2 emp3 = new Driver2();
        Employee2 emp4 = new Employee2();
        Employee2[] array = {emp1, emp2, emp3, emp4};
        for (Employee2 e:array) {
            if (e instanceof Driver2) {
                System.out.println(((Driver2)e).carName);
                ((Driver2)e).drives();
            }
        }
        //Doctor2 d1 = (Doctor2)emp1;
        //d1.cures();
        h.help();
        System.out.println(((Doctor2)emp1).specialization);
        ((Doctor2)emp1).cures();
     //   ((Doctor2)emp1).help();
    }
}

class Employee2 extends java.lang.Object {
    double salary = 1000;
    String name = "Maksim";
    int age;
    int experience;

    void eat() {
        System.out.println("Is eating");
    }

    void sleep() {
        System.out.println("Is sleeping");
    }
}

class Doctor2 extends Employee2{
    String specialization = "Flebologist";

    void cures() {
        System.out.println("Is curing");
    }
}

class Teacher2 extends Employee2 {
    int pupilQuantity;

    void teaches() {
        System.out.println("Is teaching");
    }
}

class Driver2 extends Employee2 {
    String carName = "BMW";

    void drives() {
        System.out.println("Is driving");
    }
}

