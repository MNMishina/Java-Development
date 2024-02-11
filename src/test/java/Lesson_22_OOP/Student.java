package Lesson_22_OOP;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3)
            this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int i) {
        if (1 <= i && i < 5) {
            course = i;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int i) {
        if (1 <= i && i < 11) {
            grade = i;
        }
    }

    public void showInfo() {
        System.out.println("Студент " + getName() + " курс " + getCourse() + " оценка " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName(new StringBuilder("Игорь"));
        st.setCourse(2);
        st.setGrade(8);
        st.showInfo();
    }
}
