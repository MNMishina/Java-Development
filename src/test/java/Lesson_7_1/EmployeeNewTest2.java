package Lesson_7_1;

import Lesson_7.Employee;

public class EmployeeNewTest2 {

    public static void main(String[] args) {
        Lesson_7.Employee emp1 = new Lesson_7.Employee(124);
//        Lesson_7.Employee emp2 = new Lesson_7.Employee("Smirnoff");
//        Lesson_7.Employee emp3 = new Lesson_7.Employee(850.20);

//        System.out.println(emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary);

        emp1.showId();
        emp1.showSalary();
        emp1.showSurname();





    }


}
