package Lesson_18;

public class Test6 {
    public static void main(String[] args) {
        char[] array = {'p','r','i','v','e','t'};
      //  String st = new String(array);
     //   System.out.println(st);

        StringBuilder sb = new StringBuilder("Hello world");
     //   sb.append(array, 2, 3);

        sb.insert(1, array, 2, 4);
        System.out.println(sb);
    }
}
