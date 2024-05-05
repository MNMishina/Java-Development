package Lesson_27;

public class Test10 {
  void marathon(int airTemperature, int tempBega) throws PodvernulNoguException {
    if (tempBega > 12) {
      throw new PodvernulNoguException("Temp bega was too high: " + tempBega);
    }
    if (airTemperature > 32) {
      throw new SveloMishcuException();
    }
    System.out.println("You ran the marathon");
  }

  public static void main(String[] args) {
    Test10 t10 = new Test10();
    try {
      t10.marathon(20, 18);
    } catch (PodvernulNoguException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("You will be given a certificate anyway !");
    }
  }
}

class PodvernulNoguException extends Exception {
  PodvernulNoguException(String message) {
    super(message);
  }

  PodvernulNoguException() {

  }
}

class SveloMishcuException extends RuntimeException {
  SveloMishcuException(String message) {
    super(message);
  }
  SveloMishcuException() {

  }
}


