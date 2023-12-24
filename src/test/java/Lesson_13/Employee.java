package Lesson_13;

public class Employee {
    public static void main(String[] args) {
        switch ("Thursday") {
            case "Monday":
            case "Tuesday":
            case "Wendsday":
            case "Thursday":
            case "Friday":
                System.out.println("Rabota do 18.00");
                break;
            case "Saturday":
                System.out.println("Rabota do 14.00");
                break;
            case "Sunday":
                System.out.println("Weekend !!!");
                break;
            default:
                System.out.println("Wrong day !");
        }
    }
}
