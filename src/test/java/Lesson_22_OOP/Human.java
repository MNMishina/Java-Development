package Lesson_22_OOP;

public class Human {
    final String gender;

    Human(String gender) {
        this.gender = gender;
    }
    private boolean clever;

    public boolean isClever() {
        return clever;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }
    private StringBuilder name1;
    public StringBuilder getName1() {
        StringBuilder sb = new StringBuilder(name1);
        return sb;
    }

    public void setName1(StringBuilder sb) {
        name1 = sb;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        if (i > 0) {
            age = i;
        }
    }

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int w) {
        if (w > 0) {
            weight = w;
        }
    }
}
class Test {
    public static void main(String[] args) {
        Human h = new Human("male");
        h.setName("Amelia");
        h.setAge(7);
        h.setWeight(25);
        System.out.println("Name " + h.getName() + " " + h.getAge() + " years " + h.getWeight() + " kg");

        h.setName1(new StringBuilder("Kira"));
        h.getName1().append("!!!!!!");
        System.out.println(h.getName1());
    }
}
