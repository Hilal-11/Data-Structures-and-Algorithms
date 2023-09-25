package MultiDimensionalArrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int data[][] = new int[4][4];
        int n = data.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int t = 1; t <= 10; t++) {
                    System.out.println(data[i][j] + " * " + t + " = " + data[i][j] * t);
                }

            }

            System.out.println("\n");
        }
    }
}
