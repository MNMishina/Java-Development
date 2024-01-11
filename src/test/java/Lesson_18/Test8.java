package Lesson_18;

//   {{element00, element01}, {element10}, {element10, element11}}
public class Test8 {
    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print(" },");
            } else {
                System.out.print(" }");
            }
        }
        System.out.print(" }");
    }
    public static void main(String[] args) {
        String[][] array1 = {{"car", "motorbike"}, {"boat", "ship", "yaht"}, {"scooter"}};
        showArray(array1);
        System.out.println();
        showArray(new String[][]{{"cat", "dog"}, {"cow", "horse"}});
    }
}
