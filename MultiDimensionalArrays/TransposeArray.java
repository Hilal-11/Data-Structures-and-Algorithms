package MultiDimensionalArrays;

import java.util.Scanner;

public class TransposeArray {

    static void printing(int data[][]) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    // static void TransposeArray(int data[][]) {
    // int n = data.length;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {

    // System.out.print(data[j][i] + "\t");
    // }
    // System.out.println();
    // }

    // }

    // static int[][] TransposeArray(int data[][], int rows, int cols) {
    // int transpose[][] = new int[cols][rows];
    // int n = transpose.length;
    // for (int i = 0; i < cols; i++) {
    // for (int j = 0; j < rows; j++) {

    // transpose[i][j] = data[j][i];

    // }

    // }
    // return transpose;

    // }
    static void TransposeArray(int data[][], int rows, int cols) {
        for (int i = 0; i < cols; i++) {
            for (int j = i; j < rows; j++) {

                int temp = data[i][j];
                data[i][j] = data[j][i];
                data[j][i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();

        int data[][] = new int[rows][cols];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = input.nextInt();

            }
        }
        System.out.println();
        printing(data);

        // System.out.println();
        // TransposeArray(data);
        System.out.println();
        TransposeArray(data, rows, cols);
        printing(data);

    }
}
