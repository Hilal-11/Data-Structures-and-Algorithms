package MultiDimensionalArrays;

import java.util.Scanner;

public class changeOddAndEven {
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

                if (data[i][j] % 2 == 0) {
                    data[i][j] += 10;
                } else {
                    data[i][j] *= 2;
                }
            }
        }
        System.out.println("\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }

    }
}