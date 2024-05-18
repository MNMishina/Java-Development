package Lesson_29;
import java.util.ArrayList;
import java.util.function.*;

public class HW_Lesson29 {
}
class Employee {
  String name;
  String department;
  int salary;

  public Employee(String name, String department, int salary) {
    this.name = name;
    this.department = department;
    this.salary = salary;
  }
}

class TestEmployee {
  void printEmployee(Employee emp) {
    System.out.println("Employee's name: " + emp.name + ", department: " + emp.department + ", salary: " + emp.salary );
  }

  void employeeFiltration(ArrayList<Employee> al, Predicate<Employee> t) {
    for (Employee e : al) {
      if (t.test(e)) {
        printEmployee(e);
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Employee> list = new ArrayList<>();
    Employee emp1 = new Employee("Elena", "IT", 230);
    Employee emp2 = new Employee("Galina", "Sales", 350);
    Employee emp3 = new Employee("Max", "IT", 500);
    Employee emp4 = new Employee("Evgeniy", "IT", 150);
    Employee emp5 = new Employee("Ruslan", "IT", 300);
    Employee emp6 = new Employee("Ezhevika", "Teaching dept", 450);
    Employee emp7 = new Employee("Sales", "Sales", 450);
    list.add(emp1);
    list.add(emp2);
    list.add(emp3);
    list.add(emp4);
    list.add(emp5);
    list.add(emp6);
    list.add(emp7);
    TestEmployee te = new TestEmployee();
    te.employeeFiltration(list, x -> x.department.equals("IT") && x.salary > 200);
    System.out.println();
    te.employeeFiltration(list, x -> x.name.startsWith("E") && x.salary != 450);
    System.out.println();
    te.employeeFiltration(list, x -> x.name.equals(x.department));
    System.out.println();

  }
}
