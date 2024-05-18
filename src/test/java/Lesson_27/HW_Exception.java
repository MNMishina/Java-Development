package Lesson_27;

public class HW_Exception {
  public static void main(String[] args) {
    Tiger1 tg = new Tiger1();
    tg.eat("meat");
    try {
      tg.drink("water");
      try {
        tg.drink("beer");
      } catch (NotWaterException e) {
        System.out.println(e.getMessage());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      } finally {
        System.out.println("This is inner finally block");
      }
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class NotMeatException extends RuntimeException {
  public NotMeatException(String message) {
    super(message);
  }
}

class NotWaterException extends Exception {
  public NotWaterException(String message) {
    super(message);
  }
}

class Tiger1 {
  public void eat(String food) {
    if (!food.equals("meat")) {
      throw new NotMeatException("A tiger doesn't eat " + food);
    }
    System.out.println("A tiger eats meat");
  }

  public void drink(String liquid) throws NotWaterException {
    if (!liquid.equals("water")) {
      throw new NotWaterException("A tiger doesn't drink " + liquid);
    }
    System.out.println("A tiger drinks water");
  }
}