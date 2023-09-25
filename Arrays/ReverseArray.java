// package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int data[] = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }
        for (int i = 0; i < data.length / 2; i++) {

            int firstValue = data[i];
            int lastValue = data[data.length - i - 1];

            data[i] = lastValue;
            data[data.length - i - 1] = firstValue;

        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
