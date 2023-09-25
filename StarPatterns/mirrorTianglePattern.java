package StarPatterns;

import java.util.Scanner;

public class mirrorTianglePattern {

    public static void mirrorTiangle(int n) {

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print(" ");
        // }
        // for (int st = 1; st <= row; st++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // trick 1
        // trick 1

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print(" ");
        // }
        // for (int st = 1; st <= row; st++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // mirrorTiangle Pattern
        // mirrorTiangle Pattern

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print(" ");
        // }
        // for (int st = 1; st <= 2 * row - 1; st++) {
        // System.out.print(" * ");
        // }

        // System.out.println(" \n ");
        // }

        // Holo mirrorTiangle Pattern
        // Holo mirrorTiangle Pattern

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print(" ");
        // }
        // for (int st = 1; st <= 2 * row - 1; st++) {
        // if (row == 1 || row == n || st == 1 || st == 2 * row - 1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print(" ");
        // }
        // for (int st = 1; st <= 2 * row - 1; st++) {
        // System.out.print(row);
        // }

        // System.out.println();
        // }

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print(" ");
        // }
        // for (int st = 1; st <= 2 * row - 1; st++) {
        // System.out.print(" " + st + " ");
        // }

        // System.out.println(" \n ");
        // }

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print(" ");
        // }
        // for (int st = 1; st <= 2 * row - 1; st++) {
        // System.out.print(" " + st + " ");
        // }
        // System.out.println(" \n ");

        // }

        // Trick 2
        // Trick 2

        // for (int row = 0; row <= n; row++) {
        // for (int col = 0; col <= n; col++) {

        // if (col < n - row) {
        // System.out.print(" ");

        // } else {
        // System.err.print("* ");
        // }
        // }
        // System.out.println();
        // }

        // Trick 2
        // Trick 2

        // for (int row = 0; row <= n; row++) {
        // for (int col = 0; col <= n; col++) {

        // if (col < row) {
        // System.out.print(" ");

        // } else {
        // System.err.print("* ");
        // }
        // }
        // System.out.println(" \n");
        // }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();
        mirrorTiangle(n);
    }
}
