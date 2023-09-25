package StarPatterns;

import java.util.Scanner;

public class DimondPatterns {

    public static void dimondPatterns(int n) {
        //
        //
        //
        //

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= n - row; col++) {
        // System.err.print(" * ");
        // }
        // for (int col = 1; col <= n - row - 1; col++) {
        // System.err.print(" * ");
        // }

        // System.err.println("\n");
        // }

        //
        //
        //
        //
        //

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= n - (row * 2) + 1; col++) {
        // System.err.print(" * ");
        // }

        // System.err.println("\n");
        // }

        //
        //
        //
        //
        //

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= 2 * row - 1; col++) {
        // System.err.print(" * ");
        // }
        // System.err.println(" \n");
        // }

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= n - row; col++) {
        // System.err.print(" * ");
        // }
        // for (int col = 1; col <= n - row - 1; col++) {
        // System.err.print(" * ");
        // }

        // System.err.println(" \n");
        // }

        //
        //
        //
        //

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= 2 * row - 1; col++) {
        // System.err.print(" * ");
        // }
        // System.err.println(" \n");
        // }

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= n - 2 * row + n - 1; col++) {
        // System.err.print(" * ");
        // }

        // System.err.println(" \n");
        // }

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= 2 * row - 1; col++) {
        // System.err.print(" * ");
        // }
        // System.err.println(" \n");
        // }

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= 2 * (n - row) - 1; col++) {
        // System.err.print(" * ");
        // }

        // System.err.println(" \n");
        // }

        //
        //
        //
        //
        //

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= 2 * row - 1; col++) {
        // if (row == 1 || col == 1 || col == 2 * row - 1) {
        // System.err.print("*");
        // } else {
        // System.err.print(" ");
        // }
        // }
        // System.err.println();
        // }
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= 2 * (n - row) - 1; col++) {
        // if (row == n || col == 1 || col == 2 * (n - row) - 1) {
        // System.err.print("*");
        // } else {
        // System.err.print(" ");
        // }
        // }
        // System.err.println();
        // }

        //

        //

        //

        // //

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= 2 * (n - row) + 1; col++) {
        // System.err.print("*");
        // }

        // System.err.println();
        // }
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= 2 * row - 1; col++) {
        // System.err.print("*");
        // }
        // System.err.println();
        // }

        //
        //
        //
        //

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= 2 * (n - row) + 1; col++) {
        // if (row == 1 || row == n || col == 1 || col == 2 * (n - row) + 1) {
        // System.err.print("*");
        // } else {
        // System.err.print(" ");
        // }

        // }
        // System.err.println();
        // }
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.err.print(" ");
        // }
        // for (int col = 1; col <= 2 * row - 1; col++) {
        // if (row == 1 || row == n || col == 1 || col == 2 * row - 1) {
        // System.err.print("*");
        // } else {
        // System.err.print(" ");
        // }

        // }
        // System.err.println();
        // }

        //
        //
        //
        //
        //

        int space = n / 2;
        int stars = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i <= n / 2) {
                space--;
                stars += 2;

            } else {
                space++;
                stars -= 2;
            }
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();
        dimondPatterns(n);

    }
}
