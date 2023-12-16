package Lesson_6;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;



    public Employee(int id1, String surname1, int age1, double salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    }

    private Employee(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }

}

class EmployeeNewTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(124, "Petrova", 82);
        Employee emp2 = new Employee(854, "Smirnoff", 54, 850.0, "IT");

    }



}
