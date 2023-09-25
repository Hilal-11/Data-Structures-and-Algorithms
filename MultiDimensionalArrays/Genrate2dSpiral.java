package MultiDimensionalArrays;

import java.util.Scanner;

public class Genrate2dSpiral {
    static void printMatrix(int data[][]) {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    static int[][] GenrateSpiral(int n) {

        int matrix[][] = new int[n][n];
        int topRow = 0;
        int bottomRow = n - 1;

        int rightColumn = n - 1;
        int leftColumn = 0;

        int currentValue = 1;
        while (currentValue <= n * n) {
            // Print Top row
            // left column to right column
            for (int j = leftColumn; j <= rightColumn && currentValue <= n * n; j++) {
                matrix[topRow][j] = currentValue;
                currentValue++;
            }
            topRow++;

            // Print right column
            // top row to bottom row
            for (int i = topRow; i <= bottomRow && currentValue <= n * n; i++) {
                matrix[i][rightColumn] = currentValue;
                currentValue++;
            }
            rightColumn--;

            // Print bottom row
            // right column to left column
            for (int j = rightColumn; j >= leftColumn && currentValue <= n * n; j--) {
                matrix[bottomRow][j] = currentValue;
                currentValue++;
            }
            bottomRow--;
            // Print left column
            // bottom row to top top row

            for (int i = bottomRow; i >= topRow && currentValue <= n * n; i--) {
                matrix[i][leftColumn] = currentValue;
                currentValue++;
            }
            leftColumn++;
        }

        return matrix;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = input.nextInt();

        int matrix[][] = GenrateSpiral(n);
        printMatrix(matrix);
    }
}
