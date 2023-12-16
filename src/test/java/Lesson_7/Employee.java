package Lesson_7;

public class Employee {

    int id;
    public  String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id2) {
        id = id2;
    }

    Employee(String surname2) {
        surname = surname2;
    }

    private Employee(double salary2) {
        salary = salary2;
    }

    double increaseSalary() {
        salary *= 2;
        return salary;
    }

    public void showId() {
        System.out.println("ID = " + id);
    }

    public void showSurname() {
        System.out.println("Surname = " + surname);
    }

    public void showSalary() {
        System.out.println("Salary = " + salary);
    }

}
