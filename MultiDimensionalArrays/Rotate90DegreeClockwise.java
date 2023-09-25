package MultiDimensionalArrays;

import java.util.Scanner;

public class Rotate90DegreeClockwise {

    static void printing(int data[][]) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    static void reverseArray(int data[]) {
        int j = data.length - 1;
        int i = 0;
        while (i < j) {

            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            j--;
            i++;
        }
    }

    static void transpose(int data[][], int rows, int cols) {

        for (int i = 0; i < cols; i++) {
            for (int j = i; j < rows; j++) {
                int temp = data[i][j];
                data[i][j] = data[j][i];
                data[j][i] = temp;
            }
        }
    }

    static void rotateArray(int data[][], int n) {

        transpose(data, n, n);
        for (int i = 0; i < n; i++) {
            reverseArray(data[i]);
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
        System.out.println("Original Array");
        printing(data);
        System.out.println();
        System.out.println("Transpose of Array");
        transpose(data, rows, cols);
        printing(data);

        System.out.println("\n");
        System.out.println("Rotate of Array");
        rotateArray(data, rows);
        printing(data);

    }
}
