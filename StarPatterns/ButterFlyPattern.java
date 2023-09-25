package StarPatterns;

import java.util.Scanner;

public class ButterFlyPattern {
    public static void ButterFlyPattern(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++)
                System.out.print(" * ");

            for (int col2 = 1; col2 <= 2 * (n - row) - 1; col2++) {
                System.err.print("   ");
            }

            for (int col3 = 1; col3 <= (row); col3++) {
                System.err.print(" * ");
            }

            System.err.println();
        }

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++)
                System.out.print(" * ");

            for (int col2 = 1; col2 <= (2 * row) - 1; col2++) {
                System.err.print("   ");
            }

            for (int col3 = 1; col3 <= n - row; col3++) {
                System.err.print(" * ");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();
        ButterFlyPattern(n);

    }
}
