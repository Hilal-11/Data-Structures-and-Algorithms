// package Arrays;

public class ArrayMaximumAndMinimum {
    public static void main(String[] args) {

        int data[] = { 10, 33, 66, 77, 44, 16, 5 };
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

        System.out.println("\n");
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        System.out.println("Maximum Element :- " + max);

        System.out.println("\n");

        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (min > data[i]) {
                min = data[i];
            }
        }

        System.out.println("Minimum Element :- " + min);

    }
}
