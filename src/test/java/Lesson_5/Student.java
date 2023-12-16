/*
        Вывод в консоль Средней арифметической оценки каждого стундента, учитывая 3 предмета.
        Использование в конструкторе перегруженного конструктора.
        Создание 3х объектов на основании 3х разных конструкторов.
 */

package Lesson_5;

public class Student {

    int studentId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double englishLanAverageGrade;

    Student(int studentId1, String name1, String surname1, int course1, double mathAverageGrade1, double economicsAverageGrade1, double englishLanAverageGrade1) {
        studentId = studentId1;
        name = name1;
        surname = surname1;
        course = course1;
        mathAverageGrade = mathAverageGrade1;
        economicsAverageGrade = economicsAverageGrade1;
        englishLanAverageGrade = englishLanAverageGrade1;
    }

    Student(int studentId2, String name2, String surname2, int course2) {
        this(studentId2, name2, surname2, course2, 0.0, 0.0, 0.0);
    }

     Student() {
        this(0, null, null, 0, 0.0, 0.0, 0.0);
    }

}

class StudentTest {

    double averageStudentGrade(Student st) {
        double srednyayaOcenka = (st.mathAverageGrade + st.economicsAverageGrade + st.englishLanAverageGrade) / 3;
        System.out.println("Srednyaya arifmeticheskaya ocenka studenta " + st.name + " " + st.surname + ": " + srednyayaOcenka);
        return srednyayaOcenka;
    }
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studentId = 15;
        st1.name = "Platon";
        st1.surname = "Levashov";
        st1.course = 3;
        st1.mathAverageGrade = 7.8;
        st1.economicsAverageGrade = 9.2;
        st1.englishLanAverageGrade = 5.6;

        Student st2 = new Student();
        st2.studentId = 20;
        st2.name = "Vitalina";
        st2.surname = "Orlovskaya";
        st2.course = 5;
        st2.mathAverageGrade = 6.4;
        st2.economicsAverageGrade = 8.3;
        st2.englishLanAverageGrade = 10.2;

        Student st3 = new Student();
        st3.studentId = 25;
        st3.name = "Jasmine";
        st3.surname = "Dedyurina";
        st3.course = 7;
        st3.mathAverageGrade = 9.3;
        st3.economicsAverageGrade = 8.6;
        st3.englishLanAverageGrade = 5.7;

        //String result3 = String.format("%.3f",avgGrade3);
        //System.out.println(st1.name + " " + st1.surname + " " + result1 + "\n" + st2.name + " " + st2.surname + " " + result2 + "\n" + st3.name + " " + st3.surname + " " + result3);

        StudentTest sTest = new StudentTest();
        sTest.averageStudentGrade(st1);
        sTest.averageStudentGrade(st2);
        sTest.averageStudentGrade(st3);

        Student stud1 = new Student(287, "Kira", "Haritonova", 1, 4.8, 7.3, 8.2);
        Student stud2 = new Student(156, "Nina", "Kornilova", 5);
        Student stud3 = new Student();

        System.out.println(stud1 + "\n" + stud2 + "\n" + stud3);
    }

}
