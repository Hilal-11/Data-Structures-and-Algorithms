package StarPatterns;

import java.util.Scanner;

public class trianglePatterns2 {

    // public static void trianglePattern2(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n - row; col++) {
    // System.out.print(" * ");
    // }
    // System.out.println();
    // }
    // }

    public static void trianglePattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                if (row == 1 || row == n || col == 1 || col == n - row) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    // public static void trianglePattern2(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n - row + 1; col++) {
    // System.out.print(" " + col + " ");
    // }
    // System.out.println();
    // }
    // }

    // public static void trianglePattern2(int n) {
    // char ch = 'A';
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n - row; col++) {
    // System.out.print(" " + ch + " ");
    // ch = (char) (ch + 1);
    // }
    // System.out.println();
    // }
    // }

    // IMPORTANT PATTERN
    // IMPORTANT PATTERN

    // public static void trianglePattern2(int n) {
    // char ch = 'A';
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n - row; col++) {
    // System.out.print(" " + ch + " ");
    // }
    // ch = (char) (ch + 1);
    // System.out.println();
    // }
    // }
    // public static void trianglePattern2(int n) {
    // char ch = 'A';
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n - row; col++) {
    // System.out.print(" " + ch + " ");
    // }
    // System.out.println();
    // ch++;
    // }
    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();
        trianglePattern2(n);

    }
}
