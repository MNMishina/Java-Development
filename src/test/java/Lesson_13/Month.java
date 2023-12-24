package Lesson_13;

public class Month {
    public static void monthNumber(int num) {

        switch (num) {
            case 2:
                System.out.println("28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Wrong month !");
        }
    }

    public static void main(String[] args) {
        monthNumber(0);
        monthNumber(1);
        monthNumber(2);
        monthNumber(11);
        monthNumber(-3);
    }
}
