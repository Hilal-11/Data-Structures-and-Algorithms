package MultiDimensionalArrays;

import java.util.Scanner;

public class basicsOf2_DArraya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int data[][] = new int[4][4];
        // int n = data.length;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // data[i][j] = input.nextInt();
        // }
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(data[i][j] + "\t");
        // }
        // System.out.println();
        // }

        // int data[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 7, 5, 4 }, { 4, 6, 7, 2
        // } };
        // int n = data.length;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(data[i][j] + "\t");
        // }
        // System.out.println();
        // }

        int data[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 7, 5, 4 },
                { 4, 6, 7, 2 } };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
