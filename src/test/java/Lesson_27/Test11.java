package Lesson_27;

public class Test11 {
  public static void main(String[] args) {
    createPassword("qwedfkluuhglfkgjfg");
  }
  public static void createPassword(String pwd) {
    if (pwd.length() < 6) {
      throw new IllegalArgumentException("Password length is too short");
    }
    if (pwd.length() > 12) {
      throw new IllegalArgumentException("Password length is too long");
    }
    System.out.println("Access permit");
  }
}
