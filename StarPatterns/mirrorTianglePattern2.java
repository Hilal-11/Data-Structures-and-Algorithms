package StarPatterns;

import java.util.Scanner;

public class mirrorTianglePattern2 {

    public static void mirrorTiangle2(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= n - row + 1; st++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print(" ");
        // }
        // for (int st = 1; st <= 2 * (n - row) - 1; st++) {
        // System.out.print(" * ");
        // }

        // System.out.println(" \n");
        // }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();
        mirrorTiangle2(n);
    }
}
