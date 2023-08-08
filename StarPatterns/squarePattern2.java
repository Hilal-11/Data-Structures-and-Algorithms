package StarPatterns;

import java.util.Scanner;

public class squarePattern2 {

    // Holo Square
    // Holo Square
    // public static void patterns(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (row == 1 || row == n || col == 1 || col == n) {
    // System.out.print(" * ");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.err.println();
    // }
    // }
    // * * * * * * *
    // * --------- *
    // * --------- *
    // * --------- *
    // * --------- *
    // * * * * * * *

    // Holo Square with Digonal Pattren
    // Holo Square with Digonal Pattren

    // public static void patterns(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (row == 1 || row == n || col == 1 || col == n || row == col) {
    // System.out.print(" * ");

    // } else {
    // System.err.print(" ");
    // }

    // }
    // System.err.println();
    // }
    // }

    // Digonal Pattern
    // Digonal Pattern

    // public static void patterns(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (row == col) {
    // System.out.print(" * ");

    // } else {
    // System.err.print(" ");
    // }
    // }
    // System.err.println();
    // }
    // }

    // Cross Digional VvvImp
    // Cross Digional VvvImp

    // public static void patterns(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (col == n - row + 1) {
    // System.out.print(" * ");

    // } else {
    // System.err.print(" ");
    // }
    // }
    // System.err.println();
    // }
    // }

    // Digonals Cross Pattern
    // Digonals Cross Pattern

    // public static void patterns(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (row == col || col == n - row + 1) {
    // System.out.print(" * ");

    // } else {
    // System.err.print(" ");
    // }
    // }
    // System.err.println();

    // }
    // }

    // Digonals Cross Hole square Pattern
    // Digonals Cross Hole square Pattern

    // public static void patterns(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (row == 1 || row == n || col == 1 || col == n || row == col || col == n -
    // row + 1) {
    // System.out.print(" * ");
    // } else {
    // System.err.print(" ");
    // }
    // }
    // System.err.println();
    // }
    // }

    // Digonals Cross Charcters Pattern
    // Digonals Cross Charcters Pattern
    // public static void patterns(int n) {

    // same 1 Alphabit pattern
    // same 1 Alphabit pattern

    // for (int row = 1; row <= n; row++) {
    // char ch = 'A';
    // for (int col = 1; col <= n; col++) {
    // if (row == col || col == n - row + 1) {
    // System.out.print(" " + ch + " ");
    // ch = (char) (ch + 1);

    // } else {
    // System.err.print(" ");
    // }
    // }

    // System.err.println();
    // }
    // }

    // same 2 Alphabit pattern
    // same 2 Alphabit pattern
    // public static void patterns(int n) {
    // char ch = 'A';
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (row == col || col == n - row + 1) {
    // System.out.print(" " + ch + " ");
    // ch = (char) (ch + 1);

    // } else {
    // System.err.print(" ");
    // }
    // }

    // System.err.println();
    // }
    // }

    // same 3 Alphabit pattern
    // same 3 Alphabit pattern

    public static void patterns(int n) {
        for (int row = 1; row <= n; row++) {
            char ch = 'A';
            for (int col = 1; col <= n; col++) {
                if (row == col || col == n - row + 1) {
                    System.out.print(" " + ch + " ");
                    ch = (char) (ch + 1);

                } else {
                    System.err.print(" ");
                }
                ch++;
            }

            System.err.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();

        patterns(n);

    }
}
