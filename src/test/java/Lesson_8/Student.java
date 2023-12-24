package Lesson_8;

public class Student {

    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count ++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " created!");
    }

    public static void showCount() {
        System.out.println("Total students created " + count);
    }

    public void showInfo() {
        System.out.println("Welcom to the Student's class !!!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student st2 = new Student("Alex", 2);
        st2.a++;
    }

    public static void main(String[] args) {
        abcd();
        Student st3 = new Student("Nina", 7);
        st3.abc();
    }
}

//class StudentTest {
//    public static void main(String[] args) {
//        Student st1 = new Student("Violett", 2);
//        Student st2 = new Student("Jinx", 1);
//        Student st3 = new Student("Otto", 4);
//
//        System.out.println(st2.name);
//        System.out.println(Student.count);
//        Student.showCount();
//        st2.showCount();
//    }
//}
