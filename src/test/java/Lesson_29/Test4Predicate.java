package Lesson_29;

import java.util.ArrayList;
import java.util.function.*;

public class Test4Predicate {
}
class Studentsts {
  String name;
  char sex;
  int age;
  int course;
  double avgGrade;

  public Studentsts(String name, char sex, int age, int course, double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;
  }
}

class StudentstsInfo {
  void printStudentInfo(Studentsts st) {
    System.out.println("Student's name: " + st.name + ", sex: " + st.sex + ", age: " + st.age + ", course: " +
          +st.course + ", average grade: " + st.avgGrade);
  }

  void testStudents(ArrayList<Studentsts> al, Predicate<Studentsts> t) {    // 2nd parameter is an interface
    for (Studentsts s : al) {
      if (t.test(s)) {
        printStudentInfo(s);
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Studentsts> list = new ArrayList<>();
    Studentsts st1 = new Studentsts("Sonya", 'f', 22, 3, 8.3);
    Studentsts st2 = new Studentsts("Kolya", 'm', 28, 5, 6.4);
    Studentsts st3 = new Studentsts("Anna", 'f', 19, 1, 8.9);
    Studentsts st4 = new Studentsts("Vova", 'm', 35, 4, 7);
    Studentsts st5 = new Studentsts("Liza", 'f', 23, 3, 9.1);
    list.add(st1);
    list.add(st2);
    list.add(st3);
    list.add(st4);
    list.add(st5);
    StudentstsInfo si = new StudentstsInfo();

    si.testStudents(list, (Studentsts st) -> {return st.avgGrade > 8.5;});
    System.out.println();
    si.testStudents(list, st -> st.avgGrade < 9);   // also possible way to write code like this
    System.out.println();
    si.testStudents(list, st -> {return st.age > 25;});
    System.out.println();
    si.testStudents(list, (Studentsts st) -> st.age < 27);
    System.out.println();
    si.testStudents(list, (Studentsts st) -> {return st.sex == 'm';});
    System.out.println();
    si.testStudents(list, (Studentsts st) -> {return (st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f');});

  }
}
