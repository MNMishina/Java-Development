package Lesson_4;

public class bankAccount {
    int id = 10;
    String name = "Nikita";
    double balance = 1000;

    void popolnenieScheta(double summaPopolneniya) {
        System.out.println("Balans popolnyaetsya na: " + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Balans posle popolneniya: " + balance);
    }

    void snyatieSoScheta(double summaSnyatiya) {
        System.out.println("Balans umenshaetsya na: " + summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Balans posle snyatiya: " + balance);
    }
}

class bankAccountTest {

    public static void main(String[] args) {
        bankAccount myAccount = new bankAccount();
        myAccount.popolnenieScheta(150.50);
        myAccount.snyatieSoScheta(500.20);
    }
}