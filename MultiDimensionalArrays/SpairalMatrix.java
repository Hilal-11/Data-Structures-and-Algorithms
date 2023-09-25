package MultiDimensionalArrays;

import java.util.Scanner;

public class SpairalMatrix {

    static void printMatrix(int data[][]) {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    static void SpairalMatrix(int data[][], int row, int col) {

        int topRow = 0;
        int bottomRow = row - 1;

        int rightColumn = col - 1;
        int leftColumn = 0;
        int totalElements = 0;

        while (totalElements < row * col) {
            // Print Top row
            // left column to right column
            for (int j = leftColumn; j <= rightColumn && totalElements < row * col; j++) {
                System.out.print(data[topRow][j] + "\t");
                totalElements++;
            }
            topRow++;

            // Print right column
            // top row to bottom row
            for (int i = topRow; i <= bottomRow && totalElements < row * col; i++) {
                System.out.print(data[i][rightColumn] + "\t");
                totalElements++;
            }
            rightColumn--;

            // Print bottom row
            // right column to left column
            for (int j = rightColumn; j >= leftColumn && totalElements < row * col; j--) {
                System.out.print(data[bottomRow][j] + "\t");
                totalElements++;
            }
            bottomRow--;
            // Print left column
            // bottom row to top top row

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

    }
}
