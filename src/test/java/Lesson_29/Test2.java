package Lesson_29;

import java.util.ArrayList;

public class Test2 {

}

class Students {
  String name;
  char sex;
  int age;
  int course;
  double avgGrade;

  public Students(String name, char sex, int age, int course, double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;
  }
}

class StudentsInfo {
  void printStudentInfo(Studentsts st) {
    System.out.println("Student's name: " + st.name + ", sex: " + st.sex + ", age: " + st.age + ", course: " +
          +st.course + ", average grade: " + st.avgGrade);
  }

  void testStudents(ArrayList<Studentsts> al, StudentsChecks sc) {
    for (Studentsts s : al) {
      if (sc.testStud(s)) {
        printStudentInfo(s);
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Studentsts> list = new ArrayList<>();
    Studentsts st1 = new Studentsts("Sonya", 'f', 22, 3, 8.3);
    Studentsts st2 = new Studentsts("Kolya", 'm', 28, 5, 6.4);
    Studentsts st3 = new Studentsts("Anna", 'f', 19, 1, 8.9);
    Studentsts st4 = new Studentsts("Lev", 'm', 35, 4, 7);
    Studentsts st5 = new Studentsts("Lizoette", 'f', 23, 3, 9.1);
    list.add(st1);
    list.add(st2);
    list.add(st3);
    list.add(st4);
    list.add(st5);
    StudentstsInfo si = new StudentstsInfo();
    for (Studentsts s : list) {
      System.out.println(s.name);
    }
    System.out.println();
    list.removeIf(x -> x.name.endsWith("a"));
    for (Studentsts s : list) {
      System.out.println(s.name);
    }
  }

//    FindStudentsOverGrade fsog = new FindStudentsOverGrade();
//    FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
//    FindStudentsOverAge fsoa = new FindStudentsOverAge();
//    FindStudentsUnderAge fsua = new FindStudentsUnderAge();
//    FindStudentsBySex fsbs = new FindStudentsBySex();
//    FindStudentsMixConditions fsmc = new FindStudentsMixConditions();

//    si.testStudents(list, fsog);
//    System.out.println();
//    si.testStudents(list, fsug);
//    System.out.println();
//    si.testStudents(list, fsoa);
//    System.out.println();
//    si.testStudents(list, fsua);
//    System.out.println();
//    si.testStudents(list, fsbs);
//    System.out.println();
//    si.testStudents(list, fsmc);

}


interface StudentChecks {
  boolean testStud(Studentsts s);
}

class FindStudentsOverGrade implements StudentsChecks {
  public boolean testStud(Studentsts s) {
    return s.avgGrade > 8.5;
  }
}

class FindStudentsUnderGrade implements StudentsChecks {
  public boolean testStud(Studentsts s) {
    return s.avgGrade < 9;
  }
}

class FindStudentsOverAge implements StudentsChecks {
  public boolean testStud(Studentsts s) {
    return s.age > 25;
  }
}

class FindStudentsUnderAge implements StudentsChecks {
  public boolean testStud(Studentsts s) {
    return s.age < 27;
  }
}

class FindStudentsBySex implements StudentsChecks {
  public boolean testStud(Studentsts s) {
    return s.sex == 'm';
  }
}

class FindStudentsMixConditions implements StudentsChecks {
  public boolean testStud(Studentsts s) {
    return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');
  }
}
