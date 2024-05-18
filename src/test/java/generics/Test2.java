package generics;

import scala.math.Equiv;

import java.util.ArrayList;

public class Test2 {
  public static void main(String[] args) {
    ArrayList<Integer> al1 = new ArrayList<>();
    al1.add(10);
    al1.add(20);
    al1.add(30);

    ArrayList<String> al2 = new ArrayList<>();
    al2.add("yes");
    al2.add("ok");
    al2.add("no");
    int a = GenericMethod.getSecondElement(al1);
    System.out.println(a);
    String s = GenericMethod.getSecondElement(al2);
    System.out.println(s);

  }
}

class GenericMethod {
  public static <T> T getSecondElement(ArrayList<T> al) {
    return al.get(1);
  }
}
