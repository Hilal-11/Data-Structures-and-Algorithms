package MultiDimensionalArrays;

import java.util.Scanner;

public class randomPractice {

    static void printMatrix(int data[][]) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    // Transpose an Array
    // Transpose an Array
    // Transpose an Array

    // static int[][] transpose(int data[][], int row, int col) {

    // int transpose[][] = new int[row][col];
    // for (int i = 0; i < transpose.length; i++) {
    // for (int j = 0; j < transpose.length; j++) {
    // transpose[i][j] = data[j][i];
    // }
    // }
    // return transpose;

    // }

    // Transpose an Array
    // Transpose an Array
    // Transpose an Array

    // static void transpose(int data[][]) {

    // for (int i = 0; i < data.length; i++) {
    // for (int j = i; j < data[i].length; j++) {
    // int temp = data[i][j];
    // data[i][j] = data[j][i];
    // data[j][i] = temp;
    // }
    // }
    // }

    // Rotate an Array
    // Rotate an Array
    // Rotate an Array

    // static void reverseArray(int data[]) {

    // int i = 0;
    // int j = data.length - 1;

    // while (i < j) {

    // int temp = data[i];
    // data[i] = data[j];
    // data[j] = temp;
    // j--;
    // i++;

    // }
    // }

    // static void transpose(int data[][], int row, int col) {

    // for (int i = 0; i < col; i++) {
    // for (int j = i; j < row; j++) {
    // int temp = data[i][j];
    // data[i][j] = data[j][i];
    // data[j][i] = temp;
    // }
    // }

    // }

    // static void rotateArray(int data[][], int n) {

    // transpose(data, n, n);
    // for (int i = 0; i < n; i++) {
    // reverseArray(data[i]);
    // }
    // }

    // static int[][] PascialsTiangle(int n) {

    // int ans[][] = new int[n][];
    // for (int i = 0; i < n; i++) {
    // ans[i] = new int[i + 1];

    // ans[i][0] = 1;
    // ans[i][i] = 1;

    // for (int j = 1; j < i; j++) {
    // ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
    // }
    // }
    // return ans;

    // }

    static void SpairalMatrix(int data[][], int row, int col) {

        int topRow = 0;
        int rightColumn = col - 1;
        int bottomRow = col - 1;
        int leftColumn = 0;

        int totalElements = 0;

        while (totalElements < row * col) {
            // topRow
            for (int j = leftColumn; j <= rightColumn && totalElements < row * col; j++) {
                System.out.print(data[topRow][j] + "\t");
                totalElements++;
            }
            topRow++;

            // right column
            for (int i = topRow; i <= bottomRow && totalElements < row * col; i++) {
                System.out.print(data[i][rightColumn] + "\t");
                totalElements++;

            }
            rightColumn--;

            // bottom row
            for (int j = rightColumn; j >= leftColumn && totalElements < row * col; j--) {
                System.out.print(data[bottomRow][j] + "\t");
                totalElements++;
            }
            bottomRow--;

            // left column
            for (int i = bottomRow; i >= topRow && totalElements < row * col; i--) {
                System.out.print(data[i][leftColumn] + "\t");
                totalElements++;
            }
            leftColumn++;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int row = input.nextInt();
        System.out.print("Enter cols : ");
        int col = input.nextInt();
        int data[][] = new int[row][col];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = input.nextInt();
            }
        }

        printMatrix(data);

        System.out.println("\n");

        SpairalMatrix(data, row, col);

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter n : ");
        // int n = input.nextInt();

        // int ans[][] = PascialsTiangle(n);
        // printMatrix(ans);

        // System.out.print("Enter rows : ");
        // int row = input.nextInt();
        // System.out.print("Enter rows : ");
        // int col = input.nextInt();
        // System.out.println(row * col + " Elements Enter");

        // int data[][] = new int[row][col];
        // for (int i = 0; i < data.length; i++) {
        // for (int j = 0; j < data[i].length; j++) {
        // data[i][j] = input.nextInt();
        // }
        // }

        // System.out.println();
        // System.out.println("Original Array");

        // printMatrix(data);

        // System.out.println();

        // int transpose[][] = transpose(data, row, col);
        // printMatrix(transpose);

        // System.out.println("Rotatr 90 Degree Array");

        // rotateArray(data, row);
        // printMatrix(data);

    }
}