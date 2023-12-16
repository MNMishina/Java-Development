/*
    Перегруженные конструкторы имеют разный список параметров (разный тип, разный порядок параметров). Access modifier может быть одинаковым или разным.
    При вызове перегруженного конструктора внутри конструктора нужно использовать слово "this".
 */
package Lesson_5;

public class Employee1 {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee1(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    }

    Employee1(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }

    Employee1(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }
}

class EmployeeTest1 {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(124254, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee1 emp2 = new Employee1("Lagutin", 30);
        System.out.println(emp2.age);
        Employee1 emp3 = new Employee1(254644, "Egorov", 36, 2500.00, "IT");
        System.out.println(emp3.department);
    }
}
