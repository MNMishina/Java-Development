package Lesson_19;

public class Test3 {
    public static void main(String[] args) {
        String[] jobMates = {"Reeves", "Willis", "Jones"};
        String[] job = {"IT", "Design"};
        for (String s1 : jobMates) {
            for (String s2 : job) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
