package StarPatterns;

import java.util.Scanner;

public class CombinePatterns {

    public static void combinePatterns(int n) {

        // 1 pattern
        // 1 pattern

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row; col++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // 2 pattern
        // 2 pattern

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print(" " + col + " ");
        // }
        // System.out.println();
        // }
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row; col++) {
        // System.out.print(" " + col + " ");
        // }
        // System.out.println();
        // }

        // 3 pattern
        // 3 pattern

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print(" " + col + " ");
        // }
        // System.out.println();
        // }
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print(" " + row + " ");
        // }
        // System.out.println();
        // }
        //
        //
        //

        // Most optimise code of this pattern
        // Most optimise code of this pattern

        // for (int row = 1; row <= 2 * n; row++) {
        // int colms = row > n ? 2 * n - row : row;
        // for (int col = 1; col <= colms; col++) {
        // System.out.print(" * ");
        // }
        // System.out.println();

        // }
        //
        //
        //

        // for (int row = 1; row <= 2 * n; row++) {
        // int colms = row > n ? 2 * n - row : row;
        // for (int col = 1; col <= colms; col++) {
        // if (row == 1 || row == 2 * n || col == 1 || col == colms) {
        // System.out.print(" * ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();
        combinePatterns(n);

    }
}
