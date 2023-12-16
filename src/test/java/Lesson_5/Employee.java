package Lesson_5;

public class Employee {

    int id0;
    String surname0;
    int age0;
    double salary0;
    String department0;

    Employee(int id, String surname, int age, double salary, String department) {
        id0 = id;
        surname0 = surname;
        age0 = age;
        salary0 = salary;  // in $
        department0 = department;
    }


    double increaseSalary2Times() {
        salary0 *= 2;
        return salary0;
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee(123554, "Knyazev", 32, 7000, "Kiber Security");
        Employee emp2 = new Employee(185422, "Buldakov", 47, 5000, "Development");

        emp1.increaseSalary2Times();
        System.out.println("Novaya zarplata sotrudnika " + emp1.surname0 + ": " + emp1.salary0);
        double newSalary = emp2.increaseSalary2Times();
        System.out.println("Novaya zarplata sotrudnika " + emp2.surname0 + ": " + newSalary);

    }

}
