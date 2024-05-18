package Lesson_29;

import java.util.ArrayList;

public class Test1 {

}

class Student {
  String name;
  char sex;
  int age;
  int course;
  double avgGrade;

  public Student(String name, char sex, int age, int course, double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;
  }
}

class StudentInfo {
  void printStudentInfo(Studentsts st) {
    System.out.println("Student's name: " + st.name + ", sex: " + st.sex + ", age: " + st.age + ", course: " +
          +st.course + ", average grade: " + st.avgGrade);
  }

  void printStudentsOverGrade(ArrayList<Studentsts> al, double avgGrade) {
    for (Studentsts s : al) {
      if (s.avgGrade > avgGrade) {
        printStudentInfo(s);
      }
    }
  }

  void printStudentsUnderGrade(ArrayList<Studentsts> al, double avgGrade) {
    for (Studentsts s : al) {
      if (s.avgGrade < avgGrade) {
        printStudentInfo(s);
      }
    }
  }

  void printStudentsOverAge(ArrayList<Studentsts> al, int age) {
    for (Studentsts s : al) {
      if (s.age > age) {
        printStudentInfo(s);
      }
    }
  }

  void printStudentsUnderAge(ArrayList<Studentsts> al, int age) {
    for (Studentsts s : al) {
      if (s.age < age) {
        printStudentInfo(s);
      }
    }
  }

  void printStudentsBySex(ArrayList<Studentsts> al, char sex) {
    for (Studentsts s : al) {
      if (s.sex == sex) {
        printStudentInfo(s);
      }
    }
  }

  void printStudentsMixConditions(ArrayList<Studentsts> al, double avgGrade, int age, char sex) {
    for (Studentsts s : al) {
      if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
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
    StudentInfo si = new StudentInfo();
    si.printStudentsOverGrade(list, 8.5);
    System.out.println("--------------------------------");
    si.printStudentsUnderGrade(list, 9);
    System.out.println("--------------------------------");
    si.printStudentsOverAge(list, 25);
    System.out.println("--------------------------------");
    si.printStudentsUnderAge(list, 27);
    System.out.println("--------------------------------");
    si.printStudentsBySex(list, 'm');
    System.out.println("--------------------------------");
    si.printStudentsMixConditions(list, 7.2, 23, 'f');
  }

}
