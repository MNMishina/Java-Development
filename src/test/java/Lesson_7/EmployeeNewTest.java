package Lesson_7;

public class EmployeeNewTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(124);
        Employee emp2 = new Employee("Smirnoff");
//        Employee emp3 = new Employee(850.20);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary);

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
//        System.out.println(emp2.salary);

        emp1.showId();
        emp1.showSalary();
        emp1.showSurname();

        emp2.showId();
        emp2.showSalary();
        emp2.showSurname();
    }

    
}
